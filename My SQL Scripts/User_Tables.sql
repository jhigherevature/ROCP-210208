
-- Creating User tables to set up a trade system

drop table if exists project.carlos cascade;

create table project.carlos (
	card_id INTEGER references cards(card_id) on delete cascade,
	num_owned INTEGER,
	num_fortrade INTEGER,
	num_wanted INTEGER,
	user_email VARCHAR (50)
);


drop table if exists project.chip cascade;

create table project.chip (
	card_id INTEGER references cards(card_id) on delete cascade,
	num_owned INTEGER,
	num_fortrade INTEGER,
	num_wanted INTEGER,
	user_email VARCHAR (50)
);

drop table if exists project.colin cascade;

create table project.colin (
	card_id INTEGER references cards(card_id) on delete cascade,
	num_owned INTEGER,
	num_fortrade INTEGER,
	num_wanted INTEGER,
	user_email VARCHAR (50)
);


drop table if exists project.tommy cascade;

create table project.tommy (
	card_id INTEGER references cards(card_id) on delete cascade,
	num_owned INTEGER,
	num_fortrade INTEGER,
	num_wanted INTEGER,
	user_email VARCHAR (50)
);