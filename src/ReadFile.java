import java.io.*;
import java.util.*;

public class ReadFile {
    List<String> arr;
    public List<String> readFile(String path){
        try(BufferedReader  fr = new BufferedReader(new FileReader((path)));){
            StringBuilder st = new StringBuilder();
            String st1;
            while ((st1 = fr.readLine()) != null){
                st.append(st1);
            }
            arr = new ArrayList<>(Arrays.asList(st.toString().split(" ")));
            arr.removeAll(Arrays.asList("", null));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return arr;
    }
}
