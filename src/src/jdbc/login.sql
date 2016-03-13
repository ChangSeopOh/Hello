
/* Drop Tables */

DROP TABLE t_member CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE t_member
(
	user_id varchar2(20) NOT NULL,
	user_name varchar2(20) NOT NULL,
	user_password varchar2(128) NOT NULL,
	PRIMARY KEY (user_id)
);



select * from t_member;

select user_name from t_member
where user_id='next'and user_password='d404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db'


insert into t_member values('next', '½ÅÇØÃ¶','d404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db')

  SELECT user_id, user_name FROM t_member WHERE user_id ='ses' AND user_password ='d404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db'

UPDATE t_member SET
	   user_name ='À¯Áø' , user_id ='ses'
WHERE user_id='realnext'

