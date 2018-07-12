data = sqlContext.read.format("com.databricks.spark.avro").load("/loudacre/accounts_avro")
ret = data.groupBy("state").agg(count(data.acct_num).alias("account_count"))
sqlContext.setConf("spark.sql.parquet.compression.codec", "uncompressed")
ret.write.parquet("/user/training/problem9/solution")
