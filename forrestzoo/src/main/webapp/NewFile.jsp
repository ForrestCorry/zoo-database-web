<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Zoo Add</title>
	<link rel="stylesheet" type="text/css" href="zoo.css">
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
		<head>
			<h1 align="center">Welcome To Forrest's Zoo</h1>
		</head>

		
		
		
		
		<div class="zootable">
		 <table>
		   <caption align="center">Animals In The Zoo</caption>
  			<tr>
    			<th>ID</th>
    			<th>Species</th> 
    			<th>Habitat</th>
    			<th>Diet</th>
    			<th>Name</th>
    			<th>Weight</th>
  			</tr>
  			<tr>
    			<td>Test</td>
    			<td>Test</td> 
    			<td>Test</td>
    			<td>Test</td>
    			<td>Test</td>
    			<td>Test</td>
  			</tr>
  			<tr>
    			<td>Test</td>
    			<td>Test</td> 
    			<td>Test</td>
    			<td>Test</td>
    			<td>Test</td>
    			<td>Test</td>
  			</tr>
  			<tr>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  			</tr>
  			<tr>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  			</tr>
  			<tr>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  			<tr>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  				<td>Test</td>
  			</tr>
		</table>
       </div>
       
     <form class="form-horizontal" action="addToDB" method="post">
  		<div class="form-group">
    		<label for="species" class="col-sm-2 control-label">Species</label>
    			<div class="col-sm-10">
      				<input class="form-control" placeholder="Species" name="species">
   			 	</div>
 		</div>
  		<div class="form-group">
    		<label for="Habitat" class="col-sm-2 control-label">Habitat</label>
    		<div class="col-sm-10">
      			<input class="form-control" placeholder="Habitat" name="habitat">
   		 	</div>
  		</div>
  		<div class="form-group">
    		<label for="Diet" class="col-sm-2 control-label">Food</label>
    		<div class="col-sm-10">
      			<input class="form-control" placeholder="Diet" name="food">
   		 	</div>
  		</div>
  		<div class="form-group">
    		<label for="Name" class="col-sm-2 control-label">Name</label>
    		<div class="col-sm-10">
      			<input class="form-control" placeholder="Name" name="name">
   		 	</div>
  		</div>
  		<div class="form-group">
    		<label for="Weight" class="col-sm-2 control-label">Weight</label>
    		<div class="col-sm-10">
      			<input class="form-control" placeholder="Weight" name="weight">
   		 	</div>
  		</div>
  		<div class="form-group">
    		<div class="col-sm-offset-2 col-sm-10">
      			<button type="submit" class="btn btn-info" value="Submit">Submit</button>
    		</div>
  		</div>
	</form>
	<div>
	</div>
	
	<div class="button" align="center">
	   <a class="btn btn-primary btn-lg" href="index.html" role="button">Home</a>
	</div>

</body>
</html>