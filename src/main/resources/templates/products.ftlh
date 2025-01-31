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

    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>