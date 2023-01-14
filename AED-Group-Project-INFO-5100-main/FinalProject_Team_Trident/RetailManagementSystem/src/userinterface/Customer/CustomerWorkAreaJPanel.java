/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;
import org.apache.log4j.Logger;
import Model.EcoSystem;
import Model.Enterprise.CustomerServiceUnit;
import Model.Enterprise.Enterprise;
import static Model.Enterprise.Enterprise.EnterpriseType.ManagementUnit;
import Model.Enterprise.ManagementUnit;
import Model.RetailEmployment.Agent;
import Model.RetailEmployment.Customer;
import Model.RetailEmployment.CustomerList;
import Model.Location.Location;
import Model.Organization.AgentOrganization;
import Model.Organization.EmergencyOrganization;
import Model.Organization.DepartmentOrganization;
import Model.Organization.Organization;
import Model.Organization.CustomerOrganization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.AgentCheckWorkRequest;
import Model.WorkQueue.EmergencyCustomerRequest;
import Model.WorkQueue.DeoartmentWorkRequest;
import Model.WorkQueue.WorkRequest;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajin
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkArea
     */
     private EcoSystem ecoSystem;
     private JPanel userProcessContainer;
     private UserAccount userAccount;
     CustomerList customerList;
     Customer customer;
     EmergencyCustomerRequest emergencyRequest;
     Location location;
     Organization organization;
     Enterprise enterprise;
    private static Logger log = Logger.getLogger(CustomerWorkAreaJPanel.class);
    private static final String CLASS_NAME = CustomerWorkAreaJPanel.class.getName();
     
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem ecoSystem, Location location,
            Organization organization,Enterprise enterprise) {
        initComponents();
        this.ecoSystem =ecoSystem;
        this.userProcessContainer = userProcessContainer;
        this.location = location;
        this.userAccount = account;
        this.customerList = ecoSystem.getCustomerDirectory();
        this.organization = organization;
        
        for(Location netwrk : ecoSystem.getLocationList())
        {
            for( Enterprise enprise : netwrk.getEnterpriseDirectory().getEnterpriseList())
            {
                if(enprise instanceof ManagementUnit)
                {
                     this.enterprise = enprise;
                }

            }
        }
        
         for( Customer customer :  ecoSystem.getCustomerDirectory().getCustomerList())
        {
            if(customer.getCustomerName().equals(userAccount.getEmployee().getName()))
            {
                this.customer = customer;
            }
        }   
        
        populateCustomerFields();
        //valueLabel.setText(account.getEmployee().getName());
        //populateRequestTable();
       // populateRequestTable();
        populateRequestTicketTable();
       // populateTable();
    }
    
     public void populateCustomerFields()
    {
      log.info("Info for populatePatientFields");
//        DefaultTableModel ordModel = (DefaultTableModel) workRequestJTable.getModel();
//                    ordModel.setRowCount(0);
        for( Customer customer :  ecoSystem.getCustomerDirectory().getCustomerList())
        {
            if(customer.getCustomerName().equals(userAccount.getEmployee().getName()))
            {
                lblName.setText(customer.getCustomerName());
                txtcustomername.setText(customer.getCustomerName());
                txtage.setText(String.valueOf(customer.getAge()));
                txtEmailAdd.setText(customer.getEmailAddress());
               // txtbloodgroup.setText(customer.getBloodGrp());
                txtPhoneNum.setText(customer.getPhoneNumber());
               // txtgender.setText(customer.getGender());
                txtAddress.setText(customer.getAddress());
                txtCustomerId.setText(String.valueOf(customer.getCustomerId()));
                txtAssigAgent.setText(customer.getAgent());
               // txtgender.setText(customer.getGender());
                txtLocation.setText(customer.getLocation());
                cbGender.setSelectedItem(customer.getGender());
                cbBloodGrp.setSelectedItem(customer.getBloodGrp());
                
            }
            
        }
        
        Organization customerOrg = null;
        for(Enterprise enterprise : location.getEnterpriseDirectory().getEnterpriseList())
        {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
               if (organization instanceof CustomerOrganization) {

                   customerOrg = organization;
                   break;
               }
           }
        }
        String UserName = "";
        String Password ="";
                
        for(UserAccount useraccount : customerOrg.getUserAccountDirectory().getUserAccountList())
            {
                if(useraccount.getEmployee().getName().equals(customer.getCustomerName()))
                {
                    System.out.println(useraccount);
                    UserName = useraccount.getUsername();
                    Password = useraccount.getUsername();
                }
            }
           txtUserName.setText(UserName);
                txtPassword.setText(Password);
    }
     
       
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        txtcustomername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmailAdd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtAssigAgent = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        cbBloodGrp = new javax.swing.JComboBox<>();
        cbGender = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDefectSign = new javax.swing.JTable();
        btnCreateTicketReq = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(300);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtcustomername, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 180, 154, -1));

        jLabel2.setText("Customer Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 185, -1, -1));

        jLabel6.setText("Customer Gender :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 228, -1, -1));

        jLabel7.setText("Blood Group :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 273, -1, -1));

        jLabel8.setText("Customer Age :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 319, -1, -1));

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        jPanel1.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 314, 154, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Hi..");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel16.setText("Customer Id :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 141, -1, -1));

        txtCustomerId.setEditable(false);
        jPanel1.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 136, 151, -1));

        jLabel9.setText("Phone Number :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 363, -1, -1));
        jPanel1.add(txtPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 358, 154, -1));

        jLabel10.setText("Email Address :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 407, 77, -1));
        jPanel1.add(txtEmailAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 402, 154, -1));

        jLabel11.setText("Customer Address :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 451, 110, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 446, 154, -1));

        btnUpdate.setText("Update ");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 146, -1));

        jLabel12.setText("Customer Agent :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 539, -1, -1));

        txtAssigAgent.setEditable(false);
        jPanel1.add(txtAssigAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 153, -1));

        jLabel14.setText("Location :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 495, -1, -1));
        jPanel1.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 153, -1));

        txtUserName.setEditable(false);
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 48, 151, -1));

        jLabel15.setText("User Name :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 53, -1, 17));

        txtPassword.setEditable(false);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 92, 151, -1));

        jLabel17.setText("Password :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 97, -1, -1));

        cbBloodGrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(cbBloodGrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 269, 154, -1));

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        cbGender.setToolTipText("");
        jPanel1.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 224, 154, -1));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 6, 80, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/HappyCustomerBG1.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -90, 500, 1200));

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 6, 161, 26));

        tblDefectSign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Packge Damaged", "Product Damaged", "Issue with refund", "Lost Package", "Appointment Date", "Date", "Customer Agent"
            }
        ));
        jScrollPane1.setViewportView(tblDefectSign);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 38, 540, 100));

        btnCreateTicketReq.setText("Create Request");
        btnCreateTicketReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTicketReqActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreateTicketReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 163, 540, -1));

        lblName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/HappyCustomerBG1.png"))); // NOI18N
        lblName.setText("<Name>");
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, -90, 1110, 1190));

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    
            
                    
         
     
    
    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void btnCreateTicketReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTicketReqActionPerformed
        // TODO add your handling code here:
        
        
        JDateChooser jd = new JDateChooser();
        jd.setMinSelectableDate(new Date());
     //   jd.setMaxSelectableDate(new Date().);
        //new Date().
        Date referenceDate = new Date();
        Calendar c = Calendar.getInstance(); 
        c.setTime(referenceDate); 
        c.add(Calendar.MONTH, 3);
        System.out.println("C.gettime "+ c.getTime());
        jd.setMaxSelectableDate(c.getTime());
