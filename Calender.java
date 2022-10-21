
import javax.swing.JOptionPane;



public class Calender extends javax.swing.JPanel {


    private String ID;
    public Calender() {
        initComponents();
        
        for(int i=0;i<7;i++)
            for(int j=0;j<12;j++)
                Calender_Table.getModel().setValueAt("__", i, j);
    }
    
    public Calender(String Name) {
        initComponents();
        
        for(int i=0;i<7;i++)
            for(int j=0;j<12;j++)
                Calender_Table.getModel().setValueAt("__", i, j);
        
        ID = Name;
        Username.setText("User :"+Name);
    }
    
    public void showalert(String ClientName, String EventTitle, int Col, int Row)
    {
        if(JOptionPane.showConfirmDialog(null, "Accept a public Event ", "Invitation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Calender_Table.getModel().setValueAt(EventTitle,Row, Col);
        }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Calender_Table = new javax.swing.JTable();
        Username = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        jLabel3.setText("Monday");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        jLabel6.setText("Thursday");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jButton1.setText("Private Event");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Public Event");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        jLabel4.setText("Tuesday");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        jLabel5.setText("Wednesday");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        jLabel7.setText("Friday");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        jLabel1.setText("Saturday");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        jLabel2.setText("Sunday");

        Calender_Table.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Calender_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "00-02", "02-04", "04-06", "06-08", "08-10", "10-12", "12-02", "02-04", "04-06", "06-08", "08-10", "10-12"
            }
        ));
        jScrollPane1.setViewportView(Calender_Table);

        Username.setText("Client number :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(Username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int col = Calender_Table.getSelectedColumn();
        int R = Calender_Table.getSelectedRow();
        if(Calender_Table.getModel().getValueAt(R, col).equals("__"))
        {
            String title = JOptionPane.showInputDialog("Please, Enter the private Event name :");
            Calender_Table.getModel().setValueAt(title,R, col);
            JOptionPane.showMessageDialog(null,"A new private event was added","Congratulation",JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null,"This date was already taken","Error!",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int C = Calender_Table.getSelectedColumn();
        int R = Calender_Table.getSelectedRow();
        if(Calender_Table.getModel().getValueAt(R, C).equals("__"))
        {
            String title = JOptionPane.showInputDialog("Please, Enter the public Event name :");
            Calender_Table.getModel().setValueAt(title,R, C);
            JOptionPane.showMessageDialog(null,"A new public event was added","Congratulation",JOptionPane.INFORMATION_MESSAGE);
            DynamicRemoteObjectImpl.Callforward(ID, title, C, R);
        }
        else
            JOptionPane.showMessageDialog(null,"This date was already taken","Error!",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Calender_Table;
    private javax.swing.JLabel Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
