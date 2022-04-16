### MySQL Server Installation
**1. Download MySQL community server yum repository rpm**

`curl -sSLO https://dev.mysql.com/get/mysql80-community-release-el7-5.noarch.rpm`

**2. Install sql yum repository rpm**

`sudo rpm -ivh mysql80-community-release-el7-5.noarch.rpm`

**3. Install MySQL server**

`sudo yum install mysql-server`

**4. Start MySQL server**

`sudo systemctl start mysqld`

**5. check the status of the MySQL server service**

`sudo systemctl status mysqld`

During the installation process temporary root password being generated in /var/log/mysqld.log

`sudo grep 'temporary password' /var/log/mysqld.log`


**6. Configuring MySQL server** 

MySQL includes a security script to change some of the less secure default options for things like remote root logins and sample users

`sudo mysql_secure_installation`

```
[root@htdhostname ~]# grep 'temporary password' /var/log/mysqld.log
2022-04-15T19:44:07.651184Z 6 [Note] [MY-010454] [Server] A temporary password is generated for root@localhost: On.*epN#!1w=
[root@htdhostname ~]# mysql_secure_installation

Securing the MySQL server deployment.

Enter password for user root: 

The existing password for the user account root has expired. Please set a new password.

New password: 

Re-enter new password: 
The 'validate_password' component is installed on the server.
The subsequent steps will run with the existing configuration
of the component.
Using existing password for root.

Estimated strength of the password: 100 
Change the password for root ? ((Press y|Y for Yes, any other key for No) : y

New password: 

Re-enter new password: 

Estimated strength of the password: 100 
Do you wish to continue with the password provided?(Press y|Y for Yes, any other key for No) : y
By default, a MySQL installation has an anonymous user,
allowing anyone to log into MySQL without having to have
a user account created for them. This is intended only for
testing, and to make the installation go a bit smoother.
You should remove them before moving into a production
environment.

Remove anonymous users? (Press y|Y for Yes, any other key for No) : y
Success.


Normally, root should only be allowed to connect from
'localhost'. This ensures that someone cannot guess at
the root password from the network.

Disallow root login remotely? (Press y|Y for Yes, any other key for No) : n

 ... skipping.
By default, MySQL comes with a database named 'test' that
anyone can access. This is also intended only for testing,
and should be removed before moving into a production
environment.


Remove test database and access to it? (Press y|Y for Yes, any other key for No) : n

 ... skipping.
Reloading the privilege tables will ensure that all changes
made so far will take effect immediately.

Reload privilege tables now? (Press y|Y for Yes, any other key for No) : y
Success.

All done! 
[root@htdhostname ~]# 
```

**7. Testing MySQL server connection**

`mysqladmin -u root -p version`
```
[root@htdhostname ~]# mysqladmin -u root -p version
Enter password: 
mysqladmin  Ver 8.0.28 for Linux on x86_64 (MySQL Community Server - GPL)
Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Server version		8.0.28
Protocol version	10
Connection		Localhost via UNIX socket
UNIX socket		/var/lib/mysql/mysql.sock
Uptime:			3 min 39 sec

Threads: 2  Questions: 14  Slow queries: 0  Opens: 132  Flush tables: 3  Open tables: 48  Queries per second avg: 0.063

[root@htdhostname ~]# mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 12
Server version: 8.0.28 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases
    -> ;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
4 rows in set (0.01 sec)

mysql> 
mysql> quit
Bye
[root@htdhostname ~]# 
```
