drop table if exists project.cards cascade;
create table project.cards (
	card_id SERIAL primary key,
	card_name VARCHAR (50),
	card_color INTEGER references cardcolor(color_id) on delete cascade,
	card_type INTEGER references cardtype(type_id) on delete cascade,
	card_subtype VARCHAR (50),
	card_supertype INTEGER references supertype(supertype_id) on delete cascade,
	card_rarity INTEGER references rarity(rarity_id) on delete cascade,
	card_set INTEGER references cardset(cardset_id) on delete cascade
);
-- Instants, Sorceries, some Artifacts, some Enchantments, and some Lands will not have subtypes.
-- The values for these in the "card_subtype" category will be set to null.

-- WHITE CARDS
insert into project.cards values (default,'Alseid of Lifes Bounty',1,4,'Nymph',0,2,1);
insert into project.cards values (default,'Archon of Falling Stars',1,2,'Archon',0,2,1);
insert into project.cards values (default,'Archon of Suns Grace',1,2,'Archon',0,3,1);
insert into project.cards values (default,'Banshing Light',1,3,null,0,2,1);
insert into project.cards values (default,'The Birth of Meletis',1,3,'Saga',0,2,1);
insert into project.cards values (default,'Captivating Unicorn',1,2,'Unicorn',0,1,1);
insert into project.cards values (default,'Commanding Presence',1,3,'Aura',0,2,1);
insert into project.cards values (default,'Dawn Evangel',1,4,'Human Cleric',0,2,1);
insert into project.cards values (default,'Daxos, Blessed by the Sun',1,2,'Demigod',2,2,1);
insert into project.cards values (default,'Daybreak Chimera',1,2,'Chimera',0,1,1);
insert into project.cards values (default,'Dreadful Apathy',1,3,'Aura',0,1,1);
insert into project.cards values (default,'Eidolon of Obstruction',1,4,'Spirit',0,3,1);
insert into project.cards values (default,'Elspeth Conquers Death',1,3,'Saga',0,3,1);
insert into project.cards values (default,'Elspeth, Suns Nemesis',1,7,'Elspeth',2,4,1);
insert into project.cards values (default,'Favored of Iroas',1,2,'Human Soldier',0,2,1);
insert into project.cards values (default,'Flicker of Fate',1,5,null,0,1,1);
insert into project.cards values (default,'Glory Bearers',1,4,'Human Cleric',0,1,1);
insert into project.cards values (default,'Heliod, Sun-Crowned',1,4,'God',2,4,1);
insert into project.cards values (default,'Heliods Intervention',1,5,null,0,3,1);
insert into project.cards values (default,'Heliods Pilgrim',1,2,'Human Cleric',0,1,1);
insert into project.cards values (default,'Heliods Punishment',1,3,'Aura',0,2,1);
insert into project.cards values (default,'Hero of the Pride',1,2,'Cat Soldier',0,1,1);
insert into project.cards values (default,'Hero of the Winds',1,2,'Human Soldier',0,2,1);
insert into project.cards values (default,'Idyllic Tutor',1,8,null,0,3,1);
insert into project.cards values (default,'Indomitable Will',1,3,'Aura',0,1,1);
insert into project.cards values (default,'Karametras Blessing',1,5,null,0,1,1);
insert into project.cards values (default,'Lagonna-Band Storyteller',1,2,'Centaur Advisor',0,2,1);
insert into project.cards values (default,'Leonin of the Lost Pride',1,2,'Cat Warrior',0,1,1);
insert into project.cards values (default,'Nyxborn Courser',1,4,'Centaur Scout',0,1,1);
insert into project.cards values (default,'Omen of the Sun',1,3,null,0,1,1);
insert into project.cards values (default,'Phalanx Tactics',1,5,null,0,2,1);
insert into project.cards values (default,'Pious Wayfarer',1,2,'Human Scout',0,1,1);
insert into project.cards values (default,'Reverent Hoplite',1,2,'Human Soldier',0,2,1);
insert into project.cards values (default,'Revoke Existence',1,8,null,0,1,1);
insert into project.cards values (default,'Rumbling Sentry',1,2,'Giant',0,1,1);
insert into project.cards values (default,'Sentinels Eyes',1,3,'Aura',0,1,1);
insert into project.cards values (default,'Shatter the Sky',1,8,null,0,3,1);
insert into project.cards values (default,'Sunmane Pegasus',1,2,'Pegasus',0,1,1);
insert into project.cards values (default,'Taranika, Akroan Veteran',1,2,'Human Soldier',2,3,1);
insert into project.cards values (default,'Transcendent Envoy',1,4,'Griffin',0,1,1);
insert into project.cards values (default,'Triumpahnt Surge',1,5,null,0,1,1);

