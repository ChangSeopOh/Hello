
/* Drop Tables */

DROP TABLE t_user CASCADE CONSTRAINTS;
SELECT *
from dpeartments


/* Create Tables */

CREATE TABLE t_user
(
	name varchar2(20) NOT NULL,
	phone varchar2(20),
	birth number(4)
);


SELECT * 
FROM t_user

commit

insert into t_user(name, phone, birth)
values('±è±â¿­','010-1111-2222', 1989)

insert into t_user(name, phone, birth)
values('Á¶´Ïµª','010-1111-3333', 1970)

insert into t_user(name, phone, birth)
values('¿øºó','010-1111-4444', 1974)


SELECT name, phone, birth, (to_char(sysdate, 'YYYY')-birth)+1 as age
FROM t_user
rollback


