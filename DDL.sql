show databases;

create database emp_db;

use emp_db;

show tables;

select * from role;

insert into user (user_id, user_name, password) values 
    (2, 'vinay', '$2a$10$aXZtO9bteuXSJDuiR5DoqeVhUqb/3sd0kVyfTLGr77QDgLFiPIj52');

insert into role (role_id, role)
     values 
     (1, "USER"),
     (2, "ADMIN");

select * from user_roles;     
insert into user_roles(user_id, role_id)
      values 
      (1,1),
      (2,1),
      (2,2);