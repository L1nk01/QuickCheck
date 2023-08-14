package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;

/**
 * Clase que proporciona métodos para trabajar con objetos JComboBox y realizar operaciones relacionadas con ellos.
 * Utiliza una conexión de base de datos para algunas de sus operaciones.
 * 
 * @author Emmanuel Campos 2022-1855
 */

public class MetodosComboBox {
    
    private Connection cn;
    
    /**
     * Constructor de la clase MetodosComboBox.
     * 
     * @param conexion La conexión a la base de datos que se utilizará para algunas operaciones.
     */
    public MetodosComboBox(Connection conexion) {
        this.cn = conexion;
    }
    
    /**
     * Obtiene el texto seleccionado del JComboBox.
     * 
     * @param comboBox El JComboBox del cual se desea obtener el texto seleccionado.
     * @return El texto seleccionado en el JComboBox, o null si el texto seleccionado es "Elegir" o "Ninguno".
     */
    public String getComboText(JComboBox<String> comboBox) {
        String selected = "Elegir";

        if (comboBox.getSelectedItem() != null) {
            selected = comboBox.getSelectedItem().toString();
        }

        if ("Elegir".equals(selected) || "Ninguno".equals(selected)) {
            return null;
        }
        return selected;
    }
    
    /**
     * Establece las opciones del JComboBox a partir de los datos de una tabla en la base de datos.
     * 
     * @param columna El nombre de la columna de la cual se obtendran los datos para llenar el JComboBox.
     * @param tabla El nombre de la tabla de la cual se obtendrán los datos para llenar el JComboBox.
     * @param comboBox El JComboBox que se llenará con las opciones obtenidas de la tabla.
     */
    public void setComboOpciones(String columna, String tabla, JComboBox<String> comboBox) {   
        String consultasql = "SELECT " + columna + " FROM tabla ORDER BY codDepto ASC;";
        String data;
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            
            while (rs.next())
            {
                data = rs.getString(1);
                comboBox.addItem(data);
            }
        }
        catch (SQLException e)
        {
            System.out.println("Error al mostrar los datos: " + e);
        }
    }
}
