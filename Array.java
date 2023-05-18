package utility;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	try {
	System.out.println("Enter array Size"); 
	int num=scan.nextInt();
	
	int a[]=new int [num];
	System.out.println("enter array elements");
	
	for(int i=0;i<a.length;i++)
	{
	 a[i]=scan.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
     
	 System.out.print(+a[i]+" ");
	
	}
	System.out.println();
	System.out.println("Enter position");
	  int n1=scan.nextInt();
	  System.out.println(a[n1]);
	  
	  
	}
	
	
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	System.out.println("End");
	
	
	
	


	}

}
