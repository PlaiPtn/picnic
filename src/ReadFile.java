import java.io.*;
import java.util.*;

public class ReadFile {
    List<String> arr;


    public String searchFile(String nameFile){
        File folder = new File("src/catalog");
        File[] listFile = folder.listFiles();
        for(var i: listFile){
            if (Objects.equals(nameFile, i.getName().substring(0, i.getName().length() - 4))) {
                return i.toString();
            }
        }
        System.out.printf("Файла с именем '%s' нет в каталоге, программа закрывается", nameFile);
        System.exit(0);
        return null;
    }
    public List<String> readFile(String nameFile){
        String path = searchFile(nameFile);
        try (BufferedReader fr = new BufferedReader(new FileReader((path)))){
            StringBuilder st = new StringBuilder();
            String st1;
            while ((st1 = fr.readLine()) != null) {
                st.append(st1);
                st.append(" ");
            }
            arr = new ArrayList<>(Arrays.asList(st.toString().split(" ")));
            arr.removeAll(Arrays.asList("", null));
            return arr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
