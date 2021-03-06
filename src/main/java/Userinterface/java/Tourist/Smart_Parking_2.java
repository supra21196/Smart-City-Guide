/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.java.Tourist;

import Main.java.Data.Parking;
import Main.java.Database.Database;
import Userinterface.java.Student.*;
import com.db4o.ObjectSet;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.view.swing.BrowserView;

import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sukhadapradhan
 */
public class Smart_Parking_2 extends javax.swing.JPanel {

    /**
     * Creates new form Smart_Banking
     */
    private JPanel MainPanel;
    public Smart_Parking_2(JPanel mp) {
        initComponents();
        MainPanel = mp;
        Parking u = new Parking(Database.city,null,0,null);
        ObjectSet<Parking> hotels = Database.db.get(u);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(Parking c :hotels){
            System.out.println(c.getName());
            model.addRow(new Object[]{c.getName(),c.getRent(),c.getAddress()});
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
        jTextField1 = new javax.swing.JTextField();
        LoginButton = new GUIComponents.RoundedPanel();
        LoginButton1 = new javax.swing.JLabel();
        LoginButton2 = new GUIComponents.RoundedPanel();
        LoginButton3 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        webButton1 = new GUIComponents.RoundedPanel();
        webbutton2 = new javax.swing.JLabel();
        demoButton = new GUIComponents.RoundedPanel();
        demobutton1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("View Parking Options");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parking Spot", "Rent/hour", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        }

        LoginButton.setBackground(new java.awt.Color(51, 204, 255));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });

        LoginButton1.setBackground(new java.awt.Color(0, 0, 0));
        LoginButton1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        LoginButton1.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton1.setText("Search");
        LoginButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginButtonLayout = new javax.swing.GroupLayout(LoginButton);
        LoginButton.setLayout(LoginButtonLayout);
        LoginButtonLayout.setHorizontalGroup(
            LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginButtonLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(LoginButton1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        LoginButtonLayout.setVerticalGroup(
            LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginButtonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LoginButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        LoginButton2.setBackground(new java.awt.Color(51, 204, 255));
        LoginButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButton2MouseClicked(evt);
            }
        });

        LoginButton3.setBackground(new java.awt.Color(51, 204, 255));
        LoginButton3.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        LoginButton3.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton3.setText("Book");
        LoginButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginButton2Layout = new javax.swing.GroupLayout(LoginButton2);
        LoginButton2.setLayout(LoginButton2Layout);
        LoginButton2Layout.setHorizontalGroup(
            LoginButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginButton2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(LoginButton3)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        LoginButton2Layout.setVerticalGroup(
            LoginButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginButton2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(LoginButton3)
                .addGap(18, 18, 18))
        );

        error.setForeground(new java.awt.Color(255, 0, 0));

        error1.setForeground(new java.awt.Color(255, 0, 0));

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
                .addGap(33, 33, 33)
                .addComponent(webbutton2)
                .addContainerGap(39, Short.MAX_VALUE))
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
                .addGap(40, 40, 40)
                .addComponent(demobutton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        demoButtonLayout.setVerticalGroup(
            demoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demoButtonLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(demobutton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(demoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(webButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(LoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(368, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(1144, Short.MAX_VALUE)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(315, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(webButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(demoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(302, Short.MAX_VALUE)
                    .addComponent(error)
                    .addContainerGap(414, Short.MAX_VALUE)))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButton1MouseClicked
        String name = jTextField1.getText();
        ((DefaultTableModel)jTable1.getModel()).setRowCount(0);
        Parking u = new Parking(Database.city,null,0,null);
        ObjectSet<Parking> universities = Database.db.get(u);
        for(Parking b:universities)
        {
            if(name.isEmpty())
            {
                ((DefaultTableModel)jTable1.getModel()).addRow(new Object[]{b.getName(),b.getRent(),b.getAddress()});
            }
            else if(b.getName().toLowerCase().contains(name.toLowerCase()))
            {
                ((DefaultTableModel)jTable1.getModel()).addRow(new Object[]{b.getName(),b.getRent(),b.getAddress()});
            }
        }
    }//GEN-LAST:event_LoginButton1MouseClicked

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        String name = jTextField1.getText();
        ((DefaultTableModel)jTable1.getModel()).setRowCount(0);
        Parking u = new Parking(Database.city,null,0,null);
        ObjectSet<Parking> universities = Database.db.get(u);
        for(Parking b:universities)
        {
            if(name.isEmpty())
            {
                ((DefaultTableModel)jTable1.getModel()).addRow(new Object[]{b.getName(),b.getRent(),b.getAddress()});
            }
            else if(b.getName().toLowerCase().contains(name.toLowerCase()))
            {
                ((DefaultTableModel)jTable1.getModel()).addRow(new Object[]{b.getName(),b.getRent(),b.getAddress()});
            }
        }
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void LoginButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButton3MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            error1.setText("Select a row");
            return;
        }
        else
        {
            Smart_Parking_3 workarea = new Smart_Parking_3(MainPanel);
            MainPanel.add(workarea);
            CardLayout layout = (CardLayout) MainPanel.getLayout();
            layout.next(MainPanel);
            workarea.setVisible(true);
        }
    }//GEN-LAST:event_LoginButton3MouseClicked

    private void LoginButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButton2MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            error1.setText("Select a row");
            return;
        }
        else
        {
            Smart_Parking_3 workarea = new Smart_Parking_3(MainPanel);
            MainPanel.add(workarea);
            CardLayout layout = (CardLayout) MainPanel.getLayout();
            layout.next(MainPanel);
            workarea.setVisible(true);
        }
    }//GEN-LAST:event_LoginButton2MouseClicked

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

    private void demobutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_demobutton1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        int column = 0;
        String em= (String)jTable1.getValueAt(row,column);
        Parking c  = new Parking(Database.city,em,0,null);
        ObjectSet<Parking> result= Database.db.get(c);
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
        Parking c  = new Parking(Database.city,em,0,null);
        ObjectSet<Parking> result= Database.db.get(c);
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
    private GUIComponents.RoundedPanel LoginButton;
    private javax.swing.JLabel LoginButton1;
    private GUIComponents.RoundedPanel LoginButton2;
    private javax.swing.JLabel LoginButton3;
    private GUIComponents.RoundedPanel demoButton;
    private javax.swing.JLabel demobutton1;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private GUIComponents.RoundedPanel webButton1;
    private javax.swing.JLabel webbutton2;
    // End of variables declaration//GEN-END:variables
}
