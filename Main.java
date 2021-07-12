public class Main {

    public static void reporte(String mensaje) {

        System.out.println("reporte: "+mensaje);
        
    }

    public static void main(String[] args) {
        
        VentanaJF ventana1 = new VentanaJF();
        reporte("salió el frame");

        /*
            LabelJF texto1 = new LabelJF();
            reporte("creamos el label con texto");

            ventana1.add(texto1);
            reporte("se añade el label al frame");

            LabelJF imagen = new LabelJF("img/logo1.jpg");
            reporte("creamos el label con imagen");

            ventana1.add(imagen);
            reporte("se añade el label al frame");
        */

        LabelJF imagenYtexto = new LabelJF("img/logo1.jpg","combo de imagen y texto");
        reporte("creamos el label con imagen y texto");

        ventana1.add(imagenYtexto);
        reporte("se añade el label al frame");

        ventana1.setLayout(null);//elimina la organización por default que se le dan a los elmentos en el frame y evita el autofit de los elementos como el label

        ventana1.setVisible(true);

       // ventana1.pack();//acomoda la ventana al tamaño de los 
        
    }
}
