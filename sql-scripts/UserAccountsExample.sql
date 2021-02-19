/*
 * THIS FILE CONTAINS INCOMPLETE SQL SCRIPTS TO SHOWCASE CERTAIN STRUCTURAL
 * METHODS FOR CREATING TABLES!
 * 
 */

/*
 * keyword create keyword table
 * CREATE TABLE <table_name> (
 * 	<column_name> <column_datatype>,
	<column_name> <column_datatype>,
	<column_name> <column_datatype>,
	<column_name> <column_datatype> 
 * );
 * 
 */


CREATE TABLE information (
	info_name VARCHAR(20),
	
);


/*
 * You can manage different users by including different database tables:
 */
--CREATE TABLE employees (
--	user_id REFERENCES usersInfo(user_id)
--)
--
--CREATE TABLE customers (
--	customer_id SERIAL PRIMARY KEY,
--	user_id REFERENCES usersInfo(user_id)
--)


/*
 * OR you can manage different users by including all user data with matching
 * roles table
 * 
 * OR some combination of the two...
 */
CREATE TABLE usersInfo(
	user_id SERIAL,
	user_email,
	user_pass,
	user_first,
	user_last,
	user_type REFERENCES user_type(type_id),
	
	CONSTRAINT PRIMARY KEY user_pk 
)

CREATE TABLE user_type (
	type_id,
	type_name -- employee, supervisor/admin, customer
)


CREATE TABLE accounts(
	user_id REFERENCE usersInfo(user_id)
)




