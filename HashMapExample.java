import java.util.HashMap;

public class HashMapExample {
	
	public static void main(String [] args) {
		
		HashMap<String,String> users = new HashMap();
		users.put("John", "Password123");
		users.put("Martha Stewart", "Snoopdog69");
		users.put("Obama", "BestPrez");
		
		System.out.println(users);
		users.remove("Obama");
		System.out.println(users);
		System.out.println(users.containsKey("John"));
		System.out.println(users.containsKey("Obama"));
		users.replace("John", "MuchStrongerPassword02039");
		System.out.println(users);
	}

}
