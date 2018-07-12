# Problem 5: 
Restore snapshot files
## Description
One of the user mistakenly deleted file under /user/cloudera/problem5/solution. Now there's just one empty file under the directory. We did not enable trash before the deletion so there is no trash to recover. However, snapshot has been abled for the folder. Please recover the file from snapshot. Note that there are several snapshots so the one with the largest sequence number is the most recent one. And the recovered file should have original user permission, ACL, timestamp.
## Output: 
Store the recovered file under /user/cloudera/problem5/solution/solution.
