
create schema bankApi;

create table bankapi.roles(
	role_id serial primary key,
	emp_role varchar(50) not null
	);

create table bankapi.employees(
	employee_id serial primary key,
	employee_fname varchar(50) not null,
	employee_lname varchar(50),
	employee_email varchar(50) unique,
	employee_login_user varchar(50) unique,
	employee_login_password varchar(50),
	employee_role integer,
	constraint employee_role_fk foreign key (employee_role) references bankapi.roles(role_id) on delete cascade
	);

create table bankapi.account_type(
	account_type_id serial primary key,
	account_type varchar(50) not null
	);

create table bankapi.customers(
	customer_id serial primary key,
	customer_fname varchar(50),
	customer_lname varchar(50),
	customer_phone varchar(50),
	customer_ssn integer unique,
	customer_email varchar(50) unique,
	customer_street_address varchar(50),
	customer_city varchar(50),
	customer_state varchar(50),
	customer_zipcode integer,
	customer_country varchar(50),
	account_type integer,
	constraint account_type_fk foreign key (account_type) references bankapi.account_type (account_type_id) on delete cascade
	);

create table bankapi.account_details(
	account_number serial primary key,
	account_customer integer,
	account_type integer,
	account_balance decimal,
	constraint account_type_fk foreign key (account_type) references bankapi.account_type (account_type_id) on delete cascade,
	constraint account_customer_fk foreign key (account_customer) references bankapi.customers (customer_id) on delete cascade
	);

create table bankapi.pending_approvals(
	customer_id serial primary key,
	customer_fname varchar(50),
	customer_lname varchar(50),
	customer_phone varchar(50),
	customer_ssn integer unique,
	customer_email varchar(50) unique,
	customer_street_address varchar(50),
	customer_city varchar(50),
	customer_state varchar(50),
	customer_zipcode integer,
	customer_country varchar(50),
	account_type integer,
	constraint account_type_fk foreign key (account_type) references bankapi.account_type (account_type_id) on delete cascade
	);

create table bankapi.customerlogin(
	customerlogin_id serial primary key,
	customer_login_user varchar(50) not null unique,
	customer_login_password varchar(50),
	customer_detail integer,
	customer_account_detail integer,
	constraint customer_detail_fk foreign key (customer_detail) references bankapi.customers (customer_id) on delete cascade,
	constraint customer_account_detail_fk foreign key (customer_account_detail) references bankapi.account_details (account_number) on delete cascade
	);

