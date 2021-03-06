/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.java.BusinessmenAdminWorkArea;

import Main.java.Login.Login;
import Userinterface.java.StudentAdminWorkArea.*;
import Userinterface.java.SystemAdminWorkArea.ManageBusinessmenAdmin;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/**
 *
 * @author sukhadapradhan
 */
public class BusinessmenAdminLeftPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentAdminLeftPanel
     */
    private JPanel container;
    public BusinessmenAdminLeftPanel(JPanel c) {
        initComponents();
        container =c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        manage_services = new javax.swing.JLabel();
        BufferedImage iconImg = null;
        try
        {
            iconImg = ImageIO.read(new File("main_logo.png"));
        }
        catch(Exception e)
        {
            System.out.println();
        }
        ImageIcon icn = new ImageIcon(iconImg.getScaledInstance(250, 200, Image.SCALE_DEFAULT));
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RightPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1600, 1200));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftPanel.setBackground(new java.awt.Color(0, 102, 204));

        logout.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        manage_services.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        manage_services.setForeground(new java.awt.Color(255, 255, 255));
        manage_services.setText("Manage Services");
        manage_services.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manage_servicesMouseClicked(evt);
            }
        });

        jLabel3.setIcon(icn);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/sukhadapradhan/Smart City Full Project/icons8-power_off_button.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/sukhadapradhan/Smart City Full Project/icons8-project_management.png")); // NOI18N

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manage_services)
                    .addComponent(logout))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LeftPanelLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(189, Short.MAX_VALUE)))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manage_services))
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(logout)))
                .addContainerGap(640, Short.MAX_VALUE))
            .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LeftPanelLayout.createSequentialGroup()
                    .addGap(227, 227, 227)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(708, Short.MAX_VALUE)))
        );

        add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        RightPanel.setBackground(new java.awt.Color(255, 255, 255));
        RightPanel.setLayout(new java.awt.CardLayout());
        add(RightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1600, 1600));
    }// </editor-fold>//GEN-END:initComponents

    private void manage_servicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_servicesMouseClicked
        ManageBusinessmenServices workarea = new ManageBusinessmenServices(RightPanel);
        RightPanel.add(workarea);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.next(RightPanel);
        workarea.setVisible(true);
    }//GEN-LAST:event_manage_servicesMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login workarea = new Login(container);
        container.add(workarea);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        workarea.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel manage_services;
    // End of variables declaration//GEN-END:variables
}
