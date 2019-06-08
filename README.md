项目名

资料
[spring文档]https://spring.io/guides/gs/serving-web-content/#initial
[github](https://github.com/1026295417/communitydemo)
[es]https://www.elasticsearch.cn/
[github OAuth](https://developer.github.com/apps/)
[Bootstrap](https://v3.bootcss.com/components/#navbar)
工具
[Git](https://git-scm.com/download/win)
[Visual Paradigm](https://www.visual-paradigm.com/cn/)
脚本
~sql
''sql
    CREATE CACHED TABLE PUBLIC.USER(
        ID INT DEFAULT  AUTO_INCREMENT PRIMARY KEY NOT NULL, 
        ACCOUNT_ID VARCHAR(100),
        NAME VARCHAR(50),
        TOKEN CHAR(36),
        GMT_CREATE BIGINT,
        GMT_MODIFIED BIGINT
    )
    
''