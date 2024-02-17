/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campus_student_attendace_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Online_attendance_management_system extends javax.swing.JFrame {

    /**
     * Creates new form Online_attendance_management_system
     */
    public Online_attendance_management_system() {
        initComponents();
    }
    
    //Variables
     private static final String username ="root"; 
   private static final String password ="Campmake96"; 
   private static final String dataconnect ="jdbc:mysql://localhost:3306/online_attendance_system"; 
   
    Connection connect = null;
    PreparedStatement pst =null;
    ResultSet rs = null;

    int q ,i ,id ,deleteItem;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    //Code to add into my SQLWorkbench
     public void updateDB() 
    {
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connect =DriverManager.getConnection(dataconnect ,username ,password);
        pst =connect.prepareStatement("Select * from register");
        rs = pst.executeQuery();
        java.sql.ResultSetMetaData stdata = rs.getMetaData();
         q = stdata.getColumnCount();
         
         DefaultTableModel RecordTable =(DefaultTableModel)jTable1.getModel();
         RecordTable.setRowCount(0);
         
        while(rs.next())
        {
        Vector columbaData = new Vector();
        
        for(i =1;i <=q ;i++)
        {
        columbaData.add(rs.getString("idRegister"));
        columbaData.add(rs.getString("Name"));
        columbaData.add(rs.getString("Surname"));
        columbaData.add(rs.getString("Student_Number"));
        columbaData.add(rs.getString("Course"));
        columbaData.add(rs.getString("Date"));
        columbaData.add(rs.getString("TimeIn"));
        columbaData.add(rs.getString("TimeOut"));
        
        
        }
        RecordTable.addRow(columbaData);
        
        }
        
        
    }  catch (Exception ex) {
        
           JOptionPane.showMessageDialog(null, ex);
           
       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Surnametxt = new javax.swing.JTextField();
        StudentNumbertxt = new javax.swing.JTextField();
        Coursetxt = new javax.swing.JTextField();
        Datetxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        Insert = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Nametxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        TimetxtIn = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        TimetxtOut = new javax.swing.JTextField();
        Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Coursetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoursetxtActionPerformed(evt);
            }
        });

        Datetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatetxtActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Student_No.", "Course", "Date", "Time In", "Time Out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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

        jLabel1.setText("Name:");

        jLabel2.setText("Surname:");

        jLabel3.setText("Student_Number:");

        jLabel4.setText("Course:");

        label.setText("Date:");

        Insert.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Insert.setText("Add");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        View.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NametxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Attendance System");
        jLabel5.setToolTipText("");

        label1.setText("Time in:");

        TimetxtIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimetxtInActionPerformed(evt);
            }
        });

        label2.setText("Time out:");

        TimetxtOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimetxtOutActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Update.setText("Update");
        Update.setToolTipText("");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(37, 37, 37))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(76, 76, 76)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(84, 84, 84)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Coursetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Surnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addComponent(Nametxt)
                        .addComponent(StudentNumbertxt)))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label)
                    .addComponent(label1)
                    .addComponent(label2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addComponent(TimetxtIn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimetxtOut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Insert)
                .addGap(92, 92, 92)
                .addComponent(View)
                .addGap(68, 68, 68)
                .addComponent(Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label)
                    .addComponent(Datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Surnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(StudentNumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimetxtOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(TimetxtIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Coursetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert)
                    .addComponent(View)
                    .addComponent(Exit)
                    .addComponent(Update))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CoursetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoursetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoursetxtActionPerformed

    private void DatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatetxtActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        //  Inserting Values into the the database
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect =DriverManager.getConnection(dataconnect ,username ,password);
            pst =connect.prepareStatement("insert into online_attendance_system.register ( Name, Surname, Student_Number, Course, Date, TimeIn, TimeOut) value(?,?,?,?,?,?,?)");

            pst.setString(1, Nametxt.getText());
            pst.setString(2, Surnametxt.getText());
            pst.setString(3, StudentNumbertxt.getText());
            pst.setString(4, Coursetxt.getText());
            pst.setString(5, Datetxt.getText());
            pst.setString(6, TimetxtIn.getText());
            pst.setString(7, TimetxtOut.getText());
            
            pst.executeUpdate();

            
            JOptionPane.showMessageDialog(null, "You have successfully saved your work");
            updateDB();
            
            //Clearing buttons
            Nametxt.setText("");
            Surnametxt.setText("");
            StudentNumbertxt.setText("");
            Coursetxt.setText("");
            Datetxt.setText("");
            TimetxtIn.setText("");
            TimetxtOut.setText("");
            
            
        }catch(Exception ex)
        {
            System.out.println("ERRORR");
            
        }
    }//GEN-LAST:event_InsertActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed

        // View information in the database
       updateDB();
    }//GEN-LAST:event_ViewActionPerformed

    private JFrame Frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       //Creating a code to end the program
        Frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(Frame ,"Confirm if you want to close the" ," register" ,
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    {
        System.exit(0);

        }
    }//GEN-LAST:event_ExitActionPerformed

    private void NametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NametxtActionPerformed

    private void TimetxtInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimetxtInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimetxtInActionPerformed

    private void TimetxtOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimetxtOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimetxtOutActionPerformed

    //Allowing the userto access information on the table
                                     
    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        //Updating Table
     try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connect = DriverManager.getConnection(dataconnect ,username ,password);
        pst = connect.prepareStatement("update register set Name =? ,Surname =? ,Student_Number =? ,Course =? ,Date =?  ,TimeIn =? ,TimeOut =? ");
      
            
            pst.setString(1, Nametxt.getText());
            pst.setString(2, Surnametxt.getText());
            pst.setString(3, StudentNumbertxt.getText());
            pst.setString(4, Coursetxt.getText());
            pst.setString(5, Datetxt.getText());
            pst.setString(6, TimetxtIn.getText());
            pst.setString(7, TimetxtOut.getText());

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Successfully updated");
        updateDB();
        }
           catch(Exception as)
           {
               System.out.println(as);
           JOptionPane.showMessageDialog(null, "Erooor");
           }
    }//GEN-LAST:event_UpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
          int SelcetedRow = jTable1.getSelectedRow(); 
          
          
          Nametxt.setText(RecordTable.getValueAt(jTable1.getSelectedRow(), 1).toString());
          Surnametxt.setText(RecordTable.getValueAt(jTable1.getSelectedRow(), 2).toString());
          StudentNumbertxt.setText(RecordTable.getValueAt(jTable1.getSelectedRow(), 3).toString());
          Coursetxt.setText(RecordTable.getValueAt(jTable1.getSelectedRow(), 4).toString());
          Datetxt.setText(RecordTable.getValueAt(jTable1.getSelectedRow(), 5).toString());
          TimetxtIn.setText(RecordTable.getValueAt(jTable1.getSelectedRow(), 6).toString());
          TimetxtOut.setText(RecordTable.getValueAt(jTable1.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Online_attendance_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Online_attendance_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Online_attendance_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Online_attendance_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Online_attendance_management_system().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Coursetxt;
    private javax.swing.JTextField Datetxt;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Insert;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JTextField StudentNumbertxt;
    private javax.swing.JTextField Surnametxt;
    private javax.swing.JTextField TimetxtIn;
    private javax.swing.JTextField TimetxtOut;
    private javax.swing.JButton Update;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    // End of variables declaration//GEN-END:variables
}
