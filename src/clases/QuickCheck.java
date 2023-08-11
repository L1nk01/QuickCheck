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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch(UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        ConexionSQLite con = new ConexionSQLite();
        Connection cn = con.conectar();
        
        LoginForm loginForm = new LoginForm(cn);
        loginForm.setVisible(true);
        loginForm.setLocationRelativeTo(null);
    }
}
