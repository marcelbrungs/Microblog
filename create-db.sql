BEGIN TRANSACTION;

drop shcema public cascade;
drop table user if exists;
create table user
    (
      user_id integer NOT NULL PRIMARY KEY,
      user_name varchar(50),
      email varchar(100),
      phone_number integer(50),
      last_name varchar(50),
      first_name varchar(50),
      address varchar(100),
      city varchar(100),
    );
    
drop table follower if exists;
create table follower
    (
      follower_id integer NOT NULL PRIMARY KEY,
      user_name varchar(50),
      email varchar(100),
    );
    
drop table post if exists;
create table post
    (
      post_id integer NOT NULL PRIMARY KEY,
      user_id integer,
      post_text varchar(500),
      picture varbinary(max),
      picture_description varchar(50);
      picture_like int,
      picture_comment varchar(500);
    );