-- BLUE CARDS
insert into project.cards values (default,'Alirios, Enraptured',2,2,'Human',2,2,1);
insert into project.cards values (default,'Ashioks Erasure',2,3,null,0,3,1);
insert into project.cards values (default,'Brine Giant',2,2,'Giant',0,1,1);
insert into project.cards values (default,'Callaphe, Beloved of the Sea',2,4,'Demigod',2,2,1);
insert into project.cards values (default,'Chain to Memory',2,5,null,0,1,1);
insert into project.cards values (default,'Deny the Divine',2,5,null,0,1,1);
insert into project.cards values (default,'Eidolon of Philosophy',2,4,'Spirit',0,1,1);
insert into project.cards values (default,'Elite Instructor',2,2,'Human Wizard',0,1,1);
insert into project.cards values (default,'Glimpse of Freedom',2,5,null,0,2,1);
insert into project.cards values (default,'Ichthyomorphosis',2,3,'Aura',0,1,1);
insert into project.cards values (default,'Kiora Bests the Sea God',2,3,'Saga',0,4,1);
insert into project.cards values (default,'Medomais Prophecy',2,3,'Saga',0,2,1);
insert into project.cards values (default,'Memory Drain',2,5,null,0,1,1);
insert into project.cards values (default,'Nadir Kraken',2,2,'Kraken',0,3,1);
insert into project.cards values (default,'Naiad of Hidden Coves',2,4,'Nymph',0,1,1);
insert into project.cards values (default,'Nyxborn Seaguard',2,4,'Merfolk Soldier',0,1,1);
insert into project.cards values (default,'Omen of the Sea',2,3,null,0,1,1);
insert into project.cards values (default,'One with the Stars',2,3,'Aura',0,2,1);
insert into project.cards values (default,'Protean Thaumaturge',2,2,'Human Wizard',0,3,1);
insert into project.cards values (default,'Riptide Turtle',2,2,'Turtle',0,1,1);
insert into project.cards values (default,'Sage of Mysteries',2,2,'Human Wizard',0,2,1);
insert into project.cards values (default,'Sea Gods Scorn',2,8,null,0,2,1);
insert into project.cards values (default,'Shimmering Chimera',2,4,'Chimera',0,2,1);
insert into project.cards values (default,'Shoal Kraken',2,2,'Kraken',0,2,1);
insert into project.cards values (default,'Sleep of the Dead',2,8,null,0,1,1);
insert into project.cards values (default,'Starlit Mantle',2,3,'Aura',0,1,1);
insert into project.cards values (default,'Stern Dismissal',2,5,null,0,1,1);
insert into project.cards values (default,'Stinging Lionfish',2,4,'Fish',0,2,1);
insert into project.cards values (default,'Sweet Oblivion',2,8,null,0,2,1);
insert into project.cards values (default,'Thassa, Deep-Dwelling',2,4,'God',2,4,1);
insert into project.cards values (default,'Thassas Intervention',2,5,null,0,3,1);
insert into project.cards values (default,'Thassas Oracle',2,2,'Merfolk Wizard',0,3,1);
insert into project.cards values (default,'Thirst for Meaning',2,5,null,0,1,1);
insert into project.cards values (default,'Threnody Singer',2,2,'Siren',0,2,1);
insert into project.cards values (default,'Thryx, the Sudden Storm',2,2,'Elemental Giant',2,3,1);
insert into project.cards values (default,'Towering-Wave Mystic',2,2,'Merfolk Wizard',0,1,1);
insert into project.cards values (default,'Triton Waverider',2,2,'Merfolk Wizard',0,1,1);
insert into project.cards values (default,'Vexing Gull',2,2,'Bird',0,1,1);
insert into project.cards values (default,'Wavebreak Hippocamp',2,4,'Horse Fish',0,3,1);
insert into project.cards values (default,'Whirlwind Denial',2,5,null,0,2,1);
insert into project.cards values (default,'Witness of Tomorrows',2,4,'Sphinx',0,1,1);

