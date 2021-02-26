
-- Creating Users to manipulate their respective tables

revoke all privileges on carlos, colin, cards, cardset, cardtype, cardcolor, rarity, supertype, user_email from carlos;
revoke all privileges on carlos, colin, cards, cardset, cardtype, cardcolor, rarity, supertype, user_email from colin;


drop user if exists carlos;
drop user if exists colin;


create user carlos with password 'carlos';
grant insert, update, delete on project.carlos to carlos;


create user colin with password 'colin';
grant insert, update, delete on project.colin to colin;

grant select on project.cards to carlos, colin;
grant select on project.cardcolor to carlos, colin;
grant select on project.cardtype to carlos, colin;
grant select on project.cardset to carlos, colin;
grant select on project.rarity to carlos, colin;
grant select on project.supertype to carlos, colin;
grant select on project.user_email to carlos, colin;


-- Creating an admin to update all information pertaining to cards and trading system, and ban (drop) users if necessary

revoke all privileges on schema project from brian;
revoke all privileges on project.cardcolor from brian;
revoke all privileges on project.cards from brian;
revoke all privileges on project.cardset from brian;
revoke all privileges on project.cardtype from brian;
revoke all privileges on project.rarity from brian;
revoke all privileges on project.supertype from brian;
revoke all privileges on project.carlos from brian;
revoke all privileges on project.colin from brian;
revoke all privileges on project.user_email from brian;

drop user if exists brian;

create user brian with password 'brian';

grant insert, select, update, delete on project.cardcolor to brian;
grant insert, select, update, delete on project.cards to brian;
grant insert, select, update, delete on project.cardset to brian;
grant insert, select, update, delete on project.cardtype to brian;
grant insert, select, update, delete on project.rarity to brian;
grant insert, select, update, delete on project.supertype to brian;
grant insert, select, update, delete on project.carlos to brian;
grant insert, select, update, delete on project.colin to brian;
grant insert, select, update, delete on project.user_email to brian;

grant create on schema project to brian;
