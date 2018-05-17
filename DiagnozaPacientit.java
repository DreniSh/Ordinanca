package projekt;



import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import projekt.Login;
import projekt.Pacienti;
import projekt.RregjistrimiPacientit;

/**
 *
 * @author Blendar Kabashi
 */
public class DiagnozaPacientit extends javax.swing.JInternalFrame {

    /**
     * Creates new form DiagnozaPacientit
     */
    public DiagnozaPacientit() {
        initComponents();
        Show_Pacient_In_Table();
    }
    Connection con = null;

    public Connection getConnection() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ambullanta?useSSL=false", "root", "3134");
            //JOptionPane.showMessageDialog(null, "Connected To Database!");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Not Connected To Database!");
            return null;
        }
    }

    public ArrayList<Pacienti> getPacientList() {

        ArrayList<Pacienti> pacientList = new ArrayList<Pacienti>();

        Connection con = getConnection();

        String query = "SELECT * FROM ambullantalogin.rregjistrimipacientit ";

        Statement st;

        ResultSet rs;

        try {

            st = con.createStatement();

            rs = st.executeQuery(query);

            Pacienti pacienti;

            while (rs.next()) {

                pacienti = new Pacienti(rs.getInt("id"), rs.getString("emri"),
                        rs.getString("mbiemri"), rs.getInt("mosha"),
                        rs.getString("emriPrindit"), rs.getDate("dataLindjes"));

                pacientList.add(pacienti);

            }

        } catch (SQLException ex) {

            Logger.getLogger(RregjistrimiPacientit.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pacientList;

    }

    // 2 - Populate the JTable
    public void Show_Pacient_In_Table() {

        ArrayList<Pacienti> list = getPacientList();

        DefaultTableModel model = (DefaultTableModel) jTable1_Pacienti.getModel();

        //clear jtable content
        model.setRowCount(0);

        Object[] row = new Object[8];

        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getId();

            row[1] = list.get(i).getEmri();

            row[2] = list.get(i).getMbiemri();

            row[3] = list.get(i).getMosha();

            row[4] = list.get(i).getEmriPrindit();

            row[5] = list.get(i).getDataLindjes();

            model.addRow(row);

        }

    }

    //showItem
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Pacienti = new javax.swing.JTable();
        btn_tregoDiagnozen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btn_gjeneroDokumentin = new javax.swing.JButton();
        btn_shtoDiagnozen = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jTable1_Pacienti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "emri", "mbiemri", "mosha", "emriPrindit", "dataLindjes"
            }
        ));
        jTable1_Pacienti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_PacientiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_Pacienti);

        btn_tregoDiagnozen.setText("Trego Diagnozen");
        btn_tregoDiagnozen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tregoDiagnozenActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Diagnoza");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Diagnoza");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Terapia");
        jScrollPane3.setViewportView(jTextArea2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Terapia");

        btn_gjeneroDokumentin.setText("Gjenero dokumentin");
        btn_gjeneroDokumentin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gjeneroDokumentinActionPerformed(evt);
            }
        });

        btn_shtoDiagnozen.setText("Shto Diagnozen");
        btn_shtoDiagnozen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_shtoDiagnozenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btn_shtoDiagnozen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btn_tregoDiagnozen, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btn_gjeneroDokumentin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tregoDiagnozen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gjeneroDokumentin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_shtoDiagnozen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tregoDiagnozenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tregoDiagnozenActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        jTextArea2.setText("");
    }//GEN-LAST:event_btn_tregoDiagnozenActionPerformed

    private void btn_gjeneroDokumentinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gjeneroDokumentinActionPerformed
        try {
            // TODO add your handling code here:
            FileOutputStream outStream = new FileOutputStream("Sample.docx");
            XWPFDocument doc = new XWPFDocument();
            XWPFParagraph tekst = doc.createParagraph();
            tekst.setAlignment(ParagraphAlignment.LEFT);
            XWPFRun dokumenti = tekst.createRun();
            dokumenti.setFontSize(26);
            dokumenti.setText(jTextArea1.getText() + "\n------------------------------------------------------------------\n" + jTextArea2.getText());
            doc.write(outStream);
            outStream.close();
            JOptionPane.showMessageDialog(null, "Dokumenti u gjenerua me sukses");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btn_gjeneroDokumentinActionPerformed

    private void btn_shtoDiagnozenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_shtoDiagnozenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_shtoDiagnozenActionPerformed

    private void jTable1_PacientiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_PacientiMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1_PacientiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gjeneroDokumentin;
    private javax.swing.JButton btn_shtoDiagnozen;
    private javax.swing.JButton btn_tregoDiagnozen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1_Pacienti;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
