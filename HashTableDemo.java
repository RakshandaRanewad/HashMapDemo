package HashMap;


import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashTableDemo {
	
	public static void main(String[] args) {
		// TOgenerated method stub
		Hashtable<Integer, String> HM=new Hashtable<>();
		HM.put(1, "Rakshanda");
		HM.put(2, "Pravin");
		HM.put(3, "Saanav");
		HM.put(40, "Kyra");
		HM.put(26, "Ashyra");
		HM.put(36, "Kajol");
		HM.put(20, "Pravin");
		HM.put( 9,"");
		
		
		
		for(Entry<Integer, String> hmm:HM.entrySet())   {
			System.out.println("key is:"+hmm.getKey() +"value is:"+hmm.getValue());
		}
		
		

	}



	}


