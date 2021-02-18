--TCL - Transaction Control Language
select * from employees; -- 1
delete from employees where emp_id=2000;
delete from employees where emp_id=2001;
delete from employees where emp_id=2002;

drop table employees;

/*
 * WITHOUT 'begin' and 'commit' you are not rolling multiple operations
 * into a single transaction, you are instead performing isolated transactions
 * on your database, and as such, do not have the room to utilize TCL commands
 */
begin;
	-- you can create multiple savepoints
	savepoint my_save_1;
	insert into examples.employees values (2000, 'Sal', 50000, 'employee');
	savepoint my_save_2;
select * from employees; -- 2
	insert into examples.employees values (2001, 'Pal', 67000, 'employee');
	savepoint my_save_3;

--select * from employees; -- 3

	rollback to savepoint my_save_1;
select * from employees; -- 4

	insert into examples.employees values (2002, 'Hal', 79000, 'supervisor');
	release savepoint my_save;
select * from employees; -- 5

commit;