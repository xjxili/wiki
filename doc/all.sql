# 电子书表
drop table if exists `ebook`;
create table `ebook`(
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    `category1_id` bigint comment '分类1',
    `category2_id` bigint comment '分类2',
    `description` varchar(200) comment '描述',
    `cover` varchar(200) comment '封面',
    `doc_count` int comment '文档数',
    `view_count` int comment '阅读数',
    `vote_count` int comment '点赞数',
    primary key (`id`)
) engine = innodb default charset=utf8mb4 comment='电子书';

insert into `ebook`(id, name ,description) values(1, 'springboot入门' ,'零基础开发企业级项目最佳框架' );
insert into `ebook`(id, name ,description) values(2, 'vue 入门教程' ,'零基础Vue开发,企业级应用最佳开发首选' );
insert into `ebook`(id, name ,description) values(3, 'python入门' ,'数据库人工智能火热框架' );
insert into `ebook`(id, name ,description) values(4, 'mysql入门' ,'中小企业首选数据库框架' );
insert into `ebook`(id, name ,description) values(5, 'oracle入门' ,'大企业最佳数据库实践' );


















drop table if exists `test`;
create table `test`(
                       `id` bigint not null comment 'id',
                       `name` varchar(50) comment '名称',
                       primary key (`id`)
)engine=innodb default charset=utf8mb4 comment='测试';

insert into `test` (id,name) values(1,'测试');


drop table if exists `demo`;
create table `demo`(
                       `id` bigint not null comment 'id',
                       `name` varchar(50) comment '名称',
                       primary key (`id`)
)engine=innodb default charset=utf8mb4 comment='测试';

insert into `demo` (id,name) values(1,'测试');