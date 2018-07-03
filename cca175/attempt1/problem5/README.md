# Problem 5: 
Spark read two text file to two rdd, parse both data and join by first column. Then write text file in format "name,ip"
## Description
  * /loudacre/weblogs/ logs for web access. Format "ip - id [time] "request" "browser""
  * /loudacre/accounts/ contains user information. Columns "id,create_time,update_time,first_name,last_name,address,city,state,zipcode,phone,login_time,access_time".
  * Parse ip and id information from web access information and parse id, first_name, last_name from accounts. Get all ip for each user name and create data as "firstname lastname,ip". Save to directory /user/training/problem5/solution.
## Output: 
  * Save to directory /user/training/problem5/solution as text file.
  * Data in format "firstname lastname,ip".
  * No compression.
