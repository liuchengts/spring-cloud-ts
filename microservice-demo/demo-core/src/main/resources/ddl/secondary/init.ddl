create table stest
(
	id bigint(15) auto_increment comment '主键'
		primary key,
	content VARCHAR (100) null comment '内容'
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='测试表';
