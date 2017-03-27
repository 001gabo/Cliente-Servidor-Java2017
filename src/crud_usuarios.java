import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author FernandoJose
 */
public class crud_usuarios extends javax.swing.JFrame {
   
    
    public crud_usuarios() {
        initComponents();
        mostrar("");
    }
    
    private void mostrar(String palabra){
   try{     
   
//   ImageIcon icono=new ImageIcon(getClass().getResource("icon/add.png"));
//   btn_add.setIcon(icono);
   DefaultTableModel modelo= new DefaultTableModel();   
   modelo.addColumn("id");
   modelo.addColumn("Rol");
   modelo.addColumn("Nombre");
   modelo.addColumn("Apellido"); 
   modelo.addColumn("Contraseña");
   modelo.addColumn("Dirección");
   modelo.addColumn("Número");
   modelo.addColumn("Email");
   jTbl_usu.setModel(modelo);
   String sql="";
  if(palabra.equals("")){ 
  sql="select id_user, us_rol, us_name, us_lastname, us_pass, us_address, us_number, us_email  from usuarios";
  
  }
  else{ 
   sql="select id_user, us_rol, us_name, us_lastname, us_pass, us_address, us_number, us_email  from usuarios where id_user  LIKE '%"+palabra+"%' or us_name LIKE '%"+palabra+"%'";
  } 
   
   String []array = new String[8];
   Connection con_usu = DriverManager.getConnection("jdbc:mysql://localhost:3307/biblioteca","root","");
   Statement st_usu = con_usu.createStatement();
   ResultSet rs_usu = st_usu.executeQuery(sql);
   rs_usu=st_usu.executeQuery(sql);
        while(rs_usu.next())
        { 
        array[0]=rs_usu.getString(1);
        array[1]=rs_usu.getString(2);
        array[2]=rs_usu.getString(3);
        array[3]=rs_usu.getString(4);
        array[4]=rs_usu.getString(5);
        array[5]=rs_usu.getString(6);
        array[6]=rs_usu.getString(7);
        array[7]=rs_usu.getString(8);
        modelo.addRow(array);
        }
        jTbl_usu.setModel(modelo);
        con_usu.close(); 
    }                                          

    catch(Exception e){
     System.out.println("error"+e);
    }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB_agregar = new javax.swing.JButton();
        jB_modificar = new javax.swing.JButton();
        jB_borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbl_usu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jB_agregar.setText("Agregar");

        jB_modificar.setText("Modificar");

        jB_borrar.setText("Borrar");

        jTbl_usu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTbl_usu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_agregar)
                        .addGap(54, 54, 54)
                        .addComponent(jB_modificar)
                        .addGap(41, 41, 41)
                        .addComponent(jB_borrar)))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_agregar)
                    .addComponent(jB_modificar)
                    .addComponent(jB_borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crud_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crud_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crud_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crud_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crud_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_agregar;
    private javax.swing.JButton jB_borrar;
    private javax.swing.JButton jB_modificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbl_usu;
    // End of variables declaration//GEN-END:variables
}
