package myproject;
import java.util.*;
public class sumofdigits {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   long n=sc.nextLong();
	   long  sum=0;
	   while(n>0) {
		  sum=sum+n%10;
		  n=n/10;
	   } 
	   System.out.println(sum);
   }
}