-- BLACK CARDS
insert into project.cards values (default,'Agonizing Remorse',3,8,null,0,2,1);
insert into project.cards values (default,'Aphemia, the Cacophony',3,4,'Harpy',2,3,1);
insert into project.cards values (default,'Aspect of Lamprey',3,3,'Aura',0,1,1);
insert into project.cards values (default,'Blight-Breath Catoblepas',3,2,'Beast',0,1,1);
insert into project.cards values (default,'Cling to Dust',3,5,null,0,2,1);
insert into project.cards values (default,'Discordant Piper',3,2,'Zombie Satyr',0,1,1);
insert into project.cards values (default,'Drag to the Underworld',3,5,null,0,2,1);
insert into project.cards values (default,'Eat to Extinction',3,5,null,0,3,1);
insert into project.cards values (default,'Elspeths Nightmare',3,3,'Aura',0,2,1);
insert into project.cards values (default,'Enemy of Enlightenment',3,4,'Demon',0,2,1);
insert into project.cards values (default,'Erebos, Bleak-Hearted',3,4,'God',2,4,1);
insert into project.cards values (default,'Ereboss Intervention',3,5,null,0,3,1);
insert into project.cards values (default,'Final Death',3,5,null,0,1,1);
insert into project.cards values (default,'Fruit of Tizerus',3,8,null,0,1,1);
insert into project.cards values (default,'Funeral Rites',3,8,null,0,1,1);
insert into project.cards values (default,'Gravebreaker Lamia',3,4,'Snake Lamia',0,3,1);
insert into project.cards values (default,'Gray Merchant of Asphodel',3,2,'Zombie',0,2,1);
insert into project.cards values (default,'Grim Physician',3,2,'Zombie',0,1,1);
insert into project.cards values (default,'Hateful Eidolon',3,4,'Spirit',0,2,1);
insert into project.cards values (default,'Inevitable End',3,3,'Aura',0,2,1);
insert into project.cards values (default,'Lampad of Deaths Vigil',3,4,'Nymph',0,1,1);
insert into project.cards values (default,'Minions Return',3,3,'Aura',0,2,1);
insert into project.cards values (default,'Mire Triton',3,2,'Zombie Merfolk',0,2,1);
insert into project.cards values (default,'Mires Grasp',3,3,'Aura',0,1,1);
insert into project.cards values (default,'Mogiss Favor',3,3,'Aura',0,1,1);
insert into project.cards values (default,'Nightmare Shpeherd',3,4,'Demon',0,3,1);
insert into project.cards values (default,'Nyxborn Marauder',3,4,'Minotaur',0,1,1);
insert into project.cards values (default,'Omen of the Dead',3,3,null,0,1,1);
insert into project.cards values (default,'Pharikas Libation',3,5,null,0,1,1);
insert into project.cards values (default,'Pharikas Spawn',3,2,'Gorgon',0,1,1);
insert into project.cards values (default,'Rage-Scarred Berserker',3,2,'Minotaur Berserker',0,1,1);
insert into project.cards values (default,'Scavenging Harpy',3,2,'Harpy',0,1,1);
insert into project.cards values (default,'Soulreaper of Mogis',3,4,'Minotaur Shaman',0,1,1);
insert into project.cards values (default,'Temple Thief',3,2,'Human Rogue',0,1,1);
insert into project.cards values (default,'Treacherous Blessing',3,3,null,0,3,1);
insert into project.cards values (default,'Tymaret Calls the Dead',3,3,'Saga',0,3,1);
insert into project.cards values (default,'Tymaret, Chosen from Death',3,4,'Demigod',2,2,1);
insert into project.cards values (default,'Underworld Charger',3,2,'Nightmare Horse',0,1,1);
insert into project.cards values (default,'Underworld Dreams',3,3,null,0,2,1);
insert into project.cards values (default,'Venomous Hierophant',3,2,'Gorgon Cleric',0,1,1);
insert into project.cards values (default,'Woe Strider',3,2,'Horror',0,3,1);

