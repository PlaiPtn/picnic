import java.util.*;

public class Model implements Commands{
    @Override
    public int lenFile(List<String> list) {
        return list.size();
    }

    @Override
    public String bigLenWord(List<String> list) {
        list.sort((a, b) -> Integer.compare(a.length(), b.length()));
        return list.get(list.size() - 1);
    }

    @Override
    public Map<String, Integer> frequencyWords(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (var i: list){

            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
        }
        return map;
    }

}
