import java.util.ArrayList;
import java.util.Iterator;

public class ForEachLoop {

	public static void main(String[] args) {
		/*String[] cars = {"BMW","GTI","New Car"};		
		for (String car: cars  ) {
			System.out.println(car);
		}*/
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(7);
		numbers.add(2);
		/*for (int a: numbers) {
			System.out.println(a);//prints 3   7   2 in diff lines
		}*/
		Iterator<Integer> it=numbers.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
