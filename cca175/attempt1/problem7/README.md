# Problem 7: 
Spark read from text file, split to array and select first 7 columns from RDD.
## Description
  * Read from text file under directory /loudacre/accounts/. Files are in csv format delimited by ','.
  * Colmns "id,create_time,update_time,first_name,last_name,address,city,state,zipcode,phone,login_time,access_time".
  * Sample data "97320,2013-09-22 13:57:58.0,2014-03-14 15:55:49.0,Bryant,Nemec,4007 West Fork Drive,Eugene,OR,97440,5411715739,2014-03-18 13:32:51.0,2014-03-18 13:32:51.0".
  * Select the first 8 columns "id,create_time,update_time,first_name,last_name,address,city,state" and save to text file delimited by bar.
## Output: 
  * Save to directory /user/training/problem7/solution.
  * File should be in text format delimieted by vertical bar ('|').
  * No compression.
