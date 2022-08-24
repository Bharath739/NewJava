import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	@DataProvider
	public Object[][] m1() {
		
		Object[][] ob=new Object[2][2];
		
		ob[0][0]="bharath";
		ob[0][1]="kumar";
		ob[1][0]="sbk";
		ob[1][1]="chennai";
		return ob;
		
		
	}
	@Test(dataProvider = "m1")
	public void data(String s1,String s2) {
		
		System.out.println(s1);
		System.out.println(s2);
	}
	

}
