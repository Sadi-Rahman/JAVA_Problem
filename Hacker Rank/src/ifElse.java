 
  import java.util.Scanner;
  
  public class ifElse{ 
	  public static void main (String[] args) {
		  System.out.println("Enter Number: "); 
		  Scanner scan = new Scanner (System.in);
		  	int n =scan.nextInt(); 
		  	scan.close();
  
		  	String ans ="  "; 
		  	if(n %2 ==1) { 
		  		ans="Weird"; 
		  		} else{ 
		  			if (n>= 6 && n<=20){
		  				ans="Weird"; 
		  				} 
		  			else{ ans="Not Weird"; 
		  			} 
		  		} 
		  	System.out.println(ans); }
	  
  }
 