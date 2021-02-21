drop table if exists project.cards cascade;
create table project.cards (
	card_id SERIAL primary key,
	card_name VARCHAR (50),
	card_color INTEGER references cardcolor(color_id) on delete cascade,
	card_type INTEGER references cardtype(type_id) on delete cascade,
	card_subtype VARCHAR (50),
	card_supertype INTEGER references supertype(supertype_id) on delete cascade,
	card_rarity INTEGER references rarity(rarity_id) on delete cascade,
	card_set VARCHAR (50)
);
-- Instants, Sorceries, some Artifacts, some Enchantments, and some Lands will not have subtypes.
-- The values for these in the "card_subtype" category will be set to null.

-- WHITE CARDS
insert into project.cards values (default,'Alseid of Lifes Bounty',1,4,'Nymph',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Archon of Falling Stars',1,2,'Archon',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Archon of Suns Grace',1,2,'Archon',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Banshing Light',1,3,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'The Birth of Meletis',1,3,'Saga',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Captivating Unicorn',1,2,'Unicorn',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Commanding Presence',1,3,'Aura',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Dawn Evangel',1,4,'Human Cleric',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Daxos, Blessed by the Sun',1,2,'Demigod',2,2,'Theros Beyond Death');
insert into project.cards values (default,'Daybreak Chimera',1,2,'Chimera',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Dreadful Apathy',1,3,'Aura',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Eidolon of Obstruction',1,4,'Spirit',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Elspeth Conquers Death',1,3,'Saga',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Elspeth, Suns Nemesis',1,7,'Elspeth',2,4,'Theros Beyond Death');
insert into project.cards values (default,'Favored of Iroas',1,2,'Human Soldier',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Flicker of Fate',1,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Glory Bearers',1,4,'Human Cleric',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Heliod, Sun-Crowned',1,4,'God',2,4,'Theros Beyond Death');
insert into project.cards values (default,'Heliods Intervention',1,5,null,0,3,'Theros Beyond Death');
insert into project.cards values (default,'Heliods Pilgrim',1,2,'Human Cleric',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Heliods Punishment',1,3,'Aura',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Hero of the Pride',1,2,'Cat Soldier',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Hero of the Winds',1,2,'Human Soldier',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Idyllic Tutor',1,8,null,0,3,'Theros Beyond Death');
insert into project.cards values (default,'Indomitable Will',1,3,'Aura',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Karametras Blessing',1,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Lagonna-Band Storyteller',1,2,'Centaur Advisor',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Leonin of the Lost Pride',1,2,'Cat Warrior',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Nyxborn Courser',1,4,'Centaur Scout',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Omen of the Sun',1,3,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Phalanx Tactics',1,5,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Pious Wayfarer',1,2,'Human Scout',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Reverent Hoplite',1,2,'Human Soldier',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Revoke Existence',1,8,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Rumbling Sentry',1,2,'Giant',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Sentinels Eyes',1,3,'Aura',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Shatter the Sky',1,8,null,0,3,'Theros Beyond Death');
insert into project.cards values (default,'Sunmane Pegasus',1,2,'Pegasus',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Taranika, Akroan Veteran',1,2,'Human Soldier',2,3,'Theros Beyond Death');
insert into project.cards values (default,'Transcendent Envoy',1,4,'Griffin',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Triumpahnt Surge',1,5,null,0,1,'Theros Beyond Death');

-- BLUE CARDS
insert into project.cards values (default,'Alirios, Enraptured',2,2,'Human',2,2,'Theros Beyond Death');
insert into project.cards values (default,'Ashioks Erasure',2,3,null,0,3,'Theros Beyond Death');
insert into project.cards values (default,'Brine Giant',2,2,'Giant',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Callaphe, Beloved of the Sea',2,4,'Demigod',2,2,'Theros Beyond Death');
insert into project.cards values (default,'Chain to Memory',2,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Deny the Divine',2,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Eidolon of Philosophy',2,4,'Spirit',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Elite Instructor',2,2,'Human Wizard',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Glimpse of Freedom',2,5,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Ichthyomorphosis',2,3,'Aura',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Kiora Bests the Sea God',2,3,'Saga',0,4,'Theros Beyond Death');
insert into project.cards values (default,'Medomais Prophecy',2,3,'Saga',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Memory Drain',2,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Nadir Kraken',2,2,'Kraken',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Naiad of Hidden Coves',2,4,'Nymph',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Nyxborn Seaguard',2,4,'Merfolk Soldier',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Omen of the Sea',2,3,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'One with the Stars',2,3,'Aura',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Protean Thaumaturge',2,2,'Human Wizard',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Riptide Turtle',2,2,'Turtle',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Sage of Mysteries',2,2,'Human Wizard',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Sea Gods Scorn',2,8,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Shimmering Chimera',2,4,'Chimera',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Shoal Kraken',2,2,'Kraken',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Sleep of the Dead',2,8,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Starlit Mantle',2,3,'Aura',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Stern Dismissal',2,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Stinging Lionfish',2,4,'Fish',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Sweet Oblivion',2,8,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Thassa, Deep-Dwelling',2,4,'God',2,4,'Theros Beyond Death');
insert into project.cards values (default,'Thassas Intervention',2,5,null,0,3,'Theros Beyond Death');
insert into project.cards values (default,'Thassas Oracle',2,2,'Merfolk Wizard',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Thirst for Meaning',2,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Threnody Singer',2,2,'Siren',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Thryx, the Sudden Storm',2,2,'Elemental Giant',2,3,'Theros Beyond Death');
insert into project.cards values (default,'Towering-Wave Mystic',2,2,'Merfolk Wizard',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Triton Waverider',2,2,'Merfolk Wizard',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Vexing Gull',2,2,'Bird',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Wavebreak Hippocamp',2,4,'Horse Fish',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Whirlwind Denial',2,5,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Witness of Tomorrows',2,4,'Sphinx',0,1,'Theros Beyond Death');

-- BLACK CARDS
insert into project.cards values (default,'Agonizing Remorse',3,8,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Aphemia, the Cacophony',3,4,'Harpy',2,3,'Theros Beyond Death');
insert into project.cards values (default,'Aspect of Lamprey',3,3,'Aura',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Blight-Breath Catoblepas',3,2,'Beast',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Cling to Dust',3,5,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Discordant Piper',3,2,'Zombie Satyr',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Drag to the Underworld',3,5,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Eat to Extinction',3,5,null,0,3,'Theros Beyond Death');
insert into project.cards values (default,'Elspeths Nightmare',3,3,'Aura',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Enemy of Enlightenment',3,4,'Demon',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Erebos, Bleak-Hearted',3,4,'God',2,4,'Theros Beyond Death');
insert into project.cards values (default,'Ereboss Intervention',3,5,null,0,3,'Theros Beyond Death');
insert into project.cards values (default,'Final Death',3,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Fruit of Tizerus',3,8,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Funeral Rites',3,8,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Gravebreaker Lamia',3,4,'Snake Lamia',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Gray Merchant of Asphodel',3,2,'Zombie',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Grim Physician',3,2,'Zombie',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Hateful Eidolon',3,4,'Spirit',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Inevitable End',3,3,'Aura',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Lampad of Deaths Vigil',3,4,'Nymph',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Minions Return',3,3,'Aura',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Mire Triton',3,2,'Zombie Merfolk',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Mires Grasp',3,3,'Aura',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Mogiss Favor',3,3,'Aura',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Nightmare Shpeherd',3,4,'Demon',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Nyxborn Marauder',3,4,'Minotaur',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Omen of the Dead',3,3,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Pharikas Libation',3,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Pharikas Spawn',3,2,'Gorgon',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Rage-Scarred Berserker',3,2,'Minotaur Berserker',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Scavenging Harpy',3,2,'Harpy',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Soulreaper of Mogis',3,4,'Minotaur Shaman',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Temple Thief',3,2,'Human Rogue',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Treacherous Blessing',3,3,null,0,3,'Theros Beyond Death');
insert into project.cards values (default,'Tymaret Calls the Dead',3,3,'Saga',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Tymaret, Chosen from Death',3,4,'Demigod',2,2,'Theros Beyond Death');
insert into project.cards values (default,'Underworld Charger',3,2,'Nightmare Horse',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Underworld Dreams',3,3,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Venomous Hierophant',3,2,'Gorgon Cleric',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Woe Strider',3,2,'Horror',0,3,'Theros Beyond Death');

-- RED CARDS
insert into project.cards values (default,'The Akroan War',4,3,'Saga',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Anax, Hardened in the Forge',4,4,'Demigod',2,2,'Theros Beyond Death');
insert into project.cards values (default,'Arena Trickster',4,2,'Human Shaman',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Aspect of Manticore',4,3,'Aura',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Blood Aspirant',4,2,'Satyr Berserker',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Careless Celebrant',4,2,'Satyr Shaman',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Dreamshaper Shaman',4,4,'Minotaur Shaman',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Dreamstalker Manticore',4,4,'Manticore',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Escape Velocity',4,3,'Aura',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Fateful End',4,5,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Final Flare',4,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Flummoxed Cyclops',4,2,'Cyclops',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Furious Rise',4,3,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Hero of the Games',4,2,'Human Soldier',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Heroes of the Revel',4,2,'Satyr Soldier',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Impending Doom',4,3,'Aura',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Incendiary Oracle',4,2,'Human Shaman',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Infuriate',4,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Iroass Blessing',4,3,'Aura',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Irreverant Revelers',4,2,'Satyr',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Nysborn Brute',4,4,'Cyclops',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Omen of the Forge',4,3,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Oread of Mountains Blaze',4,3,'Nymph',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Ox of Agonas',4,2,'Ox',0,4,'Theros Beyond Death');
insert into project.cards values (default,'Phoenix of Ash',4,2,'Phoenix',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Portent of Betrayal',4,8,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Purphoros, Bronze-Blooded',4,4,'God',2,4,'Theros Beyond Death');
insert into project.cards values (default,'Purphoross Intervention',4,8,null,0,3,'Theros Beyond Death');
insert into project.cards values (default,'Satyrs Cunning',4,8,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'Skophos Maze-Warden',4,2,'Minotaur Warrior',0,2,'Theros Beyond Death');
insert into project.cards values (default,'Skophos Warleader',4,2,'Minotaur Warrior',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Stampede Rider',4,2,'Satyr',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Storm Herald',4,2,'Human Shaman',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Storms Wrath',4,8,null,0,3,'Theros Beyond Death');
insert into project.cards values (default,'Tectonic Giant',4,2,'Elemental Giant',0,3,'Theros Beyond Death');
insert into project.cards values (default,'Thrill of Possibility',4,5,null,0,1,'Theros Beyond Death');
insert into project.cards values (default,'The Triumph fo Anax',4,3,'Saga',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Underworld Breach',4,3,null,0,3,'Theros Beyond Death');
insert into project.cards values (default,'Underworld Fires',4,8,null,0,2,'Theros Beyond Death');
insert into project.cards values (default,'Underworld Rage-Hound',4,2,'Elemental Hound',0,1,'Theros Beyond Death');
insert into project.cards values (default,'Wrap in Flames',4,8,null,0,1,'Theros Beyond Death');

-- GREEN CARDS
