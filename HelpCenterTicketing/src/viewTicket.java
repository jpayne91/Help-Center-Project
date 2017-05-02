
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class viewTicket extends javax.swing.JPanel {

    database db = new database();
    phonecallTicket ticket;

    public viewTicket() {
        initComponents();
        changeWindow();

        ticket = db.getTicket();
        setInfo(db.getTicket());
        updateConsole();
        db.updateViewRs();

    }

    public void setInfo(phonecallTicket dticket) {

        this.ticket = dticket;
        textID.setText(Integer.toString(ticket.id));
        textWho.setText(ticket.who);
        textTag.setText(ticket.tag);
        textDate.setText(ticket.date);
        textPhone.setText(ticket.phone);
        textProblem.setText(ticket.problem);
        textNotes.setText(ticket.notes);
        txtStatus.setText(ticket.status);

    }

    public void updateConsole() {
        console.setText(db.displayAllTickets());

    }

    public void changeWindow() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContainer = new javax.swing.JPanel();
        panelINFO = new javax.swing.JPanel();
        labelProblem = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        labelCompTag = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        labelWho = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textID = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        textDate = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        textTag = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        textPhone = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        textProblem = new javax.swing.JTextPane();
        labelID = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        textWho = new javax.swing.JTextPane();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        jscrollpane = new javax.swing.JScrollPane();
        txtStatus = new javax.swing.JTextPane();
        cbStatus = new javax.swing.JComboBox();
        btnView = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSubmitStatus = new javax.swing.JButton();
        btnByID = new javax.swing.JButton();
        btnByName = new javax.swing.JButton();
        labelID1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        textNotes = new javax.swing.JTextPane();
        labelNotes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setEnabled(false);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(500, 500));

        panelContainer.setPreferredSize(new java.awt.Dimension(500, 700));

        panelINFO.setPreferredSize(new java.awt.Dimension(500, 700));

        labelProblem.setText("Title");

        labelTime.setText("Date");

        labelCompTag.setText("Comp ID");

        labelPhone.setText("Phone #");

        labelWho.setText("User");

        jScrollPane2.setViewportView(textID);

        jScrollPane3.setViewportView(textDate);

        jScrollPane4.setViewportView(textTag);

        jScrollPane5.setViewportView(textPhone);

        jScrollPane6.setViewportView(textProblem);

        labelID.setText("ID");

        jScrollPane8.setViewportView(textWho);

        btnPrevious.setText("Previous");
        btnPrevious.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblStatus.setText("Status");

        jscrollpane.setViewportView(txtStatus);

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "New", "In Progress", "On Hold", "Completed" }));

        btnView.setText("View");
        btnView.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSubmitStatus.setText("Update");
        btnSubmitStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSubmitStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitStatusActionPerformed(evt);
            }
        });

        btnByID.setText("By ID");
        btnByID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByIDActionPerformed(evt);
            }
        });

        btnByName.setText("By Name");
        btnByName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByNameActionPerformed(evt);
            }
        });

        labelID1.setText("Sort by:");

        jScrollPane7.setViewportView(textNotes);

        labelNotes.setText("Notes");

        console.setColumns(20);
        console.setRows(5);
        jScrollPane1.setViewportView(console);

        javax.swing.GroupLayout panelINFOLayout = new javax.swing.GroupLayout(panelINFO);
        panelINFO.setLayout(panelINFOLayout);
        panelINFOLayout.setHorizontalGroup(
            panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelINFOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addComponent(labelProblem)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelINFOLayout.createSequentialGroup()
                                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStatus)
                                    .addComponent(labelID1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelINFOLayout.createSequentialGroup()
                                        .addComponent(btnByID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnByName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelINFOLayout.createSequentialGroup()
                                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelINFOLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelINFOLayout.createSequentialGroup()
                                                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panelINFOLayout.createSequentialGroup()
                                                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnSubmitStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(15, 15, 15))))
                            .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelINFOLayout.createSequentialGroup()
                                    .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelID)
                                        .addComponent(labelWho)
                                        .addComponent(labelPhone)
                                        .addComponent(labelCompTag)
                                        .addComponent(labelTime))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelINFOLayout.createSequentialGroup()
                                            .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelINFOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNotes)
                .addGap(217, 217, 217))
        );
        panelINFOLayout.setVerticalGroup(
            panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelINFOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelWho)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelINFOLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(labelProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelINFOLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(labelCompTag, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(labelNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(lblStatus)
                        .addGap(307, 307, 307))
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelINFOLayout.createSequentialGroup()
                                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSubmitStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelINFOLayout.createSequentialGroup()
                                .addComponent(jscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnByID)
                            .addComponent(btnByName)
                            .addComponent(labelID1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("View Tickets");

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(panelContainerLayout);
        panelContainerLayout.setHorizontalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerLayout.createSequentialGroup()
                .addComponent(panelINFO, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelContainerLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelContainerLayout.setVerticalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(panelINFO, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByNameActionPerformed
        console.setText(db.displayNameTickets());
    }//GEN-LAST:event_btnByNameActionPerformed

    private void btnByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByIDActionPerformed
        console.setText(db.displayAllTickets());
    }//GEN-LAST:event_btnByIDActionPerformed

    private void btnSubmitStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitStatusActionPerformed

        db.updateEmployeeStatus(ticket.id, cbStatus.getSelectedIndex());
        setInfo(ticket);
    }//GEN-LAST:event_btnSubmitStatusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        cbStatus.setVisible(true);

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        cbStatus.setVisible(false);

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        setInfo(db.nextTicket(ticket));

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        setInfo(db.previousTicket(ticket));
    }//GEN-LAST:event_btnPreviousActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnByID;
    private javax.swing.JButton btnByName;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSubmitStatus;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JTextArea console;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jscrollpane;
    private javax.swing.JLabel labelCompTag;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelID1;
    private javax.swing.JLabel labelNotes;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelProblem;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelWho;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JPanel panelINFO;
    private javax.swing.JTextPane textDate;
    private javax.swing.JTextPane textID;
    private javax.swing.JTextPane textNotes;
    private javax.swing.JTextPane textPhone;
    private javax.swing.JTextPane textProblem;
    private javax.swing.JTextPane textTag;
    private javax.swing.JTextPane textWho;
    private javax.swing.JTextPane txtStatus;
    // End of variables declaration//GEN-END:variables
}
