package Day2Programs;
import java.util.*;
public class StringOperations {
	public static void main (String[] args) {
		//Substring

		/* String str="Java Programming";

		System.out.println(str.substring(3));

		System.out.println(str.substring(0,4));*/

		

	//indexOf

		/*String str="Java Programming";

		System.out.println(str.indexOf("Prog"));

		System.out.println(str.indexOf("x"));*/

		

	//UpperCase&LowerCase

		/*String str="Java Programming";

		System.out.println(str.toUpperCase());

		System.out.println(str.toLowerCase());*/

		

	//Replace

		/*String str="Java Programming";

		System.out.println(str.replace('a','A'));*/

		

//Equals
		/*String str="JAVA";
		String str1="java";
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));*/

//charAt
		/*String str="JAVA";
		System.out.println(str.charAt(2));*/

//Split

		/*String str="java,python,springBoot";
		String []language = str.split(",");
		for(String s1:language) {
		System.out.println(s1);*/

//trim
		/*String str =" Java ";
		System.out.println(str.length());
		String str1 = str.trim();
		System.out.println(str1);
		System.out.println(str1.length());
		*/
		
//compareTo	
		/*String str ="java";
		String str1 ="Python";
		System.out.println(str.compareTo(str1));
		
		String str ="java";
		String str1 ="java";
		System.out.println(str.compareTo(str1));
		*/
		
//contains
		/*String str = "Java Programming";
		System.out.println(str.contains("Java"));
		System.out.println(str.contains("Python"));
		*/
		
//String intern
		/*String s1 = new String("JavaDeveloper");
	    String s2 = "JavaDeveloper";                        	
	    String s3 = s1.intern();
		System.out.println(s1==s2);		
		System.out.println(s2==s3);
		*/
		
//String Builder
		/*StringBuilder sb = new StringBuilder("Hello");
		sb. append("World");
		System.out.println("After append:" + sb);
		sb.insert(5,",");
		System.out.println("After insert: "+ sb);
		*/
		
		
		
		
		
		
		
		
	}

}
