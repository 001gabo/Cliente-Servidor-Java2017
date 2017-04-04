/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hugo
 */
public class Jplista_libros extends javax.swing.JPanel {
    List<List<String>> lista_libros = new ArrayList<List<String>>();
    List<String> datos = new ArrayList<String>();
    List<List<JLabel>> lista_labels = new ArrayList<List<JLabel>>();
    List<JLabel> labels = new ArrayList<JLabel>();
    List<JPanel> panels = new ArrayList<JPanel>();
    JFPrestar vetanaFPrestar;
    /**
     * Creates new form Jplista_libros
     */
    public Jplista_libros() {
        initComponents();
    }
    public Jplista_libros( List<List<String>> milista_libros, int numero){
        initComponents();
        set_labels();
        set_panels();
        this.jLabel11.setText(this.jLabel11.getText() + numero);
        JLabel ltemporal;
        lista_libros = milista_libros;
        for(int x = 0; x < lista_libros.size(); x++)
        {
            labels = lista_labels.get(x);
            datos = milista_libros.get(x);
            ltemporal = labels.get(0);
            ltemporal.setText(String.valueOf((x + 1)));
            ltemporal = labels.get(1);
            ltemporal.setText(datos.get(1));
            ltemporal = labels.get(2);
            ltemporal.setText(datos.get(2));
            ltemporal = labels.get(3);
            ltemporal.setText(datos.get(3));
        }
        if(lista_libros.size() < 5)
        {
            limpiar_labels(lista_libros.size());
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JPanelcuadro1 = new javax.swing.JPanel();
        JLInd1 = new javax.swing.JLabel();
        JPSeleccionar1 = new javax.swing.JPanel();
        JLSeleccionar1 = new javax.swing.JLabel();
        JLNombre1 = new javax.swing.JLabel();
        JLAutor1 = new javax.swing.JLabel();
        JLN1 = new javax.swing.JLabel();
        JLA1 = new javax.swing.JLabel();
        JLE1 = new javax.swing.JLabel();
        JLEditorial1 = new javax.swing.JLabel();
        JPanelcuadro2 = new javax.swing.JPanel();
        JLInd2 = new javax.swing.JLabel();
        JPSeleccionar2 = new javax.swing.JPanel();
        JLSeleccionar2 = new javax.swing.JLabel();
        JLNombre2 = new javax.swing.JLabel();
        JLAutor2 = new javax.swing.JLabel();
        JLN2 = new javax.swing.JLabel();
        JLA2 = new javax.swing.JLabel();
        JLE2 = new javax.swing.JLabel();
        JLEditorial2 = new javax.swing.JLabel();
        JPanelcuadro3 = new javax.swing.JPanel();
        JLInd3 = new javax.swing.JLabel();
        JPSeleccionar3 = new javax.swing.JPanel();
        JLSeleccionar3 = new javax.swing.JLabel();
        JLNombre3 = new javax.swing.JLabel();
        JLAutor3 = new javax.swing.JLabel();
        JLN3 = new javax.swing.JLabel();
        JLA3 = new javax.swing.JLabel();
        JLE3 = new javax.swing.JLabel();
        JLEditorial3 = new javax.swing.JLabel();
        JPanelcuadro4 = new javax.swing.JPanel();
        JLInd4 = new javax.swing.JLabel();
        JPSeleccionar4 = new javax.swing.JPanel();
        JLSeleccionar4 = new javax.swing.JLabel();
        JLNombre4 = new javax.swing.JLabel();
        JLAutor4 = new javax.swing.JLabel();
        JLN4 = new javax.swing.JLabel();
        JLA4 = new javax.swing.JLabel();
        JLE4 = new javax.swing.JLabel();
        JLEditorial4 = new javax.swing.JLabel();
        JPanelcuadro5 = new javax.swing.JPanel();
        JLInd5 = new javax.swing.JLabel();
        JPSeleccionar5 = new javax.swing.JPanel();
        JLSeleccionar5 = new javax.swing.JLabel();
        JLNombre5 = new javax.swing.JLabel();
        JLAutor5 = new javax.swing.JLabel();
        JLN5 = new javax.swing.JLabel();
        JLA5 = new javax.swing.JLabel();
        JLE5 = new javax.swing.JLabel();
        JLEditorial5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Búsqueda");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Número de coincidencias: ");

        JPanelcuadro1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        JLInd1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLInd1.setText("1");

        JPSeleccionar1.setBackground(new java.awt.Color(153, 255, 153));
        JPSeleccionar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        JPSeleccionar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPSeleccionar1MouseReleased(evt);
            }
        });

        JLSeleccionar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLSeleccionar1.setText("Seleccionar");
        JPSeleccionar1.add(JLSeleccionar1);

        JLNombre1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLNombre1.setText("nombre");

        JLAutor1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLAutor1.setText("autor");

        JLN1.setText("Nombre:");

        JLA1.setText("Autor:");

        JLE1.setText("Editorial:");

        JLEditorial1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLEditorial1.setText("autor");

        javax.swing.GroupLayout JPanelcuadro1Layout = new javax.swing.GroupLayout(JPanelcuadro1);
        JPanelcuadro1.setLayout(JPanelcuadro1Layout);
        JPanelcuadro1Layout.setHorizontalGroup(
            JPanelcuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelcuadro1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLInd1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelcuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLN1)
                    .addComponent(JLA1)
                    .addComponent(JLE1))
                .addGap(27, 27, 27)
                .addGroup(JPanelcuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelcuadro1Layout.createSequentialGroup()
                        .addComponent(JLEditorial1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanelcuadro1Layout.createSequentialGroup()
                        .addGroup(JPanelcuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNombre1)
                            .addComponent(JLAutor1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPSeleccionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        JPanelcuadro1Layout.setVerticalGroup(
            JPanelcuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelcuadro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelcuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPSeleccionar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelcuadro1Layout.createSequentialGroup()
                        .addGroup(JPanelcuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLInd1)
                            .addComponent(JLNombre1)
                            .addComponent(JLN1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelcuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLAutor1)
                            .addComponent(JLA1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelcuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLE1)
                    .addComponent(JLEditorial1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanelcuadro2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        JLInd2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLInd2.setText("1");

        JPSeleccionar2.setBackground(new java.awt.Color(153, 255, 153));
        JPSeleccionar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        JPSeleccionar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPSeleccionar2MouseReleased(evt);
            }
        });

        JLSeleccionar2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLSeleccionar2.setText("Seleccionar");
        JPSeleccionar2.add(JLSeleccionar2);

        JLNombre2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLNombre2.setText("nombre");

        JLAutor2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLAutor2.setText("autor");

        JLN2.setText("Nombre:");

        JLA2.setText("Autor:");

        JLE2.setText("Editorial:");

        JLEditorial2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLEditorial2.setText("autor");

        javax.swing.GroupLayout JPanelcuadro2Layout = new javax.swing.GroupLayout(JPanelcuadro2);
        JPanelcuadro2.setLayout(JPanelcuadro2Layout);
        JPanelcuadro2Layout.setHorizontalGroup(
            JPanelcuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelcuadro2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLInd2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelcuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLN2)
                    .addComponent(JLA2)
                    .addComponent(JLE2))
                .addGap(27, 27, 27)
                .addGroup(JPanelcuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelcuadro2Layout.createSequentialGroup()
                        .addComponent(JLEditorial2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanelcuadro2Layout.createSequentialGroup()
                        .addGroup(JPanelcuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNombre2)
                            .addComponent(JLAutor2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPSeleccionar2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        JPanelcuadro2Layout.setVerticalGroup(
            JPanelcuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelcuadro2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelcuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPSeleccionar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelcuadro2Layout.createSequentialGroup()
                        .addGroup(JPanelcuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLInd2)
                            .addComponent(JLNombre2)
                            .addComponent(JLN2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelcuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLAutor2)
                            .addComponent(JLA2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelcuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLE2)
                    .addComponent(JLEditorial2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanelcuadro3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        JLInd3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLInd3.setText("1");

        JPSeleccionar3.setBackground(new java.awt.Color(153, 255, 153));
        JPSeleccionar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        JPSeleccionar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPSeleccionar3MouseReleased(evt);
            }
        });

        JLSeleccionar3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLSeleccionar3.setText("Seleccionar");
        JPSeleccionar3.add(JLSeleccionar3);

        JLNombre3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLNombre3.setText("nombre");

        JLAutor3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLAutor3.setText("autor");

        JLN3.setText("Nombre:");

        JLA3.setText("Autor:");

        JLE3.setText("Editorial:");

        JLEditorial3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLEditorial3.setText("autor");

        javax.swing.GroupLayout JPanelcuadro3Layout = new javax.swing.GroupLayout(JPanelcuadro3);
        JPanelcuadro3.setLayout(JPanelcuadro3Layout);
        JPanelcuadro3Layout.setHorizontalGroup(
            JPanelcuadro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelcuadro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLInd3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelcuadro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLN3)
                    .addComponent(JLA3)
                    .addComponent(JLE3))
                .addGap(27, 27, 27)
                .addGroup(JPanelcuadro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelcuadro3Layout.createSequentialGroup()
                        .addComponent(JLEditorial3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanelcuadro3Layout.createSequentialGroup()
                        .addGroup(JPanelcuadro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNombre3)
                            .addComponent(JLAutor3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPSeleccionar3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        JPanelcuadro3Layout.setVerticalGroup(
            JPanelcuadro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelcuadro3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelcuadro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPSeleccionar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelcuadro3Layout.createSequentialGroup()
                        .addGroup(JPanelcuadro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLInd3)
                            .addComponent(JLNombre3)
                            .addComponent(JLN3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelcuadro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLAutor3)
                            .addComponent(JLA3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelcuadro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLE3)
                    .addComponent(JLEditorial3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanelcuadro4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        JLInd4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLInd4.setText("1");

        JPSeleccionar4.setBackground(new java.awt.Color(153, 255, 153));
        JPSeleccionar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        JPSeleccionar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPSeleccionar4MouseReleased(evt);
            }
        });

        JLSeleccionar4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLSeleccionar4.setText("Seleccionar");
        JPSeleccionar4.add(JLSeleccionar4);

        JLNombre4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLNombre4.setText("nombre");

        JLAutor4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLAutor4.setText("autor");

        JLN4.setText("Nombre:");

        JLA4.setText("Autor:");

        JLE4.setText("Editorial:");

        JLEditorial4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLEditorial4.setText("autor");

        javax.swing.GroupLayout JPanelcuadro4Layout = new javax.swing.GroupLayout(JPanelcuadro4);
        JPanelcuadro4.setLayout(JPanelcuadro4Layout);
        JPanelcuadro4Layout.setHorizontalGroup(
            JPanelcuadro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelcuadro4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLInd4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelcuadro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLN4)
                    .addComponent(JLA4)
                    .addComponent(JLE4))
                .addGap(27, 27, 27)
                .addGroup(JPanelcuadro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelcuadro4Layout.createSequentialGroup()
                        .addComponent(JLEditorial4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanelcuadro4Layout.createSequentialGroup()
                        .addGroup(JPanelcuadro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNombre4)
                            .addComponent(JLAutor4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                        .addComponent(JPSeleccionar4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        JPanelcuadro4Layout.setVerticalGroup(
            JPanelcuadro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelcuadro4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelcuadro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPSeleccionar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelcuadro4Layout.createSequentialGroup()
                        .addGroup(JPanelcuadro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLInd4)
                            .addComponent(JLNombre4)
                            .addComponent(JLN4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelcuadro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLAutor4)
                            .addComponent(JLA4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelcuadro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLE4)
                    .addComponent(JLEditorial4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanelcuadro5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        JLInd5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLInd5.setText("1");

        JPSeleccionar5.setBackground(new java.awt.Color(153, 255, 153));
        JPSeleccionar5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        JPSeleccionar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JPSeleccionar5MouseReleased(evt);
            }
        });

        JLSeleccionar5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLSeleccionar5.setText("Seleccionar");
        JPSeleccionar5.add(JLSeleccionar5);

        JLNombre5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLNombre5.setText("nombre");

        JLAutor5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLAutor5.setText("autor");

        JLN5.setText("Nombre:");

        JLA5.setText("Autor:");

        JLE5.setText("Editorial:");

        JLEditorial5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLEditorial5.setText("autor");

        javax.swing.GroupLayout JPanelcuadro5Layout = new javax.swing.GroupLayout(JPanelcuadro5);
        JPanelcuadro5.setLayout(JPanelcuadro5Layout);
        JPanelcuadro5Layout.setHorizontalGroup(
            JPanelcuadro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelcuadro5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLInd5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelcuadro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLN5)
                    .addComponent(JLA5)
                    .addComponent(JLE5))
                .addGap(27, 27, 27)
                .addGroup(JPanelcuadro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelcuadro5Layout.createSequentialGroup()
                        .addComponent(JLEditorial5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanelcuadro5Layout.createSequentialGroup()
                        .addGroup(JPanelcuadro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNombre5)
                            .addComponent(JLAutor5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPSeleccionar5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        JPanelcuadro5Layout.setVerticalGroup(
            JPanelcuadro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelcuadro5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelcuadro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPSeleccionar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelcuadro5Layout.createSequentialGroup()
                        .addGroup(JPanelcuadro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLInd5)
                            .addComponent(JLNombre5)
                            .addComponent(JLN5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelcuadro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLAutor5)
                            .addComponent(JLA5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelcuadro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLE5)
                    .addComponent(JLEditorial5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addContainerGap(327, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JPanelcuadro4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JPanelcuadro3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JPanelcuadro2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JPanelcuadro1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JPanelcuadro5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelcuadro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPanelcuadro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPanelcuadro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPanelcuadro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPanelcuadro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JPSeleccionar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPSeleccionar1MouseReleased
        seleccionar_libro(1);
    }//GEN-LAST:event_JPSeleccionar1MouseReleased

    private void JPSeleccionar2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPSeleccionar2MouseReleased
        seleccionar_libro(2);
    }//GEN-LAST:event_JPSeleccionar2MouseReleased

    private void JPSeleccionar3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPSeleccionar3MouseReleased
        seleccionar_libro(3);
    }//GEN-LAST:event_JPSeleccionar3MouseReleased

    private void JPSeleccionar4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPSeleccionar4MouseReleased
        seleccionar_libro(4);
    }//GEN-LAST:event_JPSeleccionar4MouseReleased

    private void JPSeleccionar5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPSeleccionar5MouseReleased
        seleccionar_libro(5);
    }//GEN-LAST:event_JPSeleccionar5MouseReleased
    private void seleccionar_libro(int numero)
    {
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLA1;
    private javax.swing.JLabel JLA2;
    private javax.swing.JLabel JLA3;
    private javax.swing.JLabel JLA4;
    private javax.swing.JLabel JLA5;
    private javax.swing.JLabel JLAutor1;
    private javax.swing.JLabel JLAutor2;
    private javax.swing.JLabel JLAutor3;
    private javax.swing.JLabel JLAutor4;
    private javax.swing.JLabel JLAutor5;
    private javax.swing.JLabel JLE1;
    private javax.swing.JLabel JLE2;
    private javax.swing.JLabel JLE3;
    private javax.swing.JLabel JLE4;
    private javax.swing.JLabel JLE5;
    private javax.swing.JLabel JLEditorial1;
    private javax.swing.JLabel JLEditorial2;
    private javax.swing.JLabel JLEditorial3;
    private javax.swing.JLabel JLEditorial4;
    private javax.swing.JLabel JLEditorial5;
    private javax.swing.JLabel JLInd1;
    private javax.swing.JLabel JLInd2;
    private javax.swing.JLabel JLInd3;
    private javax.swing.JLabel JLInd4;
    private javax.swing.JLabel JLInd5;
    private javax.swing.JLabel JLN1;
    private javax.swing.JLabel JLN2;
    private javax.swing.JLabel JLN3;
    private javax.swing.JLabel JLN4;
    private javax.swing.JLabel JLN5;
    private javax.swing.JLabel JLNombre1;
    private javax.swing.JLabel JLNombre2;
    private javax.swing.JLabel JLNombre3;
    private javax.swing.JLabel JLNombre4;
    private javax.swing.JLabel JLNombre5;
    private javax.swing.JLabel JLSeleccionar1;
    private javax.swing.JLabel JLSeleccionar2;
    private javax.swing.JLabel JLSeleccionar3;
    private javax.swing.JLabel JLSeleccionar4;
    private javax.swing.JLabel JLSeleccionar5;
    private javax.swing.JPanel JPSeleccionar1;
    private javax.swing.JPanel JPSeleccionar2;
    private javax.swing.JPanel JPSeleccionar3;
    private javax.swing.JPanel JPSeleccionar4;
    private javax.swing.JPanel JPSeleccionar5;
    private javax.swing.JPanel JPanelcuadro1;
    private javax.swing.JPanel JPanelcuadro2;
    private javax.swing.JPanel JPanelcuadro3;
    private javax.swing.JPanel JPanelcuadro4;
    private javax.swing.JPanel JPanelcuadro5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    // End of variables declaration//GEN-END:variables
    private void limpiar_labels(int num_libros)
    {
        for(int x = 4; x >= num_libros; x--)
        {
            panels.get(x).setVisible(false);
        }
    }
    private void set_labels()
    {
        labels.add(JLInd1);
        labels.add(JLNombre1);
        labels.add(JLAutor1);
        labels.add(JLEditorial1);
        lista_labels.add(labels);
        labels = new ArrayList<JLabel>();
        labels.add(JLInd2);
        labels.add(JLNombre2);
        labels.add(JLAutor2);
        labels.add(JLEditorial2);
        lista_labels.add(labels);
        labels = new ArrayList<JLabel>();
        labels.add(JLInd3);
        labels.add(JLNombre3);
        labels.add(JLAutor3);
        labels.add(JLEditorial3);
        lista_labels.add(labels);
        labels = new ArrayList<JLabel>();
        labels.add(JLInd4);
        labels.add(JLNombre4);
        labels.add(JLAutor4);
        labels.add(JLEditorial4);
        lista_labels.add(labels);
        labels = new ArrayList<JLabel>();
        labels.add(JLInd5);
        labels.add(JLNombre5);
        labels.add(JLAutor5);
        labels.add(JLEditorial5);
        lista_labels.add(labels);
        labels = new ArrayList<JLabel>();
    }
    private void set_panels()
    {
        panels.add(this.JPanelcuadro1);
        panels.add(this.JPanelcuadro2);
        panels.add(this.JPanelcuadro3);
        panels.add(this.JPanelcuadro4);
        panels.add(this.JPanelcuadro5);
        
    }
}
