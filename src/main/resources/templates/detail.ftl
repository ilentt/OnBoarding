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

  <title><@spring.message "project.title"/></title>
</head>

<body>

  <div class="container">
    <form class="form-horizontal" role="form">
      <h2>${name}</h2>
     
	  <div class="form-group">
	    <label class="control-label col-sm-2" for="proId">Project number:</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" id="proId" disabled data-bind="text: id">
	    </div>
	  </div>
	  
	  
	  <div class="form-group">
	    <label class="control-label col-sm-2" for="projectName">Project name:</label>
	    <div class="col-sm-10"> 
	      <input type="text" class="form-control" id="projectName" placeholder="Enter Projecet Name" data-bind="text: name">
	    </div>
	  </div>
	  
	  
	  <div class="form-group">
	    <label class="control-label col-sm-2" for="finishingDate">Finishing Date:</label>
	    <div class="col-sm-10"> 
	      <input type="text" class="form-control" id="finishingDate" placeholder="Enter Finishing Date" data-bind="text: finishingDate">
	    </div>
	  </div>
	  
	  
	  <div class="form-group"> 
	    <div class="col-sm-offset-2 col-sm-10">
	      <div class="checkbox">
	        <label><input type="checkbox"> Remember me</label>
	      </div>
	    </div>
	  </div>
	  <div class="form-group"> 
	    <div class="col-sm-offset-2 col-sm-10">
      		<button type="submit" class="btn btn-default">Submit</button>
      		<button type="submit" class="btn btn-default">Back</button>
	    </div>
	  </div>
      
      
    </form>
  </div>   
  
</body>

</html>