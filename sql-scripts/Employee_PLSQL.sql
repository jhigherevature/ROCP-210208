--As its name implies, DROP IF EXISTS will drop an entity if it already exists in our DB
drop table if exists examples.employees CASCADE;
DROP SEQUENCE IF EXISTS emp_id_seq;
DROP FUNCTION IF EXISTS emp_id_func;
--WHEN YOU DROP A TRIGGER, YOU MUST SPECIFY THE TABLE IT IS ASSOCIATED WITH
DROP TRIGGER IF EXISTS emp_id_trig ON examples.employees;

--CREATE A TABLE:
create table examples.employees (
--	<column_name> <column_type>,
	emp_id INTEGER PRIMARY KEY, -- ID will be used to identify employees
	emp_name VARCHAR(50), -- VARCHAR is typically used for string data
	emp_salary DECIMAL,
	emp_title VARCHAR(20)
);

--SEQUENCES ARE USED TO MANAGE A COUNTER
CREATE SEQUENCE emp_id_seq START WITH 1000 INCREMENT BY 2;

--FUNCTIONS: PERFORM A SERIES OF OPERATIONS AS SPECIFIED WITHIN THE BODY OF THE FUNCTION
CREATE OR REPLACE FUNCTION emp_id_func() RETURNS TRIGGER AS
$$ 
BEGIN
	IF NEW.emp_id IS NULL THEN
		NEW.emp_id:=NEXTVAL('emp_id_seq');
		RETURN NEW;
	END IF;
END;
$$ LANGUAGE PLPGSQL;

--TRIGGERS ARE ENTITIES WHICH WAIT FOR A SPECIFIED EVENT TO PERFORM AN ACTION
CREATE TRIGGER emp_id_trig 
BEFORE INSERT ON examples.EMPLOYEES
FOR EACH ROW
EXECUTE PROCEDURE emp_id_func();


insert into examples.employees values (null, 'Patty', 120000, 'CEO');
insert into examples.employees values (null, 'Matt', 45000, 'employee');
insert into examples.employees values (null, 'Jill', 50000, 'employee');
insert into examples.employees values (null, 'Phil', 75000, 'supervisor');
insert into examples.employees values (null, 'Will', 55000, 'employee');
insert into examples.employees values (null, 'Bob', 80000, 'supervisor');
insert into examples.employees values (null, 'Sally', 52000, 'employee');
insert into examples.employees values (null, 'Sarah', 50000, 'Employee');
insert into examples.employees values (null, 'Bobby', 50000, 'Employee');
