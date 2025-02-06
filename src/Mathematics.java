import java.util.HashMap; 

public class Mathematics {
	
	private Polynomial polynomial;
	private Polynomial polynomialSimplified;
	private Term[] polynomialArray;
	
	//Exercise 14 - has bugs
	public Polynomial simplify(Polynomial polynomial) {
		this.polynomial = polynomial;
		polynomialArray = polynomial.getAllTerms();
		
		String varExpKey = "";

		HashMap<String, Double> simplifyTable = new HashMap<String, Double>();

		//fill HashMap simplifyTable
		for (int i=0; i< polynomial.getNumberTerms(); i++){
			char var = polynomialArray[i].getVariable();
			int exp = polynomialArray[i].getExponent();

			varExpKey = var + Integer.toString(exp);
			/*
			System.out.println("simplifyTable i: "+ i);
			System.out.println("var: " + var);
			System.out.println("exp: " + exp);
			System.out.println("varExpKey: " + varExpKey);
			*/
			
			double coeff = polynomialArray[i].getCoefficient();
			
			if (simplifyTable.containsKey(varExpKey)){
				coeff = coeff + simplifyTable.get(varExpKey);
				simplifyTable.put(varExpKey, coeff);
			}
			else {simplifyTable.put(varExpKey, coeff);}

		}

		
		//Create new simplified polynomial Array
		int simplifiedSize = simplifyTable.size();
		Term[] simplifiedPoly = new Term[simplifiedSize];

		int i=0;
		for (String j : simplifyTable.keySet()){
			//System.out.println("i: " + i);
			//System.out.println("key: " + j);
			//System.out.println("value: "+ simplifyTable.get(j));
			double coeff = simplifyTable.get(j);
			char var = j.charAt(0);
			String s_exp = j.substring(1);
			//System.out.println("s_exp" + s_exp);
			int exp;
			if (s_exp != "") {
			//	System.out.println("I'm in if s_exp");
				exp = Integer.valueOf(s_exp);
			}
			else exp = 0;
			//System.out.println("coeff: "+ coeff +", var: "+ var +",exp: " + exp);
		
			Term simpTerm = null;
			try {
				simpTerm = new Term(coeff, var, exp);
			}
			catch (ExceptionCoefficientZero e) {
			}
			//System.out.println("simpTerm: " + simpTerm);
			
			simplifiedPoly[i]= simpTerm;
			i++;
		}
		
		//put polynomial Array into polynomialSimplified for output
		
		Term[] unsimplifiedTerms = polynomial.getAllTerms();
		
		int lengthUnsimplified = polynomial.getNumberTerms();
		//System.out.println("unsimplifiedTerms[]: " + unsimplifiedTerms.toString() +",lengthUnsimplified: " + lengthUnsimplified);
		
		for (int m=0; m<lengthUnsimplified; m++) {
			/*System.out.println("poly: " + polynomial.toString());
			System.out.println("m: "+m);
			System.out.println("lengthUnsimplified: " + lengthUnsimplified);
			System.out.println("unsimplifiedTerms[m]: "+ unsimplifiedTerms[m]);
			*/
			polynomial.removeTerm(unsimplifiedTerms[0]);
			//System.out.println("poly: " + polynomial.toString());
		}
		
		for (int k=0; k<simplifiedPoly.length; k++) {
			polynomial.addTerm(simplifiedPoly[k]);
		}
		
		return polynomial;
	}
	
	//Exercise 15
	public Polynomial sumPolynomials(Polynomial polynomial1, Polynomial polynomial2) {
		return polynomial; //placeholder for code
	}
	
}
