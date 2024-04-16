import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<String> listWords;
    Model model;
    public Controller(String path) throws IOException {
        model = new Model();
        listWords = new ReadFile().readFile(path);
    }

    public int lenList(){
        return model.lenFile(listWords);
    }

    public String bigWord(){
        return model.bigLenWord(listWords);
    }


}
