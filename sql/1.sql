# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table company (
  id                        integer auto_increment not null,
  name                      varchar(255),
  constraint pk_company primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table company;

SET FOREIGN_KEY_CHECKS=1;

