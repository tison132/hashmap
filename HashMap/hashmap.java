import java.util.*;
import java.lang.*;
class hashmap{
    public static void main(String[] args) {
        String s="kaviina";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            System.out.println(m.getKey()+"->"+m.getValue());
        }
        //To sort the hashmap
        System.out.println("After sorting the key :");
        TreeMap<Character,Integer> sorted = new TreeMap<>();
        sorted.putAll(map);
        for(Map.Entry<Character,Integer> e : sorted.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }
        //to sort the hashmap
        List<Map.Entry<Character,Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>() {
            public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2){
                return(o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<Character,Integer> ans = new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> val : list){
            ans.put(val.getKey(), val.getValue());
        }
        System.out.println("After sorting the value : ");
        for(Map.Entry<Character,Integer> m : ans.entrySet()){
            System.out.println(m.getKey()+"->"+m.getValue());
        }
    }
}