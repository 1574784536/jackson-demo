测试url
GET:http://127.0.0.1:8081/jacksongege/userInfo/listUserInfoAndOrder

GET:http://127.0.0.1:8081/jacksongege/userInfo/listUserInfo

POST:http://127.0.0.1:8081/jacksongege/userInfo/add
{
"userId": "1001",
"userName": "王尼玛",
"age": 21
}

PUT:http://127.0.0.1:8081/jacksongege/userInfo/update
{
"userId": "1001",
"userName": "王进喜",
"age": 22
}

DELETE:http://127.0.0.1:8081/jacksongege/userInfo/delete/1001


```sql
create table user_info(
user_id varchar(20) NOT NULL COMMENT '主键ID',
user_name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
age INT(11) NULL DEFAULT NULL COMMENT '年龄',
PRIMARY KEY (user_id)
);

drop table order_info;
create table order_info(
order_id varchar(20) NOT NULL COMMENT '主键ID',
user_uid VARCHAR(20) NULL DEFAULT NULL COMMENT '用户id',
order_number INT(11) NULL DEFAULT NULL COMMENT '订单编号',
PRIMARY KEY (order_id)
);

insert into user_info(user_id, user_name, age) value ('1001', '王进喜', 21);
insert into user_info(user_id, user_name, age) value ('1002', 'jackson', 21);
insert into user_info(user_id, user_name, age) value ('1003', '吴中生', 21);

insert into order_info(order_id, user_uid, order_number) value ('o1001', '1001', 123456);
insert into order_info(order_id, user_uid, order_number) value ('o1002', '1001', 123457);
```

