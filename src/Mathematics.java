
public class Mathematics {
	
	private Polynomial polynomial;
	private Term[] polynomialArray;
		
	public Polynomial simplify(Polynomial polynomial) {
		this.polynomial = polynomial;
		polynomialArray = polynomial.getAllTerms();
		
		
	}
}
