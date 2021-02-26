drop table if exists project.cardtype cascade;
create table project.cardtype (
	type_id SERIAL primary key,
	type_name VARCHAR (50)
);

insert into project.cardtype values (default,'Artifact');
insert into project.cardtype values (default,'Creature');
insert into project.cardtype values (default,'Enchantment');
insert into project.cardtype values (default,'Enchantment Creature');
insert into project.cardtype values (default,'Instant');
insert into project.cardtype values (default,'Land');
insert into project.cardtype values (default,'Planeswalker');
insert into project.cardtype values (default,'Sorcery');
insert into project.cardtype values (default,'Artifact Creature');

drop table if exists project.supertype cascade;
create table project.supertype (
	supertype_id SERIAL primary key,
	supertype_name VARCHAR (50)
);

insert into project.supertype values (0,'None');
insert into project.supertype values (default,'Basic');
insert into project.supertype values (default,'Legendary');


drop table if exists project.cardcolor cascade;
create table project.cardcolor (
	color_id SERIAL primary key,
	color_name VARCHAR (50)
);

insert into project.cardcolor values (default,'White');
insert into project.cardcolor values (default,'Blue');
insert into project.cardcolor values (default,'Black');
insert into project.cardcolor values (default,'Red');
insert into project.cardcolor values (default,'Green');
insert into project.cardcolor values (default,'White/Blue');
insert into project.cardcolor values (default,'White/Black');
insert into project.cardcolor values (default,'White/Red');
insert into project.cardcolor values (default,'White/Green');
insert into project.cardcolor values (default,'Blue/Black');
insert into project.cardcolor values (default,'Blue/Red');
insert into project.cardcolor values (default,'Blue/Green');
insert into project.cardcolor values (default,'Black/Red');
insert into project.cardcolor values (default,'Black/Green');
insert into project.cardcolor values (default,'Red/Green');
insert into project.cardcolor values (default,'Colorless');


drop table if exists project.rarity cascade;
create table project.rarity (
	rarity_id SERIAL primary key,
	rarity_name VARCHAR (50)
);

insert into project.rarity values (default,'common');
insert into project.rarity values (default,'uncommon');
insert into project.rarity values (default,'rare');
insert into project.rarity values (default,'mythic rare');


drop table if exists project.cardset cascade;
create table project.cardset (
	cardset_id SERIAL primary key,
	cardset_name VARCHAR (50)
);

insert into project.cardset values(default,'Theros: Beyond Death');


drop table if exists project.user_email cascade;
create table project.user_email (
	email_id SERIAL primary key,
	user_email VARCHAR(50)
);

insert into project.user_email values (default, 'carlos@email.com');
insert into project.user_email values (default, 'colin@email.com');


