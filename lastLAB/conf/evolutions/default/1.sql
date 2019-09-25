# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tbMovie (
  id                        varchar(255) not null,
  title                     varchar(255),
  actor                     varchar(255),
  actress                   varchar(255),
  year                      varchar(255),
  sweater_id                varchar(255),
  constraint pk_tbMovie primary key (id))
;

create table tbSweater (
  id                        varchar(255) not null,
  brand                     varchar(255),
  type                      varchar(255),
  color                     varchar(255),
  size                      varchar(255),
  pattern                   varchar(255),
  constraint pk_tbSweater primary key (id))
;

create table tbUser (
  id                        varchar(255) not null,
  name                      varchar(255),
  surname                   varchar(255),
  address                   varchar(255),
  status                    varchar(255),
  password                  varchar(255),
  constraint pk_tbUser primary key (id))
;

alter table tbMovie add constraint fk_tbMovie_sweater_1 foreign key (sweater_id) references tbSweater (id) on delete restrict on update restrict;
create index ix_tbMovie_sweater_1 on tbMovie (sweater_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table tbMovie;

drop table tbSweater;

drop table tbUser;

SET FOREIGN_KEY_CHECKS=1;

