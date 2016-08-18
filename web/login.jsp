<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login  ||  Event Management</title>
        <link href="assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="assets/js/bootstrap.js" type="text/javascript"></script>
        <script src="assets/js/npm.js" type="text/javascript"></script>
        <style> 
            .main{
                position:absolute;
                text-align:left;
                height: 100%;
                width: 100%;
                border-radius:5%;                 
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <div class="main">
                        <center> 
                            <h3>Admin Login</h3>
                        </center>
                        <form method="post" action="index.jsp">
                            <div class="form-group">
                                <label>Email</label>
                                <input type="email" name="email" class="form-control" required="required" placeholder="Enter the Email">   
                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input type="password" name="password" class="form-control" required="required" placeholder="Enter Password" >
                            </div>
                        </form>
                        <div>
                            <input type="checkbox" name="checkbox"> Remember me?
                            <input type="submit" class="btn btn-success pull-right glyphicon glyphicon-log-in" value="Login"/>                  
                        </div>
                        <br>
                        <div>
                            <a href="reset.jsp" class="btn btn-danger  btn-group-vertical">
                                <span class="glyphicon glyphicon-warning-sign"></span> Forget Password?
                            </a>
                            <a href="signup.jsp" class="btn btn-info btn-group-vertical">
                                <span class="glyphicon glyphicon-plus"></span>Sign Up
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div> 
    </body>



</html>
