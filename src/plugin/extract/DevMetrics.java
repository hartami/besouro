/**
 * 
 */
package plugin.extract;

/**
 * @author April
 *
 */
public class DevMetrics {
	double codecoverage;
	long lineofcode;
	int numberoftest;
	int numberoffailedtest;
	int numberofsuccessfultest;
	/**
	 * This is the constructor
	 */
	public DevMetrics(double cc, long loc, int nt, int ift, int ist) {
		// TODO Auto-generated constructor stub
		codecoverage = cc;
		lineofcode = loc;
		numberoftest = nt;
		numberoffailedtest = ift;
		numberofsuccessfultest = ist;
	}

	public static void main(String[] args) {
		
		FileAccess a = new FileAccess();
		a.openFile ();
		a.readFile ();
		a.closeFile ();
		
		
	}
}
