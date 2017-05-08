package Libros;
import conexion.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

public class form_add extends javax.swing.JFrame {
  Connection con;
  PreparedStatement pst;//query
  ResultSet rs=null;//rsultado
  Statement s;
  crud_libros open;
  int contpal=0;
  
  
    public form_add() {
        initComponents();
        mostrar();
       setLocationRelativeTo(null);
       this.getContentPane().setBackground(new Color(26,35,126));
        
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
        cancelar = new javax.swing.JButton();
        btn_categorianew = new javax.swing.JButton();
        in_diaspres = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        in_desc.setName("in_descripción"); // NOI18N
        getContentPane().add(in_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 95, -1));

        in_anio.setName("in_editorial"); // NOI18N
        in_anio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_anioKeyTyped(evt);
            }
        });
        getContentPane().add(in_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 95, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("codigo");
        jLabel9.setName("in_anio"); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        in_cantidad.setName("in_cantidad"); // NOI18N
        in_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_cantidadKeyTyped(evt);
            }
        });
        getContentPane().add(in_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 95, -1));

        in_cod.setName("in_codigo"); // NOI18N
        getContentPane().add(in_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 92, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Observación");
        jLabel11.setName("in_anio"); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        in_observacion.setName("in_observacion"); // NOI18N
        getContentPane().add(in_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 92, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Autor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 90, -1));

        in_edicion.setName("in_edicion"); // NOI18N
        getContentPane().add(in_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 95, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edición");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        in_name.setName("in_namelib"); // NOI18N
        in_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_nameKeyTyped(evt);
            }
        });
        getContentPane().add(in_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 95, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Editorial");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de libro");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Año ");
        jLabel8.setName("in_anio"); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        btn_editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editorialActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 20, 20));

        btn_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 20, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Categoria");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Dias a prestar");
        jLabel12.setName("in_anio"); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        combo_categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, -1));

        combo_author.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, -1));

        combo_editorial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 110, -1));

        combo_estados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_estados, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 110, -1));

        btn_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_authorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 20, 20));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 90, -1));

        btn_categorianew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categorianewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_categorianew, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 20, 20));
        getContentPane().add(in_diaspres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 90, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Estado");
        jLabel13.setName("in_anio"); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

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
           rs=s.executeQuery("call pa_addselectcategoria");
           while(rs.next())
            { 
            this.combo_categoria.addItem(rs.getString(1));
            
            }
 //        combo_box Autor
            
           rs=s.executeQuery("call pa_addselectauthort");
           while(rs.next())
            { 
            combo_author.addItem(rs.getString(1));
            }       
//       Combo_box editorial
                  
           rs=s.executeQuery("call pa_addselectedit");
           while(rs.next())
            { 
            this.combo_editorial.addItem(rs.getString(1));
           
            }  
 //        combo_box estados
   
           rs=s.executeQuery("call pa_addselectestadost");
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
         int diaspres=Integer.parseInt(in_diaspres.getText());
        try{
          con=conexion_mysql.getConnection();
          s= con.createStatement();
          
          //          encontrando el id de la tabla categora 	pa_addselectcatego
          int id_categoria=0;
          //	pa_addselectcatego
          rs=s.executeQuery("call pa_addselectcatego('"+(combo_categoria.getSelectedItem().toString())+"')");
          while(rs.next())
            { 
            id_categoria=rs.getInt(1);
            }
          System.out.print(id_categoria);
     //     encontrando el id de la tabla autor 
//          String pivote=combo_author.getSelectedItem().toString();
//          int valor=pivote.indexOf(" "); 
//          String nombre=pivote.substring(0,valor); 
          int id_autor=0;  //encontrando el id de la tabla autor 
  
          rs=s.executeQuery("call pa_addselectauthor('"+(combo_author.getSelectedItem().toString())+"')");
          while(rs.next())
            { 
            id_autor=rs.getInt(1);
            }
         System.out.print(id_autor);
         int id_editorial=0;//encontrando el id de la editorial 
          rs=s.executeQuery("call pa_addselecteditorial('"+(combo_editorial.getSelectedItem().toString())+"')");
          while(rs.next())
            { 
            id_editorial=rs.getInt(1);
            }
          System.out.print( id_editorial);
         int id_estado=0;  // encontrando el id del estado 
          rs=s.executeQuery("call pa_addselectestados('"+(combo_estados.getSelectedItem().toString())+"')");
          while(rs.next())
            { 
            id_estado=rs.getInt(1);
            } 
            System.out.print( id_estado);
   // Ahora haremos el insert principal
        if(in_cod.getText().matches("[A-Z]{2}+[/-]{1}+[0-9]{2}+[/-]{1}+[0-9]{1}")) {
        
         pst=con.prepareStatement("call pa_addglobal('"+(in_desc.getText())+"','"+(in_name.getText())+"',"+(Integer.parseInt(in_cantidad.getText()))+","+(id_categoria)+","+(id_autor)+",'"+(in_edicion.getText())+"',"+(id_editorial)+","+(Integer.parseInt(in_anio.getText()))+",'"+(in_cod.getText())+"','"+(in_observacion.getText())+"',"+(id_estado)+",'"+(diaspres)+"')");      
      
//      String query="'"+(in_desc.getText())+"','"+(in_name.getText())+"',"+(Integer.parseInt(in_cantidad.getText()))+","+(id_categoria)+","+(id_autor)+",'"+(in_edicion.getText())+"',"+(id_editorial)+","+(Integer.parseInt(in_anio.getText()))+",'"+(in_cod.getText())+"','"+(in_observacion.getText())+"',"+(id_estado)+"";
//      System.out.print(""+query);
        pst.executeUpdate();
        con.close();
        open =new crud_libros();
        open.setVisible(true);
        this.setVisible(false); 

        }else {
         JOptionPane.showMessageDialog(null, "El campo codigo esta mal, digitar de la siguiente manera ej: IM-01-1 donde IM es el tipo de estante,01 el número de estante y 1 es el nivel.");
        
        }
        }
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(null,("Error"+ex.toString()));
        }
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_authorActionPerformed
    JFrame frame2 = new JFrame("Nuevo Autor");
    try{
    
    String name = JOptionPane.showInputDialog(frame2,"Ingrese un nombre y un apellido del autor a registrar");
    if(name==null){
    frame2.dispose();
    }else{ 
        //call pa_addinsertautor('"+(categoria)+"')
        con=conexion_mysql.getConnection();   
        pst=con.prepareStatement("call pa_addinsertautor('"+(name)+"')");
       
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
        //call pa_addinserteditorial('"+(name)+"')
        con=conexion_mysql.getConnection();   
        pst=con.prepareStatement("call pa_addinserteditorial('"+(edit)+"')");
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
        pst=con.prepareStatement("call pa_addinsertestado('"+(state)+"')");
        pst.executeUpdate();
        con.close();
        combo_estados.addItem(state);
       
        }
    }
    catch (Exception ex){
      JOptionPane.showMessageDialog(null,("error"+ex));
    }
    }//GEN-LAST:event_btn_estadoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
      crud_libros librosform =new crud_libros();
      librosform.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void in_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_cantidadKeyTyped
        char num=evt.getKeyChar();
        if(num<'0' || num>'9')
        evt.consume();
    }//GEN-LAST:event_in_cantidadKeyTyped

    private void in_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_nameKeyTyped
