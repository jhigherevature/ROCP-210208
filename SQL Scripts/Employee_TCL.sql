
select * from employees; --1
delete from employees where emp_id=2000;
delete from employees where emp_id=2001;
delete from employees where emp_id=2002;

begin;
	insert into examples.employees values(2000, 'Sal', 50000, 'employee');
	savepoint my_save;
select * from employees; --2

	insert into examples.employees values(2001, 'Pal', 67000, 'employee');
select * from employees; --3
	rollback to savepoint my_save;
select * from employees; --4

	insert into examples.employees values(2002, 'Hal', 79000, 'supervisor');
	release savepoint my_save;
select * from employees; --5

commit;