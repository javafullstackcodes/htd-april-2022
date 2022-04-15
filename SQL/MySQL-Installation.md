###MySQL Server Installation###
**1. Download MySQL community server yum repository rpm**

`curl -sSLO https://dev.mysql.com/get/mysql80-community-release-el7-5.noarch.rpm`

**2. Install sql yum repository rpm**

`sudo rpm -ivh mysql57-community-release-el7-9.noarch.rpm`

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


**7. Testing MySQL server connection**

mysqladmin -u root -p version
