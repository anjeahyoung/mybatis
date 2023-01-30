drop user mybatis cascade; -- mybatis�� ���ӿ� �ȵ� ���¿��� ���� system���� �����Ұ�
drop table addresses cascade constraints;
drop table posts cascade constraints;
drop table users cascade constraints;
--create table mybatis.users (
--  user_id number(2) constraint users_userid_pk primary key,
--    user_name varchar2(12),
--    reg_date date);
--    
--create table mybatis.addresses (
--    user_id number(2) constraint addresses_userid_pk primary key 
--                constraint addresses_userid_fk references mybatis.users(user_id),
--    address varchar2(30));
--    
--create table mybatis.posts (
--    post_id number(3) constraint posts_postid_pk primary key,
--    post_title varchar2(60),
--    post_content varchar2(120),
--    user_id number(2) constraint posts_userid_fk references mybatis.users(user_id)); 


create table mybatis.users(
    user_id number(2),
    user_name varchar2(12),
    reg_date date);

create table mybatis.addresses (
user_id number(2),
address varchar2(30));

create table mybatis.posts (
    post_id number(3),
    opst_title varchar2(60),
    opst_content varchar2(120),
    user_id number(2));
    
alter table mybatis.users
    add constraint user_userid_pk primary key(user_id);
    
alter table mybatis.addresses
    add constraint addr_userid_pk primary key(user_id);
    
alter table mybatis.posts
    add constraint post_postid_pk primary key(post_id);
    
alter table mybatis.addresses
    add constraint addr_userid_fk foreign key(user_id)
    references mybatis.users(user_id);
    
alter table mybatis.posts
    add constraint post_userid_fk foreign key(user_id)
    references mybatis.users(user_id);
    
insert into mybatis.users
    values(1, 'john', to_date('2023-01-26', 'yyyy-mm-dd'));
    
insert into mybatis.users
    values(2, 'terry', to_date('2023-01-27', 'yyyy-mm-dd'));

insert into mybatis.addresses
    values(1, '����� ������');
insert into mybatis.addresses
    values(2, '������ �д籸');

insert into mybatis.posts
    values(101, '���', '�ʿ� ���� �������', 1);
insert into mybatis.posts
    values(102, '����', '�ʿ� ���� �������', 1);
insert into mybatis.posts
    values(201, '��ġ', '�װ� �־�� ���� ����.', 2);
insert into mybatis.posts
    values(202, '�����', '���г�������� ���� �����̴�.', 2);    
insert into mybatis.posts
    values(203, '���Ҷ�', '�װ� �׸���', 2);
    
commit;    
    
    
    
    