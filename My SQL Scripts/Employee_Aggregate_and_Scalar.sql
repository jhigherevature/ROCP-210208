-- aggregate function : perfromed across an entire column and retrun a single result
select min(emp_salary) from examples.employees;
select avg(emp_salary) from examples.employees;

--window functions: 
select emp_name, emp_title, first_value(emp_salary) over() from employees;
select emp_name, emp_title, first_value(emp_salary) over(order by emp_name desc) from employees;
select emp_name, emp_title, first_value(emp_salary) over(partition by emp_title order by emp_name desc) from employees;
select emp_name, emp_title, first_value(emp_salary) over(partition by emp_title order by emp_name asc) from employees;

-- scalar functions:
--string functions:
select upper(emp_name) from employees;
select char_length(emp_name) from employees;
select('Hello ' || 'World!'); -- string concat in SQL performed with ||

-- mathematical functions:
select abs (emp_salary) from employees;
select abs(-175);