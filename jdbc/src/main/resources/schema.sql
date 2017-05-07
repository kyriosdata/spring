drop table stock if EXISTS;

create table stock (
  stock_id int,
  company_name varchar2(50),
  symbol varchar2(10),
  price decimal(10,2)
);

insert into stock values (1, 'VMWare', 'VMW', 34.56);
insert into stock values (2, 'Facebook', 'FB', 4.56);
insert into stock values (3, 'Apple', 'APL', 9.56);