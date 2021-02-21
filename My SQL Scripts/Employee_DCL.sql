/* 
 * Before dropping a user, we must remove privileges because our db will 
 * recognize that this user has certain power to manipulate
 * data within a specific table/tables.
 */ 
revoke all privileges on examples.employees from joe;
revoke all privileges on schema examples from joe;
--we can use 'if exists' to check that a user exists before dropping as well
drop user if exists joe;

-- use the create statement to create users as well
create user joe with password 'password';

--GRANT <permission> ON <ENTITY> TO <USERNAME>
grant insert on examples.employees to joe;
grant select, update, delete on examples.employees to joe;

grant create on schema examples to joe;
--REVOKE <PERMISSION> ON <ENTITY> FROM <USERNAME>
revoke create on schema examples from joe;

