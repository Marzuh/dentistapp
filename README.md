I started my work on this assignment with:
Base knowledge of Java Core
NO knowledge about Spring framework
NEVER heard about Thymeleaf and MVC pattern.

So, after I recieved assignment description, I started with selfeducation.
At first, looked few education channels on youtube (I choosed this format because had same work trips around Estonia). Its take about 10+hours.
Second, find documentation about Thymeleaf here:https://habr.com/ru/post/435062/ (russian translation of officail documentation) and here:  https://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html.
Read and tried understand a lot of different excamples of Thymeleaf+Spring demo-projects.

As result of watching, reading and coding understand MCV patter, base syntaxis of Thymeleaf and base concept of Spring.
Here is some of used resources:
https://stackabuse.com/integrating-h2-database-with-spring-boot/
a lot of https://www.baeldung.com/
https://www.youtube.com/playlist?list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ
https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html
https://stackoverflow.com/questions/43606063/spring-thymeleaf-delete-object-from-html-table-and-pass-id-to-controller

About app:
//

Important links:
Here you can read GTM raport (Git Time Manager):
https://github.com/Marzuh/dentistapp/blob/master/GTM_raport.md
DB tables relations:
https://github.com/Marzuh/dentistapp/blob/master/CGI%20Dentist%20app%20db.pdf

I think, that I done next assigment tasks:
0) STAGE 0 – all of them =)
1) STAGE 1 
2) STAGE 2 
3.1) Delete added visit 
3.3) Server validation for adding and deleting visits
5) STAGE 5 – add some bootstrap

Things that I didn't finish, due to limit of time and no mentors:
3.2) Edit registration (no time)
4) STAGE 4 - Searh (no time)
6)U nit tests (no time and not enough skills with unit test for web)
7)On "registered-visits" web page change dentistId to dentistFullName (done few tries, no result in 1 hour, skipped)

Some cases that I implemented and changed during this assignment:
Used Stream in DB request(filter on server side, not right DB reuest)

Bugs that I have enought time to fix:
1)When moved on bootstrap(or somewhere near) lost verification errors. 
2)In register form visit time filtering works bad (if add visit and delete it, only then visit hide in list, spend some time but didn't find working code. Imho it must be done on client side (Angular, React)
3)Not all element on their place in bootstrap.
4)DB requst wasnt work properly( I think some mistakes from my side, teoretical can be fixed with unit test, no time)

I am very glad that I tried this assigment. Lot of fun and excpirience.
