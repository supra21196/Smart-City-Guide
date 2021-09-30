/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.java.Tourist;

import Main.java.Data.TouristSpot;
import Main.java.Database.Database;
import Userinterface.java.Student.*;
import com.db4o.ObjectSet;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.view.swing.BrowserView;

import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sukhadapradhan
 */
public class Smart_TouristSpots extends javax.swing.JPanel {

    /**
     * Creates new form Smart_Banking
     */
    public Smart_TouristSpots() {
        initComponents();
        TouristSpot u = new TouristSpot(Database.city,null,null,null);
        ObjectSet<TouristSpot> hotels = Database.db.get(u);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(TouristSpot c :hotels){
            System.out.println(c.getName());
            model.addRow(new Object[]{c.getName(),c.getImage(),c.getWebsite()});
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
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        LoginButton2 = new GUIComponents.RoundedPanel();
        LoginButton3 = new javax.swing.JLabel();
        imageView = new javax.swing.JLabel();
        webButton1 = new GUIComponents.RoundedPanel();
        webbutton2 = new javax.swing.JLabel();
        demoButton = new GUIComponents.RoundedPanel();
        demobutton1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 753));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("View Tourist Spots");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Image", "Website"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );

        LoginButton2.setBackground(new java.awt.Color(51, 204, 255));
        LoginButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButton2MouseClicked(evt);
            }
        });

        LoginButton3.setBackground(new java.awt.Color(0, 0, 0));
        LoginButton3.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        LoginButton3.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton3.setText("Search");
        LoginButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginButton2Layout = new javax.swing.GroupLayout(LoginButton2);
        LoginButton2.setLayout(LoginButton2Layout);
        LoginButton2Layout.setHorizontalGroup(
            LoginButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginButton2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(LoginButton3)
                .addGap(47, 47, 47))
        );
        LoginButton2Layout.setVerticalGroup(
            LoginButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginButton2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LoginButton3)
                .addContainerGap(21, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, webButton1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(webbutton2)
                .addGap(31, 31, 31))
        );
        webButton1Layout.setVerticalGroup(
            webButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webButton1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(webbutton2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

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
                .addGap(45, 45, 45)
                .addComponent(demobutton1)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        demoButtonLayout.setVerticalGroup(
            demoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demoButtonLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(demobutton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(imageView, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                                .addGap(98, 98, 98))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(demoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(webButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(webButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(demoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imageView, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButton3MouseClicked
        String name = jTextField1.getText();
        ((DefaultTableModel)jTable1.getModel()).setRowCount(0);
        TouristSpot u = new TouristSpot(Database.city,null,null,null);
        ObjectSet<TouristSpot> universities = Database.db.get(u);
        for(TouristSpot b:universities)
        {
            if(name.isEmpty())
            {
                ((DefaultTableModel)jTable1.getModel()).addRow(new Object[]{b.getName(),b.getImage(),b.getWebsite()});
            }
            else if(b.getName().toLowerCase().contains(name.toLowerCase()))
            {
                ((DefaultTableModel)jTable1.getModel()).addRow(new Object[]{b.getName(),b.getImage(),b.getWebsite()});
            }
        }
    }//GEN-LAST:event_LoginButton3MouseClicked

    private void LoginButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButton2MouseClicked
        String name = jTextField1.getText();
        ((DefaultTableModel)jTable1.getModel()).setRowCount(0);
        TouristSpot u = new TouristSpot(Database.city,null,null,null);
        ObjectSet<TouristSpot> universities = Database.db.get(u);
        for(TouristSpot b:universities)
        {
            if(name.isEmpty())
            {
                ((DefaultTableModel)jTable1.getModel()).addRow(new Object[]{b.getName(),b.getImage(),b.getWebsite()});
            }
            else if(b.getName().toLowerCase().contains(name.toLowerCase()))
            {
                ((DefaultTableModel)jTable1.getModel()).addRow(new Object[]{b.getName(),b.getImage(),b.getWebsite()});
            }
        }
    }//GEN-LAST:event_LoginButton2MouseClicked

    

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 1;
        String em= (String)jTable1.getValueAt(row,column);
        ImageIcon imgThisImg = new ImageIcon(em);
        imageView.setIcon(imgThisImg);
    }//GEN-LAST:event_jTable1MouseClicked

    private void webbutton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webbutton2MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 2;
        String em= (String)jTable1.getValueAt(row,column);
        if (!em.startsWith("https://")&&!em.startsWith("http://"))
        {
            em = "https://"+em;
        }
        System.out.println(em);
        try {
            Desktop.getDesktop().browse(new URL(em).toURI());

        } catch (IOException | URISyntaxException e1) {
            System.out.println(e1.getMessage());
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
            System.out.println(e1.getMessage());
        }
    }//GEN-LAST:event_webButton1MouseClicked

    private void demobutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demobutton1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        TouristSpot c  = new TouristSpot(Database.city,em,null,null);
        ObjectSet<TouristSpot> result= Database.db.get(c);
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
        TouristSpot c  = new TouristSpot(Database.city,em,null,null);
        ObjectSet<TouristSpot> result= Database.db.get(c);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUIComponents.RoundedPanel LoginButton2;
    private javax.swing.JLabel LoginButton3;
    private GUIComponents.RoundedPanel demoButton;
    private javax.swing.JLabel demobutton1;
    private javax.swing.JLabel imageView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private GUIComponents.RoundedPanel webButton1;
    private javax.swing.JLabel webbutton2;
    // End of variables declaration//GEN-END:variables
}