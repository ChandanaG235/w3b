package p7;
import java.util.Scanner;
public class Calculateaverage 
{
	 public static void main(String[] args) 
	 {
		    float sum =0.0f;
		    Scanner sc = new Scanner (System.in);
		    
		    /*This line declares array Integer Wrapper Object */ 
		    Integer cie[] = new Integer [3];
		    
		    for (int i=0; i< 3; i++) 
		    {
		      System.out.println("Enter the score of Internal : "+(i+1));
		      cie[i] = Integer.parseInt(sc.next());
		      sum=sum + cie[i];
		    }
		      System.out.println("The average Internal Score is "+(sum/3));
		      sc.close();
	}

}
