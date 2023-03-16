class MyArray {
	Object[] arr;
	int capacity = 10;
	int incrementsize = 5;
	int cnt;

	MyArray() {
		arr = new Object[capacity];
	}

	MyArray(int capacity) {
		this.capacity = capacity;
		arr = new Object[capacity];
	}

	MyArray(int capacity, int incrementsize) {
		this.capacity = capacity;
		this.incrementsize = incrementsize;
		arr = new Object[capacity];
	}
	void add(Object data) {
		if(capacity>=cnt) {

			capacity += incrementsize;
			Object[] narr = new Object[capacity+incrementsize];
			System.arraycopy(arr, 0, narr, 0, arr.length);
			arr=narr;
		}
		arr[cnt++] = data;
	}

	Object get(int idx) {
		return arr[idx];
	}
}

public class GenericTest1 {

	public static void main(String[] args) {
		MyArray marr = new MyArray();
		marr.add(new Person("hong",10));
		
		Person p = (Person)marr.get(0);
		System.out.println(p.info());
	}

}
