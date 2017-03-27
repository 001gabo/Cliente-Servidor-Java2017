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
    public int num_coin_buscar_pornom(String nombre)
    {
        int numero = 0;
        try{
            String query = "CALL count_coincidencias_busq_libros ('" + nombre + "')";
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
        finally{
            return numero;
        }
    }
    public List<List<String>> bucscarpornom(String nombre)
    {
        List<List<String>> lista = new ArrayList<List<String>>();
        List<String> datos = new ArrayList<String>();
        try {
            String query = "SELECT * from libros WHERE lib_name LIKE '%" + nombre + "%'";
            //datos[0] = query;
            //lista.add(datos);
            System.out.println(query);
            int temporal;
            Statement sentencia = con.createStatement();
            ResultSet resp = sentencia.executeQuery(query);
            while(resp.next())
            {
                temporal = resp.getInt(1);
                datos.add(Integer.toString(temporal));
                datos.add(resp.getString(2));
                datos.add(resp.getString(3));
                datos.add(resp.getString(4));
                
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
