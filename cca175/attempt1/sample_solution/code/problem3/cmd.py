sqlContext.setConf("spark.sql.parquet.compression.codec", "gzip")
sqlContext.sql("select released, name from default.device").write.parquet("/user/training/problem3/solution")
