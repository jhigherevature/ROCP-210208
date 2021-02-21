/*
 * This is for multi line comments
 * all of this is in a comment
 */

-- This is a single line comment

/*
 * DDL - Data Definition Language
 */

-- To create a Schema, use the CREATE statement
--create schema examples;

-- Use the DROP statement to remove Schemas
-- CASCADE allows you to propagate changes across associated connecitons
--drop schema examples cascade;

-- As its name implies, DROP <item> IF EXISTS will drop an entity if it already exists in our database
drop table if exists examples.employees cascade;
drop sequence if exists emp_id_seq;
drop function if exists emp_id_func;
--when you drop a trigger, you must specify its assoc table
drop trigger if exists emp_id_trig on examples.employees;

--CREATE A TABLE:
create table examples.employees (
-- <column_name> <column_type>,
	emp_id INTEGER primary key, -- ID will be used to identify employees
	emp_name VARCHAR(50), -- VARCHAR is typically used for string data
	emp_salary DECIMAL, 
	emp_title VARCHAR(20)
);

-- SEQUENCES are used to manage a counter
create sequence emp_id_seq start with 1000 increment by 2;

--functions: perform a series of operations as specified within the body fo the function
create function emp_id_func() returns trigger as 
$$ begin 
	if new.emp_id is null then
		new.emp_id:=nextval('emp_id_seq');
		return new;
	end if;
end;
$$ language PLPGSQL;

-- TRIGGERS are entitites which wait for a specified event to perform an action
create trigger emp_id_trig 
before insert on examples.employees
for each row 
execute procedure emp_id_func();




insert into examples.employees values (NULL, 'Patty', 120000, 'CEO');
insert into examples.employees values (NULL, 'Matt', 45000, 'employee');
insert into examples.employees values (NULL, 'Jill', 50000, 'employee');
insert into examples.employees values (NULL, 'Phil', 75000, 'supervisor');
insert into examples.employees values (NULL, 'Will', 55000, 'employee');
insert into examples.employees values (NULL, 'Bob', 80000, 'supervisor');
insert into examples.employees values (NULL, 'Sally', 52000, 'employee');


commit;