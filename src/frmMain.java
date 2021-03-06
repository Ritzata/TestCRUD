
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO Z40-75
 */
public class frmMain extends javax.swing.JFrame {
    String nol_jam = "";
    String nol_menit = "";
    String nol_detik = "";
    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        setJam();
        setTanggal();
    }
    
    public void setTanggal(){
    java.util.Date skrg = new java.util.Date();
    java.text.SimpleDateFormat kal = new
    java.text.SimpleDateFormat("dd/MM/yyyy");
    labeltanggal.setText(kal.format(skrg));
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        b2 = new javax.swing.JLabel();
        txtTempat = new javax.swing.JTextField();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        b5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        rdLaki = new javax.swing.JRadioButton();
        rdPerempuan = new javax.swing.JRadioButton();
        b6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        b7 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        tgl = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labeltanggal = new javax.swing.JLabel();
        labeljam = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));
        jPanel5.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(null);

        tblData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "Tempat", "Tanggal", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 520, 340);

        jPanel5.add(jPanel3);
        jPanel3.setBounds(350, 200, 540, 360);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ISIAN DATA SISWA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 12))); // NOI18N
        jPanel1.setLayout(null);

        b1.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b1.setText("NIS");
        jPanel1.add(b1);
        b1.setBounds(10, 40, 80, 30);

        txtNIS.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        txtNIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNISActionPerformed(evt);
            }
        });
        jPanel1.add(txtNIS);
        txtNIS.setBounds(120, 40, 190, 30);

        b2.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b2.setText("Tanggal Lahir");
        jPanel1.add(b2);
        b2.setBounds(10, 190, 100, 30);

        txtTempat.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jPanel1.add(txtTempat);
        txtTempat.setBounds(120, 140, 190, 30);

        b3.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b3.setText("Jenis Kelamin");
        jPanel1.add(b3);
        b3.setBounds(10, 250, 100, 30);

        b4.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b4.setText("Kelas");
        jPanel1.add(b4);
        b4.setBounds(10, 310, 80, 30);

        txtKelas.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jPanel1.add(txtKelas);
        txtKelas.setBounds(120, 310, 190, 30);

        b5.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b5.setText("Alamat");
        jPanel1.add(b5);
        b5.setBounds(10, 410, 80, 30);

        txtEmail.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jPanel1.add(txtEmail);
        txtEmail.setBounds(120, 360, 190, 30);

        buttonGroup1.add(rdLaki);
        rdLaki.setText("Laki - Laki");
        jPanel1.add(rdLaki);
        rdLaki.setBounds(120, 250, 80, 30);

        buttonGroup1.add(rdPerempuan);
        rdPerempuan.setText("Perempuan");
        jPanel1.add(rdPerempuan);
        rdPerempuan.setBounds(210, 250, 90, 30);

        b6.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b6.setText("Email");
        jPanel1.add(b6);
        b6.setBounds(10, 360, 80, 30);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 410, 190, 100);

        b7.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b7.setText("Nama");
        jPanel1.add(b7);
        b7.setBounds(10, 90, 80, 30);

        b8.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b8.setText("Tempat Lahir");
        jPanel1.add(b8);
        b8.setBounds(10, 140, 100, 30);

        txtNama.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jPanel1.add(txtNama);
        txtNama.setBounds(120, 90, 190, 30);
        jPanel1.add(tgl);
        tgl.setBounds(120, 190, 190, 26);

        jPanel5.add(jPanel1);
        jPanel1.setBounds(10, 140, 320, 550);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        btnAdd.setText("Save");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);
        btnAdd.setBounds(20, 10, 90, 30);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);
        btnDelete.setBounds(120, 10, 90, 30);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);
        btnClear.setBounds(220, 10, 90, 30);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel2.add(btnRefresh);
        btnRefresh.setBounds(320, 10, 90, 30);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel2.add(btnEdit);
        btnEdit.setBounds(420, 10, 90, 30);

        jPanel5.add(jPanel2);
        jPanel2.setBounds(350, 140, 540, 50);

        jLabel1.setFont(new java.awt.Font("Swis721 Blk BT", 0, 18)); // NOI18N
        jLabel1.setText("FORM BIODATA SISWA SMK TELKOM MALANG ");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(10, 0, 460, 40);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("THE REAL INFORMATIC SCHOOL\n");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(0, 30, 240, 40);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(10, 0, 880, 0);

        labeltanggal.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        labeltanggal.setForeground(new java.awt.Color(255, 255, 255));
        labeltanggal.setText("Tanggal");
        jPanel5.add(labeltanggal);
        labeltanggal.setBounds(670, 70, 210, 20);

        labeljam.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        labeljam.setForeground(new java.awt.Color(255, 255, 255));
        labeljam.setText("Jam");
        jPanel5.add(labeljam);
        labeljam.setBounds(670, 100, 220, 20);

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel5.add(btnPrint);
        btnPrint.setBounds(700, 580, 190, 40);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 900, 730);

        setBounds(0, 0, 925, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            txtNIS.setText(tblData.getValueAt(baris, 0).toString());
            txtNama.setText(tblData.getValueAt(baris, 1).toString());
            txtTempat.setText(tblData.getValueAt(baris, 2).toString());
            SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
            Date dateFormat=null;
            try {
                dateFormat=date.parse(tblData.getValueAt(baris, 3).toString());
            } catch (ParseException ex) {
                
            }
            tgl.setDate(dateFormat);
            if ("Laki-laki".equals(tblData.getValueAt(baris, 4).toString())) {
                rdLaki.setSelected(true);
            } else {
                rdPerempuan.setSelected(true);
            }
            txtKelas.setText(tblData.getValueAt(baris, 5).toString());
            txtEmail.setText(tblData.getValueAt(baris, 6).toString());
            txtAlamat.setText(tblData.getValueAt(baris, 7).toString());
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void txtNISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNISActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(tgl.getDate());
       
        
        if ("".equals(txtNIS.getText()) || 
                "".equals(txtNama.getText()) ||
                "".equals(txtTempat.getText()) || 
                "".equals(tanggal) ||               
                "".equals(txtKelas.getText()) || 
                "".equals(txtEmail.getText()) ||
                "".equals(txtAlamat.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", 
            JOptionPane.WARNING_MESSAGE);
        } else {
             String JK = "";
            if (rdLaki.isSelected()) {
                JK = "L";
            } else {
                JK = "P";
            }
            String SQL = "INSERT INTO t_siswa (NIS,NamaSiswa,TempatLahir,Tanggallahir,JenisKelamin,Kelas,Email,Alamat) "
            + "VALUES('" + txtNIS.getText() 
                    +"','" + txtNama.getText() 
                    +"','" + txtTempat.getText() 
                    +"','" + tanggal 
                    +"','" + JK 
                    +"','" + txtKelas.getText() 
                    + "','" +txtEmail.getText() 
                    + "','" + txtAlamat.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses",
                        JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            String NIS = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus","Sukses",JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus","Gagal",JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Barisnya Terlebih Dahulu","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        txtNIS.setText("");
        txtNama.setText("");
        txtTempat.setText("");
        tgl.setCalendar(null);
        txtKelas.setText("");
        buttonGroup1.clearSelection();
        txtEmail.setText("");
        txtAlamat.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        selectData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    
        if ("".equals(txtNIS.getText()) || "".equals(txtNama.getText()) ||"".equals(txtAlamat.getText()) || "".equals(txtKelas.getText()) || "".equals(txtTempat.getText()) || "".equals(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            int  baris = tblData.getSelectedRow();
        String NIS = tblData.getValueAt(baris, 0).toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(tgl.getDate());
        String JK = "";
            if (rdLaki.isSelected()) {
                JK = "L";
            } else {
                JK = "P";
            }
            String SQL = "UPDATE t_siswa SET `NIS`='"+txtNIS.getText()
                    +"',`NamaSiswa`='"+txtNama.getText()
                    +"',`TempatLahir`='"+txtTempat.getText()
                    +"',`TanggalLahir`='"+tanggal                   
                    +"',`JenisKelamin`='"+JK
                    +"',`Kelas`='"+txtKelas.getText()
                    +"',`Email`='"+txtEmail.getText()
                    +"',`Alamat`='"+txtAlamat.getText()
                    +"' WHERE NIS="+NIS;
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate","Sukses",JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        MessageFormat header = new MessageFormat("Biodata Siswa SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}    ");
        try
        {
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
           
        }catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labeljam;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JTable tblData;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTempat;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NIS","Nama Siswa","Tempat lahir","Tanggal lahir","Jenis Kelamin","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try{
            while(rs.next()){
                String NIS = rs.getString(1);
                String namaSiswa = rs.getString(2);
                String Tempat = rs.getString(3);
                String Tanggal = rs.getString(4);
                String jenisKelamin = "";
                if ("L".equals(rs.getString(5))) {
                    jenisKelamin = "Laki-laki";
                } else {
                    jenisKelamin = "Perempuan";
                }
                String kelas = rs.getString(6);
                String email = rs.getString(7);
                String alamat = rs.getString(8);
                String data[] = {NIS,namaSiswa,Tempat,Tanggal,jenisKelamin,kelas,email,alamat};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm);
    }

    private void setJam() {
        ActionListener taskPerformer = new ActionListener(){
        public void actionPerformed(ActionEvent evt) {
            Date dt = new Date();
            int nilai_jam = dt.getHours();
            int nilai_menit = dt.getMinutes();
            int nilai_detik = dt.getSeconds();
            if (nilai_jam <= 9) {
                nol_jam = "0";
            }
            if (nilai_menit <= 9) {
                nol_menit = "0";
            }
            if (nilai_detik <= 9) {
                nol_detik = "0";
            }
            
            String jam = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String detik = nol_detik + Integer.toString(nilai_detik);
            labeljam.setText("Jam "+jam + ":" + menit + ":" +detik);
        }
    };
    new Timer(100, taskPerformer).start();
    }
}
