import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test_Tcs {

	public static void main(String[] args) {
		
		
		String string = "big black bug bit a big black dog on his big black nose";
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		String[] s=string.split(" ");
		
		for (String s2 : s) {
			
			if (map.containsKey(s2)) {
				
				map.put(s2, map.get(s2)+1);
				
			} else {
				
				map.put(s2, 0);

			}
			
		}
		
		System.out.println(map);

	}

}