-- RED CARDS
insert into project.cards values (default,'The Akroan War',4,3,'Saga',0,3,1);
insert into project.cards values (default,'Anax, Hardened in the Forge',4,4,'Demigod',2,2,1);
insert into project.cards values (default,'Arena Trickster',4,2,'Human Shaman',0,1,1);
insert into project.cards values (default,'Aspect of Manticore',4,3,'Aura',0,1,1);
insert into project.cards values (default,'Blood Aspirant',4,2,'Satyr Berserker',0,2,1);
insert into project.cards values (default,'Careless Celebrant',4,2,'Satyr Shaman',0,2,1);
insert into project.cards values (default,'Dreamshaper Shaman',4,4,'Minotaur Shaman',0,2,1);
insert into project.cards values (default,'Dreamstalker Manticore',4,4,'Manticore',0,2,1);
insert into project.cards values (default,'Escape Velocity',4,3,'Aura',0,2,1);
insert into project.cards values (default,'Fateful End',4,5,null,0,2,1);
insert into project.cards values (default,'Final Flare',4,5,null,0,1,1);
insert into project.cards values (default,'Flummoxed Cyclops',4,2,'Cyclops',0,1,1);
insert into project.cards values (default,'Furious Rise',4,3,null,0,2,1);
insert into project.cards values (default,'Hero of the Games',4,2,'Human Soldier',0,1,1);
insert into project.cards values (default,'Heroes of the Revel',4,2,'Satyr Soldier',0,2,1);
insert into project.cards values (default,'Impending Doom',4,3,'Aura',0,2,1);
insert into project.cards values (default,'Incendiary Oracle',4,2,'Human Shaman',0,1,1);
insert into project.cards values (default,'Infuriate',4,5,null,0,1,1);
insert into project.cards values (default,'Iroass Blessing',4,3,'Aura',0,1,1);
insert into project.cards values (default,'Irreverant Revelers',4,2,'Satyr',0,1,1);
insert into project.cards values (default,'Nyxborn Brute',4,4,'Cyclops',0,1,1);
insert into project.cards values (default,'Omen of the Forge',4,3,null,0,1,1);
insert into project.cards values (default,'Oread of Mountains Blaze',4,3,'Nymph',0,1,1);
insert into project.cards values (default,'Ox of Agonas',4,2,'Ox',0,4,1);
insert into project.cards values (default,'Phoenix of Ash',4,2,'Phoenix',0,3,1);
insert into project.cards values (default,'Portent of Betrayal',4,8,null,0,1,1);
insert into project.cards values (default,'Purphoros, Bronze-Blooded',4,4,'God',2,4,1);
insert into project.cards values (default,'Purphoross Intervention',4,8,null,0,3,1);
insert into project.cards values (default,'Satyrs Cunning',4,8,null,0,1,1);
insert into project.cards values (default,'Skophos Maze-Warden',4,2,'Minotaur Warrior',0,2,1);
insert into project.cards values (default,'Skophos Warleader',4,2,'Minotaur Warrior',0,1,1);
insert into project.cards values (default,'Stampede Rider',4,2,'Satyr',0,1,1);
insert into project.cards values (default,'Storm Herald',4,2,'Human Shaman',0,3,1);
insert into project.cards values (default,'Storms Wrath',4,8,null,0,3,1);
insert into project.cards values (default,'Tectonic Giant',4,2,'Elemental Giant',0,3,1);
insert into project.cards values (default,'Thrill of Possibility',4,5,null,0,1,1);
insert into project.cards values (default,'The Triumph fo Anax',4,3,'Saga',0,1,1);
insert into project.cards values (default,'Underworld Breach',4,3,null,0,3,1);
insert into project.cards values (default,'Underworld Fires',4,8,null,0,2,1);
insert into project.cards values (default,'Underworld Rage-Hound',4,2,'Elemental Hound',0,1,1);
insert into project.cards values (default,'Wrap in Flames',4,8,null,0,1,1);

