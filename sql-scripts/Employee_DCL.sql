/*
 * Before dropping a user, we must remove privileges 
 * because our DB will recognize that this user has certain
 * power to manipulate data within a specific table/tables 
 */
revoke all privileges on examples.employees from joe;
-- we can use 'if exists' to check that the user exists before 
-- dropping users as well
drop user if exists joe;

--Use the create statement to create users as well
create user joe with password 'password';

--GRANT <permission> ON <ENTITY> TO <USER_NAME>
grant insert on examples.employees to joe;
grant select, update, delete on examples.employees to joe;

grant create on schema examples to joe;
--REVOKE <permission> ON <ENTITY> FROM <USER_NAME>
revoke create on schema examples from joe;


