public class Term {

	private double coefficient;
	private char variable;
	private int exponent;
	
	//Exercises 1,3
    public Term(double coefficient, char variable, int exponent) throws ExceptionCoefficientZero{
    	if (coefficient == 0) {
    		throw new ExceptionCoefficientZero("The terms of the coefficient zero are not valid");
    	}
    	this.coefficient = coefficient;
    	this.variable = variable;
    	this.exponent = exponent;
    }
    
    public double getCoefficient() {
    	return coefficient;
    }
    
    public char getVariable() {
    	return variable;
    }
    
    public int getExponent() {
    	return exponent;
    }
 
    //Exercise 4
    public String toString() {
    	String s_coeff = "";
    	String s_var = "";
    	String exp = "";
    	String s_exp = "";
    	    	
    	if (coefficient != 0) {
    		s_coeff = Double.toString(coefficient);
    	}
    	if (variable != ' ') {
    		s_var = variable+"";
    	}
    	if (exponent > 0) {
    		exp = "^";
    	}
    	if (exponent != 0) {
    		s_exp = exponent+"";
    	}

    	String str = s_coeff + s_var + exp + s_exp;
    	//Integer.toString(exponent); //another option
    	return str;
    }
    
}