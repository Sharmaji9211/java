create database code_mentor;
use code_mentor;
create table users(
id INT auto_increment primary key,

username varchar(50) not null,
password varchar(100) not null,
email varchar(100) not null unique
);
alter table users
add  phone varchar(12);
alter table users
add name varchar(100);
create table course(
id int auto_increment primary key,
name varchar(100),
description text,
price double
);

show tables;
desc users;
desc course;
-- Insert sample data into courses
INSERT INTO course (name, description, price) VALUES 
('Java Basics', 'Learn Java fundamentals', 299.99),
('Spring Boot', 'Master Spring Boot', 499.99),
('Data Structures', 'Comprehensive course on DSA', 399.99);

select * from course;

