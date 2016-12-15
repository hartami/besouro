package plugin.extract;

import java.lang.reflect.Method;
import besouro.plugin.ProgrammingSessionTest;
import junit.framework.Test;
import java.util.Arrays;
import java.lang.annotation.Annotation;



/*
 * NumberofTest dihitung berdasarkan jumlah @Test dalam program java
 */


public class NumberofTest {
	
	public static void main(String[] args) {
		
		int nt=0; // number of test
	
		
		
		Class<ProgrammingSessionTest> aClass = ProgrammingSessionTest.class;
		
		
		/*
		Annotation[] annotations = aClass.getAnnotations();
		System.out.println(Arrays.toString(annotations));
		System.out.println(annotations.length);
		System.out.println(aClass.getName());
		System.out.println(aClass.toString());
		System.out.println(aClass.getClass().isAnnotationPresent(org.junit.Test.class));

		
		if (aClass.getClass().isAnnotationPresent(org.junit.Test.class))
		{
		    // process the annotation, "annotations" being the instance of the object we are inspecting
		 nt=1;
		 System.out.println ("The number of test is "+nt);
		 }
		
		*/
	}
	
}

