import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommMenu {
    Scanner scanner;

    public CommMenu() {
        this.scanner = new Scanner(System.in);

    }

    public Map<String, String> createDictMenu(){
        Map<String, String> dictMenu = new HashMap<>();
        dictMenu.put("1", "1. Количество слов в файле");
        dictMenu.put("2", "2. Вывести самое длинное слово");
        dictMenu.put("3", "3. Вывести частоту слов");
        return dictMenu;
    }

    public int printMenu(){
        System.out.println("Введите номер интересующей операции или 'q' для выхода из программы");
        Map<String, String> commands = createDictMenu();
        for(var command: commands.values()){
            System.out.println(command);
        }
        String comm = scanner.nextLine();
        if (comm.equalsIgnoreCase("q")){
            System.out.println("До скорых встреч");
            System.exit(0);
        }
        if (!commands.containsKey(comm)){
            System.out.println("Такой операции нет, программа закрывается");
            System.exit(0);
        }
        return Integer.parseInt(comm);
    }
}
