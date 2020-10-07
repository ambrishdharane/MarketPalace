<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
 </head>
<head>
<style>

 ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}

 </style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div style="height: 100%;width: 1340px">


<ul>
  <li><a href="./">Home</a></li>
  <li><a href="./product">Products</a></li>
  <li><a href="./aboutus">AboutUs</a></li>
  <li><a href="./login">Login</a></li>
   <li><a class="active" href="./register">Register</a></li>
</ul>




<div style="background-color: #ffffff; height: 900px;    width: 1340px;">

dfdsfdsfdsf

<div id="formBlock" style="height: 680px;width: 700px;margin-left:300px;background-color: #b5afd8;border-radius: 25px;" >
<div class="container">
  <h2 align="center">User Registration</h2>
  <form action="./storereg">
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    <div class="form-group">
      <label for="mobileno">MobileNo:</label>
      <input type="number" class="form-control" id="mobileno" placeholder="Enter Mobile Numbe" name="mobileno">
    </div>
    <div class="form-group">
      <label for="address">Address:</label>
      <textarea name="address" class="form-control" id="address" placeholder="Enter Address" >
      Enter Address
      </textarea>
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
    </div>
     <div class="form-group">
      <label for="confirmpass">ConfirmPassword:</label>
      <input type="password" class="form-control" id="confirmpass" placeholder="Enter confirm password" name="confirmpass">
    </div>
    
    
    <div class="form-group form-check">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
</div>





</div>
<footer>
<div style="background-color: #091638; ;height: 250PX;">
CC
</div>
</footer>
</div>
</body>

</html>