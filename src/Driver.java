//import java.util.Arrays;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {	
		Term t0=null;
		Term t1=null;
		Term t2=null;
		Term t3=null;
		
		try {
			t0 = new Term(3,'x',2);
			t1 = new Term(-2,'y',3);
			t2 = new Term(-2,'y',3);
			t3 = new Term(8,' ', 0);
			
		}
		catch (ExceptionCoefficientZero e) {
		}
		

		System.out.println("t0: "+ t0);
		System.out.println("t1: "+ t1);
		System.out.println("t2: "+ t2);
		System.out.println("t3: "+ t3);
		System.out.println("t3 string: " + t3.toString());

		
		
		//Exercise 5
		APolynomial AP = new APolynomial();
		
		Term[] inputArray = {t0, t1, t2};
		
		AP.setPolynomial(inputArray);
		Term[] p1 = AP.getPolynomial();
		
		//convert to string
		String p1_string = "";
		for (int i=0; i < AP.getNumberTerms(); i++) {
			p1_string = p1_string + p1[i].toString() + ", ";
		}
		System.out.println("p1: " + p1_string);
		System.out.println("p1 length: " + AP.getNumberTerms());
		
		
		
		//Exercise 6
		AP.addTerm(t3);
		Term[] p2 = AP.getPolynomial();
		
		//convert to string
		String p2_string = "";
		for (int i=0; i < AP.getNumberTerms(); i++) {
			p2_string = p2_string + p2[i].toString() + ", ";
		}
		System.out.println("p2: " + p2_string);
		System.out.println("p2 length: " + AP.getNumberTerms());
		
		/*
		//Exercise 8
		AP.addTerm(t1);
		
		System.out.println(" "); //debugging 
		AP.removeTerm(t1);
		System.out.println(AP.getPolynomial());
	
		*/
	}
	
	

}
