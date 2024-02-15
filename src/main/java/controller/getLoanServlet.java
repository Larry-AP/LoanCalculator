package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoanCalculator;

/**
 * Servlet implementation class getLoanServlet
 */
@WebServlet("/getLoanServlet")
public class getLoanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getLoanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		double principal = Double.parseDouble(request.getParameter("principal"));
        double interestRate = Double.parseDouble(request.getParameter("interestRate"));
        int loanTermLength = Integer.parseInt(request.getParameter("loanTermLength"));
        double additionalPayments = Double.parseDouble(request.getParameter("additionalPayments"));

        double monthlyInterestRate = interestRate / 12 / 100; 
        int totalPayments = loanTermLength;
        
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), totalPayments)) / (Math.pow((1 + monthlyInterestRate), totalPayments) - 1);
        
        double totalPaymentWithoutAdditional = monthlyPayment * totalPayments;
        
        double totalPayment = totalPaymentWithoutAdditional + additionalPayments;

        LoanCalculator loanCalculator = new LoanCalculator(principal, interestRate, loanTermLength, additionalPayments);
        
     
        //Decimal Format
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedTotalPayment = df.format(totalPayment);

        request.setAttribute("loanCalculator", loanCalculator);
        request.setAttribute("formattedTotalPayment", formattedTotalPayment);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
