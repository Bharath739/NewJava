
public class Mak_StringCaps {

	
	
	
	
	public void make_first_letter_caps(String value) {
		
		String v1=value.substring(0, 1).toUpperCase()+value.substring(1);
		//String v2=v
		
		System.out.println(v1);
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Mak_StringCaps m1=new Mak_StringCaps();
		m1.make_first_letter_caps("bharath");
		
	}
	
	
	
	
}
