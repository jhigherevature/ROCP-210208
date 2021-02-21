-- asterisk is used to represent all columns
select *  from employees;

-- we can specify columns if we do not need all data
select emp_id, emp_name from examples.employees;

/* WHERE statement */
select * from employees where emp_salary > 70000;
select emp_name, emp_title from employees where emp_id = 1000;

/* GROUP BY */
select sum(emp_salary), emp_title from examples.employees group by emp_title;
select emp_title from employees group by emp_title;
select emp_title from employees;

/* HAVING */

select sum(emp_salary), emp_title from examples.employees
group by emp_title having sum(emp_salary) > 175000;

/* ORDER BY */
select * from employees;
-- ORDER BY uses an ascending or descending order
select * from employees order by emp_salary desc;

-- we can include multiple columns to order by using a comma to separate
select * from employees order by emp_salary asc, emp_title desc;
-- upper case letters have a 'higher' value, so they are first when we descend

/* ALL TOGETHER */
select avg(emp_salary), emp_title
from examples.employees
where emp_salary < 100000
group by emp_title 
having avg (emp_salary) < 75000
order by emp_title;

-- AS is used to specify an 'alias' for data we retrieve from our database
-- use double-quotes when we do not insert the string into a table
select emp_salary as "Money" from employees;

/* LIKE */
-- for strings the % is used for a wildcard for any number of characters
select * from employees where lower(emp_name) like 's%a%';
-- for strings the _ is used for a wildcard for a single character
select * from employees where lower(emp_name) like 's_%a%';

/* BETWEEN */
-- use AND to specify upper and lower limits of a BETWEEN operation
select * from employees where emp_salary between 45000 and 75000

/* IN */
select * from employees where lower(emp_title) in ('employee', 'supervisor');





