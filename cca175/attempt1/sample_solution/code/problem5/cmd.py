weblogs = sc.textFile("/loudacre/weblogs/").map(lambda line : line.split(" ")).map(lambda split : (split[2], split[0]))
accounts = sc.textFile("/loudacre/accounts/").map(lambda line : line.split(",")).map(lambda split : (split[0], (split[3], split[4])))
weblogs.join(accounts).map(lambda (id, (ip, (first_name, last_name))) : first_name + " " + last_name + "," + ip).saveAsTextFile("/user/training/problem5/solution")
