package Principal;

import Vista.Form1;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.UIManager;

public class T2 {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        }catch(Exception x)
        {
            System.out.println("ERROR AL AGREGAR LA EXTENSION FLATLAFT");
        }
        
        Form1 formulario = new Form1();
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setTitle("Sistema de Gestión de Técnicos de Soporte Informático");
        
    }
    
}
