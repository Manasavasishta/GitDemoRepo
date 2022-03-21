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
        int bp=scan.nextInt();
        int h=scan.nextInt();
        scan.close();
        
        System.out.println(s);
        System.out.println(a);
      
        System.out.println(d);
        System.out.println(b);
        System.out.println(m);
        System.out.println(bp);
        System.out.println(h);

}
}