<%--
  Created by IntelliJ IDEA.
  User: Sharma Ji
  Date: 5/24/2021
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Complex Form</title>
</head>
<body>
<h1>                               Complex form</h1>
<form action="form_submit">
    <div class="container mt-4">
        <div class="form-group">
            <label for="exampleFormControlInput1">Email address</label>
            <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com"
                   name="email">
        </div>
        <div class="form-group">
            <label for="exampleFormControlSelect1">Select Religion</label>
            <select class="form-control" id="exampleFormControlSelect1" name="religion">
                <option>Hindu</option>
                <option>Muslim</option>
                <option>Christian</option>
                <option>Sikhh</option>
                <option>Budhha</option>
            </select>
        </div>
        <div class="form-group">
            <label for="exampleFormControlSelect2">Select Flavour</label>
            <select multiple class="form-control" id="exampleFormControlSelect2" name="flavour">
                <option>Mango</option>
                <option>Orange</option>
                <option>Butterscotch</option>
                <option>Vanilla</option>
                <option>Chocolate</option>
            </select>
        </div>
        <div class="form-group">
            <label for="exampleFormControlTextarea1">Feedback</label>
            <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="feedback"></textarea>
        </div>
        <div class="form-check">
            <input type="checkbox" class="form-check-input" id="exampleCheck1" name="isCheck">
            <label class="form-check-label" for="exampleCheck1">Do you Want to Proceed</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail11">Street</label>
            <input type="text" class="form-control" name="address.street" id="exampleInputEmail11"
                   aria-describedby="emailHelp1" placeholder="Enter street">
            <small id="emailHelp1" class="form-text text-muted">Enter your Street</small>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail12">City</label>
            <input type="text" class="form-control" name="address.city" id="exampleInputEmail12"
                   aria-describedby="emailHelp2" placeholder="Enter city">
            <small id="emailHelp2" class="form-text text-muted">Enter your City.</small>
        </div>
        <div class="form-group">
            <input type="text" id="datein" name="date">
            <label for="datein">Date of birth</label>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>