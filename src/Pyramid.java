import java.util.HashMap;
import java.util.Iterator;

public class Pyramid {
	
	
	public void normalPyramid(int num) {
		
		int i,j;
		
		for ( i = 0; i <=num; i++) {
			
			for ( j = 0; j <=i; j++) {
				
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
	}
	
	
	public void actualPyramid(int num) {
		
		int i,j;
		
		for ( i = 0; i <num; i++) {
			
			for ( j = num-i; j >1; j--) {
				
				System.out.print(" ");
			}
				for ( j = 0; j <=i; j++) {
					
					System.out.print(" *");
				}
				System.out.println();
			}
			
		}
		
		
		
		
		
		
	
	


	public static void main(String[] args) {
		
		Pyramid p=new Pyramid();
		p.normalPyramid(5);
		p.actualPyramid(10);
		

	}

}