-- GREEN CARDS
insert into project.cards values (default,'Arasta of the Endless Web',5,4,'Spider',2,3,1);
insert into project.cards values (default,'The Binding of the Titans',5,3,'Saga',0,2,1);
insert into project.cards values (default,'Chainweb Aracnir',5,2,'Spider',0,2,1);
insert into project.cards values (default,'Destiny Spinner',5,4,'Human',0,2,1);
insert into project.cards values (default,'Dryad of the Ilysian Grove',5,4,'Nymph',0,3,1);
insert into project.cards values (default,'The First Iroan Games',5,3,'Saga',0,3,1);
insert into project.cards values (default,'Gift of Strength',5,5,null,0,1,1);
insert into project.cards values (default,'Hydras Growth',5,3,'Aura',0,2,1);
insert into project.cards values (default,'Hyrax Tower Scout',5,2,'Human Scout',0,1,1);
insert into project.cards values (default,'Ilysain Caryatid',5,2,'Plant',0,1,1);
insert into project.cards values (default,'Inspire Awe',5,5,null,0,1,1);
insert into project.cards values (default,'Klothyss Design',5,8,null,0,2,1);
insert into project.cards values (default,'Loathsome Chimera',5,2,'Chimera',0,1,1);
insert into project.cards values (default,'Mantle of the Wolf',5,3,'Aura',0,3,1);
insert into project.cards values (default,'Moss Viper',5,2,'Snake',0,1,1);
insert into project.cards values (default,'Mystic Repeal',5,5,null,0,2,1);
insert into project.cards values (default,'Nessian Boar',5,2,'Boar',0,3,1);
insert into project.cards values (default,'Nessian Hornbeetle',5,2,'Insect',0,2,1);
insert into project.cards values (default,'Nessian Wanderer',5,2,'Satyr Scout',0,2,1);
insert into project.cards values (default,'Nexus Wardens',5,2,'Satyr Archer',0,1,1);
insert into project.cards values (default,'Nylea, Keen-Eyed',5,4,'God',2,4,1);
insert into project.cards values (default,'Nyleas Forerunner',5,4,'Beast',0,1,1);
insert into project.cards values (default,'Nyleas Huntmaster',5,2,'Centaur Shaman',0,1,1);
insert into project.cards values (default,'Nyleas Intervention',5,8,null,0,3,1);
insert into project.cards values (default,'Nyx Herald',5,4,'Centaur Shaman',0,2,1);
insert into project.cards values (default,'Nyxbloom Ancient',5,4,'Elemental',0,4,1);
insert into project.cards values (default,'Nyxborn Colossus',5,4,'Giant',0,1,1);
insert into project.cards values (default,'Omen of the Hunt',5,3,null,0,1,1);
insert into project.cards values (default,'Pheres-Band Brawler',5,2,'Centaur Warrior',0,2,1);
insert into project.cards values (default,'Plummet',5,5,null,0,1,1);
insert into project.cards values (default,'Relentless Pursuit',5,8,null,0,1,1);
insert into project.cards values (default,'Renata, Called to the Hunt',5,4,'Demigod',2,2,1);
insert into project.cards values (default,'Return to Nature',5,5,null,0,1,1);
insert into project.cards values (default,'Setessan Champion',5,2,'Human Warrior',0,3,1);
insert into project.cards values (default,'Setessan Petitioner',5,2,'Human Druid',0,2,1);
insert into project.cards values (default,'Setessan Skirmisher',5,2,'Human Warrior',0,1,1);
insert into project.cards values (default,'Setessan Training',5,3,'Aura',0,1,1);
insert into project.cards values (default,'Skola Grovedancer',5,4,'Satyr Druid',0,1,1);
insert into project.cards values (default,'Voracious Typhon',5,2,'Snake Beast',0,1,1);
insert into project.cards values (default,'Warbriar Blessing',5,3,'Aura',0,1,1);
insert into project.cards values (default,'Wolfwillow Haven',5,3,'Aura',0,2,1);

