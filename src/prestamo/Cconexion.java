/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

/**
 *
 * @author hugo
 */
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class Cconexion {
    Connection con;
    
    public Cconexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
            con = conexion;
        }
        catch (Exception e) {
        }    
    }
    public Connection getconector()
    {
        return con;
    }
    public int num_coin_buscar(String parametro, int opcion)
    {
        int numero = 0;
        String query = "";
        try{
            switch(opcion)
            {
                case 1:
                    query = "CALL count_coincidencias_busq_libros_nombre ('" + parametro + "')";
                    break;
                case 2:
                    query = "CALL count_coincidencias_busq_libros_autor ('" + parametro + "')";
                    break;
                case 3:
                    query = "CALL count_coincidencias_busq_libros_editorial ('" + parametro + "')";
                    break;
            }
            Statement sentencia = con.createStatement();
            ResultSet resp = sentencia.executeQuery(query);
            while(resp.next())
            {
                numero = resp.getInt(1);
            }
            return numero;
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        return numero;
    }
    public List<List<String>> bucscarpornom(String parametro, int indice, int opcion)
    {
        List<List<String>> lista = new ArrayList<List<String>>();
        List<String> datos = new ArrayList<String>();
        try {
            String query = "";
            switch(opcion)
            {
                case 1:
                    query = "CALL buscar_libros_nombre ('" + parametro + "', '" + indice + "')";
                    break;
                case 2:
                    query = "CALL buscar_libros_autor ('" + parametro + "', '" + indice + "')";
                    break;
                case 3:
                    query = "CALL buscar_libros_editorial ('" + parametro + "', '" + indice + "')";
                    break;
            }
            int temporal;
            Statement sentencia = con.createStatement();
            ResultSet resp = sentencia.executeQuery(query);
            while(resp.next())
            {
                temporal = resp.getInt("id_lib");
                datos.add(Integer.toString(temporal));
                datos.add(resp.getString("lib_name"));
                datos.add(resp.getString("aut_name"));
                datos.add(resp.getString("ed_name"));
                
                //datos[4] = resp.getInt(5)
                lista.add(datos);
                //con.close();
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return lista;
    }
}
