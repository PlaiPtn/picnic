import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class View {
    Controller controller;
    Scanner scanner;
    CommMenu menu;

    public View() {

        this.scanner = new Scanner(System.in);
        this.menu = new CommMenu();
    }

    public void run(){
        System.out.println("Переместите файл для работы в каталог 'catalog' и введите имя файла до точки в консоль");
        String name = scanner.nextLine();
        controller = new Controller(name);
        if (!controller.listWords.isEmpty()) {
            while (true){
                System.out.println("-----------------------");
                int numbComm = menu.printMenu();
                if (numbComm == 1){
                    System.out.printf("=> %s\n", controller.lenList());
                } else if (numbComm == 2) {
                    System.out.printf("=> %s\n",controller.bigWord());
                } else if (numbComm == 3) {
                    Map<String, Integer> mapWords = controller.mapWords();
                    for (var i: mapWords.keySet()){
                        System.out.printf("%s = %d \n", i, mapWords.get(i));
                    }
                }
            }
        }
        else {
            System.out.printf("Файл %s пуст, программа закрывается", name);
        }
    }
}
