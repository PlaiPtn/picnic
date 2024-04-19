import java.io.*;
import java.util.*;

public class ReadFile {
    List<String> arr;


    public List<String> searchFile(String nameFile){
        File folder = new File("src/catalog");
        File[] listFile = folder.listFiles();
        for(var i: listFile){
            if (Objects.equals(nameFile, i.getName().substring(0, i.getName().length() - 4))) {
                return readFile(i.toString());
            }
        }
        return null;
    }
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
