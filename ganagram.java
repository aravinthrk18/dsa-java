import java.util.*;
public class ganagram
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     String[] words = {
                "eat", "tea", "tan", "ate", "nat", "bat"
        };
        
        groupAnagrams(words);
	
	
}
 static void groupAnagrams(String[] words) {
     
     HashMap<String , ArrayList<String>> map = new HashMap<>();
     
     for(int i=0;i<words.length;i++){
         
         char ch[] = words[i].toCharArray();
         Arrays.sort(ch);
         
         String key = new String(ch);
         Arrays.sort(ch);
         
         if(!map.containsKey(key)){
             map.put(key , new ArrayList<>());
         }
         
         map.get(key).add(words[i]);
     }
     
     
     for(ArrayList<String> group : map.values()){
         System.out.print(group);
     }
}
}
