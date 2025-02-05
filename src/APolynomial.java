 import java.util.ArrayList;
 
 public class APolynomial implements Polynomial {
 
	 private ArrayList<Term> polynomial = new ArrayList<Term>();
	 //private int polynomialLength = polynomial.size();
	 
	 public void setPolynomial(ArrayList<Term> polynomial){
		 if (polynomial.size() <= 100) {
			this.polynomial = polynomial;
			//this.polynomialLength = polynomial.size();
		 }
		 else
			 System.out.println("polynomial exceeds max array length of 100");
	 }
	 
	 public ArrayList<Term> getPolynomial() {
		 return this.polynomial;
	 }
	 
	 //exercise 6
	 public boolean addTerm(Term t) {
		 if (polynomial.size() < 100){
			 //polynomial[polynomialLength] = t;
			 polynomial.add(t);
			 //polynomialLength = polynomial.size();
			 return true;
		 }
		 else {
			 System.out.println("Can not add term as max length of polynomial has already been reached.");
			 return false;
		 }
	 }
	 
	 //exercise 7
	 public int getNumberTerms() {
		 return polynomial.size();
	 }

	 
	 public boolean removeTerm(Term t) {
		 for (int i = 0; i < polynomial.size(); i++) {

			 if (t.getCoefficient() == polynomial.get(i).getCoefficient() && t.getVariable() == polynomial.get(i).getVariable() && t.getExponent() == polynomial.get(i).getExponent()) {
				 polynomial.remove(i);
				 System.out.println("removed index: " + i);
				 i--;
				 System.out.println("i after i--: "+ i);
			 }			 
		 }
		 return true;
	 } 
	 
	 
// public int[] getExponents(); 
// public char[] getVariablesl(); 
// public Term[];
// getTerms(); 
// public Term[] getAllTerms();
 
 
 
 }
 
 