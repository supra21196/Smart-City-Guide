/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.java.TouristAdminWorkArea;

import Main.java.Data.ParkingRequest;
import Main.java.Database.Database;
import Main.java.Roles.User;
import Userinterface.java.StudentAdminWorkArea.*;
import com.db4o.ObjectSet;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sukhadapradhan
 */
public class ViewParkingRequestsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUniversities
     */
    public ViewParkingRequestsPanel() {
        initComponents();
        ObjectSet<ParkingRequest> housing = Database.db.get(ParkingRequest.class);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(ParkingRequest c :housing){
            String pend = "Pending";
            if(c.isResolved())
            {
                pend = "Resolved";
            }
            model.addRow(new Object[]{c.getName(),c.getEmail(),c.getNumber(),c.getImage(),pend});
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        acceptButton = new GUIComponents.RoundedPanel();
        acceptButton1 = new javax.swing.JLabel();
        declineButton = new GUIComponents.RoundedPanel();
        declineButton1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText(" Manage Parking");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 210, 40));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 280, 10));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 280, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email ID", "Contact Number", "Image", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 140, 770, 260));

        acceptButton.setBackground(new java.awt.Color(51, 204, 255));
        acceptButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptButtonMouseClicked(evt);
            }
        });

        acceptButton1.setBackground(new java.awt.Color(0, 0, 0));
        acceptButton1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        acceptButton1.setForeground(new java.awt.Color(255, 255, 255));
        acceptButton1.setText("Accept");
        acceptButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout acceptButtonLayout = new javax.swing.GroupLayout(acceptButton);
        acceptButton.setLayout(acceptButtonLayout);
        acceptButtonLayout.setHorizontalGroup(
            acceptButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceptButtonLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(acceptButton1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        acceptButtonLayout.setVerticalGroup(
            acceptButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceptButtonLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(acceptButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(acceptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 140, 60));

        declineButton.setBackground(new java.awt.Color(51, 204, 255));
        declineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                declineButtonMouseClicked(evt);
            }
        });

        declineButton1.setBackground(new java.awt.Color(0, 0, 0));
        declineButton1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        declineButton1.setForeground(new java.awt.Color(255, 255, 255));
        declineButton1.setText("Decline");
        declineButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                declineButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout declineButtonLayout = new javax.swing.GroupLayout(declineButton);
        declineButton.setLayout(declineButtonLayout);
        declineButtonLayout.setHorizontalGroup(
            declineButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(declineButtonLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(declineButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        declineButtonLayout.setVerticalGroup(
            declineButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(declineButtonLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(declineButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(declineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void acceptButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptButton1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String em= (String)jTable1.getValueAt(row,column);
        User u  = new User(em,null,null);
        ParkingRequest hr = new ParkingRequest(em,null,null,null);
        ObjectSet<User> user = Database.db.get(u);
        ObjectSet<ParkingRequest> request = Database.db.get(hr);
        if(user.hasNext() && request.hasNext())
        {
            u = user.next();
            hr=request.next();
            if(!hr.isResolved())
            {
                u.setParkingPermission(true);
                hr.setResolved(true);
                Database.db.store(u);
                Database.db.store(hr);
                model.setValueAt("Resolved",row,4);
            }
        }
    }//GEN-LAST:event_acceptButton1MouseClicked

    private void acceptButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptButtonMouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String em= (String)jTable1.getValueAt(row,column);
        User u  = new User(em,null,null);
        ParkingRequest hr = new ParkingRequest(em,null,null,null);
        ObjectSet<User> user = Database.db.get(u);
        ObjectSet<ParkingRequest> request = Database.db.get(hr);
        if(user.hasNext() && request.hasNext())
        {
            u = user.next();
            hr=request.next();
            if(!hr.isResolved())
            {
                u.setParkingPermission(true);
                hr.setResolved(true);
                Database.db.store(u);
                Database.db.store(hr);
                model.setValueAt("Resolved",row,4);
            }
        }
    }//GEN-LAST:event_acceptButtonMouseClicked

    private void declineButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineButton1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String em= (String)jTable1.getValueAt(row,column);
        User u  = new User(em,null,null);
        ParkingRequest hr = new ParkingRequest(em,null,null,null);
        ObjectSet<User> user = Database.db.get(u);
        ObjectSet<ParkingRequest> request = Database.db.get(hr);
        if(user.hasNext() && request.hasNext())
        {
            u = user.next();
            hr=request.next();
            if(!hr.isResolved())
            {
                u.setParkingPermission(false);
                Database.db.store(u);
                Database.db.delete(hr);
                model.setValueAt("Declined",row,4);
            }
        }
    }//GEN-LAST:event_declineButton1MouseClicked

    private void declineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineButtonMouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String em= (String)jTable1.getValueAt(row,column);
        User u  = new User(em,null,null);
        ParkingRequest hr = new ParkingRequest(em,null,null,null);
        ObjectSet<User> user = Database.db.get(u);
        ObjectSet<ParkingRequest> request = Database.db.get(hr);
        if(user.hasNext() && request.hasNext())
        {
            u = user.next();
            hr=request.next();
            if(!hr.isResolved())
            {
                u.setParkingPermission(false);
                Database.db.store(u);
                Database.db.delete(hr);
                model.setValueAt("Declined",row,4);
            }
        }
    }//GEN-LAST:event_declineButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUIComponents.RoundedPanel acceptButton;
    private javax.swing.JLabel acceptButton1;
    private GUIComponents.RoundedPanel declineButton;
    private javax.swing.JLabel declineButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
