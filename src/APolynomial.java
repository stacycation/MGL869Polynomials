import java.util.Arrays;

//Exercise 5
public class APolynomial implements Polynomial {
 
	 private Term[] polynomial = new Term[100];
	 //private int polynomialLength = polynomial.length;
	 
	 public void setPolynomial(Term[] Polynomial){
		 if (polynomial.length <= 100) {
			 for (int i=0; i < Polynomial.length; i++) {
				 polynomial[i] = Polynomial[i];
			 }
			//this.polynomial = polynomial;
			//this.polynomialLength = polynomial.length;
		 }
		 else
			 System.out.println("polynomial exceeds max array length of 100");
	 }
	 
	 //Exercise 6
	 public boolean addTerm(Term t) {
		 if (polynomial.length <= 100 || polynomial == null){
			 int insertIndex = this.getNumberTerms(); 
			 polynomial[insertIndex] = t;
			 return true;
		 }
		 else {
			 System.out.println("Can not add term as max length of polynomial has already been reached.");
			 return false;
		 }
	 }
	 
	 //Exercise 7
	 public int getNumberTerms() {
		 int count = 0;
		 for (int i=0; i < polynomial.length; i++) {
			 if (polynomial[i] != null) count++; 
		 }
		 return count;
	 }

	 //Exercise 8
	 public boolean removeTerm(Term t) {
		 for (int i = 0; i < this.getNumberTerms(); i++) {
			 if (t.getCoefficient() == polynomial[i].getCoefficient() && t.getVariable() == polynomial[i].getVariable() && t.getExponent() == polynomial[i].getExponent()) {
				 for (int j=i; j < this.getNumberTerms(); j++) {
					 polynomial[j] = polynomial[j+1];
				 }
				 i--;
			 }			 
		 }
		 return true;
	 } 
	 
	 //Exercise 9
	 public int[] getExponents() {
		 int[] ExpArray = new int[this.getNumberTerms()];
		 Boolean new_exp = true;
		 int realLength = 0;
		 
		 for (int i=0; i < this.getNumberTerms(); i++) {
			 //System.out.println("first i: " + i);
			 for (int j=0; j < this.getNumberTerms() ; j++) {
				//check if exponent is already in the ExpArray
				if (ExpArray[j] == polynomial[i].getExponent()) {
					new_exp = false;
				}
			 }
			 if (new_exp) {
				 realLength++;
				 ExpArray[realLength-1] = polynomial[i].getExponent();
				 //System.out.println("i: " + i);
				 //System.out.println("ExpArrayUnformatted: " + Arrays.toString(ExpArray));
			 }
		 }
		 
		 int[] ExpArrayFormatted = new int[realLength];		 
		 for (int k=0; k<realLength; k++) {
			 ExpArrayFormatted[k] = ExpArray[k];
		 }	 
		 return ExpArrayFormatted;
	 }
	 
	 //Exercise 10
	 public char[] getVariables() {
		 char[] VarArray = new char[this.getNumberTerms()];
		 Boolean new_var = true;
		 int realLength = 0;
		 
		 for (int i=0; i < this.getNumberTerms(); i++) {
			 //System.out.println("i: " + i);
			 new_var = true;
			 for (int j=0; j < this.getNumberTerms() ; j++) {
				//System.out.println("j: "+j);
				if (VarArray[j] == polynomial[i].getVariable()) {
					new_var = false;
				}
			 }
			 if (new_var) {
				 realLength++;
				 VarArray[realLength-1] = polynomial[i].getVariable();
				 //System.out.println("if (new_var) i: " + i);
				 //System.out.println("VarArrayUnformatted: " + Arrays.toString(VarArray));
			 }
		 }
		 
		 char[] VarArrayFormatted = new char[realLength];		 
		 for (int k=0; k<realLength; k++) {
			 VarArrayFormatted[k] = VarArray[k];
		 }	 
		 return VarArrayFormatted;
	 }
	 
	 //Exercise 11
	 public Term[] getTerms(char variable, int exponent) {
		 Term[] TermsRequested = new Term[this.getNumberTerms()];
		 int realLength = 0;
		 for (int i=0; i<this.getNumberTerms(); i++) {
			 if (variable == polynomial[i].getVariable() && exponent == polynomial[i].getExponent()) {
				 TermsRequested[realLength] = polynomial[i];
				 realLength++;
			 }
		 }
		 
		 Term[] TermsRequestedFormatted = new Term[realLength];	
		 
		 for (int k=0; k<realLength; k++) {
			 TermsRequestedFormatted[k] = TermsRequested[k];
		 }	 
		 return TermsRequestedFormatted;
	 }
	 
	 //Exercise 12
	 public Term[] getAllTerms() {
		 return polynomial;
	 }
 
 
	 //Exercise 13
	 public String toString() {
		 String p_string = "";
			for (int i=0; i < this.getNumberTerms(); i++) {
				p_string = p_string + polynomial[i].toString();
				if (polynomial[i+1] != null) {
					p_string = p_string + "+";
				}
			}
		return p_string;
	 }
 
 }
 
 