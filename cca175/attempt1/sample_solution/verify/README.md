# Process to check:

## Problem 1.
### Run in Spark: 
sc.textFile("/user/training/problem1/solution/").count
### Result: 
129761

## Problem 2. 
Run in mysql: select count(*) from problem2.solution;
Result:
+----------+
| count(*) |
+----------+
|   194764 |
+----------+
1 row in set (0.16 sec)

Problem 3.
Run in terminal: hadoop fs -ls /user/training/problem3/solution/
Result:
Found 7 items
-rw-rw-rw-   1 training supergroup          0 2018-07-10 20:06 /user/training/problem3/solution/_SUCCESS
-rw-rw-rw-   1 training supergroup        332 2018-07-10 20:06 /user/training/problem3/solution/_common_metadata
-rw-rw-rw-   1 training supergroup       1384 2018-07-10 20:06 /user/training/problem3/solution/_metadata
-rw-rw-rw-   1 training supergroup        796 2018-07-10 20:06 /user/training/problem3/solution/part-r-00000-ccae6376-1000-4f27-a9df-5f30f3c8960a.gz.parquet
-rw-rw-rw-   1 training supergroup        827 2018-07-10 20:06 /user/training/problem3/solution/part-r-00001-ccae6376-1000-4f27-a9df-5f30f3c8960a.gz.parquet
-rw-rw-rw-   1 training supergroup        817 2018-07-10 20:06 /user/training/problem3/solution/part-r-00002-ccae6376-1000-4f27-a9df-5f30f3c8960a.gz.parquet
-rw-rw-rw-   1 training supergroup        799 2018-07-10 20:06 /user/training/problem3/solution/part-r-00003-ccae6376-1000-4f27-a9df-5f30f3c8960a.gz.parquet

Run in Spark:
data = sqlContext.read.parquet("/user/training/problem3/solution/")
data.show()
Result:
+--------------------+--------------------+
|            released|                name|
+--------------------+--------------------+
|2008-10-21 00:00:...|       Sorrento F00L|
|2010-04-19 00:00:...|        Titanic 2100|
|2011-02-18 00:00:...|          MeeToo 3.0|
|2011-09-21 00:00:...|          MeeToo 3.1|
|2008-10-21 00:00:...|            iFruit 1|
|2011-11-02 00:00:...|            iFruit 3|
|2010-05-20 00:00:...|            iFruit 2|
|2013-07-02 00:00:...|            iFruit 5|
|2008-10-21 00:00:...|        Titanic 1000|
|2008-10-21 00:00:...|          MeeToo 1.0|
|2011-02-28 00:00:...|       Sorrento F21L|
|2012-10-25 00:00:...|            iFruit 4|
|2011-11-21 00:00:...|       Sorrento F23L|
|2010-05-25 00:00:...|        Titanic 2200|
|2010-06-20 00:00:...|Ronin Novelty Note 1|
|2012-07-21 00:00:...|        Titanic 2500|
|2013-04-11 00:00:...|Ronin Novelty Note 3|
|2011-10-02 00:00:...|Ronin Novelty Note 2|
|2013-07-02 00:00:...|Ronin Novelty Note 4|
|2012-07-21 00:00:...|           iFruit 3A|
+--------------------+--------------------+
only showing top 20 rows
Run in Spark: data.count
Result: res3: Long = 50  

Problem 4.
Run in terminal: hadoop fs -tail /user/training/problem4/solution/part-00000
Sample Result:
...
Zinke   Glenn
Zinke   Eddy
Zinke   Glenn
Zinke   Eddy
Zinke   Glenn
Ziolkowski  Heather
Ziolkowski  Heather
Ziolkowski  Heather
...
Zwick   Frederick

Run in Spark: sc.textFile("/user/training/problem4/solution/").count
Result: res4: Long = 129761

Problem 5.
Run in terminal: hadoop fs -tail /user/training/problem5/solution/part-00186
...
Elizabeth Searle,212.91.194.246
Elizabeth Searle,47.83.164.38
Elizabeth Searle,47.83.164.38
...
Elizabeth Fincher,145.48.106.83
Elizabeth Fincher,145.48.106.83
Run in Spark: sc.textFile("/user/training/problem5/solution/").count
Result: res5: Long = 1079891 

