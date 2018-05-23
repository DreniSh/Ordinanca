/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author drens
 */
public class Terminet extends javax.swing.JInternalFrame {

    public Terminet() {
        initComponents();
        getConnection();
        Show_Termini_In_Table();
    }

    Connection con = null;

    public Connection getConnection() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ambullanta?useSSL=false", "root", "3134");
            //Eshte konektuar ne databaz
            //JOptionPane.showMessageDialog(null, "Connected To Database!");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Not Connected To Database!");
            return null;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        txt_termini = new javax.swing.JTextField();
        txt_emriMbiemri = new javax.swing.JTextField();
        txt_pershkrimi = new javax.swing.JTextField();
        txt_kohaFillimit = new javax.swing.JTextField();
        txt_kohaMbarimit = new javax.swing.JTextField();
        data = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txt_nrTelefonit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Termini:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("EmriMbiemri:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Pershkrimi:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Koha Fillimit:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Koha Mbarimit:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Data:");

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        txt_kohaFillimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kohaFillimitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nr Telefonit:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Termini", "Pershkrimi", "Lokacioni", "Koha Fillimit", "Koha Mbarimit", "Data", "Nr Tel"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_termini)
                    .addComponent(txt_emriMbiemri)
                    .addComponent(txt_pershkrimi)
                    .addComponent(txt_kohaFillimit)
                    .addComponent(txt_kohaMbarimit)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btn_clear)
                        .addGap(61, 61, 61)
                        .addComponent(btn_delete))
                    .addComponent(txt_nrTelefonit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_termini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_emriMbiemri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_pershkrimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_kohaFillimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_kohaMbarimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nrTelefonit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_add)
                            .addComponent(btn_clear)
                            .addComponent(btn_delete))
                        .addGap(78, 78, 78))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_kohaFillimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kohaFillimitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kohaFillimitActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_termini.setText("");
        txt_emriMbiemri.setText("");
        txt_pershkrimi.setText("");
        txt_kohaFillimit.setText("");
        txt_kohaMbarimit.setText("");
        data.setDate(null);
        txt_nrTelefonit.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        if (!txt_termini.getText().equals("")) {
            Connection con = getConnection();
            try {
                PreparedStatement ps = con.prepareStatement("DELETE FROM ambullantalogin.terminet"
                        + " WHERE termini = ?");
                int id = Integer.parseInt(txt_termini.getText());
                ps.setInt(1, id);
                ps.executeUpdate();
                Show_Termini_In_Table();
                //Termini u fshi
                JOptionPane.showMessageDialog(null, "Termini Deleted");

            } catch (SQLException ex) {
                Logger.getLogger(RregjistrimiPacientit.class.getName()).log(Level.SEVERE, null, ex);

                JOptionPane.showMessageDialog(null, "Termini Not Deleted!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Termin Not Deleted : No Id To Delete!");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        if (checkInputs()) {

            try {

                Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement("INSERT INTO ambullantalogin.terminet"
                        + "(termini,emriMbiemri,pershkrimi,kohaFillimit,kohaMbarimit,data,nrTel)"
                        + "values(?,?,?,?,?,?,?)  ");

                ps.setString(1, txt_termini.getText());
                ps.setString(2, txt_emriMbiemri.getText());
                ps.setString(3, txt_pershkrimi.getText());
                ps.setString(4, txt_kohaFillimit.getText());
                ps.setString(5, txt_kohaMbarimit.getText());

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String addDate = dateFormat.format(data.getDate());
                ps.setString(6, addDate);

                ps.setString(7, txt_nrTelefonit.getText());

                ps.executeUpdate();
                Show_Termini_In_Table();
                //tregon per insertimin e pacientit
                JOptionPane.showMessageDialog(null, "Pacient Inserted");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "One or More Fields Are Empty");
        }
    }//GEN-LAST:event_btn_addActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private com.toedter.calendar.JDateChooser data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txt_emriMbiemri;
    private javax.swing.JTextField txt_kohaFillimit;
    private javax.swing.JTextField txt_kohaMbarimit;
    private javax.swing.JTextField txt_nrTelefonit;
    private javax.swing.JTextField txt_pershkrimi;
    private javax.swing.JTextField txt_termini;
    // End of variables declaration//GEN-END:variables

    private boolean checkInputs() {
        if (txt_emriMbiemri.getText() == null || txt_pershkrimi.getText() == null
                || txt_kohaFillimit.getText() == null || txt_kohaMbarimit.getText() == null
                || data.getDate() == null || txt_nrTelefonit.getText() == null) {
            return false;
        } else {
            try {
                Integer.parseInt(txt_termini.getText());
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    private void Show_Termini_In_Table() {
        ArrayList<Termini> list = getTerminList();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        //clear jtable content
        model.setRowCount(0);
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getTermini();
            row[1] = list.get(i).getEmriMbiemri();
            row[2] = list.get(i).getPershkrimi();
            row[3] = list.get(i).getKohaFillimit();
            row[4] = list.get(i).getKohaMbarimit();
            row[5] = list.get(i).getData();
            row[6] = list.get(i).getNrTelefonit();

            model.addRow(row);

        }
    }

    //Table
    public ArrayList<Termini> getTerminList() {

        ArrayList<Termini> terminList = new ArrayList<Termini>();
        Connection con = getConnection();
        String query = "SELECT * FROM ambullantalogin.terminet ";

        Statement st;
        ResultSet rs;

        try {

            st = con.createStatement();
            rs = st.executeQuery(query);
            Termini termini;

            while (rs.next()) {
                termini = new Termini(rs.getInt("termini"), rs.getString("emriMbiemri"),
                        rs.getString("pershkrimi"), rs.getString("kohaFillimit"),
                        rs.getString("kohaMbarimit"), rs.getDate("data"), rs.getString("nrTel"));

                terminList.add(termini);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RregjistrimiPacientit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return terminList;
    }
}
