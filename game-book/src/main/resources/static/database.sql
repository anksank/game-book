create database if not exists gamedb;

create table if not exists player
(
  id bigint not null auto_increment,
  name varchar(50) not null,
  create_time timestamp not null default CURRENT_TIMESTAMP,
  primary key(id)
);

delete from player;
insert into player(name, create_time) values ('Ankit', now());
insert into player(name, create_time) values ('Saumya Shekhar', now());
insert into player(name, create_time) values ('Nitin Gupta', now());
insert into player(name, create_time) values ('Pooja Gupta', now());

create table if not exists board_game
(
  id bigint not null auto_increment,
  name varchar(50) not null,
  min_players int,
  max_players int,
  create_time timestamp not null default CURRENT_TIMESTAMP,
  primary key(id)
);

delete from board_game;
insert into board_game(name, min_players, max_players, create_time) values ('7 Wonders', 3, 7, now());

create table if not exists game_details
(
  id bigint not null auto_increment,
  player_id bigint not null,
  create_time timestamp not null default CURRENT_TIMESTAMP,
  primary key(id)
);