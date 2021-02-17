DROP TABLE IS EXISTS state CASCADE;
DROP TABLE IS EXISTS sports CASCADE;
DROP TABLE IS EXISTS team CASCADE;
DROP TABLE IS EXISTS players CASCADE;

CREATE TABLE state (
	state_id SERIAL,
	state_name varchar(50),
	
--	create a primary key constraint on the state table, called state_pk
	CONSTRAINT state_pk PRIMARY KEY (state_id)
);

CREATE TABLE sports (
	sport_id SERIAL PRIMARY KEY,
	sport_name varchar(50)
);

CREATE TABLE team (
	team_id SERIAL PRIMARY KEY,
	team_name varchar(40) check(length(team_name) > 1),
	team_state integer,
	team_sport integer,
	
	/* Using ON DELETE CASCADE will make sure that records in our 
	 * team table will also be removed when the associated table data
	 * is removed
	 */ 
	CONSTRAINT team_state_fk FOREIGN KEY (team_state) REFERENCES state(state_id) ON DELETE CASCADE,
	CONSTRAINT team_sport_fk FOREIGN KEY (team_sport) REFERENCES sports(sport_id) ON DELETE CASCADE
);

CREATE TABLE players(
	player_id SERIAL PRIMARY KEY,
	team_id integer REFERENCES team(team_id) ON DELETE CASCADE,
	player_name varchar(100),
	player_salary integer,
	draft_date date
);

INSERT INTO state(state_name) VALUES('Colorado');
INSERT INTO state(state_name) VALUES('California');
INSERT INTO state(state_name) VALUES('Texas');

INSERT INTO sports(sport_name) VALUES('football');
INSERT INTO sports(sport_name) VALUES('basketball');

INSERT INTO team VALUES(DEFAULT,'broncos',1,1);
INSERT INTO team VALUES(DEFAULT,'49ers',2,1);
INSERT INTO team VALUES(DEFAULT,'cowboys',3,1);
INSERT INTO team VALUES(DEFAULT,'nuggets',1,2);
INSERT INTO team VALUES(DEFAULT,'lakers',2,2);
INSERT INTO team VALUES(DEFAULT,'spurs',3,2);

INSERT INTO players VALUES (DEFAULT,1,'Bill Smith',450000,DATE '2020-02-08');
INSERT INTO players VALUES (DEFAULT,1,'Matt Jones',470000,TO_DATE('2020/10/15','YYYY/MM/DD'));
INSERT INTO players VALUES (DEFAULT,1,'Joe Williams',480000,'2021-01-31');
INSERT INTO players VALUES (DEFAULT,1,'Gary Brown',447500,CURRENT_DATE);

INSERT INTO players VALUES (DEFAULT,2,'Dill Smith',650000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,2,'Pat Jones',660000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,2,'Moe Williams',620000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,2,'Larry Brown',635000,CURRENT_DATE);

INSERT INTO players VALUES (DEFAULT,3,'Hill Smith',700000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,3,'Cat Jones',710000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,3,'Poe Williams',690000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,3,'Perry Brown',730000,CURRENT_DATE);

INSERT INTO players VALUES (DEFAULT,4,'Phil Smith',550000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,4,'Kat Jones',590000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,4,'Whoa Williams',540000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,4,'Terri Brown',620000,CURRENT_DATE);

INSERT INTO players VALUES (DEFAULT,5,'Will Smith',580000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,5,'Yatt Jones',550000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,5,'Slo-Mo Williams',540000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,5,'Jerri Brown',580000,CURRENT_DATE);

INSERT INTO players VALUES (DEFAULT,6,'Nill Smith',600000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,6,'Fatt Jones',580000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,6,'Romo Williams',590000,CURRENT_DATE);
INSERT INTO players VALUES (DEFAULT,6,'Scary Brown',610000,CURRENT_DATE);
