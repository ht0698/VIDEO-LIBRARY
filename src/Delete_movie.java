
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Delete_movie.java
 *
 * Created on Jul 23, 2014, 6:12:27 PM
 */

/**
 *
 * @author sd
 */
public class Delete_movie extends javax.swing.JFrame {

    /** Creates new form Delete_movie */
    public Delete_movie() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delete a movie from the list!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 0, 360, 39);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Publisher               :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 250, 120, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Duration                :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 280, 122, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Director                 :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 220, 121, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Sequel                   :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 190, 121, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Name                     :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 160, 121, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Enter Movie Code  :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 100, 140, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Serial No.               :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 130, 170, 15);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 100, 100, 20);

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 130, 100, 20);

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 160, 100, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("View Movie Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 130, 140, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Reset");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 210, 80, 23);

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(130, 220, 100, 20);

        jTextField7.setEditable(false);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(130, 280, 100, 20);

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(130, 250, 100, 20);

        jTextField4.setEditable(false);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(130, 190, 100, 20);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(310, 250, 70, 23);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 170, 80, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/the-conjuring-movie-poster.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 450);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-506)/2, (screenSize.height-486)/2, 506, 486);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String mc=jTextField2.getText();
    
      if(mc.isEmpty())
      {JOptionPane.showMessageDialog(this, "Enter the movie code!");}         
             try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection
                    ("jdbc:mysql://localhost/Theatre_Management_System","root","");
            Statement stmt=con.createStatement();

            String q1="select * from movie where movie_code=('"+(mc)+"');";
            ResultSet rs=stmt.executeQuery(q1);

            int fnd=0;

          

            while(rs.next())
            {
                jTextField1.setText(rs.getString("s_no"));
                jTextField4.setText(rs.getString("sequel"));
                jTextField3.setText(rs.getString("name"));
                jTextField5.setText(rs.getString("director"));
                jTextField6.setText(rs.getString("publisher"));
                jTextField7.setText(rs.getString("duration"));
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
                fnd++;
            }
       if(fnd==0){JOptionPane.showMessageDialog(this,"No Such Movie Code!");}
            }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
         
        
         

      

       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
      
        jButton3.setEnabled(false);
        jButton2.setEnabled(false);

}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new Admin_resources().setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

     String mc=jTextField2.getText();



       
       
          try
     {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection
                    ("jdbc:mysql://localhost/Theatre_Management_System","root","");
            Statement stmt=con.createStatement();
            String q1="Delete from movie where movie_code='"+(mc)+"';";
            stmt.executeUpdate(q1);

            JOptionPane.showMessageDialog(this, "Record Deleted!");
    }

     catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
         
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jButton3.setEnabled(false);
        jButton2.setEnabled(false);
      

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_movie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

}
