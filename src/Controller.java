import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Controller {
//    List<String> listWords;
    List<String> listWords;
    Model model;
    public Controller(String path){
        model = new Model();
        listWords = new ReadFile().readFile(path);
    }

    public int lenList(){
        return model.lenFile(listWords);
    }

    public String bigWord(){
        return model.bigLenWord(listWords);
    }

    public Map<String, Integer> mapWords(){
        return model.frequencyWords(listWords);
    }


}
