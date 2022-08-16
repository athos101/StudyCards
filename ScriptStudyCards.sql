create user 'athos' identified by '2003';
create database studycards;
grant all on studycards.* to athos;

 create table carta(
 id int auto_increment not null primary key,
 titulo varchar(32) not null,
 frente varchar(360) not null,
 verso varchar(360) not null
 );