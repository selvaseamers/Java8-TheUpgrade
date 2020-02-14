package ex.hashmap;

public class CHashMapMain {

	public static void main(String[] args) {

		CMap<String, String> map = new CHashMap<String, String>(5, 53);

		map.put("bala", "spiderman");
		map.put("venkat", "superman");
		map.put("sangeetha", "wonderwomen");
		map.put("pankaj", "hawckeye");
		map.put(null, "ironman");
		
		System.out.println(map.get("bala"));
		System.out.println(map.get("venkat"));
		
		map.remove("venkat");
		
		System.out.println(map.get("bala"));
		System.out.println(map.get("venkat"));
		System.out.println(map.get("sangeetha"));
		System.out.println(map.get("pankaj"));
		System.out.println(map.get(null));

		map.remove(null);
		
		System.out.println(map.get(null));

	}

}
