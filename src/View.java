import java.io.IOException;

public class View {
    Controller controller;
    public void run() throws IOException {
        String path = "C:\\Users\\AHosoba\\Desktop\\it\\picnic\\src\\catalog\\input.txt";
        controller = new Controller(path);
        System.out.println(controller.bigWord());
    }
}