-- MULTI-COLORED CARDS
insert into project.cards values (default,'Dream Trawler',6,2,'Sphinx',0,3,1);
insert into project.cards values (default,'Staggering Insight',6,3,'Aura',0,2,1);
insert into project.cards values (default,'Kunoros, Hound of Athreos',7,2,'Hound',2,3,1);
insert into project.cards values (default,'Rise to Glory',7,8,null,0,2,1);
insert into project.cards values (default,'Haktos the Unscarred',8,2,'Human Warrior',2,3,1);
insert into project.cards values (default,'Hero of the Nyxborn',8,4,'Human Soldier',0,2,1);
insert into project.cards values (default,'Bronzehide Lion',9,2,'Cat',0,3,1);
insert into project.cards values (default,'Calix, Destinys Hand',9,7,'Calix',2,4,1);
insert into project.cards values (default,'Siona, Captain of the Pyleas',9,2,'Human Soldier',2,2,1);
insert into project.cards values (default,'Ashiok, Nightmare Muse',10,7,'Ashiok',2,4,1);
insert into project.cards values (default,'Atris, Oracle of Half-Truths',10,2,'Human Advisor',2,3,1);
insert into project.cards values (default,'Dervourer of Memory',10,2,'Nightmare',0,2,1);
insert into project.cards values (default,'Dalakos, Crafter of Wonders',11,2,'Merfolk Artificer',2,3,1);
insert into project.cards values (default,'Mischievous Chimera',11,4,'Chimera',0,2,1);
insert into project.cards values (default,'Enigmatic Incarnation',12,3,null,0,3,1);
insert into project.cards values (default,'Eutropia the Twice-Favored',12,2,'Human Wizard',2,2,1);
insert into project.cards values (default,'Uro, Titan of Natures Wrath',12,2,'Elder Giant',2,4,1);
insert into project.cards values (default,'Allure of the Unkown',13,8,null,0,3,1);
insert into project.cards values (default,'Kroxa, Titan of Deaths Hunger',13,2,'Elder Giant',2,3,1);
insert into project.cards values (default,'Slaughter-Priest of Mogis',13,2,'Minotaur Shaman',0,2,1);
insert into project.cards values (default,'Acolyte of Affliction',14,2,'Human Cleric',0,2,1);
insert into project.cards values (default,'Polukranos, Unchained',14,2,'Zombie Hydra',2,4,1);
insert into project.cards values (default,'Gallia of the Endless Dance',15,2,'Satyr',0,1,1);
insert into project.cards values (default,'Klothys, God of Destiny',15,4,'God',2,4,1);
insert into project.cards values (default,'Warden of the Chained',15,2,'Minotaur Warrior',0,2,1);


-- COLORLESS/ARTIFACT CARDS
insert into project.cards values (default,'Altar of the Pantheon',16,1,null,0,1,1);
insert into project.cards values (default,'Bronze Sword',16,1,'Equipment',0,1,1);
insert into project.cards values (default,'Entrancing Lyre',16,1,null,0,2,1);
insert into project.cards values (default,'Mirror Shield',16,1,'Equipment',0,2,1);
insert into project.cards values (default,'Nyx Lotus',16,1,null,2,3,1);
insert into project.cards values (default,'Shadowspear',16,1,'Equipment',2,3,1);
insert into project.cards values (default,'Soul-Guide Lantern',16,1,null,0,2,1);
insert into project.cards values (default,'Thaumaturges Familiar',16,9,'Bird',0,1,1);
insert into project.cards values (default,'Thundering Chariot',16,1,'Vehicle',0,2,1);
insert into project.cards values (default,'Travelers Amulet',16,1,null,0,1,1);
insert into project.cards values (default,'Wings of Hubris',16,1,'Equipment',0,1,1);


-- LANDS CARDS
insert into project.cards values (default,'Field of Ruin',16,6,'Land',0,2,1);
insert into project.cards values (default,'Labyrinth of Skophos',16,6,'Land',0,3,1);
insert into project.cards values (default,'Temple of Abandon',16,6,'Land',0,3,1);
insert into project.cards values (default,'Temple of Deceit',16,6,'Land',0,3,1);
insert into project.cards values (default,'Temple of Enlightenment',16,6,'Land',0,3,1);
insert into project.cards values (default,'Temple of Malice',16,6,'Land',0,3,1);
insert into project.cards values (default,'Temple of Plenty',16,6,'Land',0,3,1);
insert into project.cards values (default,'Unknown Shores',16,6,'Land',0,1,1);
insert into project.cards values (default,'Plains',16,6,'Land',1,1,1);
insert into project.cards values (default,'Island',16,6,'Land',1,1,1);
insert into project.cards values (default,'Swamp',16,6,'Land',1,1,1);
insert into project.cards values (default,'Mountain',16,6,'Land',1,1,1);
insert into project.cards values (default,'Forest',16,6,'Land',1,1,1);


