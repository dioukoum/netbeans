/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class PanelStudent extends javax.swing.JPanel {

    /**
     * Creates new form PanelStudent
     */
    public PanelStudent() {
        initComponents();
        connexion();
        afficherTable();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    private void connexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/gl3dbtest","root","");
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        classe = new javax.swing.JTextField();
        telephone = new javax.swing.JFormattedTextField();
        btnEnregistrer = new javax.swing.JButton();
        btnNettoyer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        maTable = new javax.swing.JTable();
        id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSupprimer = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion student"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel1.setText("Nom");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 39, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel2.setText("Prenom");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 39, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel3.setText("Classe");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 112, -1, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel4.setText("Telephone");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 112, -1, -1));

        nom.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        nom.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 26, 250, 50));

        prenom.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        prenom.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        prenom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 26, 250, 50));

        classe.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        classe.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        classe.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(classe, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 99, 250, 40));

        telephone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        telephone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 100, 250, 40));

        btnEnregistrer.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnEnregistrer.setText("Enregistrer");
        btnEnregistrer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });
        add(btnEnregistrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        btnNettoyer.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnNettoyer.setText("Nettoyer");
        btnNettoyer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNettoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNettoyerActionPerformed(evt);
            }
        });
        add(btnNettoyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        btnModifier.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });
        add(btnModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        maTable.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        maTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idE", "Nom", "Prenom", "Classe", "Telephone"
            }
        ));
        maTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maTable.setRowHeight(25);
        maTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                maTableMouseReleased(evt);
            }
        });
        maTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                maTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(maTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 260, 950, 276));

        id.setFocusable(false);
        id.setMaximumSize(new java.awt.Dimension(0, 0));
        id.setMinimumSize(new java.awt.Dimension(0, 0));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 100, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib/index3.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 180, 180));

        btnSupprimer.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });
        add(btnSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        connexion();
        try 
        {
            String query= "INSERT INTO student(nom,prenom,classe,telephone) VALUES(?,?,?,?)";
            pst= con.prepareStatement(query);
            pst.setString(1, nom.getText().toUpperCase());
            pst.setString(2, prenom.getText());
            pst.setString(3, classe.getText().toUpperCase());
            pst.setString(4, telephone.getText());
            
            pst.executeUpdate();
            pst.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Etudiant Ajouté avec success!");
            vider();
            afficherTable();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void maTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maTableKeyReleased
        
    }//GEN-LAST:event_maTableKeyReleased

    private void maTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maTableMouseReleased
        connexion();
        int select= maTable.getSelectedRow();
        try 
        {
            id.setText(maTable.getValueAt(select, 0).toString());
            nom.setText(maTable.getValueAt(select, 1).toString().toUpperCase());
            prenom.setText(maTable.getValueAt(select, 2).toString());
            classe.setText(maTable.getValueAt(select, 3).toString());
            telephone.setText(maTable.getValueAt(select, 4).toString());
            
            con.close();
            afficherTable();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_maTableMouseReleased

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        connexion();
        try {
            String query= "UPDATE student SET nom=?,prenom=?,classe=?,telephone=? WHERE idE=?";
            pst=con.prepareStatement(query);
            pst.setString(1, nom.getText());
            pst.setString(2, prenom.getText());
            pst.setString(3, classe.getText());
            pst.setString(4, telephone.getText());
            pst.setString(5, id.getText());
            
            pst.executeUpdate();
            pst.close();
            con.close();
            afficherTable();
            JOptionPane.showMessageDialog(null,"Modification effectuée avec succès!");
            vider();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void btnNettoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNettoyerActionPerformed
        vider();
    }//GEN-LAST:event_btnNettoyerActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        connexion();
        try {
            String query= "DELETE FROM student WHERE idE=?";
            pst= con.prepareStatement(query);
            pst.setString(1, id.getText());
            pst.executeUpdate();
            pst.close();
            con.close();
            afficherTable();
            JOptionPane.showMessageDialog(null,"Etudiant avec succees!");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void vider()
    {
        nom.setText("");
        prenom.setText("");
        classe.setText("");
        telephone.setText("");
    }
    private void afficherTable()
    {
        connexion();
        String colonnes[]={"Identifiant","Nom","Prenom","Classe","Telephone"};
        DefaultTableModel model= new DefaultTableModel(null,colonnes);
        try 
        {
            String query= "SELECT * FROM student";
            Statement st= con.createStatement();
            rs= st.executeQuery(query);
            while(rs.next())
            {
                String donnee[]={
                    rs.getString("idE"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("classe"),
                    rs.getString("telephone")
                };
                model.addRow(donnee);
            }
            maTable.setModel(model);
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnNettoyer;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JTextField classe;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable maTable;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JFormattedTextField telephone;
    // End of variables declaration//GEN-END:variables
}