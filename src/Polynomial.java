
public interface Polynomial {
	public boolean addTerm(Term t);
	public int getNumberTerms();
	public boolean removeTerm(Term t);
	public int[] getExponents();
	public char[] getVariablesl();
	public Term[] getTerms(char variable, int exponent);
	public Term[] getAllTerms();
}
