/**
 * 
 */
package plugin.extract;
import java.io.*;
import java.util.*;


/**
 * @author April
 *
 */
public class FileAccess {
	public Scanner x;
	public String[] timestamp;
	public String[] timestampnew;
	public void openFile() {
		try {
			x = new Scanner(new File ("C:\\Users\\April\\Documents\\Kuliah EMSE\\Internship Project\\besouroEpisodes.txt"));
		}
		catch (Exception e) {
			System.out.println ("The file doesn't exist");
		}
	}
	
	public void readFile () {
		// an iteration to read the file
		while (x.hasNext()) {
			String column1 = x.next();  // The first column of besouroepisode.txt
			int i=0;
			timestamp = column1.split("(?<=\\G.{10})");
			System.out.println(timestamp[i]);
			Set<String> orderedUniqueTimestamp = new LinkedHashSet<String>(Arrays.asList(timestamp));
			System.out.println(orderedUniqueTimestamp);
		
			i++;
				
			
			String column2 = x.next();
			String column3 = x.next();
			String column4 = x.next();
			String column5 = x.next();	
			
		}
		
	}
	
	public String[] getTimestamp(){
		return timestamp;
	}
	
	public void setTimestamp(String[] timestamp){
		this.timestamp = timestamp;
	}
	
	public void closeFile(){
		x.close();
	}


}
