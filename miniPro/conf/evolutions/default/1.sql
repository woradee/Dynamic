# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tbmember (
  id                        varchar(255) not null,
  password                  varchar(255),
  email                     varchar(255),
  constraint pk_tbmember primary key (id))
;

create table tbImages (
  pid                       varchar(255) not null,
  name                      varchar(255),
  date                      datetime,
  tid                       varchar(255),
  constraint pk_tbImages primary key (pid))
;

create table tbTour (
  tid                       varchar(255) not null,
  name                      varchar(255),
  type                      varchar(255),
  size                      varchar(255),
  location                  varchar(255),
  history                   varchar(255),
  time                      varchar(255),
  tel                       varchar(255),
  mail                      varchar(255),
  year                      varchar(255),
  organize                  varchar(255),
  constraint pk_tbTour primary key (tid))
;

alter table tbImages add constraint fk_tbImages_tourist_1 foreign key (tid) references tbTour (tid) on delete restrict on update restrict;
create index ix_tbImages_tourist_1 on tbImages (tid);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table tbmember;

drop table tbImages;

drop table tbTour;

SET FOREIGN_KEY_CHECKS=1;

