/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import java.sql.DriverManager;

/**
 *
 * @author admin
 */
public class Agent extends javax.swing.JFrame {

    /**
     * Creates new form Entreprise
     */
    Connection con =null ;
    Statement  stt=null;
    PreparedStatement add =null , st=null;
    ResultSet res=null;     

    public Agent() {
        initComponents();
        SelectedMed();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextIDAg = new javax.swing.JTextField();
        jTextAgeAg = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jCombAg = new javax.swing.JComboBox<>();
        jTextTelAg = new javax.swing.JTextField();
        jBtnModifierAg = new javax.swing.JButton();
        jBtnAjouterAg = new javax.swing.JButton();
        jBtnSupprimerAg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgent = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPasswordAg = new javax.swing.JPasswordField();
        jBtnAnnulerAg = new javax.swing.JButton();
        jTextNomAg1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 169, 53));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 169, 53));
        jLabel5.setText("ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 94, 72, 29));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(55, 169, 53));
        jLabel6.setText("Gender");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 177, 115, 29));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(55, 169, 53));
        jLabel7.setText("Nom");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 135, 115, 29));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(55, 169, 53));
        jLabel8.setText("Age");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 177, 115, 29));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(55, 169, 53));
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 142, 115, 29));

        jTextIDAg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextIDAg.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(55, 169, 53), null));
        jTextIDAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDAgActionPerformed(evt);
            }
        });
        jPanel2.add(jTextIDAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 94, 216, 29));

        jTextAgeAg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextAgeAg.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(55, 169, 53), null));
        jPanel2.add(jTextAgeAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 177, 216, 29));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(55, 169, 53));
        jLabel12.setText("Tel");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 94, 115, 29));

        jCombAg.setBackground(new java.awt.Color(55, 169, 53));
        jCombAg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCombAg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));
        jCombAg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 169, 53)));
        jPanel2.add(jCombAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 178, 222, 29));

        jTextTelAg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextTelAg.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(55, 169, 53), null));
        jPanel2.add(jTextTelAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 87, 218, 29));

        jBtnModifierAg.setBackground(new java.awt.Color(55, 169, 53));
        jBtnModifierAg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnModifierAg.setForeground(new java.awt.Color(255, 255, 255));
        jBtnModifierAg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/ModifierAgent.png"))); // NOI18N
        jBtnModifierAg.setText("Modifier");
        jBtnModifierAg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnModifierAgMouseClicked(evt);
            }
        });
        jBtnModifierAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModifierAgActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnModifierAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 256, 161, 55));

        jBtnAjouterAg.setBackground(new java.awt.Color(55, 169, 53));
        jBtnAjouterAg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnAjouterAg.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAjouterAg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/AjouterAgent.png"))); // NOI18N
        jBtnAjouterAg.setText("Ajouter");
        jBtnAjouterAg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAjouterAgMouseClicked(evt);
            }
        });
        jBtnAjouterAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAjouterAgActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnAjouterAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 256, 145, 55));

        jBtnSupprimerAg.setBackground(new java.awt.Color(55, 169, 53));
        jBtnSupprimerAg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnSupprimerAg.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSupprimerAg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/supprimer.png"))); // NOI18N
        jBtnSupprimerAg.setText("Supprimer");
        jBtnSupprimerAg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnSupprimerAgMouseClicked(evt);
            }
        });
        jBtnSupprimerAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSupprimerAgActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnSupprimerAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 256, -1, 55));

        jTableAgent.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 0), null));
        jTableAgent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTableAgent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Age", "Tel", "Mot de passe", "Gendre"
            }
        ));
        jTableAgent.setRowHeight(25);
        jTableAgent.setSelectionBackground(new java.awt.Color(51, 255, 51));
        jTableAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAgentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAgent);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 384, 766, 146));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(55, 169, 53));
        jLabel10.setText("LISTE D'AGENTS");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 331, -1, 35));

        jPasswordAg.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(55, 169, 53), null));
        jPanel2.add(jPasswordAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 135, 222, 33));

        jBtnAnnulerAg.setBackground(new java.awt.Color(55, 169, 53));
        jBtnAnnulerAg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnAnnulerAg.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAnnulerAg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/vider.png"))); // NOI18N
        jBtnAnnulerAg.setText("Vider");
        jBtnAnnulerAg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAnnulerAgMouseClicked(evt);
            }
        });
        jBtnAnnulerAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnnulerAgActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnAnnulerAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 256, 149, 55));

        jTextNomAg1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextNomAg1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(55, 169, 53), null));
        jPanel2.add(jTextNomAg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 135, 216, 29));

        jPanel3.setBackground(new java.awt.Color(55, 169, 53));

        jLabel4.setBackground(new java.awt.Color(55, 169, 53));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/Vent.png"))); // NOI18N
        jLabel4.setText("GESTION D'AGENTS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(55, 169, 53));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanel5.setBackground(new java.awt.Color(55, 169, 53));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 800, 140));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 0, 816, 650));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/MedicamentLogo.png"))); // NOI18N
        jLabel1.setText("Medicament");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 210, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/enterepriseLogo.png"))); // NOI18N
        jLabel2.setText("Entreprise");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 190, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/VenteLogo.png"))); // NOI18N
        jLabel3.setText("Vente");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 168, -1));

        jPanel6.setBackground(new java.awt.Color(55, 169, 53));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/k.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 0, 300, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void SelectedMed(){
          try{
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
              stt =con.createStatement();
              res = stt.executeQuery("Select * from agent");
              jTableAgent.setModel(DbUtils.resultSetToTableModel(res));
          
          }catch(SQLException e){
              e.printStackTrace();
          
          }
    }
    private void jTextIDAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDAgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDAgActionPerformed

    private void jBtnModifierAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModifierAgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnModifierAgActionPerformed

    private void jBtnAjouterAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAjouterAgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAjouterAgActionPerformed

    private void jBtnSupprimerAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSupprimerAgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSupprimerAgActionPerformed

    private void jBtnAnnulerAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnnulerAgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAnnulerAgActionPerformed

    private void jBtnAjouterAgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAjouterAgMouseClicked
        try{
            
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
           add = con.prepareStatement("INSERT INTO agent  VALUES(?,?,?,?,?,?)");

            add.setInt(1, Integer.parseInt(jTextIDAg.getText()));
            add.setString(2,jTextNomAg1.getText());
            add.setInt(3, Integer.parseInt(jTextAgeAg.getText()));
            add.setInt(4, Integer.parseInt(jTextTelAg.getText()));
            add.setString(5,jPasswordAg.getText());
            add.setString(6,jCombAg.getSelectedItem().toString());
            
            
         int rowsAffected = add.executeUpdate();
             if (rowsAffected > 0) {
                 JOptionPane.showMessageDialog(this, "Agent ajouté avec succès");
              } else {
                  JOptionPane.showMessageDialog(this, "Échec de l'ajout d'agent");
               }
             
             con.close();
             SelectedMed();
            
            
        //JOptionPane.showMessageDialog(this, "Médicament ajouté avec succès");
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout du agent : " + e.getMessage());

    }
    
    }//GEN-LAST:event_jBtnAjouterAgMouseClicked

    private void jBtnAnnulerAgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAnnulerAgMouseClicked
        jTextIDAg.setText("");
        jTextNomAg1.setText("");
        jTextAgeAg.setText("");
        jTextTelAg.setText("");
        jPasswordAg.setText("");
        
    }//GEN-LAST:event_jBtnAnnulerAgMouseClicked

    private void jBtnSupprimerAgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSupprimerAgMouseClicked
       if(jTextIDAg.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this, " Entrer (ID) d'agent supprimer");
          }else{
          
          try{
              
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
              String id = jTextIDAg.getText();
              String sql = "DELETE FROM agent WHERE IdAgent="+id;
              Statement add = con.createStatement();
              add.executeUpdate(sql);
              JOptionPane.showMessageDialog(this, "Agent Supprimer avec succès");
              SelectedMed();
              con.close();
              
          }catch(SQLException e){
                 e.printStackTrace();
          }
          
        }
    }//GEN-LAST:event_jBtnSupprimerAgMouseClicked

    private void jTableAgentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAgentMouseClicked
         TableModel model = jTableAgent.getModel();
        int i = jTableAgent.getSelectedRow();
        if (i != -1 ){
        jTextIDAg.setText(model.getValueAt(i, 0).toString());
        jTextNomAg1.setText(model.getValueAt(i,1).toString());
        jTextAgeAg.setText(model.getValueAt(i,2).toString());
        jTextTelAg.setText(model.getValueAt(i,3).toString());
        jPasswordAg.setText(model.getValueAt(i,4).toString());
        jCombAg.setSelectedItem(model.getValueAt(i, 5).toString());
        }
    }//GEN-LAST:event_jTableAgentMouseClicked

    private void jBtnModifierAgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnModifierAgMouseClicked
             if(jTextIDAg.getText().isEmpty() || jTextNomAg1.getText().isEmpty() || jTextTelAg.getText().isEmpty() || jTextAgeAg.getText().isEmpty() || jPasswordAg.getText().isEmpty()){
            
            
            JOptionPane.showMessageDialog(this, "Demblir les champs ");
        
        }else{
            try {
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");

    String sql =  "UPDATE agent SET NomAg=?, AgeAgent=?, TelAgent=?,PwdAgent=?, GenderAgent=? WHERE IdAgent= ? ";

    st = con.prepareStatement(sql);
    st.setString(1, jTextNomAg1.getText());
    st.setInt(2, Integer.parseInt(jTextAgeAg.getText()));
    st.setInt(3, Integer.parseInt(jTextTelAg.getText()));
    st.setString(4, jPasswordAg.getText());
    st.setString(5, jCombAg.getSelectedItem().toString());
    st.setInt(6, Integer.parseInt(jTextIDAg.getText()));

    int rowsUpdated = st.executeUpdate();

    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(this, " Agent mis à jour avec succès");
    } else {
        JOptionPane.showMessageDialog(this, "Impossible de mettre à jour l'agent");
    }
    con.close();
     
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Erreur lors de la mise à jour du agent");
}
        SelectedMed();
        }
        
    }//GEN-LAST:event_jBtnModifierAgMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       new Entereprise().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new Midcine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         new Vente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAjouterAg;
    private javax.swing.JButton jBtnAnnulerAg;
    private javax.swing.JButton jBtnModifierAg;
    private javax.swing.JButton jBtnSupprimerAg;
    private javax.swing.JComboBox<String> jCombAg;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordAg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAgent;
    private javax.swing.JTextField jTextAgeAg;
    private javax.swing.JTextField jTextIDAg;
    private javax.swing.JTextField jTextNomAg1;
    private javax.swing.JTextField jTextTelAg;
    // End of variables declaration//GEN-END:variables
}
