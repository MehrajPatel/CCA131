# Problem 3: 
Increase NN memory by calculation
## Description
Suppose our master node has 31GB memory in total. We have zookeeper, namenode, secondary namenode, resourcemanager and job history on the host. We would ilke to change namenode heap size as large as possible to support more files stored on HDFS. Please consider the proper size for namenode memory. Note that actual memory usage is usually 1.3 times java heap size and namenode and secondary namenode should have the same java heap size.
Memory usage consideration:
  * Reserve 6.2 GB (20%) for system usage.
  * 1 GB java heap size for zookeeper instance.
  * 1 GB java heap size for resourcemanager instance.
  * 1 GB java heap size for job historyserver instance.
## Output: 
Proper memory for namenode/secondary namenode on Cloudera Manager.
