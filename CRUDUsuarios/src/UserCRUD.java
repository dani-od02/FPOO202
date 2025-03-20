import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}