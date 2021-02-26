/*
 * This is for multi-line comments
 * all of this is in a comment
 */

--This is a single line comment

/*
 * DDL - Data Definition Language
 */
-- To create a Schema use the CREATE statement
CREATE SCHEMA examples;

--Use the DROP statement to remove Schemas
--CASCADE allows you to propagate changes across associated connections
--drop schema examples cascade;

--As its name implies, DROP IF EXISTS will drop an entity if it already exists in our DB
drop table if exists examples.employees cascade;

--CREATE A TABLE:
create table examples.employees (
--	<column_name> <column_type>,
	emp_id INTEGER, -- ID will be used to identify employees
	emp_name VARCHAR(50), -- VARCHAR is typically used for string data
	emp_salary DECIMAL,
	emp_title VARCHAR(20)
);

/*
 * DML - Data Manipulation Language
 */
--In SQL, String data within queries should use single quotes
insert into examples.employees values (1000, 'Patty', 120000, 'CEO');
insert into examples.employees values (1001, 'Matt', 45000, 'employee');
insert into examples.employees values (1002, 'Jill', 50000, 'employee');
insert into examples.employees values (1003, 'Phil', 75000, 'supervisor');
insert into examples.employees values (1004, 'Will', 55000, 'employee');
insert into examples.employees values (1005, 'Bob', 80000, 'supervisor');
insert into examples.employees values (1006, 'Sally', 52000, 'employee');

--Values inserted into our tables are case-sensitive
insert into examples.employees values (1007, 'Sarah', 50000, 'Employee');
insert into examples.employees values (1008, 'Bobby', 50000, 'Employee');

--You do not need the schema qualifier if you have selected the schema in DBeaver specifically
update employees set emp_name='Gill' where emp_id=1002;
UPDATE examples.employees SET EMP_SALARY=100000000 WHERE emp_id = 1000;

--Remove all records from employees table
--delete from examples.employees;

--Remove a specific record
--delete from examples.employees where emp_title='employee';
delete from examples.employees where emp_id=1000;

commit;
