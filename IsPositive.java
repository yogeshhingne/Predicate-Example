package predicatepack;
import java.util.function.Predicate;
import java.util.Scanner;
public class IsPositive { 
	    public static void main(String[] args) {
	    	Predicate<Integer> p = i -> i>0;
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Sample Input :\t ");
	 int a=sc.nextInt();
	 System.out.println( "Sample Output :\t "+p.test(a));
	 System.out.print("sample Input :\t ");
	 int b=sc.nextInt();
	 System.out.print( "Sample Output :\t "+p.test(b));
	    }
	}

