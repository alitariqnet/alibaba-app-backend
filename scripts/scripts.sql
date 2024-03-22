create table users(
	id serial not null primary key,
	name varchar(50) not null,
	email varchar(70) null,
	phone varchar(15) null,
	address varchar(200) not null,
	username varchar(40) not null,
	password text not null,
	is_active boolean default true,
	created_on date default now()
);

insert into users (name,email,phone,address,username,"password") values('Ali Tariq','alibabapk@aol.com',
	'6856567','22 Shalimar link road Mughalpura','alibaba','pass');

alter table users drop column created_on;
alter table users add column created_on timestamp default now();

create table orders(
	id serial not null primary key,
	user_id serial not null references users(id),
	total_items int2 not null,
	total_price int4 not null,
	is_complete boolean default true,
	created_on date default now()
);

create table items(
	id serial not null primary key,
	title text not null,
	company varchar(60) not null,
	mfg_date date not null,
	exp_date date not null,
	price int4 not null,
	batch_number int4 not null,
	is_available boolean default true,
	created_on date default now()
);

insert into items(title,company,mfg_date,exp_date, price,batch_number) values
('Keyboard','A4Tech','1999-1-1','2002-12-20','100','09583893');


insert into customer (name,email,phone,address) values
('Ali','alibaba@hotmail.com','123456','Shalamar link road');

create table users(
        id serial not null primary key,
        username varchar(50) not null primary key,
        password varchar(500) not null,
        enabled boolean not null
);

create table authorities (
        id serial not null primary key,
        username varchar(50) not null,
        authority varchar(50) not null,
        constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

create table groups (
        id serial not null primary key,
        group_name varchar(50) not null
);

create table group_authorities (
        id serial not null primary key,
        group_id bigint not null,
        authority varchar(50) not null,
        constraint fk_group_authorities_group foreign key(group_id) references groups(id)
);

create table group_members (
        id serial not null primary key,
        username varchar(50) not null,
        group_id bigint not null,
        constraint fk_group_members_group foreign key(group_id) references groups(id)
);