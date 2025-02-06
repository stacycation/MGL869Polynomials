 import java.util.ArrayList;
 
 public class APolynomial implements Polynomial {
 
	 private Term[] polynomial = new Term[100];
	 //private int polynomialLength = polynomial.length;
	 
	 public void setPolynomial(Term[] Polynomial){
		 if (polynomial.length <= 100) {
			 for (int i=0; i < Polynomial.length; i++) {
				 this.polynomial[i] = Polynomial[i];
			 }
			//this.polynomial = polynomial;
			//this.polynomialLength = polynomial.length;
		 }
		 else
			 System.out.println("polynomial exceeds max array length of 100");
	 }
	 
	 public Term[] getPolynomial() {
		 return this.polynomial;
	 }
	 
	 //exercise 6
	 public boolean addTerm(Term t) {
		 if (polynomial.length <= 100){
			 int insertIndex = this.getNumberTerms(); 
			 polynomial[insertIndex] = t;
			 return true;
		 }
		 else {
			 System.out.println("Can not add term as max length of polynomial has already been reached.");
			 return false;
		 }
	 }
	 
	 //exercise 7
	 public int getNumberTerms() {
		 int count = 0;
		 for (int i=0; i < polynomial.length; i++) {
			 if (polynomial[i] != null) count++; 
		 }
		 return count;
	 }

	 
	 public boolean removeTerm(Term t) {
		 for (int i = 0; i < polynomial.length; i++) {
			 System.out.println("i: " + i);
			 System.out.println("polynomial[i]: " + polynomial[i]);
			 System.out.println("poly size: " + polynomial.length);
			 System.out.println("t: " + t);
			 
			 //once one term is removed, won't go back in the if clause on consequent loops. why?!
			 if (polynomial[i] == t) {
			 //if (true) {
				 polynomial.remove(i);
				 System.out.println("removed index: " + i);
				 i--;
				 System.out.println("i after i--: "+ i);
			 }
			 System.out.println("-post if statement-");
			 System.out.println("i: " + i);
			 if (i != -1) System.out.println("polynomial[i]: " + polynomial[i]);
			 System.out.println("poly size: " + polynomial.length);
			 System.out.println("t: " + t);
			 System.out.println("-----------------------------"); //debugging
			 
		 }
		 return true;
	 }
	 
	 public String pToString() {
		 String p_string = "";
			for (int i=0; i < this.getNumberTerms(); i++) {
				p_string = p_string + polynomial[i].toString() + ", ";
			}
		return p_string;
	 }
	 
	 
// public int[] getExponents(); 
// public char[] getVariablesl(); 
// public Term[];
// getTerms(); 
// public Term[] getAllTerms();
 
 
 
 }
 
 