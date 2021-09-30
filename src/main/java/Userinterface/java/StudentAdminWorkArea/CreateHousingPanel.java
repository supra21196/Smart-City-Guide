/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.java.StudentAdminWorkArea;

import Main.java.Data.House;
import Main.java.Database.Database;
import com.db4o.ObjectSet;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author sukhadapradhan
 */
public class CreateHousingPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUniversities
     */
    public CreateHousingPanel() {
        initComponents();
        House u = new House(Database.city,null,0,null,null);
        ObjectSet<House> libraries = Database.db.get(u);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(House c :libraries){
            model.addRow(new Object[]{c.getCategory(),c.getPrice(),c.getImage(),c.getAddress()});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        CatTxtFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PriceTxtFld = new javax.swing.JTextField();
        createButton = new GUIComponents.RoundedPanel();
        createButton1 = new javax.swing.JLabel();
        editbutton = new GUIComponents.RoundedPanel();
        editButton1 = new javax.swing.JLabel();
        deleteButton = new GUIComponents.RoundedPanel();
        deletebutton1 = new javax.swing.JLabel();
        imageView = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        demoButton = new GUIComponents.RoundedPanel();
        demobutton1 = new javax.swing.JLabel();
        longField = new javax.swing.JTextField();
        latField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        imageName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AddressTxtFld = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1500, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Manage Housing");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 200, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Price", "Image Path", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 140, 510, 170));

        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Category");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        CatTxtFld.setForeground(new java.awt.Color(0, 102, 204));
        CatTxtFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 204)));
        CatTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatTxtFldActionPerformed(evt);
            }
        });
        jPanel1.add(CatTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 190, -1));

        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Image");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, 20));

        PriceTxtFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 204)));
        PriceTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTxtFldActionPerformed(evt);
            }
        });
        jPanel1.add(PriceTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 190, 20));

        createButton.setBackground(new java.awt.Color(51, 204, 255));
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createButtonMouseClicked(evt);
            }
        });

        createButton1.setBackground(new java.awt.Color(0, 0, 0));
        createButton1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        createButton1.setForeground(new java.awt.Color(255, 255, 255));
        createButton1.setText("Create");
        createButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout createButtonLayout = new javax.swing.GroupLayout(createButton);
        createButton.setLayout(createButtonLayout);
        createButtonLayout.setHorizontalGroup(
            createButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createButtonLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(createButton1)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        createButtonLayout.setVerticalGroup(
            createButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(createButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 140, 50));

        editbutton.setBackground(new java.awt.Color(51, 204, 255));
        editbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbuttonMouseClicked(evt);
            }
        });

        editButton1.setBackground(new java.awt.Color(0, 0, 0));
        editButton1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        editButton1.setForeground(new java.awt.Color(255, 255, 255));
        editButton1.setText("Edit");
        editButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout editbuttonLayout = new javax.swing.GroupLayout(editbutton);
        editbutton.setLayout(editbuttonLayout);
        editbuttonLayout.setHorizontalGroup(
            editbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editbuttonLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(editButton1)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        editbuttonLayout.setVerticalGroup(
            editbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editbuttonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(editButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(editbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, 50));

        deleteButton.setBackground(new java.awt.Color(51, 204, 255));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        deletebutton1.setBackground(new java.awt.Color(0, 0, 0));
        deletebutton1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        deletebutton1.setForeground(new java.awt.Color(255, 255, 255));
        deletebutton1.setText("Delete");
        deletebutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebutton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout deleteButtonLayout = new javax.swing.GroupLayout(deleteButton);
        deleteButton.setLayout(deleteButtonLayout);
        deleteButtonLayout.setHorizontalGroup(
            deleteButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteButtonLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(deletebutton1)
                .addGap(43, 43, 43))
        );
        deleteButtonLayout.setVerticalGroup(
            deleteButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(deletebutton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, -1, 50));
        jPanel1.add(imageView, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 340, 270));

        error.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 240, -1));

        demoButton.setBackground(new java.awt.Color(51, 204, 255));
        demoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                demoButtonMouseClicked(evt);
            }
        });

        demobutton1.setBackground(new java.awt.Color(0, 0, 0));
        demobutton1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        demobutton1.setForeground(new java.awt.Color(255, 255, 255));
        demobutton1.setText("Demo");
        demobutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                demobutton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout demoButtonLayout = new javax.swing.GroupLayout(demoButton);
        demoButton.setLayout(demoButtonLayout);
        demoButtonLayout.setHorizontalGroup(
            demoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, demoButtonLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(demobutton1)
                .addGap(46, 46, 46))
        );
        demoButtonLayout.setVerticalGroup(
            demoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demoButtonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(demobutton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(demoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 143, -1, 60));

        longField.setForeground(new java.awt.Color(0, 102, 204));
        longField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 204)));
        jPanel1.add(longField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 190, -1));

        latField.setForeground(new java.awt.Color(0, 102, 204));
        latField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 204)));
        jPanel1.add(latField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 190, -1));

        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Latitude");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 60, -1));

        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Longitude");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        upload.setBackground(new java.awt.Color(255, 255, 255));
        upload.setForeground(new java.awt.Color(0, 102, 204));
        upload.setText("Upload");
        upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadMouseClicked(evt);
            }
        });
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        jPanel1.add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Price");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, 20));
        jPanel1.add(imageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 40, 20));

        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Address");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        AddressTxtFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 204)));
        AddressTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTxtFldActionPerformed(evt);
            }
        });
        jPanel1.add(AddressTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 190, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 1330));
    }// </editor-fold>//GEN-END:initComponents

    private void createButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButton1MouseClicked
        String use = CatTxtFld.getText();
        String em = PriceTxtFld.getText();
        String img = imageName.getText();
        String adr = AddressTxtFld.getText();
        if(use.isEmpty() || em.isEmpty() || img.isEmpty() || adr.isEmpty())
        {
            error.setText("Fields are empty");
            return;
        }
        String longitude = longField.getText();
        String lat = latField.getText();
        double lon = 0;
        double l = 0;
        try
        {
            lon = Double.parseDouble(longitude);
            l = Double.parseDouble(lat);
        }
        catch (Exception e)
        {
            error.setText("Longitude and latitude are invalid");
            return;
        }
        House u = new House(Database.city,use,0,null,null);
        ObjectSet<House> libraries = Database.db.get(u);
        if(!libraries.isEmpty())
        {
            error.setText("House already created");
            return;
        }
        double price=0;
        try{
            price = Double.parseDouble(em);
        }
        catch (Exception e)
        {
            error.setText("Invalid Price");
            return;
        }
        if(price<=0)
        {
            error.setText("Invalid Price");
            return;
        }
        
        House sa= new House(Database.city,use,price,adr,img);
        sa.setLatitude(l);
        sa.setLongitude(lon);

        Database.db.set(sa);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{sa.getCategory(),sa.getPrice(),sa.getImage(),sa.getAddress()});
        CatTxtFld.setText("");
        PriceTxtFld.setText("");
        imageName.setText("");
        AddressTxtFld.setText("");
        longField.setText("");
        latField.setText("");
        error.setText("");
        
    }//GEN-LAST:event_createButton1MouseClicked

    private void createButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMouseClicked
        String use = CatTxtFld.getText();
        String em = PriceTxtFld.getText();
        String img = imageName.getText();
        String adr = AddressTxtFld.getText();
        if(use.isEmpty() || em.isEmpty() || img.isEmpty()||adr.isEmpty())
        {
            error.setText("Fields are empty");
            return;
        }
        String longitude = longField.getText();
        String lat = latField.getText();
        double lon = 0;
        double l = 0;
        try
        {
            lon = Double.parseDouble(longitude);
            l = Double.parseDouble(lat);
        }
        catch (Exception e)
        {
            error.setText("Longitude and latitude are invalid");
            return;
        }
        House u = new House(Database.city,use,0,null,null);
        ObjectSet<House> libraries = Database.db.get(u);
        if(!libraries.isEmpty())
        {
            error.setText("House already created");
            return;
        }
        double price=0;
        try{
            price = Double.parseDouble(em);
        }
        catch (Exception e)
        {
            error.setText("Invalid Price");
            return;
        }
        if(price<=0)
        {
            error.setText("Invalid Price");
            return;
        }
        House sa= new House(Database.city,use,price,adr,img);
        sa.setLatitude(l);
        sa.setLongitude(lon);

        Database.db.set(sa);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{sa.getCategory(),sa.getPrice(),sa.getAddress(),sa.getImage()});
        CatTxtFld.setText("");
        PriceTxtFld.setText("");
        imageName.setText("");
        AddressTxtFld.setText("");
        longField.setText("");
        latField.setText("");
        error.setText("");
    }//GEN-LAST:event_createButtonMouseClicked

    private void editButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButton1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        House c  = new House(Database.city,em,0,null,null);
        ObjectSet<House> result= Database.db.get(c);
        if(result.hasNext())
        {
            c = result.next();
            if(!CatTxtFld.getText().isEmpty() && !PriceTxtFld.getText().isEmpty() && !AddressTxtFld.getText().isEmpty())
            {
                double price=0;
                try{
                    price = Double.parseDouble(PriceTxtFld.getText());
                }
                catch (Exception e)
                {
                    error.setText("Invalid Price");
                    return;
                }
                if(price<=0)
                {
                    error.setText("Invalid Price");
                    return;
                }
                c.setCategory(CatTxtFld.getText());
                c.setPrice(price);
                c.setAddress(AddressTxtFld.getText());
                Database.db.store(c);
                ((DefaultTableModel)jTable1.getModel()).setValueAt(c.getCategory(),row,0);
                ((DefaultTableModel)jTable1.getModel()).setValueAt(c.getPrice(),row,1);
                ((DefaultTableModel)jTable1.getModel()).setValueAt(c.getAddress(),row,3);
                CatTxtFld.setText("");
                PriceTxtFld.setText("");
                AddressTxtFld.setText("");
            }
        }
    }//GEN-LAST:event_editButton1MouseClicked

    private void editbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonMouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        House c  = new House(Database.city,em,0,null,null);
        ObjectSet<House> result= Database.db.get(c);
        if(result.hasNext())
        {
            c = result.next();
            if(!CatTxtFld.getText().isEmpty() && !PriceTxtFld.getText().isEmpty()&& !AddressTxtFld.getText().isEmpty())
            {
                double price=0;
                try{
                    price = Double.parseDouble(PriceTxtFld.getText());
                }
                catch (Exception e)
                {
                    error.setText("Invalid Price");
                    return;
                }
                if(price<=0)
                {
                    error.setText("Invalid Price");
                    return;
                }
                c.setCategory(CatTxtFld.getText());
                c.setPrice(price);
                c.setAddress(AddressTxtFld.getText());
                Database.db.store(c);
                ((DefaultTableModel)jTable1.getModel()).setValueAt(c.getCategory(),row,0);
                ((DefaultTableModel)jTable1.getModel()).setValueAt(c.getPrice(),row,1);
                ((DefaultTableModel)jTable1.getModel()).setValueAt(c.getAddress(),row,3);
                CatTxtFld.setText("");
                PriceTxtFld.setText("");
                AddressTxtFld.setText("");
            }
        }
    }//GEN-LAST:event_editbuttonMouseClicked

    private void deletebutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebutton1MouseClicked
        int row = jTable1.getSelectedRow();
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        House c  = new House(Database.city,em,0,null,null);
        ObjectSet<House> result= Database.db.get(c);
        if(result.hasNext())
        {
            c = result.next();
            Database.db.delete(c);
        }
        ((DefaultTableModel)jTable1.getModel()).removeRow(row);
        ImageIcon imgThisImg = new ImageIcon(em);
        imageView.setIcon(null);
        CatTxtFld.setText("");
        PriceTxtFld.setText("");
        AddressTxtFld.setText("");
    }//GEN-LAST:event_deletebutton1MouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        int row = jTable1.getSelectedRow();
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        House c  = new House(Database.city,em,0,null,null);
        ObjectSet<House> result= Database.db.get(c);
        if(result.hasNext())
        {
            c = result.next();
            Database.db.delete(c);
        }
        ((DefaultTableModel)jTable1.getModel()).removeRow(row);
        ImageIcon imgThisImg = new ImageIcon(em);
        imageView.setIcon(null);
        CatTxtFld.setText("");
        PriceTxtFld.setText("");
        AddressTxtFld.setText("");
        
        
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void demobutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demobutton1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        House c  = new House(Database.city,em,0,null,null);
        ObjectSet<House> result= Database.db.get(c);
        if(result.hasNext()) {
            c = result.next();

        }
        else
        {
            return;
        }
        System.out.println(c.getLatitude()+"  "+c.getLongitude());
        final String setMarkerScript =
                "var myLatlng = new google.maps.LatLng("+c.getLatitude()+","+c.getLongitude()+");\n" +
                        "var marker = new google.maps.Marker({\n" +
                        "    position: myLatlng,\n" +
                        "    map: map,\n" +
                        "    title: 'Hello World!'\n" +
                        "});" +
                        "map.setZoom(10);\n" +
                        "map.panTo(marker.position);";
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("6P830J66YB8PPPG6S0ECTNSXFKRYM7697J8DJ5XQB2TBY68DAES9LOAOCUJ70GWEMY7L").build();
        Engine engine = Engine.newInstance(options);
        Browser browser = engine.newBrowser();
        System.out.println("Inside demo click");
        SwingUtilities.invokeLater(() -> {
            BrowserView view = BrowserView.newInstance(browser);

            JFrame frame = new JFrame("Google Maps");
            frame.add(view, BorderLayout.CENTER);
            frame.setSize(800, 500);
            System.out.println("Showing Map");
            frame.setVisible(true);

            browser.navigation().loadUrl("/Users/sukhadapradhan/Smart City Full Project/map.html");
        });
        Timer t = new Timer();
        final int[] count = {0};
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("settingmarker");
                browser.mainFrame().ifPresent(frame2 -> frame2.executeJavaScript(setMarkerScript));
                if(count[0] >=2)
                {
                    t.cancel();
                }
                count[0]++;
            }
        };
        t.schedule(task,5000L,5000L);
    }//GEN-LAST:event_demobutton1MouseClicked

    private void demoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demoButtonMouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        House c  = new House(Database.city,em,0,null,null);
        ObjectSet<House> result= Database.db.get(c);
        if(result.hasNext()) {
            c = result.next();

        }
        else
        {
            return;
        }
        System.out.println(c.getLatitude()+"  "+c.getLongitude());
        final String setMarkerScript =
                "var myLatlng = new google.maps.LatLng("+c.getLatitude()+","+c.getLongitude()+");\n" +
                        "var marker = new google.maps.Marker({\n" +
                        "    position: myLatlng,\n" +
                        "    map: map,\n" +
                        "    title: 'Hello World!'\n" +
                        "});" +
                        "map.setZoom(10);\n" +
                        "map.panTo(marker.position);";
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("6P830J66YB8PPPG6S0ECTNSXFKRYM7697J8DJ5XQB2TBY68DAES9LOAOCUJ70GWEMY7L").build();
        Engine engine = Engine.newInstance(options);
        Browser browser = engine.newBrowser();
        System.out.println("Inside demo click");
        SwingUtilities.invokeLater(() -> {
            BrowserView view = BrowserView.newInstance(browser);

            JFrame frame = new JFrame("Google Maps");
            frame.add(view, BorderLayout.CENTER);
            frame.setSize(800, 500);
            System.out.println("Showing Map");
            frame.setVisible(true);

            browser.navigation().loadUrl("/Users/sukhadapradhan/Smart City Full Project/map.html");
        });

        Timer t = new Timer();
        final int[] count = {0};
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("settingmarker");
                browser.mainFrame().ifPresent(frame2 -> frame2.executeJavaScript(setMarkerScript));
                if(count[0] >=2)
                {
                    t.cancel();
                }
                count[0]++;
            }
        };
        t.schedule(task,5000L,5000L);
    }//GEN-LAST:event_demoButtonMouseClicked

    private void CatTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatTxtFldActionPerformed

    private void PriceTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTxtFldActionPerformed

    private void uploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileFilter imageFilter = new FileNameExtensionFilter(
            "Image files", ImageIO.getReaderFileSuffixes());
        fileChooser.setFileFilter(imageFilter);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imageName.setText(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_uploadMouseClicked

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
                int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 2;
        String em= (String)jTable1.getValueAt(row,column);
        ImageIcon imgThisImg = new ImageIcon(em);
        imageView.setIcon(imgThisImg);
        
       
        if(row>=0)
        {
            CatTxtFld.setText(jTable1.getValueAt(row,0).toString());
            PriceTxtFld.setText(jTable1.getValueAt(row,1).toString());
            AddressTxtFld.setText(jTable1.getValueAt(row,3).toString());
        }
        else
        {
            CatTxtFld.setText("");
            PriceTxtFld.setText("");
            AddressTxtFld.setText("");
        }    
    }//GEN-LAST:event_jTable1MouseClicked

    private void AddressTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTxtFldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTxtFld;
    private javax.swing.JTextField CatTxtFld;
    private javax.swing.JTextField PriceTxtFld;
    private GUIComponents.RoundedPanel createButton;
    private javax.swing.JLabel createButton1;
    private GUIComponents.RoundedPanel deleteButton;
    private javax.swing.JLabel deletebutton1;
    private GUIComponents.RoundedPanel demoButton;
    private javax.swing.JLabel demobutton1;
    private javax.swing.JLabel editButton1;
    private GUIComponents.RoundedPanel editbutton;
    private javax.swing.JLabel error;
    private javax.swing.JLabel imageName;
    private javax.swing.JLabel imageView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField latField;
    private javax.swing.JTextField longField;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}