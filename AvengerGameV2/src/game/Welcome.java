package game;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

/**
 * @since Tu Vieja
 * @author Marikena Feuereisen
 * This Class open the screen for the first time to start the Avengers game experience using swing for the graphic interface 
 */
 public class Welcome extends JFrame implements ActionListener{
   
    private static final long serialVersionUID = 1L;
    private JTextField textField1;
    private JLabel label1;
    JButton button1, back;
    private  String text = "";
    private JMenu menuOptions;
    private JMenuBar mb;
    private JMenuItem instruction;
  //  private JTextArea textArea;

    public Welcome(){
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setBounds(0,0,1000,700);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
        setLayout(null);
        setTitle("Avengers Game");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon2.png")).getImage());

        mb = new JMenuBar();
        mb.setBackground(new Color(255,0,0));
        setJMenuBar(mb);
    
        menuOptions = new  JMenu("Options");
        menuOptions.setBackground(Color.DARK_GRAY);
        menuOptions.setFont(new Font("Lucida Calligraphy", 1, 14));
        menuOptions.setForeground(Color.DARK_GRAY);
        mb.add(menuOptions);
    
     
        button1 = new JButton("Continue");
        button1.setBounds(450,385,100,30);
        button1.setBackground(new Color(255,255,255));
        button1.setFont(new Font("Arial", 3, 14));
        button1.setForeground(new Color(255,0,0));
        button1.addActionListener(this);
        add(button1);
    

        instruction = new JMenuItem("Instructions");
        instruction.setFont(new Font("Lucida Calligraphy", 1,14));
        instruction.setForeground(Color.DARK_GRAY);
        menuOptions.add(instruction);
        instruction.addActionListener(this);
    
            
        ImageIcon image = new ImageIcon(getClass().getResource("images/logo.png"));
        label1 = new JLabel(image);
        label1.setBounds(0,0,1000,700);
        add(label1);
        
        JLabel label2 = new JLabel("Just For Fun");
        label2.setBounds(25,155,400,80);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(Color.BLACK);
        add(label2);

        JLabel label3 = new JLabel("Enter your name");
        label3.setBounds(370,-4,1000,700);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(Color.BLACK);
        add(label3);
    
        textField1 = new JTextField();
        textField1.setBounds(370,355,255,25);
        textField1.setBackground(new Color(220,220,220));
        label2.setFont(new Font("Andale Mono", 1, 14));
        label2.setForeground(new Color(255,0,0));
        add(textField1);

      
    
    
       
    }
/**
 * the method actionPerformed produce the events of the respective buttons
 */
    public void actionPerformed(ActionEvent e){
    
    	if(e.getSource() == button1) {
            text = textField1.getText().trim(); // trim borra los espacios
            setTitle(text);
            if(text.equals("") ){
                JOptionPane.showMessageDialog(null, "Enter your name first");
            }else{
                ChooseCharacter choose = new ChooseCharacter(getText());
                choose.setBounds(0,0,1000,700);
                choose.setVisible(true);
                choose.setResizable(false);
                choose.setLocationRelativeTo(null);
                this.setVisible(false) ;
            }
            
        } if(e.getSource() == instruction){
            JOptionPane.showMessageDialog(null, "Welcome to Avengers game! \n"
            +" \n"
            + "Instructions: \n"
            +"\n"
            +" 1. Choose the Character with who you wanna play with.\n"
            +" 2. Select the weapons to attack the enemy.\n"
            +" 3. Try to keep alive.\n\n"
            +"             Good Luck! :D");
   
        }
        

     }
    public String getText() {
    	return text;
    }
    public void setText(String text) {
    	this.text = text;
    }
    
    
  
 } 