data = sqlContext.read.parquet("/loudacre/accounts_parquet")
data.select("last_name", "first_name").orderBy("last_name").map(lambda row : str(row.last_name) + "\t" + str(row.first_name)).coalesce(1).saveAsTextFile("/user/training/problem4/solution")
