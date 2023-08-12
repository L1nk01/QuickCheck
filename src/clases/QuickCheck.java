package clases;



import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ventanas.LoginForm;

/**
 *
 * @author ecpau
 */
public class QuickCheck {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Establecer el aspecto visual del programa utilizando el FlatLightLaf
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch(UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        // Crear una instancia de ConexionSQLite para establecer conexión con la base de datos
        ConexionSQLite con = new ConexionSQLite();
        Connection cn = con.conectar();
        
        // Crear y mostrar la ventana de inicio de sesión, posicionándola en el centro de la pantalla
        LoginForm loginForm = new LoginForm(cn);
        loginForm.setVisible(true);
        loginForm.setLocationRelativeTo(null);
    }
}
