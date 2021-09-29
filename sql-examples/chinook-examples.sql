
-- retrieves all albums that start with an A
select * from album
where title like '%A';

-- retrieves the customer id, date, and total cost of invoices with a toatl cost greater than 12
select CustomerId, InvoiceDate, Total from invoice
where Total > 12;

/*
 aggregate functions: 
 take a set of data as input, and return some value
 
	exs: count, avg, sum, min, max, pow (raising to a power), round (rounds data to certain decimal places)
*/
-- retrieve the total number of customers 
select count(customerId) as 'Total Customers' from customer;

-- retrieve the average total of an invoice
select avg(total) as 'Average Cost' from invoice;

-- retrieve the total money made from invoices
select sum(total) as 'Total of all the Totals' from invoice;

/*
scalar functions:
operate on a single input and return multiple values

	exs: concat, length, trim (removes extra whitespaces from beginning or end of strings)
*/

-- concat appends strings together
-- retrieve the name and addresses of all employees in only two columns
select concat(FirstName, ' ', LastName) as 'FullName', 
	concat(Address, ', ', City, ', ', State, ', ', PostalCode) as 'Street Address'
    from employee;
select * from employee;

-- length returns the length of a string 
-- retrieve the length of every employees name
select length(FirstName) from employee;

-- retrieves all employees with a first name longer than 5 characters 
select * from employee 
where length(FirstName) > 5;


/*
	JOINS
*/

-- get all the employees that report to someone
select e1.EmployeeId, e1.FirstName, e1.reportsTo
from employee e1
left join employee e2
on e1.reportsTo = e2.ReportsTo;

select e1.EmployeeId, e1.FirstName, e1.reportsTo
from employee e1
inner join employee e2
on e1.EmployeeId = e2.employeeId AND e1.ReportsTo IS NOT NULL;

select EmployeeId, FirstName, ReportsTo
from employee
where ReportsTo IS NOT NULL;

-- gets all the playlists with more than 10 tracks
select PlaylistId, count(TrackId) from playlisttrack
group by PlaylistId
having count(TrackId) > 10;


/*
Subqueries
a query inside another query
*/

select PlaylistId, count(TrackId) from playlisttrack
group by PlaylistId
having count(TrackId) >= 
	(select count(TrackId) from playlisttrack
		where PlaylistId = 3);

















