import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class VentanaJF extends JFrame {

    public VentanaJF(){

        this.setTitle("MI VENTANA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(550,550);
        this.getContentPane().setBackground(new Color(129,247,238));

        ImageIcon logo = new ImageIcon("img/logo1.jpg");
        this.setIconImage(logo.getImage());

    }


}