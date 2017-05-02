
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class main extends javax.swing.JFrame {

    JFrame pframe = new JFrame("Phone Call");
    JFrame vframe = new JFrame("View Tickets");
    JFrame eframe = new JFrame("Employee Add/Del");
    viewTicket viewticket = new viewTicket();

    public main() {

        pframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pframe.getContentPane().add(new phoneCall());
        pframe.pack();

        vframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vframe.getContentPane().add(viewticket);
        vframe.pack();

        eframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        eframe.getContentPane().add(new pnlAdmin());
        eframe.pack();

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPhoneCall = new javax.swing.JButton();
        buttonInfo = new javax.swing.JButton();
        mainLogo = new javax.swing.JLabel();
        buttonViewTicket = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        buttonPhoneCall.setBackground(new java.awt.Color(51, 204, 0));
        buttonPhoneCall.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonPhoneCall.setText("New Ticket");
        buttonPhoneCall.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonPhoneCall.setBorderPainted(false);
        buttonPhoneCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPhoneCallActionPerformed(evt);
            }
        });

        buttonInfo.setBackground(new java.awt.Color(255, 255, 51));
        buttonInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonInfo.setText("New User");
        buttonInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonInfo.setBorderPainted(false);
        buttonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInfoActionPerformed(evt);
            }
        });

        mainLogo.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        mainLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLogo.setText("Help Desk Center");

        buttonViewTicket.setBackground(new java.awt.Color(0, 153, 255));
        buttonViewTicket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonViewTicket.setText("View Ticket");
        buttonViewTicket.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonViewTicket.setBorderPainted(false);
        buttonViewTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonViewTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPhoneCall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPhoneCall, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(buttonViewTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPhoneCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPhoneCallActionPerformed

        buttonPhoneCall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pframe.setVisible(true);

            }
        });
    }//GEN-LAST:event_buttonPhoneCallActionPerformed

    private void buttonViewTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewTicketActionPerformed

        // TODO add your handling code here:
        buttonViewTicket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewticket.db.updateViewRs();
                viewticket.updateConsole();
                vframe.setVisible(true);

            }
        });

    }//GEN-LAST:event_buttonViewTicketActionPerformed

    private void buttonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInfoActionPerformed
        eframe.setVisible(true);
    }//GEN-LAST:event_buttonInfoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInfo;
    private javax.swing.JButton buttonPhoneCall;
    private javax.swing.JToggleButton buttonViewTicket;
    private javax.swing.JLabel mainLogo;
    // End of variables declaration//GEN-END:variables
}
