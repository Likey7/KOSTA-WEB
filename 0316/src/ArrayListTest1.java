import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<String> sarr = new ArrayList<>();
		sarr.add("원숭이");
		sarr.add("호랑이");
		sarr.add("기린");
		sarr.add("토끼");
		
		for (int i=0; i<sarr.size(); i++) {
			System.out.println(sarr.get(i));
		}
		for(String ani : sarr) {
			System.out.println(ani);
		}
		
		Iterator<String> it = sarr.iterator();
		while(it.hasNext()) {
			String ani = it.next();
			System.out.println(ani);
		}
	}

}
