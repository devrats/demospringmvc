<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Sharma Ji
  Date: 5/20/2021
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
</head>
<body>
<form action="/submit"  method="get">
    <label>Name</label>
    <input type="text" name="name" aria-label="name">
    <br>
    <label>Password</label>
    <input type="password" name="password" aria-label="password">
    <br>
    <label>Phone</label>
    <input type="text" name="phone" aria-label="phone">
    <br>
    <input type="submit">
</form>
<form action="/submit1" >
    <label>Name</label>
    <input type="text" name="name" aria-label="name">
    <br>
    <label>Password</label>
    <input type="password" name="password" aria-label="password">
    <br>
    <label>Phone</label>
    <input type="text" name="phone" aria-label="phone">
    <br>
    <input type="submit">
    <form:errors path="user.*"/>
</form>
<form action="/submit2" >
    <label>Name</label>
    <input type="text" name="name" aria-label="name">
    <br>
    <label>Password</label>
    <input type="password" name="password" aria-label="password">
    <br>
    <label>Phone</label>
    <input type="text" name="phone" aria-label="phone">
    <br>
    <input type="submit">
</form>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>