# shimenrock.webcontainer_test
Test the connection between the middleware and the database

# JDBC����
1. ע������
2. ��ȡ����
3. ��ȡִ��sql������
4. ִ��sql���
5. ��������
6. �ر���Դ

# ����MYSQL����
docker pull mysql:5.6

docker run -d --name tsmysql -v /data/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=202009 -p 3306:3306 mysql:5.6

���ݿ���data UTF-8