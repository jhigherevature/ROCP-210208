
-- Creating User tables to set up a trade system

drop table if exists project.carlos cascade;

create table project.carlos (
	card_id INTEGER references cards(card_id) on delete cascade,
	num_owned INTEGER,
	num_fortrade INTEGER,
	num_wanted INTEGER,
	user_email INTEGER references user_email(email_id) on delete cascade
);

insert into project.carlos values (1,10,5,0,1);
insert into project.carlos values (58,3,0,1,1);
insert into project.carlos values (71,1,0,2,1);
insert into project.carlos values (73,5,3,0,1);
insert into project.carlos values (68,8,3,0,1);
insert into project.carlos values (145,0,0,4,1);
insert into project.carlos values (147,1,0,1,1);
insert into project.carlos values (159,2,0,2,1);
insert into project.carlos values (89,5,3,0,1);
insert into project.carlos values (90,2,2,0,1);
insert into project.carlos values (93,1,1,0,1);
insert into project.carlos values (99,6,2,0,1);
insert into project.carlos values (119,2,2,0,1);
insert into project.carlos values (231,3,3,0,1);




drop table if exists project.colin cascade;

create table project.colin (
	card_id INTEGER references cards(card_id) on delete cascade,
	num_owned INTEGER,
	num_fortrade INTEGER,
	num_wanted INTEGER,
	user_email INTEGER references user_email(email_id) on delete cascade
);

insert into project.colin values (1,2,2,0,2);
insert into project.colin values (58,3,3,0,2);
insert into project.colin values (71,4,4,0,2);
insert into project.colin values (73,2,0,2,2);
insert into project.colin values (68,2,2,0,2);
insert into project.colin values (145,4,4,0,2);
insert into project.colin values (147,5,1,0,2);
insert into project.colin values (159,6,2,0,2);
insert into project.colin values (89,1,0,3,2);
insert into project.colin values (90,2,0,2,2);
insert into project.colin values (93,3,0,1,2);
insert into project.colin values (99,0,0,4,2);
insert into project.colin values (119,2,0,2,2);
insert into project.colin values (231,1,0,4,2);