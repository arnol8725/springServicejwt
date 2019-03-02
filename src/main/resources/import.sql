insert into banco (id_banco,descp_banco,status)  values (1,'Banamex',1);
insert into banco (id_banco,descp_banco,status)  values (2,'liverpool',1);
insert into banco (id_banco,descp_banco,status)  values (3,'Sears',1);


insert into tarjetas (id_tarjeta,descp_tarjeta,status,banco_id_banco) values (1,'Bizmart Banamex',1,1);
insert into tarjetas (id_tarjeta,descp_tarjeta,status,banco_id_banco) values (2,'Clasica Banamex',1,1);
insert into tarjetas (id_tarjeta,descp_tarjeta,status,banco_id_banco) values (3,'Liverpool Departamental',1,2);
insert into tarjetas (id_tarjeta,descp_tarjeta,status,banco_id_banco) values (4,'Sears Departamental',1,3);


insert into users(username,password,enabled) values('arnol','$2a$10$x2//KDXuLHofH3UjeGv2a.hn93ep63/32WT9X2pm6bJzArL7GuHG6',1);
insert into users(username,password,enabled) values('admin','$2a$10$02BEO8yBrk6cf27zRCV9DOsyHPTlUi1UvE/77q9/o/eiBxZvuKQSe',1);

insert into authorities (user_id,authority) values (1,'ROLE_USER');
insert into authorities (user_id,authority) values (2,'ROLE_USER');
insert into authorities (user_id,authority) values (2,'ROLE_ADMIN');
