data = sc.textFile("/loudacre/accounts/").map(lambda line : line.split(",")).map(lambda split : split[0:8]).map(lambda line: "|".join([str(x) for x in line]))
data.saveAsTextFile("/user/training/problem7/solution")
