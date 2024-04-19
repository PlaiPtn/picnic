import java.io.IOException;

public class View {
    Controller controller;
    public void run(){
        String path = "C:\\Users\\AHosoba\\Desktop\\it\\picnic\\src\\catalog\\input.txt";
        controller = new Controller(path);
        System.out.println(controller.lenList());
        System.out.println(controller.bigWord());
        System.out.println(controller.mapWords());
    }
}
