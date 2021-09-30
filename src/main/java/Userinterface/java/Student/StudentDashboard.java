/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.java.Student;

import Main.java.Database.Database;
import Main.java.Homepage.Homepage;
import Main.java.Login.Login;
import Main.java.Login.Signup;
import Main.java.Roles.User;
import Userinterface.java.Tourist.Smart_Parking_1;
import Userinterface.java.Tourist.Smart_Parking_2;
import com.db4o.ObjectSet;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/**
 *
 * @author sukhadapradhan
 */
public class StudentDashboard extends javax.swing.JPanel {

    /**
     * Creates new form StudentDashboard
     */
    private JPanel container;
    public StudentDashboard(JPanel c) {
        initComponents();
        container=c;
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
        jPanel3 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        BufferedImage iconImg = null;
        try
        {
            iconImg = ImageIO.read(new File("main_logo.png"));
        }
        catch(Exception e)
        {
            System.out.println();
        }
        ImageIcon icn = new ImageIcon(iconImg.getScaledInstance(140, 112, Image.SCALE_DEFAULT));
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DeleteAccountButton = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        banking = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        universities = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        libraries = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        housing = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        food = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jobs = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        parkings = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(940, 630));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(940, 630));
        jPanel1.setPreferredSize(new java.awt.Dimension(940, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        logout.setText("Log Out");
        logout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 50));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel3.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, 20));

        home.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home.setText("Smart City");
        home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 500));
        home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel3.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, 78));

        jLabel10.setIcon(icn);
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, -20, 120, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/sukhadapradhan/Smart City Full Project/icons8-power_off_button.png")); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 30, -1));

        DeleteAccountButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        DeleteAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteAccountButton.setText("Delete Account");
        DeleteAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteAccountButtonMouseClicked(evt);
            }
        });
        jPanel3.add(DeleteAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 80));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(1600, 1200));
        MainPanel.setLayout(new java.awt.CardLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(1600, 1200));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banking.setBackground(new java.awt.Color(0, 204, 255));
        banking.setForeground(new java.awt.Color(255, 255, 255));
        banking.setText("         Smart Banking");
        banking.setOpaque(true);
        banking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bankingMouseClicked(evt);
            }
        });
        jPanel5.add(banking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 168, 28));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/sukhadapradhan/Smart City Full Project/icons8-bank-building-80.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 157, 120));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        universities.setBackground(new java.awt.Color(0, 204, 255));
        universities.setForeground(new java.awt.Color(255, 255, 255));
        universities.setText("      Smart Universities");
        universities.setOpaque(true);
        universities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                universitiesMouseClicked(evt);
            }
        });
        jPanel6.add(universities, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 158, 28));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/sukhadapradhan/Smart City Full Project/icons8-university-80.png")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 157, 120));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        libraries.setBackground(new java.awt.Color(0, 204, 255));
        libraries.setForeground(new java.awt.Color(255, 255, 255));
        libraries.setText("       Smart Libraries");
        libraries.setOpaque(true);
        libraries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                librariesMouseClicked(evt);
            }
        });
        jPanel7.add(libraries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 146, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/sukhadapradhan/Smart City Full Project/icons8-book-shelf-80.png")); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 146, 120));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        housing.setBackground(new java.awt.Color(0, 204, 255));
        housing.setForeground(new java.awt.Color(255, 255, 255));
        housing.setText("       Smart Housing");
        housing.setOpaque(true);
        housing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                housingMouseClicked(evt);
            }
        });
        jPanel8.add(housing, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 146, 28));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/sukhadapradhan/Smart City Full Project/icons8-house-80.png")); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 146, 120));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        food.setBackground(new java.awt.Color(0, 204, 255));
        food.setForeground(new java.awt.Color(255, 255, 255));
        food.setText("    Smart Food Services");
        food.setOpaque(true);
        food.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodMouseClicked(evt);
            }
        });
        jPanel9.add(food, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 119, 168, 28));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/sukhadapradhan/Smart City Full Project/icons8-food.png")); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 157, 118));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jobs.setBackground(new java.awt.Color(0, 204, 255));
        jobs.setForeground(new java.awt.Color(255, 255, 255));
        jobs.setText("          Smart Jobs");
        jobs.setOpaque(true);
        jobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jobsMouseClicked(evt);
            }
        });
        jPanel10.add(jobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 146, 28));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/sukhadapradhan/Smart City Full Project/icons8-new-job-80.png")); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 146, 120));

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        parkings.setBackground(new java.awt.Color(0, 204, 255));
        parkings.setForeground(new java.awt.Color(255, 255, 255));
        parkings.setText("        Smart Parking");
        parkings.setOpaque(true);
        parkings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parkingsMouseClicked(evt);
            }
        });
        jPanel12.add(parkings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 146, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/sukhadapradhan/Smart City Full Project/icons8-car-80.png")); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setOpaque(true);
        jPanel12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 146, 120));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel11.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 690, 420));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Services Offered");
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        MainPanel.add(jPanel11, "card2");

        jPanel1.add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, -1, -1));
        MainPanel.getAccessibleContext().setAccessibleName("");

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void bankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankingMouseClicked
        Smart_Banking workarea = new Smart_Banking();
        MainPanel.add(workarea);
        CardLayout layout = (CardLayout) MainPanel.getLayout();
        layout.next(MainPanel);
        workarea.setVisible(true);
    }//GEN-LAST:event_bankingMouseClicked

    private void universitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_universitiesMouseClicked
        Smart_Universities workarea = new Smart_Universities();
        MainPanel.add(workarea);
        CardLayout layout = (CardLayout) MainPanel.getLayout();
        layout.next(MainPanel);
        workarea.setVisible(true);
    }//GEN-LAST:event_universitiesMouseClicked

    private void librariesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librariesMouseClicked
        Smart_Libraries workarea = new Smart_Libraries();
        MainPanel.add(workarea);
        CardLayout layout = (CardLayout) MainPanel.getLayout();
        layout.next(MainPanel);
        workarea.setVisible(true);
    }//GEN-LAST:event_librariesMouseClicked

    private void housingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_housingMouseClicked
        if(Database.loggedIn.getHousingPermission())
        {
            Smart_Housing_1 workarea = new Smart_Housing_1();
            MainPanel.add(workarea);
            CardLayout layout = (CardLayout) MainPanel.getLayout();
            layout.next(MainPanel);
            workarea.setVisible(true);
        }
        else
        {
            Smart_Housing_2 workarea = new Smart_Housing_2();
            MainPanel.add(workarea);
            CardLayout layout = (CardLayout) MainPanel.getLayout();
            layout.next(MainPanel);
            workarea.setVisible(true);
        }
    }//GEN-LAST:event_housingMouseClicked

    private void foodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodMouseClicked
        Smart_Food_Outlets workarea = new Smart_Food_Outlets();
        MainPanel.add(workarea);
        CardLayout layout = (CardLayout) MainPanel.getLayout();
        layout.next(MainPanel);
        workarea.setVisible(true);
    }//GEN-LAST:event_foodMouseClicked

    private void jobsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobsMouseClicked
        Smart_Jobs workarea = new Smart_Jobs();
        MainPanel.add(workarea);
        CardLayout layout = (CardLayout) MainPanel.getLayout();
        layout.next(MainPanel);
        workarea.setVisible(true);
    }//GEN-LAST:event_jobsMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        MainPanel.add(jPanel11);
        CardLayout layout = (CardLayout) MainPanel.getLayout();
        layout.next(MainPanel);
        jPanel11.setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login workarea = new Login(container);
        container.add(workarea);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        workarea.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void parkingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parkingsMouseClicked
        if(!Database.loggedIn.getParkingPermission())
        {
            Smart_Parking_1 workarea = new Smart_Parking_1();
            MainPanel.add(workarea);
            CardLayout layout = (CardLayout) MainPanel.getLayout();
            layout.next(MainPanel);
            workarea.setVisible(true);
        }
        else
        {
            Smart_Parking_2 workarea = new Smart_Parking_2(container);
            MainPanel.add(workarea);
            CardLayout layout = (CardLayout) MainPanel.getLayout();
            layout.next(MainPanel);
            workarea.setVisible(true);
        }
    }//GEN-LAST:event_parkingsMouseClicked

    private void DeleteAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccountButtonMouseClicked
        // TODO add your handling code here:
        Homepage workarea = new Homepage(container);
        Database.db.delete(Database.loggedIn);
        container.add(workarea);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        workarea.setVisible(true);
        System.out.println(Database.loggedIn.getEmail());
    }//GEN-LAST:event_DeleteAccountButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeleteAccountButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel banking;
    private javax.swing.JLabel food;
    private javax.swing.JLabel home;
    private javax.swing.JLabel housing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jobs;
    private javax.swing.JLabel libraries;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel parkings;
    private javax.swing.JLabel universities;
    // End of variables declaration//GEN-END:variables
}