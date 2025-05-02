## Recap 

Cloud 
AWS 
1. Ec2 
2. Lambda
3. Docker 
4. Kubernetes 
5. Containers
6. RDS 
7. Cloudwatch 
8. Scaling - Horizontal vs vertical scaling 
9. Event driven arch 



RDS  - relational database service 
relational 

Dynamo DB 
- Mongo db  , 
- Redis ? Caching database 


                                            redis                   Mysql
Front end ------> BE   fetch the userinfo  [cached]------> database []-permanent storage



## Database ? 

ability to store the data 

File system

Relational Database 
1. Mysql, PostgreSQL , Oracle, SQL Server 

Data stored in form of table .

Relationship two or more tables 


Normalization  - remove the redundant data , DBA
1N, 2, Bcnf , 4n , 5f 


ACID properties 
A- Atomicity   , transaction happens , it happens completely or not at all 

transfer money from acount to another 
A - 1000                  B

C - Consistency 
same state before and after transaction 


I - Isolation 
independent transaction can happen

D - Durability 
during the system failure, changes in transacation happen



Blue Green Deployment 


## NoSQL 
document type 
KEY - VALUE 



====
database queries
===


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


























