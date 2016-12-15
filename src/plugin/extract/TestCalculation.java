/**
 * This is a class to calculate the number of annotation @Test in a program.
 * The program is taken from the program name of NumberofExecutedTest.java
 */
package plugin.extract;


import besouro.plugin.ProgrammingSessionTest; //just for testing another java program
import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;


/**
 * @author April
 * 
 */
public class TestCalculation {
	
    double count = 0,countBuffer=0,countLine=0;
    String lineNumber = "";
    String filePath = "C:\\Users\\April\\Documents\\Kuliah EMSE\\Internship Project\\actions.txt";
    BufferedReader br;
    String line = "";
    String namaProgram ;
       
      
	
	public TestCalculation (String pn) {
		namaProgram = pn;
		File file = new File(pn);

	}
	
	public void readNumberofTest() {
		Class<ProgrammingSessionTest> aClass = ProgrammingSessionTest.class;
		
		try {
	        br = new BufferedReader(new FileReader(filePath));
	        try {
	            while((line = br.readLine()) != null)
	            {
	                countLine++;
	                //System.out.println(line);
	                String[] words = line.split(" ");
	                for (String word : words) {
	                    if (word.equals("UnitTestCaseAction")) {
	                      count++;
	                      countBuffer++;
	                    }
	                  }

	                  if(countBuffer > 0)
	                  {
	                      countBuffer = 0;
	                      lineNumber += countLine + ",";
	                  }

	              }
	              br.close();
	          } catch (IOException e) {
	              // TODO Auto-generated catch block
	              e.printStackTrace();
	          }
	      } catch (FileNotFoundException e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();
	      }

	      System.out.println("The number of @test found --"+count+" times in"+namaProgram);
	     // System.out.println("Word found at--"+lineNumber);

	}


	
}
	

