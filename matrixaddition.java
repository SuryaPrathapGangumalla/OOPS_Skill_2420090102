package myproject;
import java.util.*;
public class matrixaddition {
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("enter the number of rows");
        	int rows=sc.nextInt();
        	System.out.println("enter the number of columns");
        	int columns=sc.nextInt();
        	int[][] matrixA=new int[rows][columns];
        	int[][] matrixB=new int[rows][columns];
        	int[][] sumoftwomatrices=new int[rows][columns];
        	System.out.println("enter the elements of first matrix");
        	for(int i=0;i<rows;i++)
        	{
        	 for(int j=0;j<columns;j++)
        	 {
        		matrixA[i][j]=sc.nextInt();
        	 }
        	}
        	System.out.println("enter the elements of second matrix");
        	for(int i=0;i<rows;i++)
        	{
        	 for(int j=0;j<columns;j++)
        	 {
        	  matrixB[i][j]=sc.nextInt();
        	 }
        	}
        	for(int i=0;i<rows;i++)
        	{
        	 for(int j=0;j<columns;j++)
        	 {
        	  sumoftwomatrices[i][j]=matrixA[i][j]+matrixB[i][j];
        	 }
        	}
        	System.out.println("sum of two matrices");
        	for(int i=0;i<rows;i++)
        	{
        	 for(int j=0;j<columns;j++)
        	 {
        	  System.out.print(sumoftwomatrices[i][j]+"\t");
        	 }
        	 System.out.println();
        
        	}
        }
}
