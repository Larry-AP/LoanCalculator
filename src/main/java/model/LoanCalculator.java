package model;

/**
 * Larry Paucar - Lpaucar
 * CIS175 -Spring 2024
 * Feb 13, 2024
 */
public class LoanCalculator {
	
	private double principal;
	private double interestRate;
	private int loanTermLength;
	private double additionalPayments;
	
	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getLoanTermLength() {
		return loanTermLength;
	}

	public void setLoanTermLength(int loanTermLength) {
		this.loanTermLength = loanTermLength;
	}

	public double getAdditionalPayments() {
		return additionalPayments;
	}

	public void setAdditionalPayments(double additionalPayments) {
		this.additionalPayments = additionalPayments;
	}
	
	public LoanCalculator() {
		super();
	}

	public LoanCalculator(double principal, double interestRate, int loanTermLength, double additionalPayments) {
		super();
		this.principal = principal;
		this.interestRate = interestRate;
		this.loanTermLength = loanTermLength;
		this.additionalPayments = additionalPayments;
	}

	@Override
	public String toString() {
		return "LoanCalculator [principal=" + principal + ", interestRate=" + interestRate + ", loanTermLength="
				+ loanTermLength + ", additionalPayments=" + additionalPayments + "]";
	}


	
	
}
	