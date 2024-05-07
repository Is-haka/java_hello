import java.awt.*;

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //JOption Input dialog added
        String input = JOptionPane.showInputDialog("Input your message");
        //JOption message dialog added
        JOptionPane.showMessageDialog(null, input);
        JOptionPane.showMessageDialog(null, "Welcome");
        /*
         * End 
        */
    }
}