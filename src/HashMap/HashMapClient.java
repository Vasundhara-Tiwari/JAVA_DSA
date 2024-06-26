package HashMap;

public class HashMapClient {
    public static void main(String[] args) {
        HashMapImplementation<String, Integer> map = new HashMapImplementation<>();
        map.put("Raj", 87);
        map.put("Ankit", 98);
        map.put("Ankita", 77);
        map.put("Puneet", 58);
        map.put("Rajesh", 89);
        map.put("Pooja", 89);
        map.put("Kaju", 78);
        map.put("Kamlesh", 89);
        map.put("Kunal", 22);
        map.put("Ankita", 67);
        System.out.println(map.get("Ankita"));
        System.out.println(map.remove("Raj"));
        System.out.println(map.get("Raj"));
        System.out.println(map.toString());
    }
}
