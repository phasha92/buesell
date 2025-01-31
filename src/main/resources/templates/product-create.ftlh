<!DOCTYPE html>
<html>
<head>
    <title>Создать новый продукт</title>
</head>
<body>
   <h1>Создание нового продукта</h1><hr>

   <form action="/product/create" method="post">
       Название <input type="text" name="title"/><br>
       Описание <input type="text" name="description"/><br>
       Цена <input type="number" name="price"/><br>
       Город <input type="text" name="city"/><br>
       Продавец <input type="text" name="author"/><br>
       <br>
       <input type="submit" value="Добавить товар"/>
   </form>
   <a href="/">Вернуться на главную</a>
</body>
</html>