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


drop table if exists project.supertype cascade;
create table project.supertype (
	type_id SERIAL primary key,
	type_name VARCHAR (50)
);

insert into project.supertype values (0,'None');
insert into project.supertype values (default,'Basic');
insert into project.supertype values (default,'Legendary');


drop table if exists project.cardcolor cascade;
create table project.cardcolor (
	type_id SERIAL primary key,
	type_name VARCHAR (50)
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



