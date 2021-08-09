package java_programming;
import java.util.*;
import java.io.*; 
public class Demo2{

	public static void main(String[] args) throws Exception  
	{  
	
	Scanner sc = new Scanner(new File("D:\\demo3.csv"));  
	sc.useDelimiter(",");  
	while (sc.hasNext())
	{  
	System.out.print(sc.next()); 
	}   
	sc.close();  
	}  

}
