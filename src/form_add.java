
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberto
 */
public class form_add extends javax.swing.JFrame {
  Connection con;
  PreparedStatement pst;//query
  ResultSet rs=null;//rsultado
  Statement s;
  crud_libros open;
 
  
  
  
    public form_add() {
        initComponents();
        mostrar();
        setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        in_desc = new javax.swing.JTextField();
        in_anio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        in_cantidad = new javax.swing.JTextField();
        in_cod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        in_observacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        in_edicion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        in_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_editorial = new javax.swing.JButton();
        btn_estado = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        combo_categoria = new javax.swing.JComboBox();
        combo_author = new javax.swing.JComboBox();
        combo_editorial = new javax.swing.JComboBox();
        combo_estados = new javax.swing.JComboBox();
        btn_author = new javax.swing.JButton();
        btn_categorianew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        in_desc.setName("in_descripción"); // NOI18N
        getContentPane().add(in_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 95, 20));

        in_anio.setName("in_editorial"); // NOI18N
        getContentPane().add(in_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 95, 20));

        jLabel3.setText("Descripción");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel9.setText("codigo");
        jLabel9.setName("in_anio"); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        in_cantidad.setName("in_cantidad"); // NOI18N
        getContentPane().add(in_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 95, 20));

        in_cod.setName("in_codigo"); // NOI18N
        getContentPane().add(in_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 92, 20));

        jLabel4.setText("cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel11.setText("Observación");
        jLabel11.setName("in_anio"); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        in_observacion.setName("in_observacion"); // NOI18N
        getContentPane().add(in_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 92, 20));

        jLabel5.setText("Autor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 130, 30));

        in_edicion.setName("in_edicion"); // NOI18N
        getContentPane().add(in_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 95, 20));

        jLabel6.setText("Edición");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        in_name.setName("in_namelib"); // NOI18N
        getContentPane().add(in_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 95, 20));

        jLabel7.setText("Editorial");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel2.setText("Nombre de libro");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel8.setText("Año ");
        jLabel8.setName("in_anio"); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        btn_editorial.setIcon(new javax.swing.ImageIcon("C:\\Users\\roberto\\Documents\\ciclo ix\\java\\Poyecto\\ProyectoJAVA\\build\\classes\\icon\\addn.png")); // NOI18N
        btn_editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editorialActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 20, 20));

        btn_estado.setIcon(new javax.swing.ImageIcon("C:\\Users\\roberto\\Documents\\ciclo ix\\java\\Poyecto\\ProyectoJAVA\\build\\classes\\icon\\addn.png")); // NOI18N
        btn_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 20, 20));

        jLabel10.setText("Categoria");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel12.setText("Estado");
        jLabel12.setName("in_anio"); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        combo_categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 110, 20));

        combo_author.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 110, 20));

        combo_editorial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 110, 20));

        combo_estados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_estados, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 110, 20));

        btn_author.setIcon(new javax.swing.ImageIcon("C:\\Users\\roberto\\Documents\\ciclo ix\\java\\Poyecto\\ProyectoJAVA\\build\\classes\\icon\\addn.png")); // NOI18N
        btn_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_authorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 20, 20));

        btn_categorianew.setBackground(javax.swing.UIManager.getDefaults().getColor("activeCaptionBorder"));
        btn_categorianew.setIcon(new javax.swing.ImageIcon("C:\\Users\\roberto\\Documents\\ciclo ix\\java\\Poyecto\\ProyectoJAVA\\build\\classes\\icon\\addn.png")); // NOI18N
        btn_categorianew.setBorder(null);
        btn_categorianew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categorianewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_categorianew, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void mostrar(){    
        
        
//        variables a esconder y desabilitar
       
        
       
        combo_author.removeAllItems(); 
        combo_categoria.removeAllItems();  
        combo_editorial.removeAllItems(); 
        combo_estados.removeAllItems(); 
        
     //  JOptionPane.showMessageDialog(null,in_estado.getLocation());   
        try{
            
            
//      combo_box Categoria     
          
           con=conexion_mysql.getConnection();
           s= con.createStatement();         
           rs=s.executeQuery("select cat_categorias from categoria");
           while(rs.next())
            { 
            this.combo_categoria.addItem(rs.getString(1));
            
            }
            
 //        combo_box Autor
            
           rs=s.executeQuery("select aut_name from autor");
           while(rs.next())
            { 
            combo_author.addItem(rs.getString(1));
             
            
            }
           
           
//       Combo_box editorial
                  
           rs=s.executeQuery("select ed_name from editoriales");
           while(rs.next())
            { 
            this.combo_editorial.addItem(rs.getString(1));
           
            }
           
          
 //        combo_box estados
          
           rs=s.executeQuery("select es_estados from estados");
           while(rs.next())
            { 
            this.combo_estados.addItem(rs.getString(1));
            
            }
           
       con.close();
        }
        catch(Exception ex){
        
            JOptionPane.showMessageDialog(null,("error"+ex));
        }
    }
    
    
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
          con=conexion_mysql.getConnection();
          s= con.createStatement();
          
          //          encontrando el id de la tabla categora 
          int id_categoria=0;
          rs=s.executeQuery("select id_categoria from categoria where cat_categorias='"+(combo_categoria.getSelectedItem().toString())+"'");
          while(rs.next())
            { 
            id_categoria=rs.getInt(1);
            }
          

     //          encontrando el id de la tabla autor 
