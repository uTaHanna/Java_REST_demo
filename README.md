## A Very Simple Java RESTful Web Application (Work in Progress)

### Technologies used:

for the backend,
* Java (1.8.0_144)
* Jersey
* Maven (3.3.9)
* MongoDB (3.2)
* Spring
* Tomcat

for the front end,
* AngularJS
* Bootstrap (to be utilized later) 

### Prelimanary Remarks
 
At least at this very early stage, my aim is not to make a practically useful<br> 
application with a meaningful business logic; instead, I am exploring AngularJS<br> 
for connecting the backend, which I have some--albeit limited--experience in, to the<br> 
front end. So, my goal here is to set up a project architecture robust enough to build<br> 
an actual application on later. Accordingly, the current code is deliberately simple.<br>
To give some motivation and a sense of direction, however, the application is<br>
meant to be a very basic address book: you can add (POST) the name and email of<br> 
a new contact and retrieve (GET) it by the name. (I have not added functionalities<br> 
corresponding to PUT and DELETE yet.)

I would also comment on the lack of tests in the current package. I normally write unit<br> 
tests in tandem with feature code, using a Jersey based testing infrastructure, for<br>
backend. However, given the simplicity of the code and unfamiliarity with testing<br>
frameworks for AngularJS, at this point I have not added tests yet. (I used Fiddler for<br> 
backend code debugging.)

I based this small project on several online sources, which are mentioned in the<br>
References section at the bottom as well as in pertinent code files.       

### How to run this tiny application (Refer to the screen shots below for illustration)

1. Build the source code with Maven.
1. Run Mongo, and make a new database called 'testdb'
1. Start Tomcat with 'tomcat7:run' command (I myself do this from IntelliJ)
1. Open http://localhost:8080/siapp on a browser, to get to the home page
1. Click 'New Contacts' link at the top
1. Enter the name and email of a new contact and submit
1. Click 'Contacts' link at the top
1. Enter the name of the new contact you just made and then submit, to get<br> 
   the email address from the database

(Since this is not meant as a practical application and the work is still in progress,<br>
I have not checked error handling yet; be careful and gentle when trying the app!)

For step 4:<br>
![home](/mdimages/home.PNG)

For step 6:<br>
![newContact](/mdimages/newContact.PNG)

For step 8:<br>
![get1](/mdimages/get1.PNG)

When submit the request, you get the email address from the database:<br> 
![get2](/mdimages/get2.PNG)

Of course, the document is in the collection:<br>
![mongo](/mdimages/mongo.PNG)

### References

For the backend configuration:

https://chiaboy.wordpress.com/2014/07/20/simple-jersey-example-with-intellij-idea-and-tomcat/<br>
https://github.com/jersey/jersey/tree/2.4.1/examples/helloworld-spring-webapp  
                  
For the front end set up:

http://sivalabs.in/2014/09/angularjs-tutorial-getting-started-with-angularjs/<br>
https://github.com/sivaprasadreddy/proof-of-concepts/tree/master/angularjs-samples

http://draptik.github.io/blog/2013/07/13/angularjs-example-using-a-java-restful-web-service/<br>
https://github.com/draptik/angulardemorestful

https://www3.ntu.edu.sg/home/ehchua/programming/webprogramming/AngularJS_Basics.html

https://stackoverflow.com/questions/24710503/how-do-i-post-urlencoded-form-data-with-http-in-angularjs<br>
(in particular for a function for data encoding, which enables use of @FormParam annotation in the backend)

### Bibliography

https://www3.ntu.edu.sg/home/ehchua/programming/howto/Tomcat_HowTo.html<br>
(More generally, the author of this site has a lot of thorough and insightful<br>
tutorials at his home page; you should check: https://www3.ntu.edu.sg/home/ehchua/programming/index.html)


 


                        