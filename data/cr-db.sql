drop schema public cascade;
drop table user if exists;
create table user(
user_id INTEGER NOT NULL PRIMARY KEY,
user_name VARCHAR(100),
user_lastname VARCHAR(100),
user_paassword VARCHAR(100),
user_email VARCHAR(100),
);
drop table follower if exists;
create table follower (
follower_id INTEGER NOT NULL PRIMARY KEY,
follower_name VARCHAR(100),
follower_lastname VARCHAR(100),
follower_email VARCHAR(100),
);
drop table post if exists;
create table post (
creator_name VARCHAR(100),
creator_surname VARCHAR(100),
creator_email VARCHAR(100),
post_content VARCHAR(200),
);