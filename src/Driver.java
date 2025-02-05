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
		
/*
		System.out.println("t0: "+ t0);
		System.out.println("t1: "+ t1);
		System.out.println("t2: "+ t2);
		System.out.println("t3: "+ t3);
		System.out.println("t3 string: " + t3.toString());
*/
		
		
		//Exercise 5
		APolynomial AP = new APolynomial();
		
		ArrayList<Term> inputArray = new ArrayList<Term>();
		inputArray.add(t0);
		inputArray.add(t1);
		inputArray.add(t2);
		
		AP.setPolynomial(inputArray);
		ArrayList<Term> p1 = AP.getPolynomial();
		//String p1_string = p1[1].toString();
		
		System.out.println("p1: " + p1);
		System.out.println("p1 length: " + AP.getNumberTerms());
		
		
		
		//Exercise 6
		AP.addTerm(t3);
		ArrayList<Term> p2 = AP.getPolynomial();
		System.out.println("p2: " + p2);	
		System.out.println("p2 length: " + p2.size());
		System.out.println("p2 length inside AP: " + AP.getNumberTerms());
		
		System.out.println(AP.getNumberTerms());
		
		//Exercise 8
		AP.addTerm(t1);
		
		System.out.println(" "); //debugging 
		AP.removeTerm(t1);
		System.out.println(AP.getPolynomial());
	
	}
	
	

}
