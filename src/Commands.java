import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface Commands {
    int lenFile(List<String> list);
    String bigLenWord(List<String> list);

    Map<String, Integer> frequencyWords();
}
