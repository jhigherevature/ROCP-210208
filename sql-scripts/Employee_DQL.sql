-- The asterisk is used to reference all columns
select * from employees;

--We can specify columns if we do not need all data
select emp_id, emp_name from examples.employees;


/* WHERE STATEMENT */
select * from employees where emp_salary > 70000;
select emp_name, emp_title from employees where emp_id = 1000;

/* GROUP BY */
select sum(emp_salary), emp_title from examples.employees group by emp_title;
select emp_title from employees  group by emp_title;
select emp_title from employees;

/* HAVING */
select sum(emp_salary), emp_title from examples.employees 
group by emp_title having sum(emp_salary) > 175000;

/* ORDER BY */
select * from employees;
--ORDER BY uses an ascending or descending order
select * from employees order by emp_salary desc;
--We can include multiple columns to order by using a comma to separate
select * from employees order by emp_title desc, emp_salary asc;
--Upper case letters have a 'higher' value, so they are first when we descend the ordering

/* ALL TOGETHER */
select avg(emp_salary), emp_title
from examples.employees
where emp_salary < 100000
group by emp_title
having avg (emp_salary) < 75000
order by emp_title;

--AS is used to specify an 'alias' for data we retrieve from our db
--Use double-quotes when we do not insert the string into a table
select emp_salary as "Money" from employees;

/* LIKE */
-- for strings the % is used for a wildcard for any number of characters
select * from employees where lower(emp_name) like '%a%';


--emp_name = 'Dan' <-- WILL WORK
--emp_name = 'Hal' <-- WILL WORK
--emp_name = 'Aaron' <-- WILL WORK
--emp_name = 'Heather' <-- NOT WORK
SELECT * FROM EMPLOYEES WHERE lower(emp_name) LIKE '___a%';

-- for strings the _ is used for a wildcard for a single character
select * from employees where lower(emp_name) like 's_%a%';

/* BETWEEN */
--Use the 'AND' keyword to specify upper and lower limits of a BETWEEN operation
select * from employees where emp_salary between 45000 and 75000;
SELECT emp_name, emp_salary FROM employees WHERE emp_salary BETWEEN 50000 AND 70000;


/* IN */
select * from employees where lower(emp_title) in ('employee', 'supervisor');
SELECT emp_name, emp_title FROM examples.employees WHERE lower(emp_title) IN ('supervisor');
