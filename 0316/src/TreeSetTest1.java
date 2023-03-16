import java.util.TreeSet;

public class TreeSetTest1 {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(100);
		tset.add(55);
		tset.add(77);
		
		System.out.println(tset);
		
		TreeSet<String> sset = new TreeSet<>();
		sset.add("hong");
		sset.add("kim");
		sset.add("park");
		
		System.out.println(sset);
		
		TreeSet<Person> pset = new TreeSet<>();
		pset.add(new Person("hong",20));
		pset.add(new Person("song",15));
		pset.add(new Person("oarj",17));
		
		System.out.println(pset);
		
		TreeSet<Complex> cset = new TreeSet<>(new ComplexCompare());
		cset.add(new Complex(3,5));
		cset.add(new Complex(4,7));
		cset.add(new Complex(2,3));
		
		System.out.println(cset);
	}
}