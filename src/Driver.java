import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {	
		
		Term t0=null;
		Term t1=null;
		Term t2=null;
		Term t3=null;
		Term t4=null;
		
		//Exercises 1,2,3
		try {
			t0 = new Term(3,'y',2);
			t1 = new Term(-2,'y',2);
			t2 = new Term(4,'x',1);
			t3 = new Term(8,' ', 0);
			t4 = new Term(7, 'y', 4);
			
		}
		catch (ExceptionCoefficientZero e) {
		}
		
		System.out.println("t0: "+ t0);
		System.out.println("t1: "+ t1);
		System.out.println("t2: "+ t2);
		System.out.println("t3: "+ t3);
		
		//Exercise 4
		System.out.println("t3 string: " + t3.toString());
		
		
		//Exercise 5
		APolynomial AP = new APolynomial();
		
		Term[] inputArray = {t0, t1, t2, t4};
		
		//Exercise 1
		AP.setPolynomial(inputArray);

		System.out.println("poly init: " + AP.toString());
		System.out.println("p length: " + AP.getNumberTerms());
		
		
		//Exercise 6
		AP.addTerm(t3);
		AP.addTerm(t2);

		System.out.println("poly post add x2: " + AP.toString());
		
		//Exercises 6, 7
		System.out.println("p length: " + AP.getNumberTerms());
		
		
		//Exercise 8
		AP.removeTerm(t3);			
		System.out.println("poly post remove: " + AP.toString());
		System.out.println("p length: " + AP.getNumberTerms());
		
		//Exercise 9
		int[] myExpArray = AP.getExponents();
		System.out.println("ExpArray: " + Arrays.toString(myExpArray));
		

		AP.addTerm(t3);
		System.out.println("poly: " + AP.toString());
		char[] myVarArray = AP.getVariables();
		System.out.println("poly: " + AP.toString());
		System.out.println("VarArray: " + Arrays.toString(myVarArray));

		
		//Exercise 11
		Term[] myTermsRequested = AP.getTerms(' ', 0);
		System.out.println("TermsRequested: " + Arrays.toString(myTermsRequested));
		
		//Exercise 14
		System.out.println("----------------------");
		AP.addTerm(t2);
		System.out.println("poly: " + AP.toString());
		
		Mathematics m = new Mathematics();
		m.simplify(AP);
		System.out.println("poly: " + AP.toString());
		
		System.out.println("----------------------");
	}
	
	

}
