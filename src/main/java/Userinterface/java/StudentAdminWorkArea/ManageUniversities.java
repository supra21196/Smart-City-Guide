/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.java.StudentAdminWorkArea;

import Main.java.Data.University;
import Main.java.Database.Database;
import com.db4o.ObjectSet;

import javax.naming.Name;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;

import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author sukhadapradhan
 */
public class ManageUniversities extends javax.swing.JPanel {

    /**
     * Creates new form ManageUniversities
     */
    public ManageUniversities() {
        initComponents();
        System.out.println(Database.city);
        University u = new University(Database.city,null,null);
        ObjectSet<University> universities = Database.db.get(u);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(University c :universities){
            model.addRow(new Object[]{c.getName(),c.getWebsite() });
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
        NameTxtFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        WebsiteTxtFld = new javax.swing.JTextField();
        createButton = new GUIComponents.RoundedPanel();
        createButton1 = new javax.swing.JLabel();
        editbutton = new GUIComponents.RoundedPanel();
        editButton1 = new javax.swing.JLabel();
        deleteButton = new GUIComponents.RoundedPanel();
        deletebutton1 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        demoButton = new GUIComponents.RoundedPanel();
        demobutton1 = new javax.swing.JLabel();
        webButton1 = new GUIComponents.RoundedPanel();
        webbutton2 = new javax.swing.JLabel();
        longField = new javax.swing.JTextField();
        latField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Manage Universities");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 240, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Website"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 140, 510, 170));

        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Latitude");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 50, -1));

