
public interface Polynomial {
	public boolean addTerm(Term t);
	public int getNumberTerms();
	public boolean removeTerm(Term t);
	public int[] getExponents();
	public char[] getVariables();
	public Term[] getTerms(char variable, int exponent);
	public Term[] getAllTerms();
//	public void setPolynomial(Term[] Polynomial);
	public String toString();
}
