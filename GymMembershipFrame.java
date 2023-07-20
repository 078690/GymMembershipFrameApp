package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;


public class GymMembershipFrame extends JFrame {

    private JPanel namepnl;
    private JPanel surnamepnl;
    private JPanel idNopnl;
    private JPanel genderpnl;
    private JPanel clientpnl;
    private JPanel headingpnl;
    private JPanel contractpnl;
    private JPanel membershipsetpnl;
    private JPanel personalpnl;
    private JPanel commentspnl;
    private JPanel btnpnl;
    private JPanel mainpnl;
    private JPanel headAndClientpnl;
    private JPanel  membershipAndCommentspnl;
    
    //lABEL
    private JLabel nameLBL;
    private JLabel surnameLBL;
    private JLabel idNoLBL;
    private JLabel genderLBL;;
    private JLabel personalLBL;
    private JLabel headingLBL;
    private JLabel contractTypeLBL;
   
    //texts
    private JTextField nametxt;
    private JTextField surnametxt;
    private JTextField idNotxt;
    
    //JCOMBO
    private JComboBox genderjc;
    
    //checkbox
    private JCheckBox personaltrainer;
    
    //RADIO
    private JRadioButton monthtomonth;
    private JRadioButton sixmonths;
    private JRadioButton annual;
    
    //buttongroup
    private ButtonGroup btnGrp;
    
    //textarea
    private JTextArea commentstxtA;
    
    //button
    private JButton apply;
    
    // scrollarea
    private JScrollPane scrolllabeltxtArea;
        
   public GymMembershipFrame(){
       setTitle("Gym membership");
       setSize(500, 550);
       
       //instintionate all panels
       headingpnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
       
       clientpnl = new JPanel(new GridLayout(4,1,1,1));
       clientpnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Clinte Detais"));
       
       namepnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
       surnamepnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
       idNopnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
       genderpnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
       
       contractpnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
       personalpnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
       
       membershipsetpnl = new JPanel(new GridLayout(2,1,1,1));
       membershipsetpnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract Detals"));
      
       commentspnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
       
       btnpnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
       headAndClientpnl = new JPanel(new BorderLayout());
        membershipAndCommentspnl = new JPanel(new BorderLayout());
       mainpnl = new JPanel(new BorderLayout());
      
       
       
       //CREATING Labels
       headingLBL = new JLabel("MEMBERSHIP FORM");
       headingLBL.setFont(new Font(Font.SANS_SERIF,Font.ITALIC + Font.BOLD,20));
       headingLBL.setForeground(Color.BLUE);
       headingLBL.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
       
       nameLBL = new JLabel("Name:              ");
       surnameLBL = new JLabel("Surname:        ");
       idNoLBL= new JLabel("ID numbers:    ");
       genderLBL = new JLabel("Gender:            ");
       contractTypeLBL = new JLabel("Type of Contract :");
       personalLBL = new JLabel("Select the checkbox if you need a personal trainer");
       
       //Create textfields
       nametxt = new JTextField(10);
       surnametxt = new JTextField(10);
       idNotxt = new JTextField(10);
       
       //creating combobox
       genderjc = new JComboBox();
       genderjc.addItem("Male");
       genderjc.addItem("Female");
       
       //creating radio
       monthtomonth = new JRadioButton("Month-to-Month");
       sixmonths = new JRadioButton("six-Months");
       annual = new JRadioButton("Annual");
       
       //creating check
       personaltrainer = new JCheckBox();
       
       //creating buttons
       btnGrp = new ButtonGroup();
       btnGrp.add(monthtomonth);
       btnGrp.add(sixmonths);
       btnGrp.add(annual);
       
       //creating text
       commentstxtA = new JTextArea(20,40);
       commentstxtA.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Comments"));
       
       scrolllabeltxtArea = new JScrollPane(commentstxtA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       
       //create button
       apply = new JButton("APPLY");
       
       //ADDing comments to panels
       headingpnl.add(headingLBL);
       
       //adding to name panel
       namepnl.add(nameLBL);
       namepnl.add(nametxt);
       
       //adding to surname panel
       surnamepnl.add(surnameLBL);
       surnamepnl.add(surnametxt);
       
       //adding to id panels
       idNopnl.add(idNoLBL);
       idNopnl.add(idNotxt);
       
       //adding to gender panel
       genderpnl.add(genderLBL);
       genderpnl.add(genderjc);
       
       //adding panels to the clinet panel
       clientpnl.add(namepnl);
       clientpnl.add(surnamepnl);
       clientpnl.add(idNopnl);
       clientpnl.add(genderpnl);
       
       //Combaining the panels of head and contract
       headAndClientpnl.add(headingpnl,BorderLayout.NORTH);
       headAndClientpnl.add(clientpnl,BorderLayout.CENTER);
       
       //Adding  Check box
       contractpnl.add(contractTypeLBL);
       contractpnl.add(monthtomonth);
       contractpnl.add(sixmonths);
       contractpnl.add(annual);
       
       //adding persomal trainer
       personalpnl.add(personalLBL);
       personalpnl.add(personaltrainer);
       
       //Combaining the conttract and personal trainer panels
          membershipsetpnl.add(contractpnl);
          membershipsetpnl.add(personalpnl);
       
        //adding comments panel
        commentspnl.add(scrolllabeltxtArea);
        
        //adding the membership and comments panels
        membershipAndCommentspnl.add(membershipsetpnl,BorderLayout.NORTH);
        membershipAndCommentspnl.add(commentspnl,BorderLayout.CENTER);
        
        //adding panel
        btnpnl.add(apply);
        
        //adding to mainpanel
        mainpnl.add(headAndClientpnl,BorderLayout.NORTH);
        mainpnl.add(membershipAndCommentspnl,BorderLayout.CENTER);
        mainpnl.add(btnpnl,BorderLayout.SOUTH);
        
        //adding to JFRAME
        add(mainpnl);
        
        pack();
       setVisible(true);
     
   }
}
