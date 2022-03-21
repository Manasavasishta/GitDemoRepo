import java.util.Scanner;
import java.util.*;


public class StdInpOut {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int a= scan.nextInt();
        Double d = scan.nextDouble();
        int b =scan.nextInt();
        String m = scan.nextLine();
        
        scan.close();
        
        System.out.println(s);
        System.out.println(a);
      
        System.out.println(d);
        System.out.println(b);
        System.out.println(m);

}
}