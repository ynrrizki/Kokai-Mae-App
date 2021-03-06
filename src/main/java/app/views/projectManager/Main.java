/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.views.projectManager;

import app.core.Database;
import app.core.Route;
import app.views.Login;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author yanu
 */
public class Main extends javax.swing.JFrame {
    
    /**
     * Creates new form PmProgress
     */
    public Main() {
        initComponents();
        route = new Route();
        _instance = Database.getInstance();
        titleRequest();
        titleReceive();
        showRequestAll("");
        showReceiveAll("");
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        sidebarPanel = new javax.swing.JPanel();
        requestBtn = new javax.swing.JButton();
        receiveBtn = new javax.swing.JButton();
        progressBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        requestPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestField = new javax.swing.JTextArea();
        deleteBtn = new javax.swing.JButton();
        sendBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        receivePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        receiveBox = new javax.swing.JComboBox<>();
        receiveUpdateBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        receiveTable = new javax.swing.JTable();
        progressPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Manager");
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setName("projectManager"); // NOI18N
        setResizable(false);

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        sidebarPanel.setBackground(new java.awt.Color(172, 217, 255));

        requestBtn.setBackground(new java.awt.Color(255, 152, 0));
        requestBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestBtn.setText("Request");
        requestBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        requestBtn.setBorderPainted(false);
        requestBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        requestBtn.setMaximumSize(new java.awt.Dimension(151, 45));
        requestBtn.setMinimumSize(new java.awt.Dimension(151, 45));
        requestBtn.setPreferredSize(new java.awt.Dimension(151, 45));
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });

        receiveBtn.setBackground(new java.awt.Color(255, 152, 0));
        receiveBtn.setForeground(new java.awt.Color(255, 255, 255));
        receiveBtn.setText("Receive");
        receiveBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        receiveBtn.setBorderPainted(false);
        receiveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        receiveBtn.setMaximumSize(new java.awt.Dimension(151, 45));
        receiveBtn.setMinimumSize(new java.awt.Dimension(151, 45));
        receiveBtn.setPreferredSize(new java.awt.Dimension(151, 45));
        receiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiveBtnActionPerformed(evt);
            }
        });

        progressBtn.setBackground(new java.awt.Color(255, 152, 0));
        progressBtn.setForeground(new java.awt.Color(255, 255, 255));
        progressBtn.setText("Progress");
        progressBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        progressBtn.setBorderPainted(false);
        progressBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        progressBtn.setMaximumSize(new java.awt.Dimension(151, 45));
        progressBtn.setMinimumSize(new java.awt.Dimension(151, 45));
        progressBtn.setPreferredSize(new java.awt.Dimension(151, 45));
        progressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progressBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(255, 46, 0));
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logoutBtn.setBorderPainted(false);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutBtn.setMaximumSize(new java.awt.Dimension(151, 45));
        logoutBtn.setMinimumSize(new java.awt.Dimension(151, 45));
        logoutBtn.setPreferredSize(new java.awt.Dimension(151, 45));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(requestBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progressBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(requestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(receiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(progressBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        requestPanel.setBackground(new java.awt.Color(255, 255, 255));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(requestTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Request:");

        requestField.setColumns(20);
        requestField.setRows(5);
        jScrollPane2.setViewportView(requestField);

        deleteBtn.setBackground(new java.awt.Color(255, 46, 0));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        sendBtn.setBackground(new java.awt.Color(255, 152, 0));
        sendBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(255, 152, 0));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout requestPanelLayout = new javax.swing.GroupLayout(requestPanel);
        requestPanel.setLayout(requestPanelLayout);
        requestPanelLayout.setHorizontalGroup(
            requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestPanelLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(requestPanelLayout.createSequentialGroup()
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, requestPanelLayout.createSequentialGroup()
                    .addContainerGap(136, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(137, Short.MAX_VALUE)))
        );
        requestPanelLayout.setVerticalGroup(
            requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, requestPanelLayout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(26, 26, 26)
                .addGroup(requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, requestPanelLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(230, Short.MAX_VALUE)))
        );

        mainPanel.add(requestPanel, "card2");

        receivePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("id");

        idField.setEditable(false);

        receiveBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "unaccept", "accept" }));

        receiveUpdateBtn.setBackground(new java.awt.Color(255, 152, 0));
        receiveUpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        receiveUpdateBtn.setText("Receive");
        receiveUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiveUpdateBtnActionPerformed(evt);
            }
        });

        receiveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Title", "File", "Bab", "Comment", "Receive"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        receiveTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receiveTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(receiveTable);

        javax.swing.GroupLayout receivePanelLayout = new javax.swing.GroupLayout(receivePanel);
        receivePanel.setLayout(receivePanelLayout);
        receivePanelLayout.setHorizontalGroup(
            receivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receivePanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(receivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(receivePanelLayout.createSequentialGroup()
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(receiveBox, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(receiveUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        receivePanelLayout.setVerticalGroup(
            receivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receivePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(receivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(receiveBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(receiveUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );

        mainPanel.add(receivePanel, "card3");

        progressPanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout progressPanelLayout = new javax.swing.GroupLayout(progressPanel);
        progressPanel.setLayout(progressPanelLayout);
        progressPanelLayout.setHorizontalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        progressPanelLayout.setVerticalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        mainPanel.add(progressPanel, "card4");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        route.nextPanel(mainPanel, requestPanel);
    }//GEN-LAST:event_requestBtnActionPerformed

    private void receiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiveBtnActionPerformed
        route.nextPanel(mainPanel, receivePanel);
    }//GEN-LAST:event_receiveBtnActionPerformed

    private void progressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progressBtnActionPerformed
        route.nextPanel(mainPanel, progressPanel);
    }//GEN-LAST:event_progressBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
       int jawab; 
        if ((jawab = JOptionPane.showConfirmDialog(null, "Anda yakin ingin logout?","konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
             new Login().setVisible(true);
             setVisible(false);
         }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        reset();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        send();
    }//GEN-LAST:event_sendBtnActionPerformed

    private void requestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTableMouseClicked
        requestField.setText(requestTable.getValueAt(requestTable.getSelectedRow(), 1).toString());
        updateBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
    }//GEN-LAST:event_requestTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        _instance.queryUpdate("UPDATE request_roadmap SET message = '"+requestField.getText()+"' WHERE id = '"+tabRequestModel.getValueAt(requestTable.getSelectedRow(),0)+"'");
        showRequestAll("");
        JOptionPane.showMessageDialog(null, "Update Berhasil");
        reset();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int jawab;
        if((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?","konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
            _instance.queryUpdate("DELETE FROM request_roadmap WHERE id = '"+tabRequestModel.getValueAt(requestTable.getSelectedRow(),0)+"'");
            showRequestAll("");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void receiveUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiveUpdateBtnActionPerformed
        _instance.queryUpdate("UPDATE roadmap_verif SET verif = '"+receiveBox.getSelectedItem()+"' WHERE id = '"+tabReceiveModel.getValueAt(receiveTable.getSelectedRow(), 0)+"'");
        showReceiveAll("");
        JOptionPane.showMessageDialog(null, "Update Berhasil");
        reset();
    }//GEN-LAST:event_receiveUpdateBtnActionPerformed

    private void receiveTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiveTableMouseClicked
        idField.setText(receiveTable.getValueAt(receiveTable.getSelectedRow(), 0).toString());
        receiveBox.setSelectedItem(receiveTable.getValueAt(receiveTable.getSelectedRow(), 5));
    }//GEN-LAST:event_receiveTableMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton progressBtn;
    private javax.swing.JPanel progressPanel;
    private javax.swing.JComboBox<String> receiveBox;
    private javax.swing.JButton receiveBtn;
    private javax.swing.JPanel receivePanel;
    private javax.swing.JTable receiveTable;
    private javax.swing.JButton receiveUpdateBtn;
    private javax.swing.JButton requestBtn;
    private javax.swing.JTextArea requestField;
    private javax.swing.JPanel requestPanel;
    private javax.swing.JTable requestTable;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton sendBtn;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
    private Route route;
    private Database _instance;
    private DefaultTableModel tabRequestModel,tabReceiveModel;
    
    public void titleRequest() {
        Object[] title = {
            "id", "Message"
        };
        tabRequestModel = new DefaultTableModel(null, title);
        requestTable.setModel(tabRequestModel);
    }
    
    public void titleReceive() {
        Object[] title = {
            "id", "Title", "File", "Bab", "Comment", "Verif"
        };
        tabReceiveModel = new DefaultTableModel(null, title);
        receiveTable.setModel(tabReceiveModel);
    }
    
    public void showRequestAll(String where) {
        tabRequestModel.getDataVector().removeAllElements();
        tabRequestModel.fireTableDataChanged();
        var rs = _instance.query("SELECT * FROM request_roadmap" + where);
        try {
            while(rs.next()) {
                Object data[] = {
                    rs.getString("id"),
                    rs.getString("message")
                };
                tabRequestModel.addRow(data);
            }
            _instance.closeResultSet();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void showReceiveAll(String where) {
        tabReceiveModel.getDataVector().removeAllElements();
        tabReceiveModel.fireTableDataChanged();
        var rs = _instance.query("SELECT roadmap.id, roadmap.title, roadmap.file, roadmap.bab, roadmap.comment, roadmap_verif.verif FROM roadmap INNER JOIN roadmap_verif ON roadmap.id = roadmap_verif.roadmap_id" + where);
        try {
            while(rs.next()) {
                Object data[] = {
                    rs.getString("id"),
                    rs.getString("title"),
                    rs.getString("file"),
                    rs.getString("bab"),
                    rs.getString("comment"),
                    rs.getString("verif"),
                };
                tabReceiveModel.addRow(data);
            }
            _instance.closeResultSet();
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void reset() {
        requestField.setText("");
    }
    
    public void send() {
        var request = requestField.getText();
        if(request.equals("")) {
            JOptionPane.showMessageDialog(null, "Isi datanya dulu dong!");
        } else {
            _instance.queryUpdate("INSERT INTO request_roadmap (message) VALUES ('"+request+"')");
            showRequestAll("");
            JOptionPane.showMessageDialog(null, "Data berhasil dikirim");
            reset();
            _instance.closeStatement();
        }
    }
}
