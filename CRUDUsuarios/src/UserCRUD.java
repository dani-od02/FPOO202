import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
// ResultSet: es como una arreglo pero se trata como un objeto y contiene el resultado de una consulta;
public class UserCRUD {
    
    private Connection conexion ;
    
    //constructor
    public UserCRUD (){
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean crearUsuario(String nom, String cor, String contra ){
         String sqlInsert = "INSERT INTO Usuarios (nombre,correo,contraseña) VALUE(?,?,?)";
        
        try{
           PreparedStatement ps = conexion.prepareStatement(sqlInsert);
           ps.setString(1,nom);
           ps.setString(2,cor);
           ps.setString(3,contra);
           return ps.executeUpdate() > 0;
        }
 /* el catch es para que si hay algun error el cache el error y te arrogue cual es el problema que es el manejo de la esepciones*/   
    catch(SQLException e){
    System.out.println("Error al intentar insertar: "+ e.getMessage());
    
    return false;
    }
    }
   
    
    public ResultSet obtenerTodos(){
        String sqlTodos = "SELECT *from usuarios";
        
        try{     
            PreparedStatement ps = conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
         catch(SQLException w){
              System.out.println("Error al intentar consultar: "+ w.getMessage());
              return null;
    }
        
    }
    
    public ResultSet buscarUsuario(int id) {
    String sql = "SELECT nombre, correo, contraseña FROM usuarios WHERE id = ?";
    
    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id);
        return ps.executeQuery();
    } catch (SQLException e) {
        System.out.println("Error al buscar usuario: " + e.getMessage());
        return null;
    }
}

    public ResultSet ObtenerUsuarioPorID (int id){
        String selectSql = "select*from usuarios where id = ? ";
        
        try{
           PreparedStatement ps = conexion.prepareStatement(selectSql);
           ps.setInt(1,id);
           return ps.executeQuery();
        }
        catch(SQLException e){
         System.out.println("Error al intentar consultar: "+ e.getMessage());
            return null;  
        }
    }
    
    public boolean actualizarUsuario(int id, String nombre, String correo, String contrasena) {
    String sql = "UPDATE usuarios SET nombre = ?, correo = ?, contraseña = ? WHERE id = ?";
    
    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, nombre);
        ps.setString(2, correo);
        ps.setString(3, contrasena);
        ps.setInt(4, id);

        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error al actualizar usuario: " + e.getMessage());
        return false;
    }
}
       public boolean eliminarUsuario(int id) {
           
    int respuesta = JOptionPane.showConfirmDialog(
        null, 
        "¿Estás seguro de que quieres eliminar este usuario?", 
        "Confirmar eliminación", 
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
    );
    
    if (respuesta != JOptionPane.YES_OPTION) {
        return false;
    }
    
    String sqlDelete = "DELETE FROM usuarios WHERE id = ?";
    
    try {
        PreparedStatement ps = conexion.prepareStatement(sqlDelete);
        ps.setInt(1, id);
        boolean eliminado = ps.executeUpdate() > 0;
        
        if (eliminado) {
            JOptionPane.showMessageDialog(
                null, 
                "Usuario eliminado correctamente", 
                "Éxito", 
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "No se encontró el usuario con ID: " + id, 
                "Advertencia", 
                JOptionPane.WARNING_MESSAGE
            );
        }
        
        return eliminado;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(
            null, 
            "Error al intentar eliminar usuario: " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE
        );
        return false;
    }
}
}