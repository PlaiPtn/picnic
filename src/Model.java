import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Model implements Commands{
    @Override
    public int lenFile(List<String> list) {
        return list.size();
    }

    @Override
    public String bigLenWord(List<String> list) {
        Collections.sort(list);
//        int temp = 0;
//        String word = "";
//        for(var i: list){
//            if (i.length() > temp){
//                temp = i.length();
//                word = i;
//            }
//        }
//        return word;
        return String.valueOf(list);
    }

    @Override
    public Map<String, Integer> frequencyWords() {
        return null;
    }

}
