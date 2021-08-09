package java_programming;
import java.util.*;
import java.io.*; 
public class CSV {

	public static void main(String[] args) throws Exception  
	{  
	
	Scanner sc = new Scanner(new File("D:\\demo1.csv"));  
	sc.useDelimiter(",");  
	while (sc.hasNext())
	{  
	System.out.print(sc.next()); 
	}   
	sc.close();  
	}  

}
