## Backend.Simbirsoft
Тестовое задание для backend-практикума.
____
### Tools 
Spring (Boot, Data, Web), MySQL, FlyWay, Lombok.
____
### Description
 - Приложение представляет собой MVC сервис, делающий парсинг полученного HTML документа, согласно заранее заданным ключам, на отдельные слова.
 - В ответ выдает JSON-объект со статистикой по количеству дубликатов слов, отсортированных по возрастанию.
 - Параллельно с отправкой ответа, сервис сохраняет статистику в базу данных. 
 - В случае, если приложение выбрасывает Exception, лог с текстом ошибки сохраняется в файл, по пути 'projectDir'/logs/'currentDate'/ .
 - Для **запуска** из исходников 
____
### Input
 - На стартовой странице (for local - http://localhost:8080/) в форму данных ввести валидный URL-страницы и нажать кнопку "Get words count".
 - Или отправить POST запрос по тому же адресу, с объектом FORM-DATA "url = ваш_URL_здесь".
____
### Output
Ответ на запрос (и в случае ошибок) представлен в форме JSON - 
'{
  "timestamp": 
  "status": 
  "message": 
  "body": 
'}

Для облегчения чтения и записи, на экран, и в базу данных, попадают последние 25% слов.
