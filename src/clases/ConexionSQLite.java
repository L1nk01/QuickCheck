package clases;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase que proporciona métodos para conectarse y desconectarse de una base de datos SQLite.
 * 
 * @author Emmanuel Campos 2022-1855
 */

public class ConexionSQLite
{
    Connection cn;
    
    /**
     * Establece una conexión con la base de datos SQLite utilizando los parámetros proporcionados.
     * 
     * @return La conexión establecida (objeto Connection) si la conexión es exitosa, o null si ocurre un error.
     */
    public Connection conectar()
    {
        String rutaActual = System.getProperty("user.dir");
        String direccion = "jdbc:sqlite:" + rutaActual + "\\src\\quickcheck\\database\\sistema_quickcheck.db";
        
        try
        {
            Class.forName("org.sqlite.JDBC");
            cn = (Connection) DriverManager.getConnection(direccion);
            System.out.println("CONECTADO");
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "No se pudo conectar.\nRevise los datos\n");
            JOptionPane.showMessageDialog(null, "Error de conexión: " + ex);
            System.out.println("NO SE PUDO CONECTAR");
            System.out.println("ERROR: " + ex);
        }
        
        return cn;
    }
    
    /**
     * Cierra la conexión actual con la base de datos SQLite.
     */
    public void desconectar()
    {
        try
        {
            cn.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ConexionSQLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
