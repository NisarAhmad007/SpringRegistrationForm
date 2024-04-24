<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>Operation Form</h1>
<form action="getDetails">
    User By ID: <input id="uid" name="UID"><br>
    <label>
        <select name="ddFlag">
            <option value="select">Select Record</option>
            <option value="delete">Delete Record</option>
            <option value="update">Update Record</option>
        </select>
    </label>
    <br>
    <br>
    <input type="submit" value="Click Now"/>
</form>
</body>
</html>