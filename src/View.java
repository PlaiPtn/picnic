import java.io.IOException;

public class View {
    Controller controller;
    public void run(){
        String name = "input";
        controller = new Controller(name);
        System.out.println(controller.lenList());
        System.out.println(controller.bigWord());
        System.out.println(controller.mapWords());
    }
}
