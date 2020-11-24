use springmvcbasicfree;

-- insert data into role table
insert into role(code,name) values('ADMIN','Quản trị');
insert into role(code,name) values('USER','Người dùng');

-- insert data into user table
insert into user(username,password,fullname,status)
values('admin','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','trương tùng lâm',1);
insert into user(username,password,fullname,status)
values('nguyenvana','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn A',1);
insert into user(username,password,fullname,status)
values('nguyenvanb','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn B',1);

-- insert data into user_role table
INSERT INTO user_role(userid,roleid) VALUES (1,1);
INSERT INTO user_role(userid,roleid) VALUES (2,2);
INSERT INTO user_role(userid,roleid) VALUES (3,2);

-- insert data into category table
INSERT INTO `springmvcbasicfree`.`category` (`id`, `code`, `name`) VALUES ('1', 'the-thao', 'thể thao');
INSERT INTO `springmvcbasicfree`.`category` (`id`, `code`, `name`) VALUES ('2', 'chinh-tri', 'chính trị');
INSERT INTO `springmvcbasicfree`.`category` (`id`, `code`, `name`) VALUES ('3', 'giao-duc', 'giáo dục');

-- insert data into new table
INSERT INTO `springmvcbasicfree`.`new` (`id`, `content`, `title`, `category_id`) VALUES ('1', 'Bài viết 1', 'Bài viết 1', '1');
INSERT INTO `springmvcbasicfree`.`new` (`id`, `content`, `title`, `category_id`) VALUES ('2', 'Bài viết 2', 'Bài viết 2', '1');
INSERT INTO `springmvcbasicfree`.`new` (`id`, `content`, `title`, `category_id`) VALUES ('3', 'Bài viết 3', 'Bài viết 3', '2');
INSERT INTO `springmvcbasicfree`.`new` (`id`, `content`, `title`, `category_id`) VALUES ('4', 'Bài viết 4', 'Bài viết 4', '2');
INSERT INTO `springmvcbasicfree`.`new` (`id`, `content`, `title`, `category_id`) VALUES ('5', 'Bài viết 5', 'Bài viết 5', '3');
