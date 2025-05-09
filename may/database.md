show databases ;

use Employee;

show tables ;

-- fetch all the data from EMPLOYEE

select * from EMPLOYEE;
select EMPLOYEE_NAME, EMPLOYEE_ADDRESS from EMPLOYEE;

-- give me all the employees from Japan
-- where clause
select * from EMPLOYEE where EMPLOYEE_ADDRESS = 'Japan';

-- fetch employees from Japan and name is John
select * from EMPLOYEE where EMPLOYEE_ADDRESS = 'Japan' AND EMPLOYEE_NAME = 'John';

-- fetch all the employees from Canada or Name is John
select * from EMPLOYEE where EMPLOYEE_ADDRESS = 'India' OR EMPLOYEE_NAME = 'Sofia';

-- list all the employees which are not from Canada
select * from EMPLOYEE where NOT EMPLOYEE_ADDRESS = 'Canada';

-- limit
select *
from EMPLOYEE limit 4;


create database mydatabase;

show databases ;

use Employee;

drop database mydatabase;


create table Product(product_id int, product_name varchar(255));

show tables;
select * from Product;

-- insert data to the product
insert into Product (product_id , product_name) values (101, 'Iphone');

drop table Product;


-- May 8 2025

show tables;
select * from Product;

insert into Product(product_id,product_name) values(3,'Pen');
INSERT into Product (product_id, product_name) values (2,'Apple');
insert into Product values(4, 'Apple Laptop'), (5, 'Mouse');

-- drop the table

    drop table Product;




-- add a column, salesman

alter table Product add salesman varchar(255);

update Product set salesman = 'Niraj' where product_id = 1;
UPDATE Product set salesman = 'Yadav' where product_id =2;
update Product set salesman = 'Varun' where product_id =3;



-- Constraints
/*
1. Not Null
2. Unique
3. primary key  - Uniquely identified column
   example
   student_id , account number , phone unique , email, sin number, license plate,
   licene number, passport number , asset id
   name?

4. Foreign key  - Primary key in another table ,A[user_id]FK     - B[user_id]- PK
5. Check
7. default


*/




create table Product(product_id int ,
product_name varchar(255) NOT NULL,
salesman varchar(255) UNIQUE  NOT NULL ,
quantity int
check ( quantity > 10 AND quantity < 100),
primary key (product_id));

drop table Product;

select *
from Product;

-- insert query

insert into Product values(1, 'Car', 'Niraj', 99);
INSERT into Product values (101, 'Yadav',12);
insert into Product (product_id,quantity) values (1,23);


-- 10 mins. create Employee table, id,name, email, age ,  check on age > 18  , not null
-- Unique and primary key
-- unique, column ca be null ,
-- primary can not be null

desc Product;


show databases ;
use ProductDB;

show databases ;
use Employee;

show tables ;
select * from Employee_1;

alter table Employee_1 add salary varchar(255);
update Employee_1 set salary = '100120' where empID = 1001;
update Employee_1 set salary = '2000' where empID = 1002;
update Employee_1 set salary = '30000' where empID = 1003;


--



-----

part 2 


----

show databases ;

use Employee;

show tables ;

select *
from EMPLOYEE;

desc EMPLOYEE;

-- find the employee with max salary
select max(EMPLOYEE_SALARY) from EMPLOYEE;
select min(EMPLOYEE_SALARY) from EMPLOYEE;

-- find total employees who are from Canada or salary greater than 40K
-- count()
use Employee;
select count(*) from EMPLOYEE where EMPLOYEE_ADDRESS = 'India' AND EMPLOYEE_SALARY > 70000;


-- calculate the total salary given to employees
-- add, avg
-- sum , avg
select sum(EMPLOYEE_SALARY) from EMPLOYEE;
select avg(EMPLOYEE_SALARY) from EMPLOYEE;


-- wildcard ?

-- find the employee whose name start with 'D'
-- find the employee whose name has letter a

select * from EMPLOYEE where EMPLOYEE_NAME LIKE 'D%';
select * from EMPLOYEE where EMPLOYEE_NAME LIKE '%S%';


--
select *
from EMPLOYEE;

-- find all the employees from the given address
-- excluded  from the given list of address

-- Canada, India, Chile -- all the employees from these city

select count(*) from EMPLOYEE where EMPLOYEE_ADDRESS IN ('Canada', 'Chile');

select * from EMPLOYEE where EMPLOYEE_ADDRESS NOT IN ('Canada', 'Chile');

select distinct EMPLOYEE_ADDRESS
from EMPLOYEE;

select *
from EMPLOYEE;



-- Joins
-- A                B


show tables ;
select *
from SALARY;

select *
from TITLES;


-- types of joins
/*
inner join      -- A      B   -- returns the common data between two tables
left outer join   --  A    B -- return all the data from left table and common from both table
right outer join   - return everything from the right table and common between left
self join  - joining with own table A with A
Full join  -


A - 50                 B - 30
left join

total = >= 50



*/



select * from EMPLOYEE;
select * from TITLES;

-- Inner join
select EMPLOYEE.EMPLOYEE_NAME, TITLES.EMPLOYEE_TITLE
from EMPLOYEE
INNER JOIN
TITLES
ON
EMPLOYEE.EMPLOYEE_ID = TITLES.EMPLOYEE_ID;

-- Left join
select EMPLOYEE.EMPLOYEE_NAME, TITLES.EMPLOYEE_TITLE
from EMPLOYEE
Left JOIN
TITLES
ON
EMPLOYEE.EMPLOYEE_ID = TITLES.EMPLOYEE_ID;


INSERT INTO EMPLOYEE values (1008,'Yadav','Canada', 647924011, 50000,'M','2017-01-01');


-- Right join
select EMPLOYEE.EMPLOYEE_NAME, TITLES.EMPLOYEE_TITLE
from EMPLOYEE
right JOIN
TITLES
ON
EMPLOYEE.EMPLOYEE_ID = TITLES.EMPLOYEE_ID;


/*-- Full join
full outer join is not available in mysql , but we can use Union
left union right join


select EMPLOYEE.EMPLOYEE_NAME, TITLES.EMPLOYEE_TITLE
from EMPLOYEE
FULL OUTER JOIN
TITLES
ON
EMPLOYEE.EMPLOYEE_ID = TITLES.EMPLOYEE_ID;*/

/*SELECT * FROM t1
LEFT JOIN t2 ON t1.id = t2.id
UNION
SELECT * FROM t1
RIGHT JOIN t2 ON t1.id = t2.id*/





























