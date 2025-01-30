<!DOCTYPE html>
<html>
<head>
    <title>КупиПродай</title>
</head>
<body>
   <h1>Главная страница</h2><hr>
   <h3>Подробная информация о товаре</h3>
   <hr>
   <b>Название товара: </b>${product.title}<br>
   <b>Описание товара: </b>${product.description}<br>
   <b>Цена: </b>${product.price}<br>
   <b>Город: </b>${product.city}<br>
   <b>Продавец: </b>${product.author}<br>
<hr>
<h3> Создать</h3>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Удалить товар"/>
</form>
<a href="/">Вернуться на главную</a>
</body>
</html>