import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Dimension;

public class BotonAparecerDesaparecer extends JButton implements ActionListener {

    Component Fuente;

    public BotonAparecerDesaparecer(Component Fuente) {
        super();
        this.Fuente = Fuente;
        this.setPreferredSize(new Dimension(50,50));
        this.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==this){

            if(Fuente.isVisible()){
                Fuente.setVisible(false);
            }else{
                Fuente.setVisible(true);
            }

        }
    }
    
}
