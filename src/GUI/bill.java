/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import CLS.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hneen.
 */

public class bill extends javax.swing.JFrame {
    Customer cous;
    List<cartclass> cart;
    /**
     * Creates new form bill
     */
    public bill() {
        initComponents();
    }
    public bill(int customer_id,int num_items,Payment pay,int order_id) {
        initComponents();
        showCustomer_info(customer_id);
        getAllCart(order_id);
        jTextArea1.setEnabled(false);
        jTextArea1.setText(printBill(cous,num_items,pay,order_id));
        jTextArea1.append("******* cart info *********");
        showCart();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        DonejButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 211, 191));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/hneen./IdeaProjects/caffe/icons/bill.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        jLabel2.setText("Bill");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        DonejButton.setBackground(new java.awt.Color(166, 82, 43));
        DonejButton.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        DonejButton.setForeground(new java.awt.Color(255, 255, 255));
        DonejButton.setText("Done!");
        DonejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(DonejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DonejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void DonejButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        loging d= new loging();
        d.setTitle("dashbord");
        d.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    void showCustomer_info(int id_customer) {
        DB conn = new DB();
        Connection dbconn = conn.connectDB();
        try {
            PreparedStatement st1 = (PreparedStatement)
                    dbconn.prepareStatement("select * from customer where coustomer_id = ? ");
            st1.setInt(1, id_customer);
            ResultSet emp_ifo = st1.executeQuery();
            if (emp_ifo.next()) {
                cous=new Customer(id_customer,emp_ifo.getString("coustomer_name"),emp_ifo.getString("coustomer_Phone"));
            }
            dbconn.close();
            st1.close();
            emp_ifo.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    void showCart(){

        if (cart!=null){
            for (cartclass b: cart){
                jTextArea1.append(b.toString());
            }
        }
    }


    public List<Items> getAllCart(int id_order){
        List<Integer> items_id=null;
        List<Items> getingItems =null;
        ResultSet resultSet=null;
        DB n= new DB();
        Connection dbconn =n.connectDB();
        try {
            PreparedStatement getItems = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM cart WHERE order_id=?");
            getItems.setInt(1,id_order);
            resultSet=getItems.executeQuery();
            cart=new ArrayList<cartclass>();
            while (resultSet.next()){
                cart.add(new cartclass(resultSet.getInt("order_id"),resultSet.getInt("item_id"),resultSet.getInt("num_item"),resultSet.getDouble("price")));
            }

            for (cartclass c:cart){
                PreparedStatement getSnack = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM stock where stock_id=?");
                getSnack.setInt(1,c.getItem_id());
                resultSet = getSnack.executeQuery();
                while (resultSet.next()) {
                    c.setItems(new stock(resultSet.getInt("stock_id"),
                            resultSet.getString("stock_name"),
                            resultSet.getDouble("stock_price")));
                }
                getSnack.close();
                resultSet.close();
            }

            getItems.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                dbconn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return getingItems;
    }

    String bill;
    String printBill(Customer customer, int num_items, Payment pay,int idOrder){
        if (pay instanceof cash){
            bill = "********************************\n" +
                    "*         Ticket Summery        *\n" +
                    "********************************\n" +
                    "  Order ID:    " +  idOrder+ "\n" +
                    "  Customer Information:\n" +
                    "  ID: " + customer.getId() + "\n" +
                    "  Name: " + customer.getName() + "\n" +
                    "  Phone: " + customer.getPhone() + "\n" +
                    "  Number Of Items: " + num_items + "  Total Price: " + pay.getTotal_price() + "\n" +
                    "  Payment Way : Cash \n" ;
        }
        if (pay instanceof card){
            bill = "********************************\n" +
                    "*         Ticket Summery        *\n" +
                    "********************************\n" +
                    "  Order ID:    " +  idOrder+ "\n" +
                    "  Customer Information:\n" +
                    "  ID: " + customer.getId() + "\n" +
                    "  Name: " + customer.getName() + "\n" +
                    "  Phone: " + customer.getPhone() + "\n" +
                    "  Number Of Items: " + num_items + "  Total Price: " + pay.getTotal_price() + "\n" +
                    "  Payment Way : card \n" ;
        }
        return bill;
    }




    // Variables declaration - do not modify                     
    private javax.swing.JButton DonejButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}