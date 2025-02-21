## Recap 

1. Linux commands
2. touch 
3. ls ls -l ls -lrt  



how to create a file 
how to edit it 
save it , save and exit 
copy 
delete 
rename 


how to create a directory 
remove a directory 
change directory 
go back to prev directory 




cd --- change dir 
rm - remove 
mv - rename 
cp - copy 
cd .. 

vi file 

open 



save and exit - :x    :wq
exit :q, :q! 


## Permissions
-rw-r--r--. 1 ec2-user ec2-user  7 Feb 14 02:45 phone
r - read 
w - write 
x - execute 

rw-  owner permission
r--  group permission, L1 
r--  other permission


chmod 
7  - rwx to owner
7  - rwx to group
7  - rwx - other 
phone

## chmod 777 file_name

permission 
0 - no permission 
1 - execute permission
2 - write permission 
3 - write and execute permission 
4 - read permission 
5 - read and execute permission 
6 - read and write permission
7 all permissions

create a directory named as pragra 
create 3 files 
1. java , javscript, python
 and write 1 line about these and save them,

1. create a file with [java]
owner permisison as readonly and group and other  permission as rwx




2. create another file [javscript] with owner permission read and write, and remaining as no permission
3. [python]onwer permission as read and execute and group as read and write and other as read only 




## grep command 

search for an expression in the file 


grep keyword_to_search file_name 

which match the keyword
1. grep java file
2. -v    - which does not match the keyword
3. -n  - to print the line numbers 
4. -i  - to rule out upper case and lower case 
5. -c - count the number of matching lines for the specific keyword


## Sort command

sort file_name - in natural sorted order 
sort -r file_name - reverse order 



Shell scripting ? 

1. create a file with .sh extension 
file.sh 

2. change the permission of the file to execute 
chmod +x file.sh 
3. echo "Hello World"
4. ./file.sh    - to the shell script file


**#!/bin/bash**
name="Nikhil"
echo "$name"


Task : 
Print 

lan="Java"
Hello I am learning Java. 
Java is Object Orirented Programming lang.




ISHA 10 11 am 














