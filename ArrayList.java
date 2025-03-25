package Day4;
import java.util.*;
public class ArrayList {
	public static void main(String[] args) {
		List<Integer> arrlist = new LinkedList<>();
		arrlist.add(100);
		arrlist.add(200);
		arrlist.add(300);
		arrlist.add(300);
		System.out.println(arrlist.get(0));
		System.out.println(arrlist.set(0,1000));
		System.out.println(arrlist.get(0));
			for(int i:arrlist) {
				System.out.println(i);
			}
	}
}
				
				
		
			
