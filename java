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
