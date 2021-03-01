-- 0NF 
CREATE TABLE orders_0NF (
	order_items VARCHAR(200),
	order_total DECIMAL,
	order_date DATE,
	cust_name VARCHAR(200),
	cust_address VARCHAR(200),
	cust_email VARCHAR(200),
	cust_pass VARCHAR(200)
);

INSERT INTO orders_0NF ('Milk x 2, Cereal x 1, Candy Bar x 1', 55.00, '2021-02-24','John Smith', '123 Main Street', 'j.smith@email.com','password123');

-- 1NF : ATOMIC DATA, identifying KEY/COLUMN, records should be unique
CREATE TABLE orders_1NF (
	order_id INTEGER,
	order_item VARCHAR(50),
	item_quantity INTEGER,
	order_total DECIMAL,
	order_date DATE,
	cust_first VARCHAR(200),
	cust_last VARCHAR(200),
	cust_address VARCHAR(200),
	cust_email VARCHAR(200),
	cust_pass VARCHAR(200)
);

INSERT INTO orders_1NF (1, 'Milk', 2, 55.00, '2021-02-24','John', 'Smith', '123 Main Street', 'j.smith@email.com','password123');
INSERT INTO orders_1NF (1, 'Cereal',1, 55.00, '2021-02-24','John', 'Smith', '123 Main Street', 'j.smith@email.com','password123');
INSERT INTO orders_1NF (1, 'Candy Bar',5, 55.00, '2021-02-24','John', 'Smith', '123 Main Street', 'j.smith@email.com','password123');

-- 2NF : All qualities of 1NF + no partial dependencies information related to more than one column should be within new table
CREATE TABLE orders_2NF (
	order_id INTEGER,
	cust_id INTEGER REFERENCES accounts_2NF(cust_id),
	order_item VARCHAR(50),
	item_quantity INTEGER,
	order_total DECIMAL,
	order_date DATE
);

CREATE TABLE accounts_2NF (
	cust_id INTEGER,
	cust_first VARCHAR(200),
	cust_last VARCHAR(200),
	cust_address VARCHAR(200),
	cust_email VARCHAR(200),
	cust_pass VARCHAR(200)
);


-- 3NF : All data in a table should only relate to a primary key for that table, not dependent on any other columns for a table
CREATE TABLE orders_3NF (
	order_id INTEGER,
	user_id INTEGER REFERENCES accounts_2NF(cust_id),
	order_total DECIMAL,
	order_date DATE
);

CREATE TABLE accounts_3NF (
	cust_id INTEGER,
	cust_first VARCHAR(200),
	cust_last VARCHAR(200),
	cust_address VARCHAR(200),
	cust_email VARCHAR(200),
	cust_pass VARCHAR(200)
);

CREATE TABLE order_items_3NF (
	order_id INTEGER REFERENCES orders_3NF(order_id),
	item_id INTEGER PRIMARY KEY,
	order_item VARCHAR(50),
	item_quantity INTEGER
);