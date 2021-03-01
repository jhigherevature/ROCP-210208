DROP TABLE IF EXISTS login CASCADE;

--Table used to hold login information for our users. This references the emp_id table simply to show how
--we can relate logging in to other tables which are associated with different 'roles'
CREATE TABLE login(
	login_id SERIAL PRIMARY KEY,
	emp_id INTEGER REFERENCES examples.employees(emp_id),
	login_name VARCHAR(30),
	login_pass VARCHAR(30)
);

--Here we are inserting records manually...how would we create a login and user at the same time?
--I'll leave that logic to you!
INSERT INTO login VALUES (DEFAULT, 1000, 'patCeo', 'pass');
INSERT INTO login VALUES (DEFAULT, 1002, 'merrymatt', 'pass');
INSERT INTO login VALUES (DEFAULT, 1006, 'philyTheKid', 'pass');

--Remember to grant permissions!
GRANT INSERT, SELECT, UPDATE, DELETE ON examples.login TO joe;


SELECT * FROM examples.employees;



CREATE TABLE dummy (
	info VARCHAR(20)
);

INSERT INTO dummy VALUES ("Test 1");
INSERT INTO dummy VALUES ("Test 2");
INSERT INTO dummy VALUES ("Test 3");
