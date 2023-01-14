/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerQueryDepartment;

import Model.EcoSystem;
import Model.Employee.Employee;
import Model.Enterprise.Enterprise;
import Model.RetailEmployment.Agent;
import Model.RetailEmployment.Customer;
import Model.RetailEmployment.CustomerList;
import Model.Location.Location;
import Model.Organization.Organization;
import Model.Organization.CustomerOrganization;
import Model.Role.CustomerRole;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.CustomerQueryDepartment.LocationMap;

/**
 *
 * @author siddhisawant
 */

public class CreateCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCustomerJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecoSystem;
    CustomerList customerList ;
    Customer customer;
    Location network;
    public CreateCustomerJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, CustomerList customerList, 
            Location network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.customerList = customerList;
        this.network = network;
        btnUpdate.setVisible(false);
         txtCustomerId.setEditable(false);
         txtAssigAgent.setEditable(false);
    }
    
    
     
       public CreateCustomerJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, CustomerList customerList,Customer customer,
               Location network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.customerList = customerList;
        this.customer=customer;
        
        this.network = network;
        btnUpdate.setVisible(true);
        PopulateValue(customer);
        btnCustomerSave.setVisible(false);
        txtCustomerId.setEditable(false);
         txtAssigAgent.setEditable(false);
         cbBloodGrp.setEnabled(false);
         cbGender.setEnabled(false);
         jLabel1.setText("Update Patient");
         lblMsg.setText("Only location and Doctor can be update from this form");
    }
     
     
       public void PopulateValue(Customer customer)
    {
        txtFirstName.setText(customer.getCustomerName());
        //txtMiddelName.setText(customer.getMiddelName());
        //txtLastName.setText(customer.getLastName());
        txtEmailAdd.setText(customer.getEmailAddress());
        txtPhoneNum.setText(customer.getPhoneNumber());
        txtUserName.setText(customer.getUserName());
        txtAge.setText(String.valueOf(customer.getAge()));
        cbBloodGrp.setSelectedItem(customer.getBloodGrp());
        cbGender.setSelectedItem(customer.getGender());
        txtAddress.setText(customer.getAddress());
        txtCustomerId.setText(String.valueOf(customer.getCustomerId()));
        txtAssigAgent.setText(customer.getAgent());
        txtLocation.setText(customer.getLocation());
        String UserName = "" ;
            String Password = ""; 
           Organization customerOrg = null;
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
        {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
               if (organization instanceof CustomerOrganization) {

                   customerOrg = organization;
                   break;
               }
           }
        }
        
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
            txtUserName.setEditable(false);
            txtPassword.setEditable(false);
        
            txtFirstName.setEditable(false);
        //txtMiddelName.setText(customer.getMiddelName());
        //txtLastName.setText(customer.getLastName());
        txtEmailAdd.setEditable(false);
        txtPhoneNum.setEditable(false);
        txtUserName.setEditable(false);
        txtAge.setEditable(false);
        txtAddress.setEditable(false);
        txtAssigAgent.setEditable(false);
       
    }

    public void ppopulateLongituteLatitude(String locationPoint)
       {
           txtLocation.setText(locationPoint);
       }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnCustomerSave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtEmailAdd = new javax.swing.JTextField();
        txtPhoneNum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtAssigAgent = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        cbBloodGrp = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        txtLocation = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblMsg = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE CUSTOMER PROFILE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 380, 39));

        jLabel2.setText("Full Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 272, -1, -1));

        jLabel5.setText("Phone Number :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 460, -1, 20));

        jLabel6.setText("Email Address :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, 30));

        jLabel7.setText("Agent Address :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 567, -1, -1));

        jLabel8.setText("User Name :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 106, -1, 25));

        jLabel9.setText("Password :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 161, -1, 25));

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
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 104, 278, 30));

        btnCustomerSave.setText("Save");
        btnCustomerSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnCustomerSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 130, -1));

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 130, -1));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 264, 278, 30));
        jPanel1.add(txtEmailAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 507, 278, 30));
        jPanel1.add(txtPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 455, 278, 30));

        jLabel12.setText("Age :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 360, -1, 25));
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 357, 278, 30));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 559, 278, 30));

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("*");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 111, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 166, 17, -1));

        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("*");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 272, 17, -1));

        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 463, 17, -1));

        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("*");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 515, 17, -1));

        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("*");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 567, 17, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 130, -1));

        jLabel16.setText("Customer Id :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 25));
        jPanel1.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 213, 278, 30));

        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setText("*");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 17, -1));

        jButton1.setText("Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 134, -1));

        jLabel19.setText("Assigned Agent :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 665, -1, -1));
        jPanel1.add(txtAssigAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 665, 278, 30));

        jButton3.setText("Assign Agent");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 130, -1));

        jLabel20.setText("Blood Group :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 405, -1, -1));

        cbBloodGrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(cbBloodGrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 405, 278, 30));

        jLabel21.setText("Gender :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 315, -1, -1));

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        cbGender.setToolTipText("");
        jPanel1.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 312, 278, 30));

        txtLocation.setEditable(false);
        jPanel1.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 611, 278, 30));

        jLabel22.setText("Set Location :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, -1, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 159, 278, 30));

        lblMsg.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(lblMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 290, 19));
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 50));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/custpic.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -110, 830, 930));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnCustomerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerSaveActionPerformed
        // TODO add your handling code here:

        if(txtFirstName.getText().isEmpty() ||  txtEmailAdd.getText().isEmpty() ||
            txtPhoneNum.getText().isEmpty() || txtUserName.getText().isEmpty() || txtPassword.getPassword().length <= 0 ||
            txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "First Name, Email address , User Name, Password,  Phone number  and Address Fields cannot be left empty");
            return;
        }

        boolean flag ;

        String email = txtEmailAdd.getText();

        flag = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of X@Y.Z");
            return;
        }

        for(Customer customer : ecoSystem.getCustomerDirectory().getCustomerList() ){
            if(customer.getEmailAddress().equals(email)) {
                JOptionPane.showMessageDialog(null, "Email Address already exists");
                return;
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
        for(Customer customer : customerList.getCustomerList()) {
            if(customer.getPhoneNumber().equals(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
                return;
            }
        }

        int age = 0;

        try {

            if(!txtAge.getText().isEmpty())
            {
                age = Integer.parseInt(txtAge.getText());
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have integers only");
            return;
        }

        String firstname = txtFirstName.getText() ;
        // String email = txtEmailAdd.getText();
        String phone = txtPhoneNum.getText();
        String address = txtAddress.getText();
        // String age = txtAge.getText();
        String userName= txtUserName.getText();
         char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        //String password = txtPassword.getText();
        Object booldGroup = cbBloodGrp.getSelectedItem();
        Object gender = cbGender.getSelectedItem();
        String agent = txtAssigAgent.getText();
        String location = txtLocation.getText();
        System.out.println(booldGroup.toString());
         System.out.println(gender.toString());
        Organization patientOrg = null;
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
        {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
               if (organization instanceof CustomerOrganization) {

                   patientOrg = organization;
                   break;
               }
           }
        }
       
        System.out.println(booldGroup.toString());
        customerList.addNewCustomer(firstname,email,phone,age, address, userName,new Date(),booldGroup.toString(),agent,gender.toString(),location);
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(firstname);
        UserAccount usserAccount = patientOrg.getUserAccountDirectory().createUserAccount(userName, password, employee, new CustomerRole());
        SendEmail( email, userName,  password);
        JOptionPane.showMessageDialog(null, "Customer Profile Created");
        
          userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerListJPanel mcjp = (CustomerListJPanel) component;
        mcjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnCustomerSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        boolean flag ;

        String email = txtEmailAdd.getText();

        flag = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of X@Y.Z");
            return;
        }

        for(Customer patient : ecoSystem.getCustomerDirectory().getCustomerList()) {
            if(patient != patient)
            {
                if(patient.getEmailAddress().equals(email))
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

            if(!txtAge.getText().isEmpty())
            {
                age = Integer.parseInt(txtAge.getText());
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have integers only");
            return;
        }

        String firstname = txtFirstName.getText() ;
        // String email = txtEmailAdd.getText();
        String phone = txtPhoneNum.getText();
        String address = txtAddress.getText();
        // String age = txtAge.getText();
        String userName= txtUserName.getText();
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        customer.setCustomerName(firstname);
        customer.setEmailAddress(email);
        customer.setPhoneNumber(phone);
        customer.setAge(age);
        customer.setAddress(address);
        customer.setAgent(txtAssigAgent.getText());
        customer.setLocation(txtLocation.getText());
       

        JOptionPane.showMessageDialog(null, "Patient Profile Updated");

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LocationMap createPatient = new LocationMap(userProcessContainer);
        userProcessContainer.add("CreatePatientJPanel",createPatient);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         int size = ecoSystem.getAgentDirectory().getAgentList().size();
                    String[] AgentList = new String[size+1]; ;
                    int i= 0;
                    AgentList[i] = "Select";
                    i++;
                    for(Agent agent : ecoSystem.getAgentDirectory().getAgentList())
                    {
                        if( agent.getEmergencyAgent() != null && !agent.getEmergencyAgent())
                        {
                            AgentList[i] = agent.getAgentName();
                            i++;
                        } 
                    }

                     final JComboBox<String> combo = new JComboBox<>(AgentList);

                    String[] options = { "OK", "Cancel" };

                    String title = "Title";
                    int selection = JOptionPane.showOptionDialog(null, combo, title,
                          JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                          options, options[0]);

                    if (selection > 0) {
                       System.out.println("Doctor is: " + options[selection]);
                    }
//                     


                    Object docterName = combo.getSelectedItem();
                    if( !docterName.equals("Select"))
                    {
                         txtAssigAgent.setText(docterName.toString());
                    }
                    else
                    {
                         txtAssigAgent.setText("");
                    }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerListJPanel mcjp = (CustomerListJPanel) component;
        mcjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void SendEmail(String emailAddress,String userName, String Password)
    {
        System.out.println("Inside Email ");
         String to = emailAddress;
        String from = "donotreplymedicalemergency@gmail.com";
        String pass = "Password@123";
// Assuming you are sending email from localhost
// String host = "192.168.0.16";

// Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
// properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

// Setup mail server
// properties.setProperty("mail.smtp.host", host);
// properties.put("mail.smtp.starttls.enable", "true");
// Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
// Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

// Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

// Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            String htmlText = ("<div style=\"color:red;\">BRIDGEYE</div>");
            message.setContent(htmlText, "text/html");

// Set Subject: header field
            message.setSubject("Patient Registration");
            
            
            String msg = "Welcome to Emergency Medical System and Thank you for registering with us. Your account Created with User Name -"+userName +" and Password -" + Password +". Please stay happy and safe";
           // String text= "<table><tr><td>EmpId</td><td>Emp name</td><td>age</td></tr><tr><td>value</td><td>value</td><td>value</td></tr></table>";
            message.setText(msg);
// Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbBloodGrp;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAssigAgent;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtEmailAdd;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
