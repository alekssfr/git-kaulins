package git1;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	static void gayMethod(){
		System.out.println("GAYYYYY");
	}
	
	static void straigthMethod() {
		System.out.println("STRAIGGHTTTT");
	}

static int mestKaulinu(int reizes) {
		int sk;
		Random rand = new Random();
		int max = 0;
		
		for(int i=0; i<reizes; i++) {
		sk = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+sk);
		if(sk > max)
			max = sk;
		}
		return max;
}
	
	public static void main(String[] args) {
		int reizes;	
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		System.out.println("Lielákais: "+mestKaulinu(reizes));
		
		scan.close();
		
		gayMethod();
		straigthMethod();
}
}
