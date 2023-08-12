package clases;

import javax.swing.JComboBox;

/**
 * Clase que contiene métodos para obtener información relacionada con la búsqueda y ordenación de empleados.
 * 
 * @author Emmanuel Campos 2022-1855
 */

public class MetodosBusqueda {
    
    /**
     * Obtiene el nombre del campo de la base de datos por el cual se realizará la búsqueda,
     * basado en la opción seleccionada en un JComboBox.
     *
     * @param comboBuscar El JComboBox que contiene las opciones de búsqueda.
     * @param nombresColumnasBD Los nombres de los campos correspondientes en la base de datos.
     * @return El nombre del campo de la base de datos a utilizar en la búsqueda. Retorna null si la opción no está definida.
     */
    public String getBuscarPor(JComboBox comboBuscar, String[] nombresColumnasBD) {
        int seleccion = comboBuscar.getSelectedIndex();
        return nombresColumnasBD[seleccion];
    }
    
    /**
     * Obtiene el criterio de ordenación para realizar una consulta en la base de datos según la opción seleccionada en un JComboBox.
     * 
     * @param comboOrdenar El JComboBox que contiene las opciones de ordenación.
     * @return El criterio de ordenación (ASC o DESC) a utilizar en la consulta. Retorna null si la opción no está definida.
     */
    public String getOrdenarPor(JComboBox comboOrdenar) {
        String selected = (String) comboOrdenar.getSelectedItem();
        
        switch (selected) {
            case "Ascendente":
                return "ASC";
            case "Descendente":
                return "DESC";
        }
        return null;
    }
    
    /**
     * Obtiene el formato de búsqueda para realizar una consulta en la base de datos según la opción seleccionada en un JComboBox.
     * 
     * @param busqueda La cadena de texto que se utilizará para realizar la búsqueda.
     * @param comboTipoBusqueda El JComboBox que contiene las opciones de formato de búsqueda ("Empieza por", "Termina con" o "Contiene").
     * @return El formato de búsqueda (LIKE UPPER(...)) a utilizar en la consulta. Retorna null si la opción no está definida.
     * 
     * El formato de búsqueda "LIKE UPPER(...)" permite realizar la búsqueda sin tener en cuenta si el texto ingresado en 'busqueda' está en mayúsculas o minúsculas. 
     * De esta manera, la consulta se realizará de forma insensible a mayúsculas y minúsculas para mejorar la precisión de los resultados.
     */
    public String getFormatoBusqueda(String busqueda, JComboBox comboTipoBusqueda) {
        String selected = (String) comboTipoBusqueda.getSelectedItem();
        
        if (busqueda.equals("Buscar")) {
            busqueda = "";
        }
        
        switch (selected) {
            case "Empieza por":
                return "LIKE UPPER('" + busqueda + "%')";
            case "Termina con":
                return "LIKE UPPER('%" + busqueda + "')";
            case "Contiene":
                return "LIKE UPPER('%" + busqueda + "%')";
        }
        return null;
    }
    
    /**
     * Construye y devuelve una consulta SQL para buscar y ordenar datos en una tabla específica,
     * basada en los parámetros proporcionados.
     *
     * @param tabla El nombre de la tabla en la base de datos.
     * @param filtro El campo de la tabla que se utilizará como filtro de búsqueda.
     * @param busquedaCompleta La condición de búsqueda completa (por ejemplo, "= 'valor'").
     * @param orden El campo por el cual se ordenarán los resultados.
     * @return Una cadena que representa la consulta SQL completa.
     */
    public String obtenerConsulta(String tabla, String filtro, String busquedaCompleta, String orden) {
        return "SELECT * FROM " + tabla + " WHERE UPPER(" + filtro + ") " + busquedaCompleta + " ORDER BY " + filtro + " " + orden + ";";
    }
}
