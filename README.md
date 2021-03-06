I started my work on this assignment with:
Base knowledge of Java Core
NO knowledge about Spring framework
NEVER heard about Thymeleaf and MVC pattern.

So, after I received the assignment description, I started with self education.
At first, I looked at a few education channels on youtube (I chose this format because I had work trips around Estonia). It takes about 10+hours.
Second, find documentation about Thymeleaf here:https://habr.com/ru/post/435062/ (russian translation of official documentation) and here:  https://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html.
Readed and tried to understand a lot of different examples of Thymeleaf+Spring demo-projects.

As a result of watching, reading and coding I understand MCV pattern, base syntaxis of Thymeleaf and base concept of Spring.
Here is some of used resources:
https://stackabuse.com/integrating-h2-database-with-spring-boot/
a lot of https://www.baeldung.com/
https://www.youtube.com/playlist?list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ
https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html
https://stackoverflow.com/questions/43606063/spring-thymeleaf-delete-object-from-html-table-and-pass-id-to-controller

About app:
I changed the app model to be more realistic. 
Dentists can add times for client visits (I started that part, but decided to fix bugs in main stages).
Clients can book times in app, if a client cancels his visit it automatically doesn't return as available for booking (in my vision the dentist must make a decision to return this visit time back to the pool or not). For the purpose of reducing human errors, clients can choose a dentist and visit time only from dropdown list. Also the client must give his ID code.



Important links:
Here you can read GTM raport (Git Time Manager):
https://github.com/Marzuh/dentistapp/blob/master/GTM_raport.md
DB tables relations:
https://github.com/Marzuh/dentistapp/blob/master/CGI%20Dentist%20app%20db.pdf

I think, that I done next assignment tasks:
0) STAGE 0 – all of them =)
1) STAGE 1
2) STAGE 2
3.1) Delete added visit
3.3) Server validation for adding and deleting visits
5) STAGE 5 – add some bootstrap

Things that I didn't finish, due to limit of time and no mentors:
3.2) Edit registration (no time)
4) STAGE 4 - Search (no time)
6)Unit tests (no time and not enough skills with unit test for web)
7)On "registered-visits" web page change dentistId to dentistFullName (done few tries, no result in 1 hour, skipped)

Some cases that I implemented and changed during this assignment:
Used Stream in DB request(filter on server side, not right DB request)

Bugs that I have enough time to fix:
1)When moved on bootstrap(or somewhere near) lost verification errors.
2)In register form visit time filtering works bad (if add visit and delete it, only then visit hide in list, spend some time but didn't find working code. Imho it must be done on client side (Angular, React)
3)Not all elements have their place in bootstrap.
4)DB request wasnt work properly( I think some mistakes from my side, theoretical can be fixed with unit test, no time)

I am very glad that I tried this assignment. Lot of fun and experience.





