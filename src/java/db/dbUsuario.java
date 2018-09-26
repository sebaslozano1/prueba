/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.usuario;

public class dbUsuario {

    private Connection conexion;
    private Statement sentenciaSQL;
    ResultSet registro;
   
 
    public void conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanambiente", "sanambiente", "sanambiente.2018");
            sentenciaSQL = conexion.createStatement();
            System.out.println("conexión exitosa");

        } catch (ClassNotFoundException | SQLException error) {
            System.out.println("ERROR EN CONEXION: " + error);
        }
    }

    public void desconectar() {
        try {
            if (registro != null) {
                registro.close();
            }
            sentenciaSQL.close();
            conexion.close();
        } catch (SQLException error) {
            System.out.println("ERROR EN DESCONEXION: " + error);
        }
    }

    public void ejecutar(String cadena) {

        try {
            sentenciaSQL.executeUpdate(cadena);
        } catch (SQLException error) {
            System.out.println("ERROR EJECUCION: " + error);
        }
    }

    public ResultSet hacerConsulta(String consulta) {
        try {
            registro = sentenciaSQL.executeQuery(consulta);
        } catch (SQLException e) {
            System.out.println("ERROR EN CONSULTA - en ResultSet: " + e);
        }
        return registro;
    }

    public void insertar() {

        try {
            sentenciaSQL.executeUpdate("INSERT INTO `prueba` (`valor1`, `valor2`) VALUES ('hola mundo', 'hola mundo')");

        } catch (SQLException error) {
            System.out.println("ERROR EJECUCION: " + error);
        }
    }
    
       public boolean insertar2(usuario objUsuario) {

        boolean estado= false;    
            
        try {
            sentenciaSQL.executeUpdate("INSERT INTO `usuario` ( `NOMBRE`, `APELLIDO`, `TIPO_DOCUMENTO`, `NUMERO_DOCUMENTO`, `DIRECCION`, `NUMERO_CELULAR`, `BARRIO`, `COMUNA`, `TELEFONO`, `EMAIL`, `SEXO`, `EPS`, `PENSION`, `ARL`) VALUES('"+objUsuario.getNombre()+"', '"+objUsuario.getApellido()+"', '"+objUsuario.getTipoDocumento()+"', '"+objUsuario.getNumeroDocumento()+"', '"+objUsuario.getDireccion()+"', '"+objUsuario.getNumeroCelular()+"', '"+objUsuario.getBarrio()+"', '"+objUsuario.getComuna()+"', '"+objUsuario.getTelefono()+"', '"+objUsuario.getEmail()+"', '"+objUsuario.getSexo()+"', '"+objUsuario.getEps()+"', '"+objUsuario.getPension()+"', '"+objUsuario.getArl()+"')");
            estado=true;
            
        } catch (SQLException error) {
            System.out.println("ERROR EJECUCION: " + error);
        }
        return estado;
    }

    
}
