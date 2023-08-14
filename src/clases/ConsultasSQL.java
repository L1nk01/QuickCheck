package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Clase que contiene consultas SQL para interactuar con la base de datos.
 * Esta clase se utiliza para realizar consultas relacionadas con usuarios y sus contraseñas.
 * Requiere una conexión a la base de datos establecida al momento de su creación.
 * 
 * @ecpau
 */
public class ConsultasSQL {
    
    Connection cn;
    
    /**
     * Constructor de la clase ConsultasSQL.
     * Inicializa la clase con la conexión a la base de datos proporcionada.
     * 
     * @param cn La conexión a la base de datos.
     */
    public ConsultasSQL(Connection cn) {
        this.cn = cn;
    }
    
    /**
     * Obtiene la contraseña de un usuario a partir de su nombre de usuario.
     * 
     * @param nombreUsuario El nombre de usuario del cual se desea obtener la contraseña.
     * @return La contraseña del usuario, o null si no se encontró ninguna coincidencia.
     */
    public String obtenerClaveUsuario(String nombreUsuario) {
        String clave = null;
        String sql = "SELECT clave FROM usuarios WHERE nombre_usuario = ?";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombreUsuario);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                clave = rs.getString("clave");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se pudo obtener la contraseña", "Error",JOptionPane.ERROR_MESSAGE);
        }

        return clave;
    }
}
