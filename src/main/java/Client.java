import javax.swing.*;

public class Client {
    public static void main(String[] args) {
        // get instance of model, view and controller to get started. the responsiblity  is with controller
        Model model = new Model("Enter url list seperated by a new line character", "Write 'null' if no file is needed for input", 1);
        View view = new View("WCE");
        Controller c = new Controller(model, view);
        c.initController();
    }
}
