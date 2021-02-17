/*
 * Before dropping a user, we must remove privileges 
 * because our DB will recognize that this user has certain
 * power to manipulate data within a specific table/tables 
 */
REVOKE ALL PRIVILEGES ON examples.employees FROM joe;
-- we can use 'if exists' to check that the user exists before 
-- dropping users as well
DROP USER IF EXISTS joe;

--Use the create statement to create users as well
CREATE USER joe WITH PASSWORD 'password';

--GRANT <permission> ON <ENTITY> TO <USER_NAME>
GRANT INSERT ON examples.employees TO joe;
GRANT SELECT, UPDATE, DELETE ON examples.employees TO joe;
GRANT USAGE ON SCHEMA examples TO joe;

GRANT CREATE ON SCHEMA examples TO joe;
--REVOKE <permission> ON <ENTITY> FROM <USER_NAME>
REVOKE CREATE ON SCHEMA examples FROM joe;

