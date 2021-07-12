import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.Font;

import java.awt.Image;

public class LabelJF extends JLabel {

    public LabelJF(){

        this.setText("hi, I'm trying to learn how to use java swing");

    }

    public LabelJF(String filePath){

        ImageIcon icono = new ImageIcon(filePath);
        Icon iconoAUsar = new ImageIcon(icono.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
        
        this.setIcon(iconoAUsar);
    }

    public LabelJF(String filePath, String texto){

        ImageIcon icono = new ImageIcon(filePath);

        //redimensionar imagen
        Icon imagenRedimensionada = new ImageIcon(icono.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));

        this.setBounds(50, 50, 400, 400);

        //acomodación del combo imagen y texto en un mismo label
        this.setHorizontalTextPosition(LabelJF.CENTER);
        this.setVerticalTextPosition(LabelJF.TOP);

        //espacio entre el texto y la imagen
        this.setIconTextGap(15);

        //crear fuente del texto
        this.setForeground(new Color(18,104,237));
        Font fuente = new Font("MV Boli", Font.PLAIN,20);
        this.setFont(fuente);

        //alineación respecto al frame
        this.setHorizontalAlignment(LabelJF.CENTER);
        this.setVerticalAlignment(LabelJF.CENTER);

        //poner fondo (para que se vea el fondo se debe poner opaco en true)
        this.setBackground(Color.WHITE);
        this.setOpaque(true);

        //ponerle bordes al label
        Border borde = BorderFactory.createLineBorder(Color.BLUE, 5);
        this.setBorder(borde);

        this.setIcon(imagenRedimensionada);
        this.setText(texto);
    }
}
