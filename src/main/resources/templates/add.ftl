<#import "spring.ftl" as spring/>

<!DOCTYPE html>

<html lang="en">

<head>

  <meta charset="utf-8">

  <script type='text/javascript' src='https://code.jquery.com/jquery-2.1.4.js'></script>

  <script type='text/javascript' src='http://ajax.aspnetcdn.com/ajax/knockout/knockout-3.1.0.js'></script>
  
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css">

  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.css">

  <!-- Latest compiled and minified JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>
  
  <script type='text/javascript' src='/static/js/ProjectViewModel.js'></script>

  <title><@spring.message "project.add"/></title>
</head>

<body>

  <div class="container">
    <form class="form-horizontal" role="form">
      <h2>${message}</h2>
      <div class="form-group">
        <label class="control-label col-sm-2" for="prjName">Project name:</label>
        <div class="col-sm-10">          
          <input type="input" class="form-control" id="prjName" placeholder="Enter project name" data-bind="value: prjName">
        </div>
      </div>
      <div class="form-group">        
        <div class="col-sm-offset-2 col-sm-10">
          <button class="btn btn-default" data-bind="click: query">Query</button>
        </div>
      </div>
      
      <div class="form-group">
            <label for="inputEmail" class="control-label col-xs-2">Email</label>
            <div class="col-xs-10">
                <input type="email" class="form-control" id="inputEmail" placeholder="Email">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword" class="control-label col-xs-2">Password</label>
            <div class="col-xs-10">
                <input type="password" class="form-control" id="inputPassword" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-offset-2 col-xs-10">
                <div class="checkbox">
                    <label><input type="checkbox"> Remember me</label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-offset-2 col-xs-10">
                <button type="submit" class="btn btn-primary">Login</button>
            </div>
        </div>
      
    </form>
  </div>   
  
</body>

</html>