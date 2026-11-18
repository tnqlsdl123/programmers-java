import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] arr = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        
        for(String str : arr) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        
        Collections.sort(list);
        
        
        return list.toArray(new String[0]);
    }
}