
Логические ошибки которые исправил:
Стрим результатов запроса к БД на правильный запрос

С чем пришлос столкнуться:
Ничего не знал про бутстрап и тимлиф, 
Понял как работает MVC
почитал документацию(не поддаётся подсчёту чистого времени), 
посмотрел обучающие ролики (около 10 часов)

Поменял модель приложения на приближённую к действительности (сначала врач вносит номерки когда можно попасть на приём, затем пациент выбирает время)

Что использовал в работе:
https://stackabuse.com/integrating-h2-database-with-spring-boot/
a lot of https://www.baeldung.com/
https://www.youtube.com/playlist?list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ
https://habr.com/ru/post/435062/ (translate of https://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html)
https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html
https://stackoverflow.com/questions/43606063/spring-thymeleaf-delete-object-from-html-table-and-pass-id-to-controller

На что надо обратить внимание:
Отчёт ГТМ на гитхабе, там затраты времени в ИДЕ
Схему приложения в пдф

Что успел сделать:
0) STAGE 0 – Projekti seadistamine
1) ETAPP 1 - arendusprojekti seadistamine ning esmased muudatused
2) ETAPP 2 - Registreeringute vaatamise vaade
3.1) Lisa registreeringute detail vaatele võimalus registreeringuid kustutada
3.3) Lisa registreeringu esitamise vaatele funktsionaalsus broneeringu aegade kontrolliks
5) ETAPP 5 – Kui see pole veel päris see..

Не успел сделать:
3.2) Lisa registreeringute detail vaatele võimalus registreeringuid muuta
4) ETAPP 4 - Otsing
Unit tests (lack of  time)
на странице зарегистрированых визитов дантистИд поменять на ФИО

Ошибки которые не успел или не смог поправить:
При переходе на бутстрап отвалились ошибки
плохо фильтруется список доступных имён( должно зарегистрированное сразу проподать из списка, а проподает только после удалении записи через Делете форм)
В бутстрапе не всё элементы получилось поставить на свои места
Запросы к БД не работают как ожидается
