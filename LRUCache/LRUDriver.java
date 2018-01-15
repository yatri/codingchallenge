
public class LRUDriver {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(4);
		cache.setValue(1, 2);
		cache.setValue(2, 3);
		cache.setValue(3, 4);
		cache.setValue(4, 5);
		cache.setValue(5, 6);
		cache.setValue(6, 7);
		System.out.println(cache.getValue(3));

	}

}