//          String pivote=combo_author.getSelectedItem().toString();
//          int valor=pivote.indexOf(" "); 
//          String nombre=pivote.substring(0,valor); 
          int id_autor=0;
          
          rs=s.executeQuery("select id_autor from autor where aut_name='"+(combo_author.getSelectedItem().toString())+"'");
          while(rs.next())
            { 
            id_autor=rs.getInt(1);
            }
          
     //          encontrando el id de la editorial
         int id_editorial=0;
          rs=s.executeQuery("select id_editorial from editoriales where ed_name='"+(combo_editorial.getSelectedItem().toString())+"'");
          while(rs.next())
            { 
            id_editorial=rs.getInt(1);
            }
          
          
     //          encontrando el id del estado  
         int id_estado=0;
          rs=s.executeQuery("select id_estados from estados where es_estados='"+(combo_estados.getSelectedItem().toString())+"'");
          while(rs.next())
            { 
            id_estado=rs.getInt(1);
            } 
          
          
   // Ahora haremos el insert principal
          
        
          
       
        pst=con.prepareStatement("insert into libros(lib_descrip, lib_name, lib_cantidad, lib_categoria, lib_autor, lib_edicion,lib_editorial,lib_year,lib_codigo,lib_observacion,lib_estado) values(?,?,?,?,?,?,?,?,?,?,?)");
       
        pst.setString(1,in_desc.getText());
        pst.setString(2,in_name.getText());
        pst.setInt(3,Integer.parseInt(in_cantidad.getText()));
        pst.setInt(4,id_categoria);
        pst.setInt(5,id_autor);
        pst.setString(6,in_edicion.getText());
        pst.setInt(7,id_editorial);
        pst.setInt(8,Integer.parseInt(in_anio.getText()));
        pst.setString(9,in_cod.getText());
        pst.setString(10,in_observacion.getText());
        pst.setInt(11,id_estado);
        
        pst.executeUpdate();
        con.close();
        open =new crud_libros();
        open.setVisible(true);
        this.setVisible(false);
        
        
        
        }
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(null,("error"+ex));
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_categorianewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categorianewActionPerformed
    JFrame frame = new JFrame("Nueva Categoria");
    try{
    String categoria = JOptionPane.showInputDialog(frame,"Ingrese una nueva categoria");
    if(categoria==null){
    frame.dispose();
    }else{      
    con=conexion_mysql.getConnection();   
    pst=con.prepareStatement("insert into categoria(cat_categorias) values(?)");
    pst.setString(1,categoria);
    pst.executeUpdate();
    con.close();
    combo_categoria.addItem(categoria);
    
     
    }
    
    }
    catch (Exception ex){
      JOptionPane.showMessageDialog(null,("error"+ex));
    }
   
    
    }//GEN-LAST:event_btn_categorianewActionPerformed

    private void btn_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_authorActionPerformed
    JFrame frame2 = new JFrame("Nuevo Autor");
    try{
    
    String name = JOptionPane.showInputDialog(frame2,"Ingrese un nombre y un apellido del autor a registrar");
    if(name==null){
    frame2.dispose();
    }else{      
        con=conexion_mysql.getConnection();   
        pst=con.prepareStatement("insert into autor(aut_name) values(?)");
        pst.setString(1,name);
        pst.executeUpdate();
        con.close();
        combo_author.addItem(name);
        
        }
    }
    catch (Exception ex){
      JOptionPane.showMessageDialog(null,("error"+ex));
    }
   
      
    }//GEN-LAST:event_btn_authorActionPerformed

    private void btn_editorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editorialActionPerformed
  JFrame frame3 = new JFrame("Nueva Editorial");
    try{
    String edit = JOptionPane.showInputDialog(frame3,"Ingrese una editorial");
    if(edit==null){
    frame3.dispose();
    }else{      
        con=conexion_mysql.getConnection();   
        pst=con.prepareStatement("insert into editoriales(ed_name) values(?)");
        pst.setString(1,edit);
        pst.executeUpdate();
        con.close();
        combo_editorial.addItem(edit);
       
        }
    }
    catch (Exception ex){
      JOptionPane.showMessageDialog(null,("error"+ex));
    }
     
    
    }//GEN-LAST:event_btn_editorialActionPerformed

    private void btn_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estadoActionPerformed
    
    
    JFrame frame4 = new JFrame("Nuevo estado");
    try{
    String state = JOptionPane.showInputDialog(frame4,"Ingrese un nuevo estado del libro");
    if(state==null){
    frame4.dispose();
    }else{      
        con=conexion_mysql.getConnection();   
        pst=con.prepareStatement("insert into estados(es_estados) values(?)");
        pst.setString(1,state);
        pst.executeUpdate();
        con.close();
        combo_estados.addItem(state);
       
        }
    }
    catch (Exception ex){
      JOptionPane.showMessageDialog(null,("error"+ex));
    }
    }//GEN-LAST:event_btn_estadoActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_author;
    private javax.swing.JButton btn_categorianew;
    private javax.swing.JButton btn_editorial;
    private javax.swing.JButton btn_estado;
    private javax.swing.JComboBox combo_author;
    private javax.swing.JComboBox combo_categoria;
    private javax.swing.JComboBox combo_editorial;
    private javax.swing.JComboBox combo_estados;
    private javax.swing.JTextField in_anio;
    private javax.swing.JTextField in_cantidad;
    private javax.swing.JTextField in_cod;
    private javax.swing.JTextField in_desc;
    private javax.swing.JTextField in_edicion;
    private javax.swing.JTextField in_name;
    private javax.swing.JTextField in_observacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
