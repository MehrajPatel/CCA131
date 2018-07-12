# Problem 8: 
Add sqoop service, create symlink and import tables onto HDFS.
## Description
  * Now we would liek to add use sqoop to sync data from MySQL database. Add the Sqoop through Cloudera Manager. Note that to connect to MySQL,  link to jdbc connector should should also be created under /var/lib/sqoop/. 
  * Use sqoop to import sample data to HDFS directory under /user/cloudera/problem5/solution. The output data should be text file with default delimiter (comma as default).
### MySQL information:  
  * hostname: localhost
  * username: cloudera
  * password: cloudera
  * table: problem8.accounts
## Output: 
  * Sqoop service added on Cloudera Manager
  * Symlink to MySQL connector (/usr/share/java/mysql-connector-java.jar) created under /var/lib/sqoop.
  * Import data from table loudacre.accounts to /user/cloudera/problem8/solution.
