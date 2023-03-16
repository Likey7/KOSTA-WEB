class MyClass<E> {
	E[] arr;
	int capacity = 10;
	int incrementsize = 5;
	int cnt;

	@SuppressWarnings("unchecked")
	MyClass() {
		arr = (E[]) (new Object[capacity]);
	}

	@SuppressWarnings("unchecked")
	MyClass(int capacity) {
		this.capacity = capacity;
		arr = (E[]) (new Object[capacity]);
	}

	@SuppressWarnings("unchecked")
	MyClass(int capacity, int incrementsize) {
		this.capacity = capacity;
		this.incrementsize = incrementsize;
		arr = (E[]) (new Object[capacity]);
	}

	@SuppressWarnings("unchecked")
	void add(E data) {
		if (cnt >= capacity) {
			capacity += incrementsize;
			E[] narr = (E[]) (new Object[capacity + incrementsize]);
			System.arraycopy(arr, 0, narr, 0, arr.length);
		}
		arr[cnt++] = data;
	}

	E get(int idx) {
		return arr[idx];
	}
}

public class GenericTest2 {

	public static void main(String[] args) {
		MyClass<Person> pers = new MyClass<>();
		pers.add(new Person("song", 25));
		Person p = pers.get(0);
		System.out.println(p.info());

		MyClass<Integer> narr = new MyClass<>();
		narr.add(10);
		int n = narr.get(0);
		System.out.println(n);
	}

}
