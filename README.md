# shimenrock.webcontainer_test
Test the connection between the middleware and the database

# JDBC步骤
1. 注册驱动
2. 获取连接
3. 获取执行sql语句对象
4. 执行sql语句
5. 处理结果集
6. 关闭资源

# 创建MYSQL环境
docker pull mysql:5.6

docker run -d --name tsmysql -v /data/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=202009 -p 3306:3306 mysql:5.6

数据库名data UTF-8