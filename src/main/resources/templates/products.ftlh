<!DOCTYPE html>
<html>
<head>
    <title>КупиПродай</title>
</head>
<body>
   <h1>Главная страница</h2><hr>
   <h3>Продукты</h3><hr>
<#list products as product>
<div>
    <p><b>${product.title}</b>${product.price} руб. | <a href="/product/${product.id}"> Подробнее...</a> </p>
</div>
</#list>
<hr>
<h3> Создать</h3>
<form action="/product/create" method="post">
    Название <input type="text" name="title"/><br><br>
    Описание <input type="text" name="description"/><br><br>
    Цена <input type="number" name="price"/><br><br>
    Город <input type="text" name="city"/><br><br>
    Продавец <input type="text" name="author"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>