//Finding whether the given number is even or odd:
import java.util.*;

import java.util.Scanner;
class Main{
    public static void main(String []args){
        int n;
        System.out.println("Enter any number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if((n|1)>n){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        
    }
}

//Finding the largest number among three numbers
import java.util.Scanner;
class Main{
    static int biggestofthree(int x,int y,int z){
        if(x>y && x>z)
            return x;
        else if(y>x && y>z)
        return y;
        else
        return z;
    }
    public static void main(String []args){
        int x,y,z,largest;
       System.out.println("Enter any three numbers:");
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        largest=biggestofthree(x,y,z);
        System.out.println(largest+"is the largest");
    }
}


//Factorial://
import java.util.Scanner; 
public class Main
{
	static int factorial(int n) {
	    int res,i; 
	    res=1;
	    for(i=2;i<=n;i++){
	        res=res*i;
	    }
	    return res; 
	}
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter any number:");
	     int num=s.nextInt();
	    
	      int result = factorial(num);
        System.out.println("Factorial of given number is " + result);
	}
}

//Fibonacci:
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int firstnum=0,secondnum=1,i,n,sum;
		System.out.println("Enter any  number:");
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
		for(i=1;i<=n;i++){
		    System.out.print(firstnum+",");
		    sum = firstnum + secondnum;
		    firstnum=secondnum;
		    secondnum=sum;
		}
	}
}