//return c.getTime()
        
        String message ="Choose Ticket date:\n";
        Object[] params = {message,jd};
        JOptionPane.showConfirmDialog(null,params,"Start date", JOptionPane.PLAIN_MESSAGE);
        
        
                String s="";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        JDateChooser date =(JDateChooser)params[1];//Casting params[1] makes me able to get its information
        System.out.println(date.getDate());
        
        Organization doctorOrg = null;
        for(Enterprise enterprise : location.getEnterpriseDirectory().getEnterpriseList())
       {
           for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
              if (organization instanceof AgentOrganization ) {

                  doctorOrg = organization;
                  break;
              }
          }
       }
        
        String agentName = txtAssigAgent.getText();
                     
         for(Agent agent : ecoSystem.getAgentDirectory().getAgentList())
        {
           if(agent.getAgentName().equals(agentName))
           {
               for(UserAccount ua : doctorOrg.getUserAccountDirectory().getUserAccountList())
               {
                   if(ua.getEmployee().getName().equals(agentName))
                   {  
                       System.out.println("Ticket date "+ date);
                        AgentCheckWorkRequest cur = new AgentCheckWorkRequest() ;
                        cur.setAgent(agent);
                        cur.setSender(userAccount);
                        cur.setReceiver(ua);
                        cur.setCustomer(customer);
                        cur.setStatus("Request"); 
                        cur.setRequestdate(date.getDate());
                        cur.setSenderNetwork(location);
                        cur.setSenderOrganization(organization);
                        cur.setRecieverNetwork(location);
                        cur.setRecieverOrganization(organization);
                        ua.getWorkQueue().addWorkRequest(cur);
                         JOptionPane.showMessageDialog(null, "Ticket created and successfully sent");
                   }   
               }
           }
        }
         
         
         populateRequestTicketTable();
        
        
        
        
    }//GEN-LAST:event_btnCreateTicketReqActionPerformed

    public void populateRequestTicketTable()
    {
        System.out.println("PopulateCheck table");
        //DefaultTableModel ordModel = (DefaultTableModel) tblEmerReq1.getModel();
       // ordModel.setRowCount(0);
         DefaultTableModel vitalModel = (DefaultTableModel) tblDefectSign.getModel();
        vitalModel.setRowCount(0);
        Organization agentOrg = null;
        for(Enterprise enterprise : location.getEnterpriseDirectory().getEnterpriseList())
       {
           for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
              if (organization instanceof AgentOrganization ) {

                  agentOrg = organization;
                  break;
              }
          }
       }

         
               for(UserAccount ua : agentOrg.getUserAccountDirectory().getUserAccountList())
               {
                    System.out.println("UA-" +ua.getUsername());
                   for(WorkRequest wr : ua.getWorkQueue().getWorkRequestList())
                   {  
                       System.out.println("wr-"+wr);
                        if(wr instanceof AgentCheckWorkRequest)
                        {
                            AgentCheckWorkRequest epr = (AgentCheckWorkRequest)wr;
                            if(epr.getCustomer() == customer)
                            {
                                System.out.println("For loop Table row added");

//                                                                   
                                        if(epr.getCheckUp() != null)
                                        {
                                            Object [] row2 = new Object[8];
                                                    row2[0] = epr.getCheckupRequestId();
                                                    row2[1] = epr.getCheckUp().getRefund() ;
                                                    row2[2] = epr.getCheckUp().getProductDamage();
                                                    row2[3] = epr.getCheckUp().getPackageDamage();
                                                    row2[4] =  epr.getCheckUp().getLostPackage();
                                                    row2[5] = epr.getRequestdate();
                                                    row2[6] = epr.getCheckUp().getDate();
                                                    row2[7] = epr.getAgent().getAgentName();
                                                    vitalModel.addRow(row2);
                                        }
                            }
                        }
                
                   }
                }
           
    //    }
   
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
//        if(txtcustomername.getText().isEmpty() ||  txtEmailAdd.getText().isEmpty() ||
//            txtPhoneNum.getText().isEmpty() || 
//            txtAddress.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "First Name, Email address , User Name, Password,  Phone number  and Address Fields cannot be left empty");
//            return;
//        }

        boolean flag ;

        String email = txtEmailAdd.getText();

        flag = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of X@Y.Z");
            return;
        }

        for(Customer customer : ecoSystem.getCustomerDirectory().getCustomerList()) {
            if(customer != customer)
            {
                if(customer.getEmailAddress().equals(email))
                {
                    JOptionPane.showMessageDialog(null, "Email Address already exists");
                }
            }
        }

        String phoneNumber = txtPhoneNum.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }

        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        for(Customer patient : customerList.getCustomerList()) {
            if(patient != patient)
            {
                if(patient.getPhoneNumber().equals(phoneNumber)) {
                    JOptionPane.showMessageDialog(null, "Phone Number already exists");
                }
            }
        }

        int age = 0;

        try {

            if(!txtage.getText().isEmpty())
            {
                age = Integer.parseInt(txtage.getText());
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have integers only");
            return;
        }

        String firstname = txtcustomername.getText() ;
        // String email = txtEmailAdd.getText();
        String phone = txtPhoneNum.getText();
        String address = txtAddress.getText();
        // String age = txtAge.getText();
       // String userName= txtUserName.getText();
       // String password = txtPassword.getText();
      

        customer.setCustomerName(firstname);
        customer.setEmailAddress(email);
        customer.setPhoneNumber(phone);
        customer.setAge(age);
        customer.setAddress(address);
       

        JOptionPane.showMessageDialog(null, "Customer Profile Updated");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        // TODO add your handling code here:
        if(txtUserName.getText().isEmpty())
        {
            return;
        }
        String userName = txtUserName.getText();
        for(UserAccount account : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                txtUserName.setText(null);
                return;
            }
        }
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed
    public void ppopulateLongituteLatitude(String locationPoint)
       {
           txtLocation.setText(locationPoint);
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateTicketReq;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbBloodGrp;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblDefectSign;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAssigAgent;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtEmailAdd;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcustomername;
    // End of variables declaration//GEN-END:variables
}
