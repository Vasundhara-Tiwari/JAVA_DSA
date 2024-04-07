package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] key = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(group(key));
    }
    public static List<List<String>> group(String[] arr){
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            String key = keySet(arr[i]);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(arr[i]);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String k: map.keySet()){
            ans.add(map.get(k));
        }
        return ans;
    }
    public static String keySet(String key){
        int[] frequency = new int[26];
        for(int i = 0; i < key.length(); i++){
            char ch = key.charAt(i);
            frequency[ch-'a']++;
        }
        String str = "";
        for(int i = 0; i < frequency.length; i++){
            str += frequency[i] + " ";
        }
        return str;
    }
}
