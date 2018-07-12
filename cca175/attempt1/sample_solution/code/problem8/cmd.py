sc.textFile("/loudacre/weblogs/").map(lambda line : (line.split(" ")[0], 1)).\
	reduceByKey(lambda v1, v2 : v1 + v2).\
	map(lambda (k, v) : str(k) + "," + str(v)).\
	saveAsTextFile("/user/training/problem8/solution")
