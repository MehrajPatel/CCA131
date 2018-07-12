# Problem 9: 
Spark SQL read from avro file and filter with some column, and then write records to hdfs as parquet file.
## Description
Read from JSON file on HDFS under path "/loudacre/accounts_avro". Count records group by state and name the count column to "account_count". The result should contain "account_count" and "state".
## Output: 
  * Save to directory "/user/training/problem9/solution".
  * The output file should be in parquet format. No compression is needed.
