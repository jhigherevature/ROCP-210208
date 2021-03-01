
-- Creating Users to manipulate their respective tables

revoke all privileges on carlos, colin, cards, cardset, cardtype, cardcolor, rarity, supertype, players from carlos;
revoke all privileges on carlos, colin, cards, cardset, cardtype, cardcolor, rarity, supertype, players from colin;


drop user if exists carlos;
drop user if exists colin;


create user carlos with password 'carlos';
grant insert, select, update, delete on project.carlos to carlos;
grant select on project.colin to carlos;


create user colin with password 'colin';
grant insert, select, update, delete on project.colin to colin;
grant select on project.carlos to colin;

grant select on project.cards to carlos, colin;
grant select on project.cardcolor to carlos, colin;
grant select on project.cardtype to carlos, colin;
grant select on project.cardset to carlos, colin;
grant select on project.rarity to carlos, colin;
grant select on project.supertype to carlos, colin;
grant select on project.players to carlos, colin;


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
revoke all privileges on project.players from brian;

drop user if exists brian;

create user brian with password 'brian';

grant insert, select, update, delete, truncate, references, trigger on project.cardcolor to brian;
grant insert, select, update, delete, truncate, references, trigger on project.cards to brian;
grant insert, select, update, delete, truncate, references, trigger on project.cardset to brian;
grant insert, select, update, delete, truncate, references, trigger on project.cardtype to brian;
grant insert, select, update, delete, truncate, references, trigger on project.rarity to brian;
grant insert, select, update, delete, truncate, references, trigger on project.supertype to brian;
grant insert, select, update, delete, truncate, references, trigger on project.carlos to brian;
grant insert, select, update, delete, truncate, references, trigger on project.colin to brian;
grant insert, select, update, delete, truncate, references, trigger on project.players to brian;
grant insert, select, update, delete, truncate, references, trigger on project.login to brian;


grant create, usage on schema project to brian;