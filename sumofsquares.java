package myproject;
import java.util.*;
public class sumofsquares {
  public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number");
	    long  n=sc.nextLong();
	    long  sum=0;
	    for(int i=1;i<=n;i++) {
	    	sum=sum+i*i;
	    }
	    System.out.println(sum);
  }
}
