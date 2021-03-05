CREATE TABLE books (
	isbn_13 serial PRIMARY KEY,
	book_name VARCHAR(50),
	author VARCHAR(50)
);

CREATE TABLE tags (
	isbn_13 INTEGER REFERENCES books(isbn_13),
	tag_name VARHCAR(50) UNIQUE
	
	CONSTRAINT tags_pk PRIMARY KEY (isbn_13, tag_name) 
);


-- Harry Potter : "Young Adult", "Fiction", "Fantasy", "Magical"
-- Lord oF the Rings : "Fiction"