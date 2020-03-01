//Derek lenz
// A hastable program that generates hashtable
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class number {
	private static int getNumber(int min, int max) {//generates number between0-9999999
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
        
	}
	
	
	public static void main(String[] args) {
	  Scanner myObj = new Scanner(System.in);
		Hashtable<Integer, Integer> hash_table =  
			        new Hashtable<Integer,Integer>(); 
	
		int ing, numCheck, nHasVal1 ,nHasVal2, nHasVal3 ,nHasVal4;
	           
		        numCheck=getNumber(0,99999999);
	            hash_table.put(0, numCheck);
			    nHasVal1=getNumber(0,99999999);
			    hash_table.put(1, nHasVal1);
			    nHasVal2=getNumber(0,99999999);
			    hash_table.put(2, nHasVal2);
			    nHasVal3=getNumber(0,99999999);
			    hash_table.put(3, nHasVal3);
			    nHasVal4=getNumber(0,99999999);
			    hash_table.put(4, nHasVal4);
			    
		 System.out.println(hash_table);
		
		}
}
