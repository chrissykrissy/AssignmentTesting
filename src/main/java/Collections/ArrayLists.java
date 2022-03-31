package Collections;
import java.util.*;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;

        for (int i = 0; i < list1.size(); i++){
            sum += list1.get(i);
        }

        for (int i = 0; i < list2.size(); i++){
            sum += list2.get(i);
        }
        //list1.forEach(e -> sum += e);
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        original.remove(toRemove);
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        if (original.size() <= 1) return true;
        for (int i = 0; i < original.size()-1; i++){
            Set<Character> set = new HashSet<Character>();
            char[] c1 = original.get(i).toCharArray();
            char[] c2 = original.get(i+1).toCharArray();

            for(char c : c1){
                set.add(c);
            }
            int count = 0;
            for(char c : c2){
                if(set.contains(c)){
                    count++;
                }
            }
            if (count == 0) return false;
        }
        return true;
    }
}
