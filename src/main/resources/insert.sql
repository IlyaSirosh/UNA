
insert into user (email,enabled,pass_reset_date,nickname,password,birth,sex) VALUES ("user@email.com",true, "2017-06-19 01:01:01", "user", "$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC","1997-07-01" ,"male");
insert into authority (name) values ("ROLE_USER");
insert into user_to_authority (user_id,authority_id) VALUES (1,1);