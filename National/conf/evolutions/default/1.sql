# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tbmember (
  id                        varchar(255) not null,
  password                  varchar(255),
  name                      varchar(255),
  email                     varchar(255),
  status                    varchar(255),
  gender                    varchar(255),
  constraint pk_tbmember primary key (id))
;

create table tbOrganize (
  oid                       varchar(255) not null,
  name                      varchar(255),
  tel                       varchar(255),
  email                     varchar(255),
  detail                    varchar(255),
  constraint pk_tbOrganize primary key (oid))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table tbmember;

drop table tbOrganize;

SET FOREIGN_KEY_CHECKS=1;

