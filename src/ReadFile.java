import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    List<String> arr = new ArrayList<>();
    public List<String> readFile(String path) throws IOException {
        try(BufferedReader  fr = new BufferedReader(new FileReader((path)));){
            StringBuilder st = new StringBuilder();
            String st1;
            while ((st1 = fr.readLine()) != null){
                st.append(st1);
            }
            arr = List.of(st.toString().split(" "));
        }
        return arr;
    }
}
