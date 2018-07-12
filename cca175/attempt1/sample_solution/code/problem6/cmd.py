data = sqlContext.read.json("/loudacre/accounts_json")
sqlContext.setConf("spark.sql.avro.compression.codec","snappy")
data.where(data.state == "CA").write.format("com.databricks.spark.avro").save("/user/training/problem6/solution")
