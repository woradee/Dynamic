# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tbmember (
  id                        varchar(255) not null,
  password                  varchar(255),
  name                      varchar(255),
  surname                   varchar(255),
  email                     varchar(255),
  status                    varchar(255),
  gender                    varchar(255),
  constraint pk_tbmember primary key (id))
;

create table tbOrganizes (
  oid                       varchar(255) not null,
  name                      varchar(255),
  address                   varchar(255),
  tel                       varchar(255),
  email                     varchar(255),
  detail                    varchar(255),
  constraint pk_tbOrganizes primary key (oid))
;

create table tbImages (
  pid                       varchar(255) not null,
  name                      varchar(255),
  date                      datetime,
  tid                       varchar(255),
  constraint pk_tbImages primary key (pid))
;

create table tbPictures (
  imagejpg                  varchar(255) not null,
  nameimage                 varchar(255),
  txtimage                  varchar(255),
  picture                   varchar(255),
  dataimage                 datetime,
  tourist_tid               varchar(255),
  constraint pk_tbPictures primary key (imagejpg))
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

create table tbTourist (
  tid                       varchar(255) not null,
  name                      varchar(255),
  type                      varchar(255),
  detail                    varchar(255),
  size                      varchar(255),
  locate                    varchar(255),
  history                   varchar(255),
  tel                       varchar(255),
  email                     varchar(255),
  servicethai               varchar(255),
  serviceeng                varchar(255),
  yearopen                  varchar(255),
  timeopen                  varchar(255),
  organize_oid              varchar(255),
  constraint pk_tbTourist primary key (tid))
;

alter table tbImages add constraint fk_tbImages_tourist_1 foreign key (tid) references tbTour (tid) on delete restrict on update restrict;
create index ix_tbImages_tourist_1 on tbImages (tid);
alter table tbPictures add constraint fk_tbPictures_tourist_2 foreign key (tourist_tid) references tbTourist (tid) on delete restrict on update restrict;
create index ix_tbPictures_tourist_2 on tbPictures (tourist_tid);
alter table tbTourist add constraint fk_tbTourist_organize_3 foreign key (organize_oid) references tbOrganizes (oid) on delete restrict on update restrict;
create index ix_tbTourist_organize_3 on tbTourist (organize_oid);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table tbmember;

drop table tbOrganizes;

drop table tbImages;

drop table tbPictures;

drop table tbTour;

drop table tbTourist;

SET FOREIGN_KEY_CHECKS=1;

