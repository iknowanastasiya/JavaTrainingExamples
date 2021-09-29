-- single line comment
/*
	multi-line comment
*/ 

/*
	DML: Data Manipulation Language
		insert, update, delete, select
        performed on the data inside the table
        
	DDL: Data Definition Language
		create, alter, drop, truncate
		perfomed on the table itself

		ALTER table_name etc.
			-- modifies the structure of the table

		TRUNCATE `customers-example`.`customers`;
			-- deletes all data, but keeps table
		
        DROP TABLE `customers-example`.`customers`;
			-- deletes all data, and removes table
		
*/


-- create a 'customers' table in the 'customers-example' schema
CREATE TABLE `customers-example`.`customers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `phone_UNIQUE` (`phone` ASC) VISIBLE);

/*
create table customers (
	id int not null auto_increment primary key,
	name varchar(45) not null,
    email varchar(45) unique,
    etc.
)
*/

-- INSERT INTO table_name VALUES (list of values); -- BAD PRACTICE
insert into customers values (1, 'Dan', 'dan.danny@gamil.com', '123-456-7890');
insert into customers values (356, 'Dan', null, null);
	-- must specify ALL columns

-- INSERT INTO table_name(list of column names) VALUES(list of values); -- GOOD PRACTICE
insert into customers(name, email, phone) values ('Jane', 'jane1234@gamil.com', '123-456-0987');
insert into customers(name, email, phone) values ('Mary', null, null);
	-- only specify columns you care about

insert into customers (name, email, phone) values ('Ezri Ference', null, null);
insert into customers (name, email, phone) values ('Vanya Glyde', 'vglyde1@wikispaces.com', null);
insert into customers (name, email, phone) values ('Julius Knowlton', null, '777-765-1437');
insert into customers (name, email, phone) values ('Carie Marlon', 'cmarlon3@phpbb.com', '644-126-7263');
insert into customers (name, email, phone) values ('Stanleigh Mawford', null, null);
insert into customers (name, email, phone) values ('Janean Bugg', null, null);
insert into customers (name, email, phone) values ('Amble Chretien', null, '398-250-9839');
insert into customers (name, email, phone) values ('Cissy Grinov', 'cgrinov7@rambler.ru', null);
insert into customers (name, email, phone) values ('Sterling Merriman', 'smerriman8@soup.io', '233-677-9670');
insert into customers (name, email, phone) values ('Aylmer Kubu', null, '792-727-9393');
insert into customers (name, email, phone) values ('Terrye Sorsby', 'tsorsbya@ovh.net', '428-184-5302');
insert into customers (name, email, phone) values ('Johnath Cartmale', null, null);
insert into customers (name, email, phone) values ('Cecilla Petroselli', 'cpetrosellic@sakura.ne.jp', null);
insert into customers (name, email, phone) values ('Daloris Rainsdon', 'drainsdond@latimes.com', null);
insert into customers (name, email, phone) values ('Ciel Britner', 'cbritnere@php.net', null);
insert into customers (name, email, phone) values ('Eustace Brumpton', null, null);
insert into customers (name, email, phone) values ('Isak Honeywood', 'ihoneywoodg@blogger.com', '322-468-0543');
insert into customers (name, email, phone) values ('Corby Jagson', 'cjagsonh@imageshack.us', null);
insert into customers (name, email, phone) values ('Jesus Mitchiner', 'jmitchineri@issuu.com', null);
insert into customers (name, email, phone) values ('Lydie Melling', null, null);

-- SELECT list of column names FROM table_name;
select name, email, phone from customers;	
select * from customers;	-- * means all columns

/*
UPDATE table_name
SET column1 = new_value1, column2 = new_value2 etc.
where some_condition;	-- updates can affect multiple rows if you let it
*/

update customers
set email = 'lydie.melling123@gmail.com'
where id = 377;

update customers
set name = 'Austin'
where id > 0;


-- DELETE FROM table_name WHERE some_condition; -- deletes can affect multiple rows if you let it
delete from customers where id > 358;


-- CRUD: create, retrieve, update, delete
	-- referring to objects/entries


























