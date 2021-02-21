drop table if exists state cascade;
drop table if exists sports cascade;
drop table if exists team cascade;
drop table if exists players cascade;

create table state (
	state_id SERIAL,
	state_name varchar(50),

	-- 	create a primary key constraint on the state table called state_pk
	constraint state_pk primary key (state_id)
);

create table sports(
	sport_id SERIAL primary key,
	sport_name varchar (50)
);

create table team (
	team_id SERIAL primary key,
	team_name varchar (40) check(length(team_name) > 1),
	team_state integer,
	team_sport integer,
	/* 
	 * using ON DELETE CASCADE will make sure that records in our
	 * team table when the associated data is removed
	 */
	constraint team_state_fk foreign key(team_state) references state(state_id) on delete cascade,
	constraint team_sport_fk foreign key(team_sport) references sports(sport_id) on delete cascade

);

create table players(
	player_id SERIAL primary key,
	team_id integer references team(team_id) on delete cascade,
	player_name varchar (100),
	player_salary integer,
	draft_date date
);

insert into state(state_name) values('Colorado');
insert into state(state_name) values('California');
insert into state(state_name) values('Texas');

insert into sports(sport_name) values('football');
insert into sports(sport_name) values('basketball');

insert into team values(DEFAULT,'Broncos',1,1);
insert into team values(default,'49ers',2,1);
insert into team values(default,'Nuggets',2,2);
insert into team values(default,'Cowboys',3,1);
--insert into team values(5,'fake',6,12); will not work because referenced values do not exist


