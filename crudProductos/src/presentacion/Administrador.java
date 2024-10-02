package presentacion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableModel;


public class Administrador extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Administrador() {
        initComponents();
        pn_nuevo.setVisible(false);
        pn_listar.setVisible(false);
        pn_modificar.setVisible(false);
        pn_eliminar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        header1 = new javax.swing.JPanel();
        exitBtn1 = new javax.swing.JPanel();
        exitTxt6 = new javax.swing.JLabel();
        exitTxt1 = new javax.swing.JLabel();
        header2 = new javax.swing.JPanel();
        exitBtn2 = new javax.swing.JPanel();
        exitTxt5 = new javax.swing.JLabel();
        exitTxt2 = new javax.swing.JLabel();
        header3 = new javax.swing.JPanel();
        exitBtn3 = new javax.swing.JPanel();
        exitTxt3 = new javax.swing.JLabel();
        exitTxt7 = new javax.swing.JLabel();
        header4 = new javax.swing.JPanel();
        exitBtn4 = new javax.swing.JPanel();
        exitTxt4 = new javax.swing.JLabel();
        exitTxt8 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        pn_nuevo = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        ff_precio = new javax.swing.JFormattedTextField();
        userLabel3 = new javax.swing.JLabel();
        userLabel4 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        tf_unidad = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        ff_codigo = new javax.swing.JFormattedTextField();
        pn_listar = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_lista = new javax.swing.JTable();
        pn_modificar = new javax.swing.JPanel();
        title4 = new javax.swing.JLabel();
        userLabel5 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        passLabel3 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        loginBtn3 = new javax.swing.JPanel();
        loginBtnTxt3 = new javax.swing.JLabel();
        ff_precio1 = new javax.swing.JFormattedTextField();
        userLabel6 = new javax.swing.JLabel();
        userLabel7 = new javax.swing.JLabel();
        tf_nombre1 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        tf_unidad1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        cb_productos = new javax.swing.JComboBox<>();
        pn_eliminar = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_lista1 = new javax.swing.JTable();
        loginBtn4 = new javax.swing.JPanel();
        loginBtnTxt4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo.png"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 290, 140));

