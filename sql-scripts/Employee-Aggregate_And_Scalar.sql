--AGGREGATE FUNCTION : Performed across an entire COLUMN, AND RETURN a single RESULT
SELECT MIN(emp_salary) FROM examples.EMPLOYEES;
SELECT AVG(emp_salary) FROM examples.EMPLOYEES;

--WINDOW FUNCTIONS: 
SELECT emp_name, emp_title, FIRST_VALUE(emp_salary) OVER() FROM employees;
SELECT emp_name, emp_title, FIRST_VALUE(emp_salary) OVER(ORDER BY emp_name desc) FROM employees;
SELECT emp_name, emp_title, FIRST_VALUE(emp_salary) OVER(PARTITION BY emp_title ORDER BY emp_name desc) FROM employees;
SELECT emp_name, emp_title, FIRST_VALUE(emp_salary) OVER(PARTITION BY emp_title ORDER BY emp_name ASC) FROM employees;

--SCALAR FUNCTIONS: 
--STRING FUNCTIONS:
SELECT UPPER(emp_name) FROM EMPLOYEES;
SELECT CHAR_LENGTH(emp_name) FROM EMPLOYEES;
SELECT ('Hello ' || 'World!'); -- String concatenation in SQL is performed with two pipes '||'

--MATHEMATICAL FUNCTIONS:
SELECT ABS(emp_salary) FROM EMPLOYEES;
SELECT ABS(-175) AS "ABSOLUTE";
