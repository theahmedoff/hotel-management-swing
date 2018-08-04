
package view;

import dao.BookingDAOImpl;
import dao.RoomDAOImpl;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Booking;


public class JFrameReseptionPanel extends javax.swing.JFrame {
    
    BookingDAOImpl bookingDAO = new BookingDAOImpl();
    RoomDAOImpl roomDAO = new RoomDAOImpl();
    //CustomerDAOImpl
    
    DefaultTableModel dtm;
    
    public JFrameReseptionPanel() {
        initComponents();
        setBookingTaable();
        //findText();
        jButtonCreate.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBooking = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextChekIn = new javax.swing.JTextField();
        jTextCheckOut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextRoomId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextCustomerId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextPrice = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableBooking);

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jButton3.setText("New Booking");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel1.setText("Check In");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jTextChekIn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jPanel1.add(jTextChekIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, 158, 29));

        jTextCheckOut.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jPanel1.add(jTextCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 37, 158, 29));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel2.setText("Check Out");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 11, -1, -1));

        jTextRoomId.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jPanel1.add(jTextRoomId, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 37, 158, 29));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel3.setText("Room ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 11, -1, -1));

        jTextCustomerId.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jPanel1.add(jTextCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 37, 158, 29));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel4.setText("Customer ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 11, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 11, -1, -1));

        jTextPrice.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jPanel1.add(jTextPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 37, 158, 29));

        jButtonCreate.setBackground(new java.awt.Color(49, 201, 206));
        jButtonCreate.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButtonCreate.setText("Update");
        jPanel1.add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 30, 110, 40));

        jButton6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1222, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


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
            java.util.logging.Logger.getLogger(JFrameReseptionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameReseptionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameReseptionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameReseptionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameReseptionPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBooking;
    private javax.swing.JTextField jTextCheckOut;
    private javax.swing.JTextField jTextChekIn;
    private javax.swing.JTextField jTextCustomerId;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextRoomId;
    // End of variables declaration//GEN-END:variables

    private void setBookingTaable() {
        dtm = new DefaultTableModel();
        
        dtm.addColumn("ID");
        dtm.addColumn("Check In");
        dtm.addColumn("Check Out");
        dtm.addColumn("Room Type");
        dtm.addColumn("Room View");
        dtm.addColumn("Room Status");
        dtm.addColumn("C Name");
        dtm.addColumn("C Surname");
        dtm.addColumn("C E-Mail");
        
        List<Booking> list = bookingDAO.getAllBoking();
        String status = "";
        for(Booking item : list){
            if (item.getRoom().isStatus() == true)
                status = "Dolu";
            else if(item.getRoom().isStatus() == false)
                status = "Bos";
            
            dtm.addRow(new Object[]{item.getId(), item.getCheckIN(), item.getCheckOUT(),
                    item.getRoom().getType(), item.getRoom().getView(), status,
                    item.getCustomer().getName(), item.getCustomer().getSurname(), item.getCustomer().getEmail()});
        }
        
        
        jTableBooking.setModel(dtm);
    }

    private void findText() {
        if (jTextChekIn != null && jTextCheckOut != null && 
                jTextRoomId.getText().equals("") && jTextCustomerId != null && jTextPrice != null) {
            jButtonCreate.setEnabled(true);
        }
    }
}
