package fabrica.abstrata.botoes;


import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author felipe
 */
public class ButtonCancel extends JButton{
    
    public ButtonCancel(String tema){
        if (tema.equalsIgnoreCase("tema2")){
            Image img = null;
            try {
                img = ImageIO.read(getClass().getResource("/Cancel-icon.jpg"));
            } catch (IOException ex) {
                Logger.getLogger(ButtonCancel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setIcon(new ImageIcon(img));
        }
    }
    
}