        NameTxtFld.setForeground(new java.awt.Color(0, 102, 204));
        NameTxtFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 204)));
        jPanel1.add(NameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 190, -1));

        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Website");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, 20));

        WebsiteTxtFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 204)));
        jPanel1.add(WebsiteTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 190, 20));

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
                .addGap(41, 41, 41)
                .addComponent(createButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        createButtonLayout.setVerticalGroup(
            createButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(createButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 140, 50));

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
                .addGap(52, 52, 52)
                .addComponent(editButton1)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        editbuttonLayout.setVerticalGroup(
            editbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editbuttonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(editButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(editbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, -1, 50));

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

        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, 50));

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
            .addGroup(demoButtonLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(demobutton1)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        demoButtonLayout.setVerticalGroup(
            demoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demoButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(demobutton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(demoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 120, 50));

        webButton1.setBackground(new java.awt.Color(51, 204, 255));
        webButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webButton1MouseClicked(evt);
            }
        });

        webbutton2.setBackground(new java.awt.Color(0, 0, 0));
        webbutton2.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        webbutton2.setForeground(new java.awt.Color(255, 255, 255));
        webbutton2.setText("Visit Website");
        webbutton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webbutton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout webButton1Layout = new javax.swing.GroupLayout(webButton1);
        webButton1.setLayout(webButton1Layout);
        webButton1Layout.setHorizontalGroup(
            webButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webButton1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(webbutton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        webButton1Layout.setVerticalGroup(
            webButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webButton1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(webbutton2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(webButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 170, -1));

        longField.setForeground(new java.awt.Color(0, 102, 204));
        longField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 204)));
        jPanel1.add(longField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 190, -1));

        latField.setForeground(new java.awt.Color(0, 102, 204));
        latField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 204)));
        jPanel1.add(latField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 190, -1));

        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 50, -1));

        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Logitude");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 50, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 1600));
    }// </editor-fold>//GEN-END:initComponents

    private void editButton1MouseClicked(MouseEvent evt) {
        int row = jTable1.getSelectedRow();
        String nf = NameTxtFld.getText();
        String wf = WebsiteTxtFld.getText();
        if(nf.isEmpty() || wf.isEmpty())
        {
            return;
        }
        if(row<0)
        {
            return;
        }
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        University c  = new University(Database.city,em,null);
        ObjectSet<University> result= Database.db.get(c);
        if(result.hasNext())
        {
            c = result.next();
            c.setName(NameTxtFld.getText());
            c.setWebsite(WebsiteTxtFld.getText());
            Database.db.store(c);
            ((DefaultTableModel)jTable1.getModel()).setValueAt(c.getName(),row,0);
            ((DefaultTableModel)jTable1.getModel()).setValueAt(c.getWebsite(),row,1);
        }
        NameTxtFld.setText("");
        WebsiteTxtFld.setText("");
    }
    private void CreateFunction()
    {
        String use = NameTxtFld.getText();
        String em = WebsiteTxtFld.getText();
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
        if(use.isEmpty() || em.isEmpty())
        {
            error.setText("Fields are empty");
            return;
        }
        if(!em.matches("(http://|https://)(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?"))
        {
            
            error.setText("Invaild URL");
            return;
        }
        University u = new University(Database.city,use,null);
        ObjectSet<University> universities = Database.db.get(u);
        if(!universities.isEmpty())
        {
            error.setText("University already created");
            return;
        }
        System.out.println(Database.city);
        University sa= new University(Database.city,use,em);
        sa.setLongitude(lon);
        sa.setLatitude(l);
        Database.db.store(sa);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{sa.getName(),sa.getWebsite() });
        NameTxtFld.setText("");
        WebsiteTxtFld.setText("");
        longField.setText("");
        latField.setText("");
        error.setText("");
    }
    private void createButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButton1MouseClicked
        CreateFunction();
    }//GEN-LAST:event_createButton1MouseClicked

    private void createButtonMouseClicked(java.awt.event.MouseEvent evt) {
        CreateFunction();
    }                                        

    private void editbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonMouseClicked
        int row = jTable1.getSelectedRow();
        String nf = NameTxtFld.getText();
        String wf = WebsiteTxtFld.getText();
        if(nf.isEmpty() || wf.isEmpty())
        {
            return;
        }
        if(row<0)
        {
            return;
        }
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        University c  = new University(Database.city,em,null);
        ObjectSet<University> result= Database.db.get(c);
        if(result.hasNext())
        {
            c = result.next();
            c.setName(NameTxtFld.getText());
            c.setWebsite(WebsiteTxtFld.getText());
            Database.db.store(c);
            ((DefaultTableModel)jTable1.getModel()).setValueAt(c.getName(),row,0);
            ((DefaultTableModel)jTable1.getModel()).setValueAt(c.getWebsite(),row,1);
        }
        NameTxtFld.setText("");
        WebsiteTxtFld.setText("");
    }//GEN-LAST:event_editbuttonMouseClicked

    private void deletebutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebutton1MouseClicked
        int row = jTable1.getSelectedRow();
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        University c  = new University(Database.city,em,null);
        ObjectSet<University> result= Database.db.get(c);
        if(result.hasNext())
        {
            c = result.next();
            Database.db.delete(c);
        }
        ((DefaultTableModel)jTable1.getModel()).removeRow(row);
        NameTxtFld.setText("");
        WebsiteTxtFld.setText("");
    }//GEN-LAST:event_deletebutton1MouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        int row = jTable1.getSelectedRow();
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        University c  = new University(Database.city,em,null);
        ObjectSet<University> result= Database.db.get(c);
        if(result.hasNext())
        {
            c = result.next();
            Database.db.delete(c);
        }
        ((DefaultTableModel)jTable1.getModel()).removeRow(row);
        NameTxtFld.setText("");
        WebsiteTxtFld.setText("");
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void demobutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demobutton1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        University c  = new University(Database.city,em,null);
        ObjectSet<University> result= Database.db.get(c); //ObjectSet is created. The set contains the result of
        // the 'get()'function, i.e Objects found in database.

        //Checks the Objectlist in database. Sees if the ObjectList is empty i.e any object is the list or not. Every
        // Objectlist has an iterator
        if(result.hasNext()) {
            c = result.next(); // .next() function gets the next element in the list

        }
        else
        {
            return;
        }
        System.out.println(c.getLatitude()+"  "+c.getLongitude());

        //Integration of Google Maps starts...
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

        //timer is used to create a delay between maps initialization and setting up of the marker. Without the timer
        //the marker could get setup before maps initialization and the marker wouldn't be setup properly.
        Timer t = new Timer();
        final int[] count = {0};
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("settingmarker");
                browser.mainFrame().ifPresent(frame2 -> frame2.executeJavaScript(setMarkerScript));
                //The 'if' condition is for the timer to stop after two iterations of browser loading.
                if(count[0] >=2) //count is between 0 to 2.
                {
                    t.cancel();
                }
                count[0]++;
            }
        };
        t.schedule(task,5000L,5000L); //period: time between two iterations
    }//GEN-LAST:event_demobutton1MouseClicked

    private void demoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demoButtonMouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        University c  = new University(Database.city,em,null);
        ObjectSet<University> result= Database.db.get(c);
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
                browser.mainFrame().ifPresent(frame2 -> frame2.executeJavaScript(setMarkerScript));
                if(count[0] >=2)
                {
                    t.cancel();
                }
                count[0]++;
            }
        };
        t.schedule(task,5000L);
    }//GEN-LAST:event_demoButtonMouseClicked

    private void webbutton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webbutton2MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 1;
        String em= (String)jTable1.getValueAt(row,column);
        if (!em.startsWith("https://")&&!em.startsWith("http://"))
        {
            em = "https://"+em;
        }
        System.out.println(em);
        try {
            Desktop.getDesktop().browse(new URL(em).toURI());

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_webbutton2MouseClicked

    private void webButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webButton1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 1;
        String em= (String)jTable1.getValueAt(row,column);
        if (!em.startsWith("https://")&&!em.startsWith("http://"))
        {
            em = "https://"+em;
        }
        System.out.println(em);
        try {
            Desktop.getDesktop().browse(new URL(em).toURI());

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_webButton1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row>=0){
            NameTxtFld.setText(jTable1.getValueAt(row, 0).toString());
            WebsiteTxtFld.setText(jTable1.getValueAt(row, 1).toString());
        }
        else
        {
            NameTxtFld.setText("");
            WebsiteTxtFld.setText("");
        }
    }//GEN-LAST:event_jTable1MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameTxtFld;
    private javax.swing.JTextField WebsiteTxtFld;
    private GUIComponents.RoundedPanel createButton;
    private javax.swing.JLabel createButton1;
    private GUIComponents.RoundedPanel deleteButton;
    private javax.swing.JLabel deletebutton1;
    private GUIComponents.RoundedPanel demoButton;
    private javax.swing.JLabel demobutton1;
    private javax.swing.JLabel editButton1;
    private GUIComponents.RoundedPanel editbutton;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField latField;
    private javax.swing.JTextField longField;
    private GUIComponents.RoundedPanel webButton1;
    private javax.swing.JLabel webbutton2;
    // End of variables declaration//GEN-END:variables
}
