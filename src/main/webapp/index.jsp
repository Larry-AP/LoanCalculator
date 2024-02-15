<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loan Calculator</title>
</head>
<body>

	<h1>Welcome to Loan Calculator!</h1>
	
	<form action="getLoanServlet" method="post">
	
	<h2>Enter Details of Your Loan Below:</h2>
	
	<label for="principal">Principal Amount:</label>
	<input type="number" id="principal" name="principal"><br>
	
	<label for="interestRate">Annual Interest Rate:</label>
	<input type="number" id="interestRate" name="interestRate"><br>
	
	<label for="loanTermLength">Loan Term Length in Months:</label>
	<input type="number" id="loanTermLength" name="loanTermLength"><br>
	
	<label for="additionalPayments">Additional Payments:</label>
	<input type="number" id="additionalPayments" name="additionalPayments"><br>
	
	
	<input type="submit" value="Calculate Loan Total" /> </form>
	

</body>
</html>