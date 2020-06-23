# web-application-api
for ust students :3 

## Prerequisites
- [Xammp Latest Version](https://www.apachefriends.org/index.html)
- [JDK 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [Apache Netbeans IDE](https://netbeans.apache.org/download/index.html)

## Must Have Apps 
- [Postman](https://www.postman.com/downloads/), for api testing.

## Installation 
- After setting up the Prerequisites 
- start the xampp control panel,then start apache & mysql services.
- in phpmyadmin create a database named web_application_api.
- from the cloned repository, drag the file in database folder to phpmyadmin page.
- in Apache Netbeans, add the cloned repostory via File->Open Project.
- incase the tomcat server is not yet included, go to tools->servers and go to add server button, select tomcat;
  afterwards specify the tomcat location (usually in C:\xammp\tomcat);
  for username & password, just set root to both.
- build the project, note that it may take sometime to build as it will install all the libraries required from maven. 
- afterwards run the program. 


## Web App API
| Request Type |  URL | Parameter
| ----- | ----- | ---- |
| POST | api/v1/sendMessage | string:message  
| GET | api/v1/sendMessag | |
