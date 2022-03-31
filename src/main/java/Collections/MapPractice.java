package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        List<Object> list = new ArrayList<Object>();
        
        for (Object o : map.keySet()){
            if(map.get(o).equals(value)) list.add(o);
        }

        Object[] ret = list.toArray();

        return ret;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        if (size <= 0) return map;
        else if (size == 1){
            map.put(1,1);
            return map;
        }else{
            map.put(1,1);
            map.put(2,1);
            for(int i = 3; i <= size; i++){
                int c = map.get(i-2);
                c += map.get(i-1);
                map.put(i, c);
            }
            return map;
        }
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        if (size <= 0) return map;
        else if (size == 1){
            map.put(1,first);
            return map;
        }else{
            map.put(1,first);
            map.put(2,second);
            for(int i = 3; i <= size; i++){
                int c = map.get(i-2);
                c += map.get(i-1);
                map.put(i, c);
            }
            return map;
        }
    }
}
