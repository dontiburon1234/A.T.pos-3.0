package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class ConexionBD {

	
	// Método para obtener la conexión a la base de datos
    public static Connection obtenerConexion() throws SQLException {
        // Configuración de la conexión a la base de datos
        String url = "jdbc:postgresql://localhost:5432/distribell";
        String usuario = "at.pos";
        String contraseña = "processus.123";

		/*
		 * Configurar en la variables de entorno en el caso de Windows
		 * 
		 * String urlConexion = System.getenv("urlConexion"); String usuarioBD =
		 * System.getenv("usuarioBD"); String contrasenaBD =
		 * System.getenv("contrasenaBD");
		 */

        // Establecer la conexión con la base de datos
        try {
			return DriverManager.getConnection(url, usuario, contraseña);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
		return null;
    }

    // Método para cerrar la conexión
    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("ConexionBD.cerrarConexion() Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    // Método para cerrar la conexión, el statement y el resultSet
    public static void cerrarConexion(Connection conexion, PreparedStatement statement, ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
        	System.out.println("ConexionBD.cerrarConexion() Error al cerrar la conexión: " + e.getMessage());
        }
    }
	
	
	
	
	
	
	
	
	
	/*
	 * public static void main(String[] args) { // Configuración de la conexión a la
	 * base de datos String url = "jdbc:postgresql://localhost:5432/distribell";
	 * String usuario = "at.pos"; String contraseña = "processus.123";
	 * 
	 * // Declaración de objetos Connection y Statement // Connection conexion =
	 * null; Statement statement = null;
	 * 
	 * try { // Establecer la conexión con la base de datos Connection conexion =
	 * DriverManager.getConnection(url, usuario, contraseña);
	 * 
	 * // Realizar operaciones en la base de datos aquí
	 * System.out.println("Conexión exitosa a la base de datos PostgreSQL");
	 * 
	 * // Crear un objeto Statement para ejecutar consultas SQL statement =
	 * conexion.createStatement();
	 * 
	 * // Ejecutar una consulta SQL String consulta = "SELECT * FROM articulo";
	 * ResultSet resultado = statement.executeQuery(consulta);
	 * 
	 * // Procesar el resultado de la consulta while (resultado.next()) { // Obtener
	 * valores de las columnas por nombre o índice int id = resultado.getInt("id");
	 * String nombre = resultado.getString("nombre");
	 * 
	 * // Hacer algo con los valores obtenidos System.out.println("ID: " + id +
	 * ", Nombre: " + nombre); }
	 * 
	 * // Cerrar la conexión conexion.close(); } catch (SQLException e) {
	 * System.out.println("Error al conectar a la base de datos PostgreSQL: " +
	 * e.getMessage()); } }
	 */
}
