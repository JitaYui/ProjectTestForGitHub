import javax.print.attribute.standard.Finishings;
import javax.swing.*;

public class Client {
    /* The client class is used for creating a gui order menu.*/
    private void Init() {
        /*initial the gui*/
        //TODO: layout
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("再一次");
        jFrame.getContentPane().add(label);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.Init();
        System.out.println("Hi起來");
    }
}
