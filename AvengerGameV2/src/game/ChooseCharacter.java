package game;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

/**
 * @author Marikena Feuereisen This class use swing to make the graphic
 *         interface of this game on the second screen where you choose your
 *         character to play with
 */

public class ChooseCharacter extends JFrame implements ActionListener, ChangeListener {

	private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11;
	JButton button, button1, button2, button3;
	ImageIcon image, image1, image2, image3, image4, image5, image6, image7, image8;
	String name = "";
	private String choosed = "";
	private String guestName;
	private JMenuBar mb;
	private JMenu menuOptions;
	private JMenuItem out, instruction;

	public ChooseCharacter(String guestNamePassed) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		StaticSemaphore.t1 = new Thread(new Thread2());
		this.guestName = guestNamePassed;
		setLayout(null);
		setTitle(guestNamePassed);
		getContentPane().setBackground(Color.BLACK);
		setIconImage(new ImageIcon(getClass().getResource("images/icon2.png")).getImage());

		mb = new JMenuBar();
		mb.setBackground(Color.DARK_GRAY);
		setJMenuBar(mb);

		menuOptions = new JMenu("Options");
		menuOptions.setBackground(Color.DARK_GRAY);
		menuOptions.setFont(new Font("Lucida Calligraphy", 1, 14));
		menuOptions.setForeground(new Color(200, 5, 19));
		mb.add(menuOptions);

		instruction = new JMenuItem("Instructions");
		instruction.setFont(new Font("Lucida Calligraphy", 1, 14));
		instruction.setForeground(Color.DARK_GRAY);
		menuOptions.add(instruction);
		instruction.addActionListener(this);

		out = new JMenuItem("Out");
		out.setFont(new Font("Lucida Calligraphy", 1, 14));
		out.setForeground(Color.DARK_GRAY);
		menuOptions.add(out);
		out.addActionListener(this);

		ImageIcon image10 = new ImageIcon(getClass().getResource("images/vs.png"));
		label10 = new JLabel(image10);
		label10.setBounds(-425, 190, 1000, 700);
		add(label10);

		ImageIcon image11 = new ImageIcon(getClass().getResource("images/t.png"));
		label11 = new JLabel(image11);
		label11.setBounds(-350, 260, 1000, 700);
		add(label11);

		button = new JButton("Thor");
		button.setBounds(488, 597, 100, 30);
		button.setBackground(new Color(0, 0, 0));
		button.setFont(new Font("Lucida Calligraphy", 5, 14));
		button.setForeground(new Color(200, 5, 21));
		button.addActionListener(this);
		add(button);

		ImageIcon image1 = new ImageIcon(getClass().getResource("images/thanos3.png"));
		label2 = new JLabel(image1);
		label2.setBounds(-390, -75, 1000, 700);
		add(label2);

		button2 = new JButton("Black widow");
		button2.setBounds(630, 597, 130, 30);
		button2.setBackground(Color.DARK_GRAY);
		button2.setFont(new Font("Lucida Calligraphy", 5, 14));
		button2.setForeground(new Color(200, 5, 19));
		button2.addActionListener(this);
		add(button2);

		ImageIcon image3 = new ImageIcon(getClass().getResource("images/chica1.png"));
		label4 = new JLabel(image3);
		label4.setBounds(200, 0, 1000, 700);
		add(label4);

		image2 = new ImageIcon(getClass().getResource("images/thor.png"));
		label3 = new JLabel(image2);
		label3.setBounds(100, 0, 1000, 700);
		add(label3);

		button1 = new JButton("Iron Man");
		button1.setBounds(335, 597, 120, 30);
		button1.setBackground(Color.DARK_GRAY);
		button1.setFont(new Font("Lucida Calligraphy", 5, 14));
		button1.setForeground(new Color(200, 5, 20));
		button1.addActionListener(this);
		add(button1);

		ImageIcon image4 = new ImageIcon(getClass().getResource("images/robert.png"));
		label5 = new JLabel(image4);
		label5.setBounds(-100, 0, 1000, 700);
		add(label5);

		ImageIcon image = new ImageIcon(getClass().getResource("images/ray.png"));
		label1 = new JLabel(image);
		label1.setBounds(0, -20, 1000, 700);
		add(label1);

		button3 = new JButton("Captain America");
		button3.setBounds(800, 597, 170, 30);
		button3.setBackground(new Color(0, 0, 0));
		button3.setFont(new Font("Lucida Calligraphy", 5, 14));
		button3.setForeground(new Color(200, 5, 20));
		button3.addActionListener(this);
		add(button3);

		ImageIcon image5 = new ImageIcon(getClass().getResource("images/evans.png"));
		label6 = new JLabel(image5);
		label6.setBounds(400, 0, 950, 650);
		add(label6);

		ImageIcon image7 = new ImageIcon(getClass().getResource("images/thunder.png"));
		label7 = new JLabel(image7);
		label7.setBounds(-290, -10, 1000, 700);
		add(label7);

		ImageIcon image8 = new ImageIcon(getClass().getResource("images/cloud.png"));
		label8 = new JLabel(image8);
		label8.setBounds(-300, 0, 1000, 700);
		add(label8);

		ImageIcon image9 = new ImageIcon(getClass().getResource("images/cloud1.png"));
		label9 = new JLabel(image9);
		label9.setBounds(-100, -150, 2000, 700);
		add(label9);

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// System.out.println("ancho/ "+toolkit.getScreenSize().getWidth());
	}

	/**
	 * the method actionPerformed produce the events of the respective buttons
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			choosed = "Thor";
			StaticSemaphore.choosed = this.getChoosed();
			StartGame start = new StartGame(guestName, getChoosed());
			start.setBounds(0, 0, 1000, 700);
			start.setVisible(true);
			start.setResizable(false);
			start.setLocationRelativeTo(null);
			this.setVisible(false);

		}
		/*
		 * if(e.getSource() == button2){ setChoosed( "xika"); StartGame start = new
		 * StartGame(guestName,getChoosed()); start.setBounds(0,0,1000,700);
		 * start.setVisible(true); start.setResizable(false);
		 * start.setLocationRelativeTo(null); this.setVisible(false); }if(e.getSource()
		 * == button1){ setChoosed("robert"); StartGame start = new StartGame(guestName,
		 * getChoosed()); start.setBounds(0,0,1000,700); start.setVisible(true);
		 * start.setResizable(false); start.setLocationRelativeTo(null);
		 * this.setVisible(false); }
		 */if (e.getSource() == button3) {
			setChoosed("Captain");
			StaticSemaphore.choosed = this.getChoosed();
			StartGame start = new StartGame(guestName, getChoosed());
			start.setBounds(0, 0, 1000, 700);
			start.setVisible(true);
			start.setResizable(false);
			start.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == out) {
			Welcome welcome = new Welcome();
			welcome.setBounds(0, 0, 1000, 700);
			welcome.setVisible(true);
			welcome.setResizable(false);
			welcome.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == instruction) {
			JOptionPane.showMessageDialog(null,
					"Welcome to Avengers game! \n" + " \n" + "Instructions: \n" + "\n"
							+ " 1. Choose the Character with who you wanna play with.\n"
							+ " 2. Select the weapons to attack the enemy.\n" + " 3. Try to keep alive.\n\n"
							+ "      Good Luck! :D");
		}

	}

	@Override
	public void stateChanged(ChangeEvent e) {

	}

	public String getChoosed() {
		return choosed;
	}

	public void setChoosed(String choosed) {
		this.choosed = choosed;
	}

}