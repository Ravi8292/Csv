package java_programming;
import java.util.*;
import java.io.*; 
public class Csv3 {

	public static void main(String[] args) throws Exception  
	{  
	
	Scanner sc = new Scanner(new File("D:\\demo2.csv"));  
	sc.useDelimiter(",");  
	while (sc.hasNext())
	{  
	System.out.print(sc.next()); 
	}   
	sc.close();  
	}  

}
