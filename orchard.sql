create database orchard;
use orchard;
create table facility
(
  facility_id   bigint auto_increment comment '主键ID'
    primary key,
  facility_name varchar(255) null comment '硬件名称',
  facility_code varchar(255) not null comment '硬件唯一性标识',
  facility_ip   varchar(255) null comment '硬件IP地址'
)
  comment '硬件';

create table facility_message
(
  facility_message_id            bigint auto_increment comment '主键ID'
    primary key,
  facility_message_code          varchar(255) not null comment '设备唯一性标识',
  facility_message_time          varchar(255) null comment '接收到数据的时间',
  facility_message_temperature   varchar(255) null comment '温度',
  facility_message_humidity      varchar(255) null comment '湿度',
  facility_message_illuminance   varchar(255) null comment '光照度',
  facility_message_soil          varchar(255) null comment '土壤温湿度',
  facility_message_precipitation varchar(255) null comment '降雨量'
)
  comment '设备信息记录';

create table permission
(
  permission_id   bigint auto_increment comment '主键ID'
    primary key,
  permission_name varchar(255) null comment '角色名称',
  permission_code varchar(255) not null comment '角色的唯一性标识'
)
  comment '角色';

create table permission_roles
(
  permission_code bigint null comment '角色唯一性标识',
  role_code       bigint null comment '权限唯一性标识'
)
  comment '角色权限中间表';

create table role
(
  role_id   bigint auto_increment comment '主键ID'
    primary key,
  role_name varchar(255) null comment '权限名称',
  role_code varchar(255) not null comment '权限唯一性标识'
)
  comment '权限';

create table threshold
(
  threshold_id            bigint auto_increment comment '阈值ID'
    primary key,
  threshold_temperature   varchar(255) null comment '温度',
  threshold_humidity      varchar(255) null comment '湿度',
  threshold_illuminance   varchar(255) null comment '光照度',
  threshold_soil          varchar(255) null comment '土壤温湿度',
  threshold_precipitation varchar(255) null comment '降雨量',
  facility_code           varchar(255) not null comment '对应设备的编码'
)
  comment '阈值';

create table user
(
  user_id       bigint auto_increment comment '主键ID'
    primary key,
  user_name     varchar(255) null comment '账号',
  user_password varchar(255) null comment '密码',
  user_code     varchar(255) not null comment '对应角色的唯一性标识'
)
  comment '用户';


