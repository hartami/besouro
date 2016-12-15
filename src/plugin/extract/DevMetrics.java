/**
 * Class DevMetrics contains some variables; code coverage, lines of code, number of tests, number of failed tests, and number of successful tests. 
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
		cc = 0.00;
		loc = 0;
		nt = 0;
		ift = 0;
		ist = 0;
		codecoverage = cc;
		lineofcode = loc;
		numberoftest = nt;
		numberoffailedtest = ift;
		numberofsuccessfultest = ist;
	}

	public static void main(String[] args) {
		NumberofExecutedTest a = new NumberofExecutedTest();
		a.openFile ();
		a.readFile ();
		a.closeFile ();	
	}
}
