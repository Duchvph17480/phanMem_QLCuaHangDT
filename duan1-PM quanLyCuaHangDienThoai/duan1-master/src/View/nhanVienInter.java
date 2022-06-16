/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.nhanVienDAO;
import Dao.userDao;
import Helper.Check;
import Helper.auth;
import Helper.dateHelper;
import Helper.dialogHelper;
import Helper.shareHelper;
import Model.nhanVien;
import java.awt.Color;
import static java.awt.Color.pink;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author NGUYEN TRI TUE
 */
public class nhanVienInter extends javax.swing.JInternalFrame {

    nhanVienDAO dao = new nhanVienDAO();
    int row = -1;

    /**
     * Creates new form nhanVienInter
     */
    public nhanVienInter() {
        initComponents();
        init();
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
        tabs = new javax.swing.JTabbedPane();
        capNhap = new javax.swing.JPanel();
        pnlNhapTT = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        txtTenNV = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQueQuan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dateNgay = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoaTrang = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        danhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnXuatFile = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLuuTru = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        pnlNhapTT.setBackground(new java.awt.Color(218, 242, 220));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên nhân viên :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính:");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quê quán:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ngày sinh:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Số điện thoại:");

        javax.swing.GroupLayout pnlNhapTTLayout = new javax.swing.GroupLayout(pnlNhapTT);
        pnlNhapTT.setLayout(pnlNhapTTLayout);
        pnlNhapTTLayout.setHorizontalGroup(
            pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhapTTLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(pnlNhapTTLayout.createSequentialGroup()
                        .addGroup(pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(1, 1, 1)))
                .addGap(59, 59, 59)
                .addGroup(pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNhapTTLayout.createSequentialGroup()
                        .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlNhapTTLayout.createSequentialGroup()
                        .addGroup(pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(txtQueQuan, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(dateNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlNhapTTLayout.setVerticalGroup(
            pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhapTTLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNhapTTLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(pnlNhapTTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNu)
                            .addComponent(rdoNam))
                        .addGap(28, 28, 28)
                        .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNhapTTLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6))
                    .addGroup(pnlNhapTTLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(dateNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(pnlNhapTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27))
        );

        jPanel1.setBackground(new java.awt.Color(129, 183, 210));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoaTrang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh.png"))); // NOI18N
        btnXoaTrang.setText("Xóa Trắng");
        btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnThem)
                .addGap(72, 72, 72)
                .addComponent(btnSua)
                .addGap(82, 82, 82)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnXoaTrang)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnXoaTrang))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout capNhapLayout = new javax.swing.GroupLayout(capNhap);
        capNhap.setLayout(capNhapLayout);
        capNhapLayout.setHorizontalGroup(
            capNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capNhapLayout.createSequentialGroup()
                .addGroup(capNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capNhapLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlNhapTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        capNhapLayout.setVerticalGroup(
            capNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capNhapLayout.createSequentialGroup()
                .addComponent(pnlNhapTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Cập nhập", capNhap);

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Giới tính", "Quê quán", "Ngày sinh", "SDT"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("DÁNH SÁCH NHÂN VIÊN");

        btnXuatFile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXuatFile.setText("Xuất Excel");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout danhSachLayout = new javax.swing.GroupLayout(danhSach);
        danhSach.setLayout(danhSachLayout);
        danhSachLayout.setHorizontalGroup(
            danhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(danhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(danhSachLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXuatFile)
                .addGap(33, 33, 33))
        );
        danhSachLayout.setVerticalGroup(
            danhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(danhSachLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(danhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnXuatFile))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Danh sách", danhSach);

        tblLuuTru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Giới tính", "Quê quán", "Ngày sinh", "SĐT"
            }
        ));
        tblLuuTru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLuuTruMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLuuTru);

        jButton1.setText("Hiển thị lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        tabs.addTab("Lưu Trữ", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (Check.checkName(txtTenNV) && Check.checkMaNV(txtMaNV) && Check.checkName(txtQueQuan)) {
            if (Check.checkSDT(txtSDT)) {
                insert();
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (Check.checkName(txtTenNV) && Check.checkSDT(txtSDT) && Check.checkName(txtQueQuan)) {
            update();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        deleteTamThoi();
        tabs.setSelectedIndex(1);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        clearFrom();
        this.rdoNam.setSelected(true);
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if (evt.getClickCount() == 1) {
            this.row = tblNhanVien.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hienThiLai();
        tabs.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblLuuTruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLuuTruMouseClicked
        if (evt.getClickCount() == 1) {
            this.row = tblLuuTru.getSelectedRow();
        }
    }//GEN-LAST:event_tblLuuTruMouseClicked

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        xuatExcel();
    }//GEN-LAST:event_btnXuatFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel capNhap;
    private javax.swing.JPanel danhSach;
    private com.toedter.calendar.JDateChooser dateNgay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlNhapTT;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblLuuTru;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables

    public void init() {
        this.row = -1;
        this.updateStatus();
        this.rdoNam.setSelected(true);
        fillTable();
        fillTable1();
        tabs.setSelectedIndex(1);
    }

    void fillTable() {
        DefaultTableModel mol = (DefaultTableModel) tblNhanVien.getModel();
        mol.setRowCount(0);
        try {
            List<nhanVien> list = dao.XoaTamThoi();
            for (nhanVien nv : list) {
                Object[] row = {nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ", nv.getQueQuan(), dateHelper.toString(nv.getNgaySinh(), "yyyy-MM-dd"), nv.getSDT()};
                mol.addRow(row);
            }
        } catch (Exception e) {
            dialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void fillTable1() {
        DefaultTableModel mol = (DefaultTableModel) tblLuuTru.getModel();
        mol.setRowCount(0);
        try {
            List<nhanVien> list = dao.HienThiLai();
            for (nhanVien nv : list) {
                Object[] row = {nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ", nv.getQueQuan(), dateHelper.toString(nv.getNgaySinh(), "yyyy-MM-dd"), nv.getSDT()};
                mol.addRow(row);
            }
        } catch (Exception e) {
            dialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void setForm(nhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtTenNV.setText(nv.getTenNV());
        this.rdoNam.setSelected(nv.isGioiTinh());
        this.rdoNu.setSelected(!nv.isGioiTinh());
        txtQueQuan.setText(nv.getQueQuan());
        dateNgay.setDate(nv.getNgaySinh());
        txtSDT.setText(nv.getSDT());
    }

    nhanVien getFrom() {
        nhanVien nv = new nhanVien();
        if (txtMaNV.getText().equals("")) {
            return null;
        }
        if (txtTenNV.getText().equals("")) {
            return null;
        }
        if (dateNgay.equals("")) {
            return null;
        } else {
            try {
                dateNgay.getDate().equals("");
            } catch (Exception e) {
                dateNgay.setBackground(pink);
                dialogHelper.alert(this, "Không được để trống và định dạng là yyyy-MM-dd");
                return null;
            }
        }
        if (txtSDT.getText().equals("")) {
            return null;
        }

        nv.setMaNV(txtMaNV.getText());
        nv.setTenNV(txtTenNV.getText());
        nv.setGioiTinh(rdoNam.isSelected());
        nv.setQueQuan(txtQueQuan.getText());
        nv.setNgaySinh(dateNgay.getDate());
        nv.setSDT(txtSDT.getText());
        return nv;
    }

    void clearFrom() {
        nhanVien nv = new nhanVien();
        setForm(nv);
        row = -1;
        updateStatus();
    }

    int checkKey() {
        int kt = 0;
        List<nhanVien> list = dao.selectAll();
        for (int i = 0; i < list.size(); i++) {
            nhanVien nv = list.get(i);
            if (txtMaNV.getText().trim().equalsIgnoreCase(nv.getMaNV().trim())) {
                kt = 1;
                break;
            }
        }
        return kt;
    }

    void insert() {
        nhanVien nv = getFrom();
        if (txtMaNV.getText().length() == 0
                || txtSDT.getText().length() == 0
                || txtQueQuan.getText().length() == 0
                || txtTenNV.getText().length() == 0) {
            dialogHelper.alert(this, "Không được để trống!");
            return;
        } else if (checkKey() == 1) {
            dialogHelper.alert(this, "Đã tồn tại mã nhân viên:" + txtMaNV.getText());
            return;
        } else {
            try {
                dao.insert(nv);
                this.fillTable();
                this.clearFrom();
                dialogHelper.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                dialogHelper.alert(this, "Thêm mới thất bại!");
                e.printStackTrace();
            }
        }
    }

    void update() {
        nhanVien nv = getFrom();
        try {
            dao.update(nv);
            fillTable();
            clearFrom();
            dialogHelper.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            dialogHelper.alert(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }
    }

    void deleteTamThoi() {
        if (dialogHelper.confirm(this, "Bạn có muốn xóa nhân viên này ?")) {
            try {
                String maNV = txtMaNV.getText();
                dao.delete(maNV);
                fillTable();
                fillTable1();
                clearFrom();
                dialogHelper.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                dialogHelper.alert(this, "Xóa thất bại!");
            }
        }
    }

    void hienThiLai() {
        if (dialogHelper.confirm(this, "Bạn có muốn thêm lại nhân viên này ?")) {
            try {
                String maNV = tblLuuTru.getValueAt(row, 0).toString();
                dao.delete1(maNV);
                fillTable1();
                fillTable();
                dialogHelper.alert(this, "Thêm lại thành công!");
            } catch (Exception e) {
                dialogHelper.alert(this, "Thêm lại thất bại!");
            }
        }
    }

    void edit() {
        String manv = (String) tblNhanVien.getValueAt(this.row, 0);
        nhanVien nv = dao.selectById(manv);
        this.setForm(nv);
        tabs.setSelectedIndex(0);
        this.updateStatus();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblNhanVien.getRowCount() - 1);
        //Trạng thái form
        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
    }

    void xuatExcel() {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Nhân Viên");

            XSSFRow row = null;
            Cell cell = null;

            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SÁCH NHÂN VIÊN");

            row = spreadsheet.createRow(3);

            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã NV");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Họ và tên");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Giới tính");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Quê quán");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Ngày sinh");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("SĐT");

            nhanVienDAO dao = new nhanVienDAO();
            List<nhanVien> listItem = dao.selectAll();

            for (int i = 0; i < listItem.size(); i++) {
                nhanVien nv = listItem.get(i);
                row = spreadsheet.createRow(4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(nv.getMaNV());
                row.createCell(1).setCellValue(nv.getTenNV());
                row.createCell(2).setCellValue(nv.isGioiTinh() ? "Nam" : "Nữ");
                row.createCell(3).setCellValue(nv.getQueQuan());
                row.createCell(4).setCellValue(nv.getNgaySinh().toString());
                row.createCell(5).setCellValue(nv.getSDT());
            }
            FileOutputStream out = new FileOutputStream(new File("C:/Users/NGUYEN TRI TUE/Documents/GitHub/duan1/nv.xlsx"));
            workbook.write(out);
            out.close();
            dialogHelper.alert(this, "Xuất file thành công!");
        } catch (Exception e) {
            dialogHelper.alert(this, "Xuất file thất bại!");
            e.printStackTrace();
        }
    }
}