Problem 6.
Run in terminal: hadoop fs -ls /user/training/problem6/solutionFound 5 items
Result:
-rw-rw-rw-   1 training supergroup          0 2018-07-10 23:10 /user/training/problem6/solution/_SUCCESS
-rw-rw-rw-   1 training supergroup        644 2018-07-10 23:10 /user/training/problem6/solution/part-r-00000-e98827d5-dd2f-4428-b035-fc9abcf23954.avro
-rw-rw-rw-   1 training supergroup        644 2018-07-10 23:10 /user/training/problem6/solution/part-r-00001-e98827d5-dd2f-4428-b035-fc9abcf23954.avro
-rw-rw-rw-   1 training supergroup        644 2018-07-10 23:10 /user/training/problem6/solution/part-r-00002-e98827d5-dd2f-4428-b035-fc9abcf23954.avro
-rw-rw-rw-   1 training supergroup        644 2018-07-10 23:10 /user/training/problem6/solution/part-r-00003-e98827d5-dd2f-4428-b035-fc9abcf23954.avro
Run in terminal: hadoop fs -get /user/training/problem6/solution/part-r-00003-e98827d5-dd2f-4428-b035-fc9abcf23954.avro; avro-tools getmeta part-r-00003-e98827d5-dd2f-4428-b035-fc9abcf23954.avro 
Result:
{"type":"record","name":"topLevelRecord","fields":[{"name":"acct_close_dt","type":["long","null"]},{"name":"acct_create_dt","type":["long","null"]},{"name":"acct_num","type":["long","null"]},{"name":"address","type":["string","null"]},{"name":"city","type":["string","null"]},{"name":"created","type":["long","null"]},{"name":"first_name","type":["string","null"]},{"name":"last_name","type":["string","null"]},{"name":"modified","type":["long","null"]},{"name":"phone_number","type":["string","null"]},{"name":"state","type":["string","null"]},{"name":"zipcode","type":["string","null"]}]}
avro.codec  snappy
Run in Spark: sqlContext.read.format("com.databricks.spark.avro").load("/user/training/problem6/solution/").count
Result: res7: Long = 92416 

Problem 7.
Run in terminal: hadoop fs -tail /user/training/problem7/solution/part-00003
Result:
...
129751|2014-02-02 16:00:18.0|\N|Sylvia|Boykin|1373 Green Hill Road|Santa Monica|CA
129752|2014-02-15 22:36:02.0|\N|Gary|Johnson|4944 Laurel Lane|Santa Barbara|CA
129753|2014-02-17 08:30:21.0|\N|Fernando|Tarrant|4395 Fulton Street|Anaheim|CA
129754|2014-01-26 04:35:47.0|\N|Maria|Godoy|455 Hickman Street|Prescott|AZ
129755|2014-01-06 16:11:39.0|2014-02-21 11:22:56.0|John|Hale|1718 Irish Lane|San Bernardino|CA
...
129761|2014-01-05 16:23:40.0|\N|Ruth|Ebersole|4684 Irving Place|Klamath Falls|OR
Run in Spark: sc.textFile("/user/training/problem7/solution").count()
Result: Out[3]: 129762

Problem 8.
Run in terminal hadoop fs -tail /user/training/problem8/solution/part-00001
...
25.45.24.35,2
145.83.182.82,2
...
45.230.116.19,2
148.13.211.103,2
2.28.189.122,2
160.126.236.46,2

Run in Spark: sc.textFile("/user/training/problem8/solution").count()
474330

Problem 9.
Run in terminal: hadoop fs -ls /user/training/problem9/solution
Found 203 items
-rw-rw-rw-   1 training supergroup          0 2018-07-10 23:31 /user/training/problem9/solution/_SUCCESS
-rw-rw-rw-   1 training supergroup        339 2018-07-10 23:31 /user/training/problem9/solution/_common_metadata
-rw-rw-rw-   1 training supergroup       1259 2018-07-10 23:31 /user/training/problem9/solution/_metadata
-rw-rw-rw-   1 training supergroup        339 2018-07-10 23:31 /user/training/problem9/solution/part-r-00000-0e1e9083-b73e-42a7-825b-10006e2bdc93.parquet
-rw-rw-rw-   1 training supergroup        339 2018-07-10 23:31 /user/training/problem9/solution/part-r-00001-0e1e9083-b73e-42a7-825b-10006e2bdc93.parquet
...
Run in Spark: data = sqlContext.read.parquet("/user/training/problem9/solution")
Run in Spark: data.show()
Result:
+-----+-------------+
|state|account_count|
+-----+-------------+
|   NV|        11016|
|   AZ|        12754|
|   OR|        13575|
|   CA|        92416|
+-----+-------------+