//     char palabra=evt.getKeyChar();
//    
//     while(contpal>=0){
//     
//      if(palabra<'A'|| palabra>'Z')
//      {
//          contpal++;
//          
//          evt.consume();
//        
//      }
//    
//      contpal=0;
//     }
 
    }//GEN-LAST:event_in_nameKeyTyped

    private void in_anioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_anioKeyTyped
        char num=evt.getKeyChar();
        if(num<'0' || num>'9')
        
        evt.consume();
        
       
    }//GEN-LAST:event_in_anioKeyTyped

    private void btn_categorianewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categorianewActionPerformed
            JFrame frame = new JFrame("Nuevo Autor");
    try{
    
    String categoria = JOptionPane.showInputDialog(frame,"Ingrese una nueva categoria");
    if(categoria==null){
    frame.dispose();
    }else{ 
        //call pa_addinsertautor('"+(categoria)+"')
        con=conexion_mysql.getConnection();   
        pst=con.prepareStatement("call pa_addinsertcatego('"+(categoria)+"')");
       
        pst.executeUpdate();
        con.close();
        combo_categoria.addItem(categoria);
        }
    }
    catch (Exception ex){
      JOptionPane.showMessageDialog(null,("error"+ex));
    }
   
    }//GEN-LAST:event_btn_categorianewActionPerformed
   
    
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
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox combo_author;
    private javax.swing.JComboBox combo_categoria;
    private javax.swing.JComboBox combo_editorial;
    private javax.swing.JComboBox combo_estados;
    private javax.swing.JTextField in_anio;
    private javax.swing.JTextField in_cantidad;
    private javax.swing.JTextField in_cod;
    private javax.swing.JTextField in_desc;
    private javax.swing.JTextField in_diaspres;
    private javax.swing.JTextField in_edicion;
    private javax.swing.JTextField in_name;
    private javax.swing.JTextField in_observacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
