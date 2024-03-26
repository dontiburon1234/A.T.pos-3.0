package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.CryptCadena;

public class UsuarioDAO {
    // Otros métodos para insertar, actualizar, eliminar usuarios, etc.

	public boolean consultaCajero(String idUsuario, char[] password){
		try {
			String strPassword = new String(password);
			idUsuario = idUsuario.toUpperCase();
			CryptCadena cryptCadena = new CryptCadena(idUsuario);
			String strPasswordEnc = cryptCadena.encrypt(strPassword);

			// Validar la existencia del cajero en la tabla usuario
			String validarUsuario = "";
			Connection conexion = ConexionBD.obtenerConexion();
			PreparedStatement st = conexion.prepareStatement("select * from usuario where id = ? and password = ?");
			st.setString(1, idUsuario);
			st.setString(2, strPasswordEnc);
			ResultSet rs = st.executeQuery();
			if (rs.next() ){
				validarUsuario = rs.getString(1);
			}

			// validar la existencia del cajero y esté activo en la tabla cajero
			String validarCajero = "";
			st = conexion.prepareStatement("Select * from cajero where id_usuario = ? and estado = ?");
			st.setString(1, idUsuario);
			st.setString(2, "activo");
			rs = st.executeQuery();
			if(rs.next()){
				validarCajero = rs.getString(3);
			}
			rs.close();
			st.close();

			if(validarUsuario.equals(idUsuario) && validarCajero.equals(idUsuario)){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			System.out.println("UsuarioDAO.consultaCajero()" + e);
			//LOG.severe("MaestroBD consultaCajero ERROR "+e);
			e.printStackTrace();
			return false;
		}
	}
	
	public Usuario obtenerUsuarioPorId(String id) throws SQLException {
        Connection conexion = ConexionBD.obtenerConexion();
        PreparedStatement statement = conexion.prepareStatement("SELECT * FROM usuario WHERE id = ?");
        statement.setString(1, id);
        ResultSet rs = statement.executeQuery();
        
        Usuario usuario = null;
        if (rs.next()) {
            usuario = new Usuario(
            		rs.getString("id"),rs.getString("id_tipo_documento"),rs.getDouble("documento"),rs.getString("nombre"),
					rs.getString("apellido"),rs.getString("password"),rs.getDate("fecha_nacimiento"),rs.getString("direccion"),
					rs.getInt("id_ciudad"),rs.getString("telefono"),rs.getString("email"),rs.getDate("fecha_ingreso"),
					rs.getInt("id_almacen"), rs.getString("estado"), rs.getTimestamp("dg_fecha_accion"),rs.getString("dg_accion")
            		);
//            usuario.setId(rs.getString("id"));
//            usuario.setNombre(rs.getString("nombre"));
            System.out.println(usuario.getNombre());
        }
        
        ConexionBD.cerrarConexion(conexion, statement, rs);
        return usuario;
    }
}

