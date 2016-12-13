/**
 * Jumlah tes yang telah dieksekusi
 */
package plugin.extract;

import java.io.File;
import java.util.Scanner;


/**
 * @author April
 *
 */
public class NumberofExecutedTest {
	
	public Scanner x;
	public String[] actiontype;
	public int i;
	public int numberoftest = 0;
	public int numberoffailedtest =0;
	public int numberofsuccessfultest = 0;
	int nt;
	
	public void openFile() {
		try {
			x = new Scanner(new File ("C:\\Users\\April\\Documents\\Kuliah EMSE\\Internship Project\\actions.txt"));
		}
		catch (Exception e) {
			System.out.println ("The file doesn't exist");
		}
	}
	
	public void readFile () {
		// an iteration to read the file
		while (x.hasNext()) {
			String column1 = x.next();  // The first column of actions.txt
			
			
			actiontype = column1.split(" ");
			
			if(actiontype[i].equals("CompilationAction") ) { 
				String timestampcompilation = x.next();
				String program = x.next();	
			}
			
			if (actiontype[i].equals("UnitTestCaseAction")) {
				String testtimestamp = x.next();
				String programname = x.next();
				String testresult = x.next();
				
				System.out.println(programname);
				numberoftest = numberoftest + 1;
				if (testresult.equals("OK")) {
					numberofsuccessfultest = numberofsuccessfultest +1 ;
				}
					else {
						numberoffailedtest =numberoffailedtest +1 ;
				}
				System.out.println("The number of executed test is "+numberoftest);
				System.out.println("The number of successful test is "+numberofsuccessfultest);
				System.out.println("The number of failed test is "+numberoffailedtest);

			}
			
			if (actiontype[i].equals("UnitTestSessionAction")) {
				String timestamp = x.next();
				String program = x.next();
				String result = x.next();
				
			}
			
			else {
				String column2 = x.next();
				String column3 = x.next();
				String column4 = x.next();
				String column5 = x.next();	
				String column6 = x.next();
				String column7 = x.next();
			}
			
		}
		
	}
	

	
	public void closeFile(){
		x.close();
	}

	

}
