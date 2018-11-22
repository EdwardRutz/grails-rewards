<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>List Products</title>
</head>

<body>


<table border="1px solid black" cellpadding="2" cellspacing="0">
    <g:each in="${allProducts}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.sku}</td>
            <td>${item.price}</td>
        </tr>
    </g:each>
</table>

</body>
</html>