        header1.setBackground(new java.awt.Color(255, 255, 255));
        header1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header1MouseDragged(evt);
            }
        });
        header1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header1MousePressed(evt);
            }
        });

        exitBtn1.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt6.setBackground(new java.awt.Color(0, 134, 190));
        exitTxt6.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/agregar.png"))); // NOI18N
        exitTxt6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt6.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt6MouseExited(evt);
            }
        });

        exitTxt1.setBackground(new java.awt.Color(0, 134, 190));
        exitTxt1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt1.setText("Agregar");
        exitTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt1.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn1Layout = new javax.swing.GroupLayout(exitBtn1);
        exitBtn1.setLayout(exitBtn1Layout);
        exitBtn1Layout.setHorizontalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtn1Layout.createSequentialGroup()
                .addComponent(exitTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtn1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitTxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(271, 271, 271)))
        );
        exitBtn1Layout.setVerticalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtn1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(exitTxt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, 40));

        header2.setBackground(new java.awt.Color(255, 255, 255));
        header2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header2MouseDragged(evt);
            }
        });
        header2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header2MousePressed(evt);
            }
        });

        exitBtn2.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt5.setBackground(new java.awt.Color(0, 134, 190));
        exitTxt5.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/listar.png"))); // NOI18N
        exitTxt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt5.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt5MouseExited(evt);
            }
        });

        exitTxt2.setBackground(new java.awt.Color(0, 134, 190));
        exitTxt2.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt2.setText("Listar     ");
        exitTxt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt2.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn2Layout = new javax.swing.GroupLayout(exitBtn2);
        exitBtn2.setLayout(exitBtn2Layout);
        exitBtn2Layout.setHorizontalGroup(
            exitBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtn2Layout.createSequentialGroup()
                .addComponent(exitTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(exitBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtn2Layout.createSequentialGroup()
                    .addComponent(exitTxt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 268, Short.MAX_VALUE)))
        );
        exitBtn2Layout.setVerticalGroup(
            exitBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addGroup(exitBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtn2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(exitTxt5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout header2Layout = new javax.swing.GroupLayout(header2);
        header2.setLayout(header2Layout);
        header2Layout.setHorizontalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header2Layout.createSequentialGroup()
                .addComponent(exitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        header2Layout.setVerticalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 280, 40));

        header3.setBackground(new java.awt.Color(255, 255, 255));
        header3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header3MouseDragged(evt);
            }
        });
        header3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header3MousePressed(evt);
            }
        });

        exitBtn3.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt3.setBackground(new java.awt.Color(0, 134, 190));
        exitTxt3.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt3.setText("Modificar");
        exitTxt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt3.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt3MouseExited(evt);
            }
        });

        exitTxt7.setBackground(new java.awt.Color(0, 134, 190));
        exitTxt7.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/modificar.png"))); // NOI18N
        exitTxt7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt7.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn3Layout = new javax.swing.GroupLayout(exitBtn3);
        exitBtn3.setLayout(exitBtn3Layout);
        exitBtn3Layout.setHorizontalGroup(
            exitBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtn3Layout.createSequentialGroup()
                .addComponent(exitTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(exitBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtn3Layout.createSequentialGroup()
                    .addComponent(exitTxt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 268, Short.MAX_VALUE)))
        );
        exitBtn3Layout.setVerticalGroup(
            exitBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addGroup(exitBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtn3Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(exitTxt7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout header3Layout = new javax.swing.GroupLayout(header3);
        header3.setLayout(header3Layout);
        header3Layout.setHorizontalGroup(
            header3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header3Layout.createSequentialGroup()
                .addComponent(exitBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        header3Layout.setVerticalGroup(
            header3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 280, 40));

        header4.setBackground(new java.awt.Color(255, 255, 255));
        header4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header4MouseDragged(evt);
            }
        });
        header4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header4MousePressed(evt);
            }
        });

        exitBtn4.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt4.setBackground(new java.awt.Color(0, 134, 190));
        exitTxt4.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt4.setText("Eliminar");
        exitTxt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt4.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt4MouseExited(evt);
            }
        });

        exitTxt8.setBackground(new java.awt.Color(0, 134, 190));
        exitTxt8.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Eliminar.png"))); // NOI18N
        exitTxt8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt8.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn4Layout = new javax.swing.GroupLayout(exitBtn4);
        exitBtn4.setLayout(exitBtn4Layout);
        exitBtn4Layout.setHorizontalGroup(
            exitBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtn4Layout.createSequentialGroup()
                .addComponent(exitTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(exitBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtn4Layout.createSequentialGroup()
                    .addComponent(exitTxt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 268, Short.MAX_VALUE)))
        );
        exitBtn4Layout.setVerticalGroup(
            exitBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt4, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addGroup(exitBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtn4Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(exitTxt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout header4Layout = new javax.swing.GroupLayout(header4);
        header4.setLayout(header4Layout);
        header4Layout.setHorizontalGroup(
            header4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header4Layout.createSequentialGroup()
                .addComponent(exitBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        header4Layout.setVerticalGroup(
            header4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 280, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        favicon.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/favicon.png"))); // NOI18N
        favicon.setText("PRODUCTOS");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(favicon, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 582, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(favicon))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 40));

        citybg.setBackground(new java.awt.Color(0, 134, 190));
        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city.png"))); // NOI18N
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 500));

        pn_nuevo.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("Agregar Producto");

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setText("PRECIO");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel.setText("NOMBRE");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        loginBtn.setBackground(new java.awt.Color(0, 134, 190));

        loginBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("Agregar");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        ff_precio.setBorder(null);
        ff_precio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));
        ff_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ff_precioActionPerformed(evt);
            }
        });

        userLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel3.setText("CODIGO");

        userLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel4.setText("UNIDAD");

        tf_nombre.setBorder(null);
        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        tf_unidad.setBorder(null);
        tf_unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_unidadActionPerformed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        ff_codigo.setBorder(null);
        ff_codigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));
        ff_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ff_codigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_nuevoLayout = new javax.swing.GroupLayout(pn_nuevo);
        pn_nuevo.setLayout(pn_nuevoLayout);
        pn_nuevoLayout.setHorizontalGroup(
            pn_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_nuevoLayout.createSequentialGroup()
                .addGroup(pn_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_nuevoLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(title))
                    .addGroup(pn_nuevoLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(passLabel))
                    .addGroup(pn_nuevoLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(pn_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(tf_nombre)
                            .addComponent(jSeparator7)
                            .addGroup(pn_nuevoLayout.createSequentialGroup()
                                .addGroup(pn_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userLabel4)
                                    .addComponent(userLabel)
                                    .addComponent(userLabel3))
                                .addGap(0, 410, Short.MAX_VALUE))
                            .addComponent(tf_unidad)
                            .addComponent(jSeparator8)
                            .addComponent(ff_precio)
                            .addComponent(ff_codigo))))
                .addGap(117, 117, 117))
            .addGroup(pn_nuevoLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_nuevoLayout.setVerticalGroup(
            pn_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_nuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(44, 44, 44)
                .addComponent(userLabel3)
                .addGap(18, 18, 18)
                .addComponent(ff_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userLabel)
                .addGap(7, 7, 7)
                .addComponent(ff_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        bg.add(pn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 670, 490));

        pn_listar.setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title1.setText("Lista de Productos");

        tb_lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Unidad"
            }
        ));
        jScrollPane1.setViewportView(tb_lista);

        javax.swing.GroupLayout pn_listarLayout = new javax.swing.GroupLayout(pn_listar);
        pn_listar.setLayout(pn_listarLayout);
        pn_listarLayout.setHorizontalGroup(
            pn_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_listarLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(title1)
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_listarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        pn_listarLayout.setVerticalGroup(
            pn_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_listarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        bg.add(pn_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 670, 490));

        pn_modificar.setBackground(new java.awt.Color(255, 255, 255));

        title4.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title4.setText("Modificar Producto");

        userLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel5.setText("PRECIO");

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        passLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel3.setText("NOMBRE");

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));

        loginBtn3.setBackground(new java.awt.Color(0, 134, 190));

        loginBtnTxt3.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        loginBtnTxt3.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt3.setText("Modificar");
        loginBtnTxt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxt3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxt3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxt3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtn3Layout = new javax.swing.GroupLayout(loginBtn3);
        loginBtn3.setLayout(loginBtn3Layout);
        loginBtn3Layout.setHorizontalGroup(
            loginBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        loginBtn3Layout.setVerticalGroup(
            loginBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        ff_precio1.setBorder(null);
        ff_precio1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));
        ff_precio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ff_precio1ActionPerformed(evt);
            }
        });

        userLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel6.setText("CODIGO");

        userLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel7.setText("UNIDAD");

        tf_nombre1.setBorder(null);
        tf_nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombre1ActionPerformed(evt);
            }
        });

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));

        tf_unidad1.setBorder(null);
        tf_unidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_unidad1ActionPerformed(evt);
            }
        });

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));

        cb_productos.setBackground(new java.awt.Color(51, 204, 255));
        cb_productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb_productos.setBorder(null);
        cb_productos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_productosItemStateChanged(evt);
            }
        });
        cb_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_productosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_modificarLayout = new javax.swing.GroupLayout(pn_modificar);
        pn_modificar.setLayout(pn_modificarLayout);
        pn_modificarLayout.setHorizontalGroup(
            pn_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_modificarLayout.createSequentialGroup()
                .addGroup(pn_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_modificarLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(title4))
                    .addGroup(pn_modificarLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(passLabel3))
                    .addGroup(pn_modificarLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(pn_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9)
                            .addComponent(jSeparator10)
                            .addComponent(tf_nombre1)
                            .addComponent(jSeparator11)
                            .addComponent(tf_unidad1)
                            .addComponent(jSeparator12)
                            .addComponent(ff_precio1)
                            .addGroup(pn_modificarLayout.createSequentialGroup()
                                .addGroup(pn_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userLabel7)
                                    .addComponent(userLabel5)
                                    .addComponent(userLabel6)
                                    .addComponent(cb_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 9, Short.MAX_VALUE)))))
                .addGap(117, 117, 117))
            .addGroup(pn_modificarLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(loginBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_modificarLayout.setVerticalGroup(
            pn_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title4)
                .addGap(44, 44, 44)
                .addComponent(userLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userLabel5)
                .addGap(7, 7, 7)
                .addComponent(ff_precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_unidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        bg.add(pn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 670, 490));

        pn_eliminar.setBackground(new java.awt.Color(255, 255, 255));

        title2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title2.setText("Eliminar Producto");

        tb_lista1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Unidad"
            }
        ));
        tb_lista1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tb_lista1);

        loginBtn4.setBackground(new java.awt.Color(0, 134, 190));

        loginBtnTxt4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        loginBtnTxt4.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt4.setText("Eliminar");
        loginBtnTxt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxt4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxt4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxt4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtn4Layout = new javax.swing.GroupLayout(loginBtn4);
        loginBtn4.setLayout(loginBtn4Layout);
        loginBtn4Layout.setHorizontalGroup(
            loginBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        loginBtn4Layout.setVerticalGroup(
            loginBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_eliminarLayout = new javax.swing.GroupLayout(pn_eliminar);
        pn_eliminar.setLayout(pn_eliminarLayout);
        pn_eliminarLayout.setHorizontalGroup(
            pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_eliminarLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(title2)
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_eliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_eliminarLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_eliminarLayout.createSequentialGroup()
                        .addComponent(loginBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))))
        );
        pn_eliminarLayout.setVerticalGroup(
            pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(loginBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        bg.add(pn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 670, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseClicked
        // TODO add your handling code here:
        pn_listar.setVisible(false);
        pn_modificar.setVisible(false);
        pn_eliminar.setVisible(false);
        pn_nuevo.setVisible(true);
    }//GEN-LAST:event_exitTxt1MouseClicked

    private void exitTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseEntered
        // TODO add your handling code here:
        exitBtn1.setBackground(Color.blue);
        exitTxt1.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt1MouseEntered

    private void exitTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseExited
        // TODO add your handling code here:
        exitBtn1.setBackground(Color.white);
        exitTxt1.setForeground(Color.black);
    }//GEN-LAST:event_exitTxt1MouseExited

    private void header1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_header1MouseDragged

    private void header1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_header1MousePressed

    private void exitTxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt2MouseClicked
        // TODO add your handling code here:
        pn_modificar.setVisible(false);
        pn_eliminar.setVisible(false);
        pn_nuevo.setVisible(false);
        pn_listar.setVisible(true);

        try {

            //limpiar tabla
            tb_lista.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Codigo", "Nombre", "Precio", "Unidad"
                    }
            ));

            // TODO add your handling code here:
            String cc, n, p, u;
            for (Product t : inventario) {
                Object[] row = {t.getId(), t.getDescripcion(), t.getPrecio(), t.getUnidad()};
                DefaultTableModel modelo = (DefaultTableModel) tb_lista.getModel();
                modelo.addRow(row);
                tb_lista.setModel(modelo);            
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_exitTxt2MouseClicked

    private void listarTabla() {
        try {

            //limpiar tabla
            tb_lista1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Codigo", "Nombre", "Precio", "Unidad"
                    }
            ));

            // TODO add your handling code here:
            for (Product t : inventario) {
                Object[] row = {t.getId(), t.getDescripcion(), t.getPrecio(), t.getUnidad()};
                DefaultTableModel modelo = (DefaultTableModel) tb_lista1.getModel();
                modelo.addRow(row);
                tb_lista1.setModel(modelo);            
            }
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    private void exitTxt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt2MouseEntered
        // TODO add your handling code here:
        exitBtn2.setBackground(Color.blue);
        exitTxt2.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt2MouseEntered

    private void exitTxt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt2MouseExited
        // TODO add your handling code here:
        exitBtn2.setBackground(Color.white);
        exitTxt2.setForeground(Color.black);
    }//GEN-LAST:event_exitTxt2MouseExited

    private void header2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_header2MouseDragged

    private void header2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_header2MousePressed

    private void llenarcombo() {
        cb_productos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        for (Product t : inventario) {
                DefaultComboBoxModel modelo =
                        (DefaultComboBoxModel) cb_productos.getModel();
                modelo.addElement(t);
                cb_productos.setModel(modelo);
        }
    }

    private void exitTxt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt3MouseClicked
        // TODO add your handling code here:        
        pn_eliminar.setVisible(false);
        pn_nuevo.setVisible(false);
        pn_listar.setVisible(false);
        pn_modificar.setVisible(true);

        llenarcombo();


    }//GEN-LAST:event_exitTxt3MouseClicked

    private void exitTxt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt3MouseEntered
        // TODO add your handling code here:
        exitBtn3.setBackground(Color.blue);
        exitTxt3.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt3MouseEntered

    private void exitTxt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt3MouseExited
        // TODO add your handling code here:
        exitBtn3.setBackground(Color.white);
        exitTxt3.setForeground(Color.black);
    }//GEN-LAST:event_exitTxt3MouseExited

    private void header3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header3MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_header3MouseDragged

    private void header3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_header3MousePressed

    private void exitTxt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt4MouseClicked
        // TODO add your handling code here:

        pn_nuevo.setVisible(false);
        pn_listar.setVisible(false);
        pn_modificar.setVisible(false);
        pn_eliminar.setVisible(true);

        listarTabla();


    }//GEN-LAST:event_exitTxt4MouseClicked

    private void exitTxt4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt4MouseEntered
        // TODO add your handling code here:
        exitBtn4.setBackground(Color.blue);
        exitTxt4.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt4MouseEntered

    private void exitTxt4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt4MouseExited
        // TODO add your handling code here:
        exitBtn4.setBackground(Color.white);
        exitTxt4.setForeground(Color.black);
    }//GEN-LAST:event_exitTxt4MouseExited

    private void header4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header4MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_header4MouseDragged

    private void header4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_header4MousePressed

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void ff_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ff_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ff_precioActionPerformed

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        //guardar data
        try {

            
            inventario.add(
            new Product(Integer.parseInt(ff_codigo.getText()), 
                        tf_nombre.getText(), 
                        Integer.parseInt(ff_precio.getText()),
                        tf_unidad.getText())
            );
            ff_codigo.setText("");
            ff_precio.setText("");
            tf_nombre.setText("");
            tf_unidad.setText("");
            JOptionPane.showMessageDialog(this, "Producto agregado exitosamente");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void tf_unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_unidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_unidadActionPerformed

    private void ff_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ff_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ff_codigoActionPerformed

    private void loginBtnTxt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxt3MouseClicked
        // TODO add your handling code here:
       

            inventario.get(
                    cb_productos.getSelectedIndex()
            ).setDescripcion(tf_nombre1.getText());
            
            inventario.get(
                    cb_productos.getSelectedIndex()
            ).setPrecio(Double.parseDouble(ff_precio1.getText()));
            
            inventario.get(
                    cb_productos.getSelectedIndex()
            ).setUnidad(tf_unidad1.getText());
            ff_precio1.setText("");
            tf_nombre1.setText("");
            tf_unidad1.setText("");
            JOptionPane.showMessageDialog(this, "Producto Modificado exitosamente");

            llenarcombo();

       

    }//GEN-LAST:event_loginBtnTxt3MouseClicked

    private void loginBtnTxt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxt3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnTxt3MouseEntered

    private void loginBtnTxt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxt3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnTxt3MouseExited

    private void ff_precio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ff_precio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ff_precio1ActionPerformed

    private void tf_nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombre1ActionPerformed

    private void tf_unidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_unidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_unidad1ActionPerformed

    private void cb_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_productosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_productosActionPerformed

    private void cb_productosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_productosItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            Product t = (Product) cb_productos.getSelectedItem();
            tf_nombre1.setText(t.getDescripcion());
            ff_precio1.setText(Double.toString(t.getPrecio()));
            tf_unidad1.setText(t.getUnidad());
        }
    }//GEN-LAST:event_cb_productosItemStateChanged

    private void loginBtnTxt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxt4MouseClicked
        // TODO add your handling code here:
        if (tb_lista1.getSelectedRow() >= 0) {
            int r = JOptionPane.showConfirmDialog(tb_lista1, "Desea elimnar producto????", "Eliminar producto", YES_NO_OPTION);
            if (r == 0) {
                inventario.remove(tb_lista1.getSelectedRow());
                listarTabla();
                JOptionPane.showMessageDialog(this, "Producto Elimniado exitosamente");

            }

        }
    }//GEN-LAST:event_loginBtnTxt4MouseClicked

    private void loginBtnTxt4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxt4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnTxt4MouseEntered

    private void loginBtnTxt4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxt4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnTxt4MouseExited

    private void exitTxt6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt6MouseClicked

    private void exitTxt6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt6MouseEntered

    private void exitTxt6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt6MouseExited

    private void exitTxt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt5MouseClicked

    private void exitTxt5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt5MouseEntered

    private void exitTxt5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt5MouseExited

    private void exitTxt7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt7MouseClicked

    private void exitTxt7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt7MouseEntered

    private void exitTxt7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt7MouseExited

    private void exitTxt8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt8MouseClicked

    private void exitTxt8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt8MouseEntered

    private void exitTxt8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxt8MouseExited

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    ArrayList<Product> inventario=new ArrayList();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> cb_productos;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel exitBtn1;
    private javax.swing.JPanel exitBtn2;
    private javax.swing.JPanel exitBtn3;
    private javax.swing.JPanel exitBtn4;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel exitTxt1;
    private javax.swing.JLabel exitTxt2;
    private javax.swing.JLabel exitTxt3;
    private javax.swing.JLabel exitTxt4;
    private javax.swing.JLabel exitTxt5;
    private javax.swing.JLabel exitTxt6;
    private javax.swing.JLabel exitTxt7;
    private javax.swing.JLabel exitTxt8;
    private javax.swing.JLabel favicon;
    private javax.swing.JFormattedTextField ff_codigo;
    private javax.swing.JFormattedTextField ff_precio;
    private javax.swing.JFormattedTextField ff_precio1;
    private javax.swing.JPanel header;
    private javax.swing.JPanel header1;
    private javax.swing.JPanel header2;
    private javax.swing.JPanel header3;
    private javax.swing.JPanel header4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JPanel loginBtn3;
    private javax.swing.JPanel loginBtn4;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel loginBtnTxt3;
    private javax.swing.JLabel loginBtnTxt4;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel passLabel3;
    private javax.swing.JPanel pn_eliminar;
    private javax.swing.JPanel pn_listar;
    private javax.swing.JPanel pn_modificar;
    private javax.swing.JPanel pn_nuevo;
    private javax.swing.JTable tb_lista;
    private javax.swing.JTable tb_lista1;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_unidad;
    private javax.swing.JTextField tf_unidad1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel3;
    private javax.swing.JLabel userLabel4;
    private javax.swing.JLabel userLabel5;
    private javax.swing.JLabel userLabel6;
    private javax.swing.JLabel userLabel7;
    // End of variables declaration//GEN-END:variables
}
