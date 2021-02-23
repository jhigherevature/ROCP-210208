
-- Creating Users to manipulate their respective tables

revoke all privileges on project.carlos from carlos;
revoke all privileges on project.chip from chip;
revoke all privileges on project.colin from colin;
revoke all privileges on project.tommy from tommy;

drop user if exists carlos;
drop user if exists chip;
drop user if exists colin;
drop user if exists tommy;

create user carlos with password 'carlos';
grant insert, select, update, delete on project.carlos to carlos;

create user chip with password 'chip';
grant insert, select, update, delete on project.chip to chip;

create user colin with password 'colin';
grant insert, select, update, delete on project.colin to colin;

create user tommy with password 'tommy';
grant insert, select, update, delete on project.tommy to tommy;


-- Creating an admin to update all information pertaining to cards and trading system, and ban (drop) users if necessary

revoke all privileges on schema project from brian;
revoke all privileges on project.cardcolor from brian;
revoke all privileges on project.cards from brian;
revoke all privileges on project.cardset from brian;
revoke all privileges on project.cardtype from brian;
revoke all privileges on project.rarity from brian;
revoke all privileges on project.supertype from brian;
revoke all privileges on project.carlos from brian;
revoke all privileges on project.chip from brian;
revoke all privileges on project.colin from brian;
revoke all privileges on project.tommy from brian;

drop user if exists brian;

create user brian with password 'brian';

grant insert, select, update, delete on project.cardcolor to brian;
grant insert, select, update, delete on project.cards to brian;
grant insert, select, update, delete on project.cardset to brian;
grant insert, select, update, delete on project.cardtype to brian;
grant insert, select, update, delete on project.rarity to brian;
grant insert, select, update, delete on project.supertype to brian;
grant insert, select, update, delete on project.carlos to brian;
grant insert, select, update, delete on project.chip to brian;
grant insert, select, update, delete on project.colin to brian;
grant insert, select, update, delete on project.tommy to brian;

grant create on schema project to brian;
