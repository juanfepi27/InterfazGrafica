import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Main{

    public static void reporte(String mensaje) {

        System.out.println("reporte: "+mensaje);
        
    }

    public static void ventanaConLabel() {

        VentanaJF ventana1 = new VentanaJF();
        reporte("sale el frame");

        /*
            LabelJF texto1 = new LabelJF();
            reporte("creamos el label con texto");

            ventana1.add(texto1);
            reporte("se agrega el label al frame");

            LabelJF imagen = new LabelJF("img/logo1.jpg");
            reporte("creamos el label con imagen");

            ventana1.add(imagen);
            reporte("se agrega el label al frame");
        */

        LabelJF imagenYtexto = new LabelJF("img/logo1.jpg","combo de imagen y texto");
        reporte("creamos el label con imagen y texto");

        ventana1.add(imagenYtexto);
        reporte("se agrega el label al frame");

        ventana1.setLayout(null);//elimina la organizacion por default que se le dan a los elmentos en el frame y evita el autofit de los elementos como el label

        ventana1.setVisible(true);

       // ventana1.pack();//acomoda la ventana al tamaño de los componentes
        
    }

    public static void main(String[] args) {

        //-------------Ventana------------------------//
        
        VentanaJF ventana1 = new VentanaJF();

        ventana1.setLayout(new BorderLayout(2,2));
        ventana1.setResizable(true);
        ventana1.getContentPane().setBackground(Color.black);

        //-------------Paneles------------------------//

        JPanel panelSur = new JPanel();
        JPanel panelNorte = new JPanel();
        JPanel panelIzquierda = new JPanel();
        JPanel panelDerecha = new JPanel();
        JPanel panelCentral = new JPanel();

        //-------------Panel del sur------------------------//

        panelSur.setPreferredSize(new Dimension(100,50));
        panelSur.setBackground(Color.black);

        //-------------Panel del norte------------------------//

        panelNorte.setPreferredSize(new Dimension(500,50));
        panelNorte.setBackground(Color.black);
        panelNorte.setLayout(new BorderLayout(10,10));

        JPanel panelNorteIzquierda = new JPanel();
        panelNorteIzquierda.setPreferredSize(new Dimension(25,50));
        panelNorteIzquierda.setBackground(Color.black);
        panelNorteIzquierda.setLayout(new BorderLayout());

        JPanel panelNorteCentro = new JPanel();
        panelNorteCentro.setPreferredSize(new Dimension(100,50));
        panelNorteCentro.setBackground(Color.black);
        panelNorteCentro.setLayout(new BorderLayout());

        LabelJF titulo = new LabelJF();
        titulo.setText("Mi ventana");
        titulo.setFont(new Font("MV Boli", Font.BOLD,40));
        titulo.setForeground(new Color(14, 166, 232 ));
        titulo.setVerticalAlignment(LabelJF.CENTER);
        titulo.setHorizontalAlignment(LabelJF.CENTER);

        BotonAparecerDesaparecer botonMenu = new BotonAparecerDesaparecer(panelIzquierda);
        botonMenu.setHorizontalAlignment(BotonAparecerDesaparecer.CENTER);
        botonMenu.setVerticalAlignment(BotonAparecerDesaparecer.CENTER);
        botonMenu.setFocusable(false);
        botonMenu.setBackground(Color.black);
            ImageIcon imgMenu = new ImageIcon("img/menuLogo.png");
            Icon imgMenuRezised = new ImageIcon(imgMenu.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        botonMenu.setIcon(imgMenuRezised);

        panelNorteIzquierda.add(titulo);
        panelNorteCentro.add(botonMenu);

        panelNorte.add(panelNorteCentro, BorderLayout.WEST);
        panelNorte.add(panelNorteIzquierda, BorderLayout.CENTER);

        //-------------Panel de la izquierda------------------------//

        panelIzquierda.setPreferredSize(new Dimension(200,100));
        panelIzquierda.setBackground(new Color(36, 43, 46 ));

        //-------------Panel de la derecha------------------------//

        panelDerecha.setPreferredSize(new Dimension(20,100));
        panelDerecha.setBackground(new Color(36, 43, 46 ));

        //-------------Panel del centro------------------------//

        panelCentral.setPreferredSize(new Dimension(50,100));
        panelCentral.setBackground(new Color(136, 148, 153 ));

        //-------------complementos de la ventana------------------------//

        ventana1.add(panelSur, BorderLayout.SOUTH);
        ventana1.add(panelNorte, BorderLayout.NORTH);
        ventana1.add(panelIzquierda, BorderLayout.WEST);
        ventana1.add(panelDerecha, BorderLayout.EAST);
        ventana1.add(panelCentral, BorderLayout.CENTER);
        ventana1.setVisible(true);

    }
}
