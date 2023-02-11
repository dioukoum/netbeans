/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import Dao.RecensementDao;
import classe.Recensement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class FrameRecensement extends javax.swing.JFrame {

    /**
     * Creates new form FrameRecensement
     */
    public FrameRecensement() {
        initComponents();
        listeRecensement();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_datenaiss = new javax.swing.JTextField();
        txt_lieunaiss = new javax.swing.JTextField();
        txt_region = new javax.swing.JTextField();
        txt_sexe = new javax.swing.JTextField();
        txt_domicile = new javax.swing.JTextField();
        txt_profession = new javax.swing.JTextField();
        txt_nom_pere = new javax.swing.JTextField();
        txt_date_enregistrement = new javax.swing.JTextField();
        btnEnregistrer = new javax.swing.JButton();
        btnmodifier = new javax.swing.JButton();
        btnsupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_table = new javax.swing.JTable();
        btnsvider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Recensement");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nom:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Prénom:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Date de naissance:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Lieu de naissance:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Région:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Domicile:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Sexe:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Profession:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Nom père:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Date d'enregistrement:");

        btnEnregistrer.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnEnregistrer.setText("Enregistrer");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        btnmodifier.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnmodifier.setText("Modifier");
        btnmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifierActionPerformed(evt);
            }
        });

        btnsupprimer.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnsupprimer.setText("Supprimer");
        btnsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupprimerActionPerformed(evt);
            }
        });

        txt_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Nom", "Prenom", "Date Naissance", "Lieu", "Region", "Sexe", "Domicile", "Profession", "Pere", "date Enregistre"
            }
        ));
        txt_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txt_table);

        btnsvider.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnsvider.setText("Vider");
        btnsvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsviderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nom_pere, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_datenaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lieunaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_region, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_domicile, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_profession, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_date_enregistrement, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEnregistrer)
                .addGap(18, 18, 18)
                .addComponent(btnmodifier)
                .addGap(18, 18, 18)
                .addComponent(btnsupprimer)
                .addGap(18, 18, 18)
                .addComponent(btnsvider)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel11))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_datenaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_lieunaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_region, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_domicile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_profession, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_nom_pere, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_date_enregistrement, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnregistrer)
                    .addComponent(btnmodifier)
                    .addComponent(btnsupprimer)
                    .addComponent(btnsvider))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        // TODO add your handling code here:
        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String sexe = txt_sexe.getText();
        String lieu = txt_lieunaiss.getText();
        String datenaiss = txt_datenaiss.getText();
        String nom_pere = txt_nom_pere.getText();
        String domicile = txt_domicile.getText();
        String profession = txt_profession.getText();
        String region = txt_region.getText();
        String dateEnregistrement = txt_date_enregistrement.getText();
        Recensement rc = new Recensement(prenom, nom, datenaiss, lieu, region, sexe, domicile, profession, nom_pere, dateEnregistrement);
        RecensementDao edao = new RecensementDao();
        edao.enregistrer(rc);
        listeRecensement();
        vider();
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void btnmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifierActionPerformed
        // TODO add your handling code here:
        int index = txt_table.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Selectionner un etudiant");
        } else {
            int id = (int) txt_table.getValueAt(index, 0);
            String nom = txt_nom.getText();
            String prenom = txt_prenom.getText();
            String sexe = txt_sexe.getText();
            String lieu = txt_lieunaiss.getText();
            String datenaiss = txt_datenaiss.getText();
            String nom_pere = txt_nom_pere.getText();
            String domicile = txt_domicile.getText();
            String profession = txt_profession.getText();
            String region = txt_region.getText();
            String dateEnregistrement = txt_date_enregistrement.getText();
            Recensement rc = new Recensement(prenom, nom, datenaiss, lieu, region, sexe, domicile, profession, nom_pere, dateEnregistrement);
            RecensementDao edao = new RecensementDao();
            edao.modifier(rc, id);
            listeRecensement();
            vider();
        }
    }//GEN-LAST:event_btnmodifierActionPerformed

    private void btnsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupprimerActionPerformed
        // TODO add your handling code here:
        int index = txt_table.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Selectionner un etudiant");
        } else {
            int id = (int) txt_table.getValueAt(index, 0);
            RecensementDao edao = new RecensementDao();
            edao.supprimer(id);
            listeRecensement();
            vider();
        }
    }//GEN-LAST:event_btnsupprimerActionPerformed

    private void txt_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tableMouseClicked
        // TODO add your handling code here:
        int index = txt_table.getSelectedRow();
        if (index != -1) {
            RecensementDao edao = new RecensementDao();
            int id =  (int) txt_table.getValueAt(index, 0);
            Recensement ex = edao.recherche(id);
            txt_nom.setText(ex.getNom());
            txt_prenom.setText(ex.getPrenom());
            txt_sexe.setText(ex.getSexe());
            txt_datenaiss.setText(ex.getDatedenaissance());
            txt_lieunaiss.setText(ex.getLieudenaissance());
            txt_nom_pere.setText(ex.getNomdupere());
            txt_profession.setText(ex.getProfession());
            txt_domicile.setText(ex.getDomicile());
            txt_region.setText(ex.getRegion());
            txt_date_enregistrement.setText(ex.getDateenregistrement());
        }
    }//GEN-LAST:event_txt_tableMouseClicked

    private void btnsviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsviderActionPerformed
        // TODO add your handling code here:
        vider();
    }//GEN-LAST:event_btnsviderActionPerformed
    private void vider(){
        txt_nom.setText("");
            txt_prenom.setText("");
            txt_sexe.setText("");
            txt_datenaiss.setText("");
            txt_lieunaiss.setText("");
            txt_nom_pere.setText("");
            txt_profession.setText("");
            txt_domicile.setText("");
            txt_region.setText("");
            txt_date_enregistrement.setText("");
    }
    private void listeRecensement() {
        RecensementDao edao = new RecensementDao();
        List<Recensement> le = edao.liste();
        DefaultTableModel model = (DefaultTableModel) txt_table.getModel();
        for (Recensement ex : le) {
            model.addRow(new Object[]{
                ex.getId(),
                ex.getNom(),
                ex.getPrenom(),
                ex.getDatedenaissance(),
                ex.getLieudenaissance(),
                ex.getRegion(),
                ex.getSexe(),
                ex.getDomicile(),
                ex.getProfession(),
                ex.getNomdupere(),
                ex.getDateenregistrement()
            });
        }
        txt_table.setModel(model);

    }

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
            java.util.logging.Logger.getLogger(FrameRecensement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRecensement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRecensement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRecensement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRecensement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnmodifier;
    private javax.swing.JButton btnsupprimer;
    private javax.swing.JButton btnsvider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_date_enregistrement;
    private javax.swing.JTextField txt_datenaiss;
    private javax.swing.JTextField txt_domicile;
    private javax.swing.JTextField txt_lieunaiss;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_nom_pere;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_profession;
    private javax.swing.JTextField txt_region;
    private javax.swing.JTextField txt_sexe;
    private javax.swing.JTable txt_table;
    // End of variables declaration//GEN-END:variables
}