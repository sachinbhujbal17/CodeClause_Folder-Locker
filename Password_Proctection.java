package folder_lokcar;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.ActionEvent;
import java.security.spec.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import javax.swing.UIManager;

public class Password_Protection extends JFrame {
	static JFrame frame;
	boolean packFrame = false;
	JPanel contentPane;
	BorderLayout borderLayout1 = new BorderLayout();
	JLabel jLabel1 = new JLabel();
	JPanel jPanel2 = new JPanel();
	JButton jButton3 = new JButton();
	Border border1;
	JPanel jPanel1 = new JPanel();
	JButton jButton2 = new JButton();
	JButton jButton1 = new JButton();
	JPasswordField jPasswordField2 = new JPasswordField();
	JPasswordField jPasswordField1 = new JPasswordField();
	TitledBorder titledBorder1;
	TitledBorder titledBorder2;
	TitledBorder titledBorder3;
	TitledBorder titledBorder4;
	int no = 3;
	JPanel jPanel3 = new JPanel();
	JProgressBar jProgressBar1 = new JProgressBar();
	JButton jButton4 = new JButton();

	// Construct the frame
	public Password_Protection() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);

		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (packFrame) {
			this.pack();
		} else {
			this.validate();
		}
		// Center the window
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();

		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}

		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}

		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		this.setVisible(true);

	}

	// Component initialization
	private void jbInit() throws IOException {
		File file20;
		try {
			file20 = new File("c:\\windows\\system32\\Initials.dll");
		} catch (Exception ex1) {
			try {
				file20 = new File("c:\\winnt\\system32\\Initials.dll");
			} catch (Exception ex2) {
				file20 = new File("c:\\Initials.dll");
			}

		}

		if (!(file20.exists())) {
			JOptionPane.showMessageDialog(this,
					"This is the First time You are Using this Software.\n           Initial Password is :   Umar\nYou can Change the Password As You Like.",
					"Password", 1);
			FileWriter out20 = new FileWriter(file20);
			out20.write("This is Initial File.");
			out20.close();

		}

		contentPane = (JPanel) this.getContentPane();
		border1 = BorderFactory.createCompoundBorder(
				BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.white, new Color(163, 186, 194),
						new Color(71, 109, 110), new Color(102, 156, 158)),
				BorderFactory.createEmptyBorder(3, 3, 3, 3));

		titledBorder1 = new TitledBorder("");
		titledBorder2 = new TitledBorder("");
		titledBorder3 = new TitledBorder("");
		titledBorder4 = new TitledBorder("");
		jLabel1.setBackground(SystemColor.menuText);
		jLabel1.setFont(new java.awt.Font("Dialog", 0, 20));
		jLabel1.setForeground(new Color(201, 228, 255));
		jLabel1.setBorder(border1);
		jLabel1.setOpaque(true);
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setText("Password Protection");

		contentPane.setLayout(borderLayout1);

		this.setResizable(false);
		this.setSize(new Dimension(400, 300));
		this.setState(Frame.NORMAL);
		this.setTitle("Password Protection");

		jButton1.setBackground(SystemColor.inactiveCaptionBorder);
		jButton1.setBounds(new Rectangle(61, 12, 134, 27));
		jButton1.setFont(new java.awt.Font("Dialog", 1, 12));
		jButton1.setForeground(Color.black);
		jButton1.setAlignmentX((float) 0.5);
		jButton1.setDebugGraphicsOptions(0);
		jButton1.setMaximumSize(new Dimension(117, 25));
		jButton1.setMinimumSize(new Dimension(117, 25));
		jButton1.setIcon(jButton1.getIcon());
		jButton1.setNextFocusableComponent(jButton2);
		jButton1.setPreferredSize(new Dimension(117, 25));
		jButton1.setToolTipText("Press This Button To Enter Password");
		jButton1.setContentAreaFilled(true);
		jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
		jButton1.setMargin(new Insets(2, 27, 2, 27));
		jButton1.setText("Password");
		jButton1.addKeyListener(new PasswordProtection_jButton1_keyAdapter(this));
		jButton1.setMnemonic('P');
		jButton1.addActionListener(new PasswordProtection_jButton1_actionAdapter(this));

		jButton2.setBackground(SystemColor.inactiveCaptionBorder);
		jButton2.setBounds(new Rectangle(61, 39, 134, 28));
		jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
		jButton2.setForeground(Color.black);
		jButton2.setAlignmentX((float) 0.5);
		jButton2.setMaximumSize(new Dimension(117, 25));
		jButton2.setNextFocusableComponent(jButton3);
		jButton2.setPreferredSize(new Dimension(117, 25));
		jButton2.setToolTipText("Press This Button To ReType Password");
		jButton2.setHorizontalTextPosition(SwingConstants.CENTER);
		jButton2.setMargin(new Insets(2, 5, 2, 5));
		jButton2.setText("ReType Password");
		jButton2.addKeyListener(new PasswordProtection_jButton2_keyAdapter(this));
		jButton2.setMnemonic('R');
		jButton2.addActionListener(new PasswordProtection_jButton2_actionAdapter(this));

		jButton3.setBackground(new Color(159, 201, 255));
		jButton3.setBounds(new Rectangle(175, 131, 67, 29));
		jButton3.setEnabled(true);
		jButton3.setFont(new java.awt.Font("SansSerif", 1, 14));
		jButton3.setForeground(Color.black);
		jButton3.setNextFocusableComponent(jButton4);
		jButton3.setToolTipText("Next");
		jButton3.setMnemonic('N');
		jButton3.setText("Next");
		jButton3.addKeyListener(new PasswordProtection_jButton3_keyAdapter(this));
		jButton3.addActionListener(new PasswordProtection_jButton3_actionAdapter(this));

		jPanel2.setBackground(SystemColor.inactiveCaptionBorder);
		jPanel2.setLayout(null);

		jPasswordField1.setMargin(new Insets(2, 1, 2, 1));
		jPasswordField1.setText("Umar");
		jPasswordField1.setHorizontalAlignment(SwingConstants.LEFT);
		jPasswordField1.setFont(new java.awt.Font("Monospaced", 1, 15));
		jPasswordField1.setToolTipText("Enter Password");
		jPasswordField1.setForeground(Color.blue);
		jPasswordField1.setAlignmentX((float) 0.5);
		jPasswordField1.setDebugGraphicsOptions(0);
		jPasswordField1.setMaximumSize(new Dimension(150, 150));
		jPasswordField1.setNextFocusableComponent(jButton2);
		jPasswordField1.setEditable(false);
		jPasswordField1.setEchoChar(' ');
		jPasswordField1.setBounds(new Rectangle(217, 12, 121, 27));

		jPasswordField2.setFont(new java.awt.Font("Monospaced", 1, 15));
		jPasswordField2.setForeground(Color.blue);
		jPasswordField2.setMaximumSize(new Dimension(150, 150));
		jPasswordField2.setMinimumSize(new Dimension(0, 0));
		jPasswordField2.setNextFocusableComponent(jButton3);
		jPasswordField2.setEditable(false);
		jPasswordField2.setToolTipText("ReType Password");
		jPasswordField2.setMargin(new Insets(2, 1, 2, 1));
		jPasswordField2.setSelectionColor(SystemColor.control);
		jPasswordField2.setText("Topia");
		jPasswordField2.setHorizontalAlignment(SwingConstants.LEFT);
		jPasswordField2.setEchoChar(' ');
		jPasswordField2.setBounds(new Rectangle(217, 39, 121, 28));

		jPanel1.setBackground(SystemColor.inactiveCaptionBorder);
		jPanel1.setRequestFocusEnabled(true);
		jPanel1.setLayout(null);

		jPanel3.setLayout(null);
		jProgressBar1.setOrientation(JProgressBar.HORIZONTAL);
		jProgressBar1.setBackground(new Color(225, 240, 206));
		jProgressBar1.setFont(new java.awt.Font("Dialog", 1, 12));
		jProgressBar1.setForeground(new Color(147, 78, 194));
		jProgressBar1.setMaximumSize(new Dimension(32767, 20));
		jProgressBar1.setMinimumSize(new Dimension(10, 20));
		jProgressBar1.setOpaque(true);
		jProgressBar1.setToolTipText("Creator");
		jProgressBar1.setIndeterminate(true);
		jProgressBar1.setBounds(new Rectangle(134, 84, 150, 23));
		jProgressBar1.setString("Umar Topia");
		jProgressBar1.setValue(0);
		jProgressBar1.setStringPainted(true);
		jProgressBar1.setForeground(Color.blue);

		jButton4.setBackground(new Color(159, 201, 255));
		jButton4.setBounds(new Rectangle(129, 182, 160, 30));
		jButton4.setFont(new java.awt.Font("SansSerif", 1, 14));
		jButton4.setForeground(Color.black);
		jButton4.setDebugGraphicsOptions(0);
		jButton4.setNextFocusableComponent(jButton1);
		jButton4.setToolTipText("Press This Button To Change Password");
		jButton4.setMnemonic('C');
		jButton4.setText("Change Password");
		jButton4.addKeyListener(new PasswordProtection_jButton4_keyAdapter(this));
		jButton4.addActionListener(new PasswordProtection_jButton4_actionAdapter(this));
		jPanel3.setBounds(new Rectangle(372, 88, 0, 0));

		jPanel1.add(jPanel3, null);
		jPanel1.add(jButton3, null);
		jPanel1.add(jProgressBar1, null);
		jPanel1.add(jButton1, null);
		jPanel1.add(jPasswordField2, null);
		jPanel1.add(jPasswordField1, null);
		jPanel1.add(jButton2, null);
		jPanel1.add(jButton4, null);
		contentPane.add(jLabel1, BorderLayout.NORTH);
		contentPane.add(jPanel2, BorderLayout.SOUTH);
		contentPane.add(jPanel1, BorderLayout.CENTER);

		jProgressBar1.enable(true);

	}

	// Overridden so we can exit when window is closed
	protected void processWindowEvent(WindowEvent e) {

		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			JOptionPane.showMessageDialog(this, "User Abort !!!", "PasswordProtection", 1);
			System.exit(0);
		}

	}

	void jButton1_actionPerformed(ActionEvent e) {

		jPasswordField1.setEditable(true);
		jPasswordField1.setBackground(Color.WHITE);
		jPasswordField1.grabFocus();

		jPasswordField1.setText("");
		jPasswordField1.setEchoChar('*');

	}

	void jButton2_actionPerformed(ActionEvent e) {
		jPasswordField2.setEditable(true);
		jPasswordField2.setBackground(Color.WHITE);
		jPasswordField2.grabFocus();

		jPasswordField2.setText("");
		jPasswordField2.setEchoChar('*');
	}

	void jButton3_actionPerformed(ActionEvent e) throws IOException {
		String hh1 = new String();
		String hh = new String();
		String hh2 = new String();
		FileProtection fil22 = new FileProtection("Great Software");

		boolean compare = jPasswordField2.getText().equals(jPasswordField1.getText());
		boolean password3 = jPasswordField1.getText().equals("");

		// String abc = System.getProperty("java.library.path");

		String ab = System.getProperty("user.dir");
		File file = null;

		try {
//      file = new File(ab + "\\Windowsx.dll");

			try {
				file = new File("c:\\windows\\system32\\Windowsx.dll");
			} catch (Exception ex1) {
				try {
					file = new File("c:\\winnt\\system32\\Windowsx.dll");
				} catch (Exception ex2) {
					file = new File("c:\\Windowsx.dll");
				}

			}

			int size = (int) file.length();
			int chars_read = 0;
			FileReader in = new FileReader(file);
			char[] data = new char[size];
			while (in.ready()) {
				chars_read += in.read(data, chars_read, size - chars_read);

			}
			in.close();
			hh2 = new String(data, 0, chars_read);
			hh = fil22.decrypt(hh2);

		} catch (Exception ex) {
			hh1 = "Umar";
		}

		boolean password1 = jPasswordField1.getText().equals(hh);
		boolean password2 = jPasswordField1.getText().equals(hh1);

		if (compare == true) {

			if (password3 == true) {
				no--;
				this.dispose();
				if (no == 2) {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have Still 2 More Chances.", "PasswordProtection",
							1);
					Password_Protection pp = new Password_Protection();
					pp.jButton2_actionPerformed(e);
					pp.jButton1_actionPerformed(e);
					pp.no = pp.no - 1;
				}

				else if (no == 1) {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have Still 1 More Chance.", "PasswordProtection", 1);
					Password_Protection pp = new Password_Protection();
					pp.jButton2_actionPerformed(e);
					pp.jButton1_actionPerformed(e);
					pp.no = pp.no - 2;
				}

				else {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have No More Chances.\nThe Program Will Exit Now.",
							"PasswordProtection", 1);
					System.exit(0);
				}

			}

			else if (password1 == true || password2 == true) {
				this.dispose();
				ChooseType ct = new ChooseType();
				ct.show();
			}

			else {
				this.dispose();
				no--;
				if (no == 2) {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have Still 2 More Chances.", "PasswordProtection",
							1);
					Password_Protection pp = new Password_Protection();
					pp.jButton2_actionPerformed(e);
					pp.jButton1_actionPerformed(e);
					pp.no = pp.no - 1;
				}

				else if (no == 1) {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have Still 1 More Chance.", "PasswordProtection", 1);
					Password_Protection pp = new Password_Protection();
					pp.jButton2_actionPerformed(e);
					pp.jButton1_actionPerformed(e);
					pp.no = pp.no - 2;
				}

				else {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have No More Chances.\nThe Program Will Exit Now.",
							"PasswordProtection", 1);
					System.exit(0);
				}

			}
		}

		else {
			this.dispose();

			boolean i = jPasswordField1.isEditable();
			boolean j = jPasswordField2.isEditable();

			if (i == false && j == false) {
				JOptionPane.showMessageDialog(this, "You Must Enter Password.\nYou Have Still 3 More Chances.",
						"PasswordProtection", 1);
				Password_Protection pp = new Password_Protection();
			}

			else if (i == false) {
				no--;

				if (no == 2) {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have Still 2 More Chances.", "PasswordProtection",
							1);
					Password_Protection pp = new Password_Protection();
					pp.jButton2_actionPerformed(e);
					pp.jButton1_actionPerformed(e);
					pp.no = pp.no - 1;
				}

				else if (no == 1) {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have Still 1 More Chance.", "PasswordProtection", 1);
					Password_Protection pp = new Password_Protection();
					pp.jButton2_actionPerformed(e);
					pp.jButton1_actionPerformed(e);
					pp.no = pp.no - 2;
				}

				else {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have No More Chances.\nThe Program Will Exit Now.",
							"PasswordProtection", 1);
					System.exit(0);
				}

			}

			else if (j == false) {
				no--;
				if (no == 2) {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have Still 2 More Chances.", "PasswordProtection",
							1);
					Password_Protection pp = new Password_Protection();
					pp.jButton2_actionPerformed(e);
					pp.jButton1_actionPerformed(e);
					pp.no = pp.no - 1;
				}

				else if (no == 1) {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have Still 1 More Chance.", "PasswordProtection", 1);
					Password_Protection pp = new Password_Protection();
					pp.jButton2_actionPerformed(e);
					pp.jButton1_actionPerformed(e);
					pp.no = pp.no - 2;
				}

				else {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have No More Chances.\nThe Program Will Exit Now.",
							"PasswordProtection", 1);
					System.exit(0);
				}

			}

			else {
				no--;
				if (no == 2) {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have Still 2 More Chances.", "PasswordProtection",
							1);
					Password_Protection pp = new Password_Protection();
					pp.jButton2_actionPerformed(e);
					pp.jButton1_actionPerformed(e);
					pp.no = pp.no - 1;
				}

				else if (no == 1) {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have Still 1 More Chance.", "PasswordProtection", 1);
					Password_Protection pp = new Password_Protection();
					pp.jButton2_actionPerformed(e);
					pp.jButton1_actionPerformed(e);
					pp.no = pp.no - 2;
				}

				else {
					JOptionPane.showMessageDialog(this,
							"You have Entered Wrong Password.\nYou Have No More Chances.\nThe Program Will Exit Now.",
							"PasswordProtection", 1);
					System.exit(0);
				}

			}
		}
	}

	void jButton4_actionPerformed(ActionEvent e) {
		this.dispose();
		ChangePassword cp = new ChangePassword();
		cp.setVisible(true);
	}

	public static void main(String args[]) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		Password_Protection pp = new Password_Protection();
		pp.setVisible(true);

	}

	void jButton3_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			try {
				this.jButton3_actionPerformed(e);
			} catch (IOException ex) {
			}
		}
	}

	void jButton1_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton1_actionPerformed(e);
		}

	}

	void jButton2_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton2_actionPerformed(e);
		}

	}

	void jButton4_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton4_actionPerformed(e);
		}

	}

}

class FolderProtection extends JFrame {
	static JFrame frame;
	boolean packFrame = false;

	JPanel contentPane;

	BorderLayout borderLayout1 = new BorderLayout();

	JToolBar jToolBar1 = new JToolBar();

	JRadioButton jRadioButton1 = new JRadioButton();
	JRadioButton jRadioButton2 = new JRadioButton();
	JRadioButton jRadioButton3 = new JRadioButton();
	JRadioButton jRadioButton4 = new JRadioButton();
	JRadioButton jRadioButton5 = new JRadioButton();
	JRadioButton jRadioButton6 = new JRadioButton();
	JRadioButton jRadioButton7 = new JRadioButton();

	ButtonGroup group1 = new ButtonGroup();
	JLabel jLabel1 = new JLabel();

	TitledBorder titledBorder1;
	TitledBorder titledBorder2;

	JToolBar jToolBar2 = new JToolBar();

	JPanel jPanel1 = new JPanel();

	JButton jButton1 = new JButton();

	Border border1;
	JButton jButton2 = new JButton();

	// Construct the frame

	public FolderProtection() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (packFrame) {
			this.pack();
		} else {
			this.validate();
		}
		// Center the window
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}
		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		this.setVisible(true);

	}

	// Component initialization
	private void jbInit() throws IOException {

		contentPane = (JPanel) this.getContentPane();

		titledBorder1 = new TitledBorder("");
		titledBorder2 = new TitledBorder("");

		contentPane.setLayout(borderLayout1);

		this.setLocale(java.util.Locale.getDefault());
		this.setResizable(false);
		this.setSize(new Dimension(325, 300));
		this.setTitle("Folder Protection");

		jToolBar1.setOrientation(JToolBar.VERTICAL);
		jToolBar1.setEnabled(false);
		jToolBar1.setBorder(null);
		jToolBar1.setOpaque(false);
		jToolBar1.setBorderPainted(true);
		jToolBar1.setFloatable(true);

		jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 16));
		jRadioButton1.setForeground(Color.blue);
		jRadioButton1.setFocusPainted(true);
		jRadioButton1.setSelected(true);
		jRadioButton1.setText("Normal Folder");
		jRadioButton1.addKeyListener(new FolderProtection_jRadioButton1_keyAdapter(this));
		jRadioButton1.setMnemonic('F');

		jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 16));
		jRadioButton2.setForeground(Color.blue);
		jRadioButton2.setFocusPainted(true);
		jRadioButton2.setText("Control Panel");
		jRadioButton2.addKeyListener(new FolderProtection_jRadioButton2_keyAdapter(this));
		jRadioButton2.setMnemonic('C');

		jRadioButton3.setFont(new java.awt.Font("Dialog", 0, 16));
		jRadioButton3.setForeground(Color.blue);
		jRadioButton3.setFocusPainted(true);
		jRadioButton3.setText("Recycle Bin");
		jRadioButton3.addKeyListener(new FolderProtection_jRadioButton3_keyAdapter(this));
		jRadioButton3.setMnemonic('R');

		jRadioButton4.setFont(new java.awt.Font("Dialog", 0, 16));
		jRadioButton4.setForeground(Color.blue);
		jRadioButton4.setFocusPainted(true);
		jRadioButton4.setText("Printers");
		jRadioButton4.addKeyListener(new FolderProtection_jRadioButton4_keyAdapter(this));
		jRadioButton4.setMnemonic('P');

		jRadioButton5.setFont(new java.awt.Font("Dialog", 0, 16));
		jRadioButton5.setForeground(Color.blue);
		jRadioButton5.setFocusPainted(true);
		jRadioButton5.setText("Web Folders");
		jRadioButton5.addKeyListener(new FolderProtection_jRadioButton5_keyAdapter(this));
		jRadioButton5.setMnemonic('W');

		jRadioButton6.setFont(new java.awt.Font("Dialog", 0, 16));
		jRadioButton6.setForeground(Color.blue);
		jRadioButton6.setFocusPainted(true);
		jRadioButton6.setText("Scanners And Cameras");
		jRadioButton6.addKeyListener(new FolderProtection_jRadioButton6_keyAdapter(this));
		jRadioButton6.setMnemonic('S');

		jRadioButton7.setFont(new java.awt.Font("Dialog", 0, 16));
		jRadioButton7.setForeground(Color.blue);
		jRadioButton7.setNextFocusableComponent(jButton1);
		jRadioButton7.setFocusPainted(true);
		jRadioButton7.setText("InterNet ShortCut");
		jRadioButton7.addKeyListener(new FolderProtection_jRadioButton7_keyAdapter(this));
		jRadioButton7.setMnemonic('I');

		jLabel1.setFont(new java.awt.Font("Dialog", 1, 20));
		jLabel1.setForeground(Color.red);
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setText("Choose The Type Of Security");

		jToolBar2.setEnabled(false);
		jToolBar2.setBorderPainted(false);

		jButton1.setBackground(new Color(159, 201, 255));
		jButton1.setFont(new java.awt.Font("SansSerif", 1, 14));
		jButton1.setForeground(Color.black);
		jButton1.setNextFocusableComponent(jButton2);
		jButton1.setBorderPainted(true);
		jButton1.setContentAreaFilled(true);
		jButton1.setFocusPainted(true);
		jButton1.setText("Next");
		jButton1.setVerticalTextPosition(SwingConstants.CENTER);
		jButton1.addKeyListener(new FolderProtection_jButton1_keyAdapter(this));
		jButton1.setMnemonic('N');
		jButton1.setToolTipText("Next");
		jButton1.addActionListener(new FolderProtection_jButton1_actionAdapter(this));

		jButton2.setBackground(new Color(159, 201, 255));
		jButton2.setFont(new java.awt.Font("SansSerif", 1, 14));
		jButton2.setNextFocusableComponent(jRadioButton1);
		jButton2.setToolTipText("Back");
		jButton2.setActionCommand("Back");
		jButton2.setMnemonic('B');
		jButton2.setText("Back");
		jButton2.addKeyListener(new FolderProtection_jButton2_keyAdapter(this));
		jButton2.addActionListener(new FolderProtection_jButton2_actionAdapter(this));

		jToolBar1.add(jRadioButton1, null);
		jToolBar1.add(jRadioButton2, null);
		jToolBar1.add(jRadioButton3, null);
		jToolBar1.add(jRadioButton4, null);
		jToolBar1.add(jRadioButton5, null);
		jToolBar1.add(jRadioButton6, null);
		jToolBar1.add(jRadioButton7, null);
		jToolBar1.add(jToolBar2, null);

		jToolBar2.add(jPanel1, null);

		jPanel1.add(jButton2, null);
		jPanel1.add(jButton1, null);

		group1.add(jRadioButton2);
		group1.add(jRadioButton1);
		group1.add(jRadioButton3);
		group1.add(jRadioButton4);
		group1.add(jRadioButton5);
		group1.add(jRadioButton6);
		group1.add(jRadioButton7);
		contentPane.add(jLabel1, BorderLayout.NORTH);
		contentPane.add(jToolBar1, BorderLayout.CENTER);
	}

	// Overridden so we can exit when window is closed
	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			JOptionPane.showMessageDialog(this, "User Abort !!!", "PasswordProtection", 1);
			System.exit(0);
		}

	}

	void jButton1_actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		this.dispose();

		// userpath=System.getProperty("user.home"+"Desktop"+"\\filename");

		String userpath = System.getProperty("user.home");
		File fc = new File(userpath);
		chooser.setCurrentDirectory(fc);

		int returnVal = chooser.showDialog(this, "Protect");
		File theFile = chooser.getSelectedFile();

		if (returnVal == JFileChooser.CANCEL_OPTION) {
			this.dispose();

			int value = JOptionPane.showConfirmDialog(this, "Do You Really Want To Exit ?", "PasswordProtection",
					JOptionPane.YES_NO_OPTION);

			if (value == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(this, "Thank You For Using This Software.", "PasswordProtection", 1);
				System.exit(0);
			}

			else if (value == JOptionPane.NO_OPTION) {
				this.jButton1_actionPerformed(e);
			}

		}

		String ext1 = ".{01E04581-4EEE-11d0-BFE9-00AA005B4383}";
		String ext2 = ".{21EC2020-3AEA-1069-A2DD-08002B30309D}";
		String ext3 = ".{645FF040-5081-101B-9F08-00AA002F954E}";
		String ext4 = ".{2227A280-3AEA-1069-A2DE-08002B30309D}";
		String ext5 = ".{BDEADF00-C265-11D0-BCED-00A0C90AB50F}";
		String ext6 = ".{E211B736-43FD-11D1-9EFB-0000F8757FCD}";
		String ext7 = ".{FBF23B40-E3F0-101B-8488-00AA003E56F8}";

		if ((theFile.toString().endsWith(ext1)) || (theFile.toString().endsWith(ext2))
				|| (theFile.toString().endsWith(ext3)) || (theFile.toString().endsWith(ext4))
				|| (theFile.toString().endsWith(ext5)) || (theFile.toString().endsWith(ext6))
				|| (theFile.toString().endsWith(ext7))) {

			int buff = theFile.toString().lastIndexOf('.');
			int buff2 = theFile.toString().lastIndexOf('\\');
			int buff1 = theFile.toString().length();

			String dir = theFile.toString().substring(buff2 + 1, buff);
			this.dispose();
			JOptionPane.showMessageDialog(this, dir + " : Is Already Protected.", "PasswordProtection", 1);

			/*
			 * String pro = theFile.toString().substring(0, buff); File theFile3 = new
			 * File(pro); theFile.renameTo(theFile3);
			 */

			int value = JOptionPane.showConfirmDialog(this, "Do You Want To Protect Another Folder ?",
					"PasswordProtection", JOptionPane.YES_NO_OPTION);

			if (value == JOptionPane.YES_OPTION) {

				int value2 = JOptionPane.showConfirmDialog(this,
						"Do You Want To Protect Another Folder With The Same Type Of Security ?", "PasswordProtection",
						JOptionPane.YES_NO_OPTION);

				if (value2 == JOptionPane.YES_OPTION) {
					this.jButton1_actionPerformed(e);

				}

				else if (value2 == JOptionPane.NO_OPTION) {
					this.setVisible(true);
				}

			}

			else if (value == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(this, "Thank You For Using This Software.", "PasswordProtection", 1);
				System.exit(0);
			}

		}

		else {

			this.dispose();

			/* Normal Folder */

			if (jRadioButton1.isSelected()) {

				JOptionPane.showMessageDialog(this, "Normal Folder will Protect : " + theFile.getName(),
						"PasswordProtection", 1);

				String path = new String(theFile.toString().concat(ext1));

				File theFile2 = new File(path);
				theFile.renameTo(theFile2);

			}

			/* Control Panel */

			else if (jRadioButton2.isSelected()) {
				JOptionPane.showMessageDialog(this, "Control Panel Will Protect : " + theFile.getName(),
						"PasswordProtection", 1);

				String path = new String(theFile.toString().concat(ext2));

				File theFile2 = new File(path);
				theFile.renameTo(theFile2);

			}

			/* Recycle Bin */

			else if (jRadioButton3.isSelected()) {

				JOptionPane.showMessageDialog(this, "Recycle Bin Will Protect : " + theFile.getName(),
						"PasswordProtection", 1);

				String path = new String(theFile.toString().concat(ext3));

				File theFile2 = new File(path);
				theFile.renameTo(theFile2);

			}

			/* Printers */

			else if (jRadioButton4.isSelected()) {
				JOptionPane.showMessageDialog(this, "Printers Will Protect : " + theFile.getName(),
						"PasswordProtection", 1);

				String path = new String(theFile.toString().concat(ext4));

				File theFile2 = new File(path);
				theFile.renameTo(theFile2);
			}

			/* Web Folders */

			else if (jRadioButton5.isSelected()) {
				JOptionPane.showMessageDialog(this, "Web Folders Will Protect : " + theFile.getName(),
						"PasswordProtection", 1);

				String path = new String(theFile.toString().concat(ext5));

				File theFile2 = new File(path);
				theFile.renameTo(theFile2);
			}

			/* Scanners And Cameras */

			else if (jRadioButton6.isSelected()) {
				JOptionPane.showMessageDialog(this, "Scanners And Cameras Will Protect : " + theFile.getName(),
						"PasswordProtection", 1);

				String path = new String(theFile.toString().concat(ext6));

				File theFile2 = new File(path);
				theFile.renameTo(theFile2);

			}

			/* InterNet ShortCut */

			else if (jRadioButton7.isSelected()) {

				JOptionPane.showMessageDialog(this, "InterNet ShortCut Will Protect : " + theFile.getName(),
						"PasswordProtection", 1);

				String path = new String(theFile.toString().concat(ext7));

				File theFile2 = new File(path);
				theFile.renameTo(theFile2);

			}
			this.dispose();

			int value = JOptionPane.showConfirmDialog(this, "Do You Want To Protect Another Folder ?",
					"PasswordProtection", JOptionPane.YES_NO_OPTION);

			if (value == JOptionPane.YES_OPTION) {
				int value2 = JOptionPane.showConfirmDialog(this,
						"Do You Want To Protect Another Folder With The Same Type Of Security ?", "PasswordProtection",
						JOptionPane.YES_NO_OPTION);

				if (value2 == JOptionPane.YES_OPTION) {
					this.jButton1_actionPerformed(e);

				}

				else if (value2 == JOptionPane.NO_OPTION) {
					this.setVisible(true);
				}

			}

			else if (value == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(this, "Thank You For Using This Software.", "PasswordProtection", 1);
				System.exit(0);
			}

		}

	}

	void jButton2_actionPerformed(ActionEvent e) {
		this.dispose();
		Protectit pt = new Protectit();
		pt.setVisible(true);
	}

	void jButton1_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton1_actionPerformed(e);
		}

	}

	void jButton2_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton2_actionPerformed(e);
		}

	}

	void jRadioButton1_keyPressed(KeyEvent ke) {
		if (this.jRadioButton1.isSelected()) {
			ActionEvent e = null;
			int key = ke.getKeyCode();
			if (key == KeyEvent.VK_ENTER) {
				this.jButton1_actionPerformed(e);
			} else if (key == KeyEvent.VK_DOWN) {
				jRadioButton2.grabFocus();
				jRadioButton2.setSelected(true);
			} else if (key == KeyEvent.VK_UP) {
				jRadioButton7.grabFocus();
				jRadioButton7.setSelected(true);
			}

		}

	}

	void jRadioButton2_keyPressed(KeyEvent ke) {
		if (this.jRadioButton2.isSelected()) {
			ActionEvent e = null;
			int key = ke.getKeyCode();
			if (key == KeyEvent.VK_ENTER) {
				this.jButton1_actionPerformed(e);
			} else if (key == KeyEvent.VK_DOWN) {
				jRadioButton3.grabFocus();
				jRadioButton3.setSelected(true);
			} else if (key == KeyEvent.VK_UP) {
				jRadioButton1.grabFocus();
				jRadioButton1.setSelected(true);
			}

		}

	}

	void jRadioButton3_keyPressed(KeyEvent ke) {
		if (this.jRadioButton3.isSelected()) {
			ActionEvent e = null;
			int key = ke.getKeyCode();
			if (key == KeyEvent.VK_ENTER) {
				this.jButton1_actionPerformed(e);
			} else if (key == KeyEvent.VK_DOWN) {
				jRadioButton4.grabFocus();
				jRadioButton4.setSelected(true);
			} else if (key == KeyEvent.VK_UP) {
				jRadioButton2.grabFocus();
				jRadioButton2.setSelected(true);
			}

		}

	}

	void jRadioButton4_keyPressed(KeyEvent ke) {
		if (this.jRadioButton4.isSelected()) {
			ActionEvent e = null;
			int key = ke.getKeyCode();
			if (key == KeyEvent.VK_ENTER) {
				this.jButton1_actionPerformed(e);
			} else if (key == KeyEvent.VK_DOWN) {
				jRadioButton5.grabFocus();
				jRadioButton5.setSelected(true);
			} else if (key == KeyEvent.VK_UP) {
				jRadioButton3.grabFocus();
				jRadioButton3.setSelected(true);
			}

		}

	}

	void jRadioButton5_keyPressed(KeyEvent ke) {
		if (this.jRadioButton5.isSelected()) {
			ActionEvent e = null;
			int key = ke.getKeyCode();
			if (key == KeyEvent.VK_ENTER) {
				this.jButton1_actionPerformed(e);
			} else if (key == KeyEvent.VK_DOWN) {
				jRadioButton6.grabFocus();
				jRadioButton6.setSelected(true);
			} else if (key == KeyEvent.VK_UP) {
				jRadioButton4.grabFocus();
				jRadioButton4.setSelected(true);
			}

		}

	}

	void jRadioButton6_keyPressed(KeyEvent ke) {
		if (this.jRadioButton6.isSelected()) {
			ActionEvent e = null;
			int key = ke.getKeyCode();
			if (key == KeyEvent.VK_ENTER) {
				this.jButton1_actionPerformed(e);
			} else if (key == KeyEvent.VK_DOWN) {
				jRadioButton7.grabFocus();
				jRadioButton7.setSelected(true);
			} else if (key == KeyEvent.VK_UP) {
				jRadioButton5.grabFocus();
				jRadioButton5.setSelected(true);
			}

		}

	}

	void jRadioButton7_keyPressed(KeyEvent ke) {
		if (this.jRadioButton7.isSelected()) {
			ActionEvent e = null;
			int key = ke.getKeyCode();
			if (key == KeyEvent.VK_ENTER) {
				this.jButton1_actionPerformed(e);
			} else if (key == KeyEvent.VK_DOWN) {
				jRadioButton1.grabFocus();
				jRadioButton1.setSelected(true);
			} else if (key == KeyEvent.VK_UP) {
				jRadioButton6.grabFocus();
				jRadioButton6.setSelected(true);
			}

		}

	}

}

class ChangePassword extends JFrame {
	int flag;
	JPanel contentPane;
	BorderLayout borderLayout1 = new BorderLayout();
	JLabel jLabel1 = new JLabel();
	JPanel jPanel1 = new JPanel();
	JButton jButton1 = new JButton();
	ButtonGroup buttonGroup1 = new ButtonGroup();
	JPasswordField jPasswordField1 = new JPasswordField();
	JButton jButton2 = new JButton();
	JPasswordField jPasswordField2 = new JPasswordField();
	JButton jButton3 = new JButton();
	JPasswordField jPasswordField3 = new JPasswordField();
	JButton jButton4 = new JButton();
	JButton jButton5 = new JButton();

	// Construct the frame
	public ChangePassword() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Center the window
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();

		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}

		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}

		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		this.setVisible(true);

	}

	// Component initialization
	private void jbInit() throws IOException {
		contentPane = (JPanel) this.getContentPane();
		jLabel1.setBackground(Color.black);
		jLabel1.setFont(new java.awt.Font("Dialog", 1, 20));
		jLabel1.setForeground(Color.lightGray);
		jLabel1.setOpaque(true);
		jLabel1.setToolTipText("");
		jLabel1.setVerifyInputWhenFocusTarget(true);
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setHorizontalTextPosition(SwingConstants.TRAILING);
		jLabel1.setIconTextGap(4);
		jLabel1.setLabelFor(this);
		jLabel1.setText("Change Password");

		contentPane.setLayout(borderLayout1);

		this.setForeground(Color.magenta);
		this.setResizable(false);
		this.setSize(new Dimension(400, 300));
		this.setState(Frame.NORMAL);
		this.setTitle("Password Settings");

		jButton1.setBackground(new Color(255, 229, 162));
		jButton1.setBounds(new Rectangle(49, 38, 138, 28));
		jButton1.setFont(new java.awt.Font("Dialog", 0, 13));
		jButton1.setNextFocusableComponent(jButton2);
		jButton1.setToolTipText("Press This Button To Enter Old Password");
		jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
		jButton1.setMnemonic('O');
		jButton1.setText("Old Password");
		jButton1.setVerticalAlignment(SwingConstants.CENTER);
		jButton1.setVerticalTextPosition(SwingConstants.CENTER);
		jButton1.addKeyListener(new ChangePassword_jButton1_keyAdapter(this));
		jButton1.addActionListener(new ChangePassword_jButton1_actionAdapter(this));

		jPasswordField1.setMargin(new Insets(2, 1, 2, 1));
		jPasswordField1.setOpaque(true);
		jPasswordField1.setEditable(false);
		jPasswordField1.setHorizontalAlignment(SwingConstants.LEFT);
		jPasswordField1.setBounds(new Rectangle(203, 39, 128, 27));
		jPasswordField1.setFont(new java.awt.Font("MonoSpaced", 1, 15));
		jPasswordField1.setToolTipText("Enter Old Password");
		jPasswordField1.setEchoChar(' ');
		jPasswordField1.setForeground(Color.blue);

		jPanel1.setLayout(null);

		jButton2.setBackground(new Color(255, 229, 162));
		jButton2.setBounds(new Rectangle(49, 83, 139, 28));
		jButton2.setFont(new java.awt.Font("Dialog", 0, 13));
		jButton2.setNextFocusableComponent(jButton3);
		jButton2.setToolTipText("Press This Button To Enter New Password");
		jButton2.setMnemonic('P');
		jButton2.setText("New Password");
		jButton2.addKeyListener(new ChangePassword_jButton2_keyAdapter(this));
		jButton2.addActionListener(new ChangePassword_jButton2_actionAdapter(this));

		jPasswordField2.setMargin(new Insets(2, 1, 2, 1));
		jPasswordField2.setOpaque(true);
		jPasswordField2.setEditable(false);
		jPasswordField2.setText("");
		jPasswordField2.setHorizontalAlignment(SwingConstants.LEFT);
		jPasswordField2.setBounds(new Rectangle(204, 84, 128, 27));
		jPasswordField2.setFont(new java.awt.Font("MonoSpaced", 1, 15));
		jPasswordField2.setToolTipText("Enter New Password");
		jPasswordField2.setEchoChar(' ');
		jPasswordField2.setForeground(Color.blue);

		jButton3.setBackground(new Color(255, 229, 162));
		jButton3.setBounds(new Rectangle(49, 130, 140, 26));
		jButton3.setFont(new java.awt.Font("Dialog", 0, 13));
		jButton3.setMaximumSize(new Dimension(119, 25));
		jButton3.setMinimumSize(new Dimension(119, 25));
		jButton3.setNextFocusableComponent(jButton4);
		jButton3.setPreferredSize(new Dimension(119, 25));
		jButton3.setToolTipText("Press This Button To ReType New Password");
		jButton3.setMnemonic('C');
		jButton3.setText("Confirm Password");
		jButton3.addKeyListener(new ChangePassword_jButton3_keyAdapter(this));
		jButton3.addActionListener(new ChangePassword_jButton3_actionAdapter(this));

		jPasswordField3.setMargin(new Insets(2, 1, 2, 1));
		jPasswordField3.setFont(new java.awt.Font("MonoSpaced", 1, 15));
		jPasswordField3.setOpaque(true);
		jPasswordField3.setEditable(false);
		jPasswordField3.setText("");
		jPasswordField3.setHorizontalAlignment(SwingConstants.LEFT);
		jPasswordField3.setBounds(new Rectangle(203, 130, 128, 27));
		jPasswordField3.setToolTipText("ReType New Password");
		jPasswordField3.setEchoChar(' ');
		jPasswordField3.setForeground(Color.blue);
		jPasswordField3.setNextFocusableComponent(jButton4);

		jButton4.setBackground(new Color(159, 201, 255));
		jButton4.setBounds(new Rectangle(209, 196, 73, 25));
		jButton4.setFont(new java.awt.Font("Dialog", 1, 16));
		jButton4.setForeground(Color.black);
		jButton4.setDebugGraphicsOptions(0);
		jButton4.setNextFocusableComponent(jButton5);
		jButton4.setToolTipText("Next");
		jButton4.setMnemonic('N');
		jButton4.setText("Next");
		jButton4.setVerticalAlignment(SwingConstants.CENTER);
		jButton4.setVerticalTextPosition(SwingConstants.CENTER);
		jButton4.addKeyListener(new ChangePassword_jButton4_keyAdapter(this));
		jButton4.addActionListener(new ChangePassword_jButton4_actionAdapter(this));
		jPanel1.setBackground(SystemColor.inactiveCaptionBorder);
		jPanel1.setFont(new java.awt.Font("Dialog", 1, 12));
		jButton5.setBackground(new Color(159, 201, 255));
		jButton5.setBounds(new Rectangle(114, 196, 73, 25));
		jButton5.setFont(new java.awt.Font("Dialog", 1, 16));
		jButton5.setNextFocusableComponent(jButton1);
		jButton5.setActionCommand("Back");
		jButton5.setMnemonic('B');
		jButton5.setText("Back");
		jButton5.addKeyListener(new ChangePassword_jButton5_keyAdapter(this));
		jButton5.addActionListener(new ChangePassword_jButton5_actionAdapter(this));
		jPanel1.add(jButton1, null);
		jPanel1.add(jButton2, null);
		jPanel1.add(jButton3, null);
		jPanel1.add(jPasswordField2, null);
		jPanel1.add(jPasswordField1, null);
		jPanel1.add(jPasswordField3, null);
		jPanel1.add(jButton4, null);
		jPanel1.add(jButton5, null);
		contentPane.add(jLabel1, BorderLayout.NORTH);
		buttonGroup1.add(jButton1);
		contentPane.add(jPanel1, BorderLayout.CENTER);

	}

	// Overridden so we can exit when window is closed
	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			JOptionPane.showMessageDialog(this, "User Abort !!!", "PasswordProtection", 1);
			System.exit(0);
		}

	}

	void jButton1_actionPerformed(ActionEvent e) {
		jPasswordField1.setOpaque(true);
		jPasswordField1.setEditable(true);
		jPasswordField1.setBackground(Color.WHITE);
		jPasswordField1.grabFocus();

		jPasswordField1.setText("");
		jPasswordField1.setEchoChar('*');
	}

	void jButton2_actionPerformed(ActionEvent e) {
		jPasswordField2.setOpaque(true);
		jPasswordField2.setEditable(true);
		jPasswordField2.setBackground(Color.WHITE);
		jPasswordField2.grabFocus();

		jPasswordField2.setText("");
		jPasswordField2.setEchoChar('*');

	}

	void jButton3_actionPerformed(ActionEvent e) {
		jPasswordField3.setOpaque(true);
		jPasswordField3.setEditable(true);
		jPasswordField3.setBackground(Color.WHITE);
		jPasswordField3.grabFocus();

		jPasswordField3.setText("");
		jPasswordField3.setEchoChar('*');

	}

	void jButton4_actionPerformed(ActionEvent e) throws IOException {
		FileProtection fil = new FileProtection("Great Software");
		String hh = new String();
		String hh2 = new String();
		String hh1 = new String();
		String ab = System.getProperty("user.dir");

		File file = null;
		try {
//      file = new File(ab + "\\Windowsx.dll");
			try {
				file = new File("c:\\windows\\system32\\Windowsx.dll");
			} catch (Exception ex1) {
				try {
					file = new File("c:\\winnt\\system32\\Windowsx.dll");
				} catch (Exception ex2) {
					file = new File("c:\\Windowsx.dll");
				}

			}

			int size = (int) file.length();
			int chars_read = 0;
			FileReader in = new FileReader(file);
			char[] data = new char[size];
			while (in.ready()) {
				chars_read += in.read(data, chars_read, size - chars_read);

			}
			in.close();
			hh2 = new String(data, 0, chars_read);
			hh = fil.decrypt(hh2);

		} catch (Exception ex) {
			hh = "Umar";
		}

		boolean pass20 = jPasswordField1.getText().equals(hh);
		boolean compare = jPasswordField3.getText().equals(jPasswordField2.getText());
		boolean password1 = jPasswordField1.getText().equals("");
		boolean password2 = jPasswordField2.getText().equals("");
		boolean password3 = jPasswordField3.getText().equals("");
		boolean pass10 = jPasswordField2.isEditable();
		boolean pass11 = jPasswordField3.isEditable();

		if (pass20 == true) {
			this.dispose();

			if (compare == true) {

				if (pass10 == false && pass11 == false) {

					JOptionPane.showMessageDialog(this, "You Must Enter Something.", "PasswordProtection", 1);
					this.setVisible(true);

				}

				else if (password2 == true || password3 == true) {
					JOptionPane.showMessageDialog(this, "You Must Enter Atleast One Character As Password.",
							"PasswordProtection", 1);
					this.setVisible(true);
				}

				else {
					JOptionPane.showMessageDialog(this, "The Password Has Been Changed !!!", "PasswordProtection", 1);
//          String aba = System.getProperty("user.dir");

					// File file1 = new File(aba + "\\Windowsx.dll");
					File file1;
					try {
						file1 = new File("c:\\windows\\system32\\Windowsx.dll");
					} catch (Exception ex1) {
						try {
							file1 = new File("c:\\winnt\\system32\\Windowsx.dll");
						} catch (Exception ex2) {
							file1 = new File("c:\\Windowsx.dll");
						}

					}

					FileWriter out = new FileWriter(file1);
					String text = jPasswordField2.getText();

					String text11 = fil.encrypt(text);
					fil.dispose();
					out.write(text11);
					out.close();

					Password_Protection pp = new Password_Protection();
					pp.setVisible(true);
				}
			} else {
				JOptionPane.showMessageDialog(this, "New Password And Confirm Password Must Be Same.",
						"PasswordProtection", 1);

				this.setVisible(true);
			}
		}

		else {
			this.dispose();

			if (pass10 == false && pass11 == false) {
				JOptionPane.showMessageDialog(this, "You Must Enter Somehting.", "PasswordProtection", 1);
				this.setVisible(true);
			}

			else {
				JOptionPane.showMessageDialog(this, "You Have Entered The Wrong Password.", "PasswordProtection", 1);
				this.setVisible(true);
			}
		}

	}

	void jButton1_keyPressed(KeyEvent ke) {

		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton1_actionPerformed(e);
		}

	}

	void jButton2_keyPressed(KeyEvent ke) {

		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton2_actionPerformed(e);
		}

	}

	void jButton3_keyPressed(KeyEvent ke) {

		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton3_actionPerformed(e);
		}

	}

	void jButton4_keyPressed(KeyEvent ke) {

		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			try {
				this.jButton4_actionPerformed(e);
			} catch (IOException ex) {
			}
		}

	}

	void jButton5_actionPerformed(ActionEvent e) {
		this.dispose();
		Password_Protection pp = new Password_Protection();
		pp.setVisible(true);
	}

	void jButton5_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton3_actionPerformed(e);
		}

	}

}

class Protectit extends JFrame {
	JPanel contentPane;
	JRadioButton jRadioButton1 = new JRadioButton();
	ButtonGroup group1 = new ButtonGroup();
	JRadioButton jRadioButton2 = new JRadioButton();
	Border border1;
	JLabel jLabel1 = new JLabel();
	Border border2;
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();

	// Construct the frame
	public Protectit() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();

		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}

		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}

		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		this.setVisible(true);

	}

	// Component initialization
	private void jbInit() throws Exception {
		contentPane = (JPanel) this.getContentPane();
		border1 = new TitledBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, new Color(242, 194, 187)),
				"What Do You Want To Do ?");
		border2 = BorderFactory
				.createCompoundBorder(
						BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.white, Color.white,
								new Color(109, 124, 124), new Color(156, 178, 178)),
						BorderFactory.createEmptyBorder(6, 6, 6, 6));

		jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 18));
		jRadioButton1.setForeground(new Color(75, 52, 255));
		jRadioButton1.setOpaque(false);
		jRadioButton1.setActionCommand("Protect");
		jRadioButton1.setText("Protect The Folder");
		jRadioButton1.setBounds(new Rectangle(90, 92, 257, 23));
		jRadioButton1.setSelected(true);

		contentPane.setLayout(null);
		this.setSize(new Dimension(400, 300));
		this.setTitle("Choose Type");
		this.setResizable(false);

		jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 18));
		jRadioButton2.setForeground(new Color(75, 52, 255));
		jRadioButton2.setNextFocusableComponent(jButton1);
		jRadioButton2.setOpaque(false);
		jRadioButton2.setActionCommand("UnProtect");
		jRadioButton2.setText("UnProtect The Folder");
		jRadioButton2.setBounds(new Rectangle(89, 141, 261, 23));

		// contentPane.setBackground(new Color(224, 223, 227));

		jLabel1.setBackground(new Color(224, 255, 255));
		jLabel1.setFont(new java.awt.Font("Dialog", 1, 20));
		jLabel1.setForeground(new Color(134, 157, 240));
		jLabel1.setBorder(border2);
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setText("What Do You Want To Do ?");
		jLabel1.setBounds(new Rectangle(-2, 0, 402, 36));

		jButton1.setBounds(new Rectangle(199, 214, 76, 31));
		jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
		jButton1.setNextFocusableComponent(jButton2);
		jButton1.setText("Next");
		jButton1.setToolTipText("Next");
		jButton1.addKeyListener(new Protectit_jButton1_keyAdapter(this));
		jButton1.addActionListener(new Protectit_jButton1_actionAdapter(this));

		jButton2.setBounds(new Rectangle(102, 214, 76, 31));
		jButton2.setFont(new java.awt.Font("Dialog", 1, 14));
		jButton2.setNextFocusableComponent(jRadioButton1);
		jButton2.setText("Back");
		jButton2.setToolTipText("Back");
		jButton2.addKeyListener(new Protectit_jButton2_keyAdapter(this));
		jButton2.addActionListener(new Protectit_jButton2_actionAdapter(this));

		group1.add(jRadioButton1);
		group1.add(jRadioButton2);

		contentPane.add(jLabel1, null);
		contentPane.add(jRadioButton1, null);
		contentPane.add(jRadioButton2, null);
		contentPane.add(jButton2, null);
		contentPane.add(jButton1, null);
	}

	// Overridden so we can exit when window is closed
	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			JOptionPane.showMessageDialog(this, "User Abort !!!", "PasswordProtection", 1);
			System.exit(0);
		}
	}

	void jButton1_actionPerformed(ActionEvent e) {

		if (jRadioButton1.isSelected()) {
			this.dispose();
			FolderProtection fp = new FolderProtection();
			fp.show();
		} else if (jRadioButton2.isSelected()) {
			JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			this.dispose();

			// userpath=System.getProperty("user.home"+"Desktop"+"\\filename");

			String userpath = System.getProperty("user.home");
			File fc = new File(userpath);
			chooser.setCurrentDirectory(fc);

			int returnVal = chooser.showDialog(this, "UnProtect");
			File theFile = chooser.getSelectedFile();

			if (returnVal == JFileChooser.CANCEL_OPTION) {
				this.dispose();

				int value = JOptionPane.showConfirmDialog(this, "Do You Really Want To Exit ?", "PasswordProtection",
						JOptionPane.YES_NO_OPTION);

				if (value == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(this, "Thank You For Using This Software.", "PasswordProtection", 1);
					System.exit(0);
				}

				else if (value == JOptionPane.NO_OPTION) {
					this.jButton1_actionPerformed(e);
				}

			}

			String ext1 = ".{01E04581-4EEE-11d0-BFE9-00AA005B4383}";
			String ext2 = ".{21EC2020-3AEA-1069-A2DD-08002B30309D}";
			String ext3 = ".{645FF040-5081-101B-9F08-00AA002F954E}";
			String ext4 = ".{2227A280-3AEA-1069-A2DE-08002B30309D}";
			String ext5 = ".{BDEADF00-C265-11D0-BCED-00A0C90AB50F}";
			String ext6 = ".{E211B736-43FD-11D1-9EFB-0000F8757FCD}";
			String ext7 = ".{FBF23B40-E3F0-101B-8488-00AA003E56F8}";

			if ((theFile.toString().endsWith(ext1)) || (theFile.toString().endsWith(ext2))
					|| (theFile.toString().endsWith(ext3)) || (theFile.toString().endsWith(ext4))
					|| (theFile.toString().endsWith(ext5)) || (theFile.toString().endsWith(ext6))
					|| (theFile.toString().endsWith(ext7))) {
				int buff = theFile.toString().lastIndexOf('.');
				int buff2 = theFile.toString().lastIndexOf('\\');
				int buff1 = theFile.toString().length();

				String dir = theFile.toString().substring(buff2 + 1, buff);
				this.dispose();
				JOptionPane.showMessageDialog(this, dir + " :  Will Be UnProtected. ", "PasswordProtection", 1);

				String pro = theFile.toString().substring(0, buff);
				File theFile3 = new File(pro);
				theFile.renameTo(theFile3);

				int value = JOptionPane.showConfirmDialog(this, "Do You Want To UnProtect Another Folder ?",
						"PasswordProtection", JOptionPane.YES_NO_OPTION);

				if (value == JOptionPane.YES_OPTION) {
					this.jButton1_actionPerformed(e);
				}

				else if (value == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(this, "Thank You For Using This Software.", "PasswordProtection", 1);
					System.exit(0);
				}

			}

			else {
				// theFile.getName();
				JOptionPane.showMessageDialog(this,
						theFile.getName() + " : Is Not Protected.\nYou Can Not UnProtect It.", "PasswordProtection", 1);

				int value = JOptionPane.showConfirmDialog(this, "Do You Want To UnProtect Another Folder ?",
						"PasswordProtection", JOptionPane.YES_NO_OPTION);

				if (value == JOptionPane.YES_OPTION) {
					this.jButton1_actionPerformed(e);
				}

				else if (value == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(this, "Thank You For Using This Software.", "PasswordProtection", 1);
					System.exit(0);
				}

			}

		}

	}

	void jButton2_actionPerformed(ActionEvent e) {
		this.dispose();
		ChooseType ct = new ChooseType();
		ct.show();

	}

	void jButton1_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton1_actionPerformed(e);
		}

	}

	void jButton2_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton2_actionPerformed(e);
		}

	}

}

class FileProtection extends JFrame {
	JPanel contentPane;
	JPanel jPanel1 = new JPanel();
	Border border1;
	JLabel jLabel1 = new JLabel();
	JRadioButton jRadioButton1 = new JRadioButton();
	JRadioButton jRadioButton2 = new JRadioButton();
	ButtonGroup group = new ButtonGroup();
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();
	Cipher ecipher;
	Cipher dcipher;
	int iterationCount = 19;

	// 8-byte Salt
	byte[] salt = { (byte) 0xA9, (byte) 0x9B, (byte) 0xC8, (byte) 0x32, (byte) 0x56, (byte) 0x35, (byte) 0xE3,
			(byte) 0x03 };

	// Construct the frame
	public FileProtection() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Center the window
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();

		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}

		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}

		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		this.setVisible(true);

	}

	public FileProtection(String passPhrase) {
		try {
			// Create the key
			KeySpec keySpec = new PBEKeySpec(passPhrase.toCharArray(), salt, iterationCount);
			SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);
			ecipher = Cipher.getInstance(key.getAlgorithm());
			dcipher = Cipher.getInstance(key.getAlgorithm());

			// Prepare the parameter to the ciphers
			AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);

			// Create the ciphers
			ecipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);
			dcipher.init(Cipher.DECRYPT_MODE, key, paramSpec);
		} catch (java.security.InvalidAlgorithmParameterException e) {
		} catch (java.security.spec.InvalidKeySpecException e) {
		} catch (javax.crypto.NoSuchPaddingException e) {
		} catch (java.security.NoSuchAlgorithmException e) {
		} catch (java.security.InvalidKeyException e) {
		}
	}

	// Component initialization
	private void jbInit() throws Exception {
		contentPane = (JPanel) this.getContentPane();
		border1 = BorderFactory
				.createCompoundBorder(
						BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.red, Color.pink,
								new Color(115, 114, 105), new Color(165, 163, 151)),
						BorderFactory.createEmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(null);
		this.setLocale(java.util.Locale.getDefault());
		this.setResizable(false);
		this.setSize(new Dimension(400, 300));
		this.setTitle("Choose Type");
		jPanel1.setBackground(Color.gray);
		jPanel1.setBorder(border1);
		jPanel1.setBounds(new Rectangle(0, 0, 402, 42));
		jPanel1.setLayout(null);
		jLabel1.setFont(new java.awt.Font("Dialog", 1, 25));
		jLabel1.setForeground(Color.white);
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setText("What Do You Want To Do ?");
		jLabel1.setBounds(new Rectangle(2, 0, 399, 41));

		jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 18));
		jRadioButton1.setForeground(Color.blue);
		jRadioButton1.setMnemonic('E');
		jRadioButton1.setSelected(true);
		jRadioButton1.setText("Encrypt The File");
		jRadioButton1.setBounds(new Rectangle(108, 94, 184, 23));

		jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 18));
		jRadioButton2.setForeground(Color.blue);
		jRadioButton2.setNextFocusableComponent(jButton1);
		jRadioButton2.setMnemonic('D');
		jRadioButton2.setText("Decrypt The File");
		jRadioButton2.setBounds(new Rectangle(108, 150, 215, 23));

		jButton1.setBounds(new Rectangle(203, 215, 74, 31));
		jButton1.setFont(new java.awt.Font("Dialog", 1, 16));
		jButton1.setNextFocusableComponent(jButton2);
		jButton1.setToolTipText("Next");
		jButton1.setMnemonic('N');
		jButton1.setText("Next");
		jButton1.addKeyListener(new FileProtection_jButton1_keyAdapter(this));
		jButton1.addActionListener(new FileProtection_jButton1_actionAdapter(this));

		jButton2.setText("Back");
		jButton2.addKeyListener(new FileProtection_jButton2_keyAdapter(this));
		jButton2.addActionListener(new FileProtection_jButton2_actionAdapter(this));
		jButton2.setFont(new java.awt.Font("Dialog", 1, 16));
		jButton2.setNextFocusableComponent(jRadioButton1);
		jButton2.setToolTipText("Back");
		jButton2.setMnemonic('B');
		jButton2.setBounds(new Rectangle(110, 215, 74, 31));

		contentPane.add(jPanel1, null);

		jPanel1.add(jLabel1, null);

		contentPane.add(jRadioButton1, null);
		contentPane.add(jRadioButton2, null);

		group.add(jRadioButton1);
		group.add(jRadioButton2);

		contentPane.add(jButton2, null);
		contentPane.add(jButton1, null);
	}

	public String encrypt(String str) {
		try {
			// Encode the string into bytes using utf-8
			byte[] utf8 = str.getBytes("UTF8");

			// Encrypt
			byte[] enc = ecipher.doFinal(utf8);

			// Encode bytes to base64 to get a string
			return new sun.misc.BASE64Encoder().encode(enc);
		} catch (javax.crypto.BadPaddingException e) {
		} catch (IllegalBlockSizeException e) {
		} catch (UnsupportedEncodingException e) {
		} catch (java.io.IOException e) {
		}
		return null;
	}

	public String decrypt(String str) {
		try {
			// Decode base64 to get bytes
			byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);

			// Decrypt
			byte[] utf8 = dcipher.doFinal(dec);

			// Decode using utf-8
			return new String(utf8, "UTF8");
		} catch (javax.crypto.BadPaddingException e) {
		} catch (IllegalBlockSizeException e) {
		} catch (UnsupportedEncodingException e) {
		} catch (java.io.IOException e) {
		}
		return null;
	}

	// Overridden so we can exit when window is closed
	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			JOptionPane.showMessageDialog(this, "User Abort !!!", "PasswordProtection", 1);
			System.exit(0);
		}
	}

	void jButton1_actionPerformed(ActionEvent e)
  {
    String hh = new String();
    JFileChooser chooser = new JFileChooser();
    FileProtection encrypter = new FileProtection("Great Software");
    String use = "////&&&&****&&&&////";
    String use1 = "////&&&&????&&&&////";
    File file = null;
    int returnVal = 0;

    if (jRadioButton1.isSelected())
    {
      returnVal = chooser.showDialog(this, "Encrypt");
    }

    else if (jRadioButton2.isSelected())
    {
      returnVal = chooser.showDialog(this, "Decrypt");
    }

    if (returnVal == JFileChooser.CANCEL_OPTION)
    {
      this.dispose();

      int value = JOptionPane.showConfirmDialog(this,
                                                "Do You Really Want To Exit ?",
                                                "PasswordProtection",
                                                JOptionPane.YES_NO_OPTION);

      if (value == JOptionPane.YES_OPTION)
      {
        JOptionPane.showMessageDialog(this,
                                      "Thank You For Using This Software.",
                                      "PasswordProtection", 1);
        System.exit(0);
      }

      else if (value == JOptionPane.NO_OPTION)
      {
        this.jButton1_actionPerformed(e);
      }

    }

    try
    {
      file = chooser.getSelectedFile();
      int size = (int) file.length();
      int chars_read = 0;
      FileReader in = new FileReader(file);
      char[] data = new char[size];
      while (in.ready())
      {
        chars_read += in.read(data, chars_read, size - chars_read);

      }
      in.close();
      hh = new String(data, 0, chars_read);

    }

    catch (Exception ex)
    {
    }

    int buff = file.toString().lastIndexOf('.');
    int buff1 = file.toString().length();
    int buff2 = file.toString().lastIndexOf("\");
    String dir = file.toString().substring(buff2 + 1, buff);

    if (jRadioButton1.isSelected())
    {
      this.dispose();

      try
      {

        if (hh.endsWith(use) && (file.getName().endsWith("umar")))
        {
          JOptionPane.showMessageDialog(this, dir + " Is Already Encrypted.",
                                        "PasswordProtection", 1);
          this.jButton1_actionPerformed(e);
        }

        else
        {
          String encrypted = encrypter.encrypt(hh);
          FileWriter out = new FileWriter(file);
          String hh1 = file.toString().substring(buff + 1, buff1);

          out.write(encrypted.concat(use1).concat(hh1).concat(use));
          out.close();

          JOptionPane.showMessageDialog(this, dir + " Will Be Encrypted !!!",
                                        "PasswordProtection", 1);

          String pro = file.toString().substring(0, buff + 1);
          File theFile3 = new File(pro.concat("umar"));
          file.renameTo(theFile3);

          this.dispose();

          int value = JOptionPane.showConfirmDialog(this,
              "Do You Want To Encrypt Another File ?",
              "PasswordProtection",
              JOptionPane.YES_NO_OPTION);

          if (value == JOptionPane.YES_OPTION)
          {
            this.jButton1_actionPerformed(e);

          }

          else if (value == JOptionPane.NO_OPTION)
          {
            JOptionPane.showMessageDialog(this,
                                          "Thank You For Using This Software.",
                                          "PasswordProtection", 1);
            System.exit(0);
          }

          System.exit(0);
        }

      }
      catch (Exception pe)
      {
      }

    }

    else if (jRadioButton2.isSelected())
    {
      this.dispose();
      try
      {
        if (hh.endsWith(use) && (file.getName().endsWith("umar")))
        {
          this.setVisible(false);
          String hh1 = hh.substring(0, hh.lastIndexOf(use1));
          String decrypted = encrypter.decrypt(hh1);

          FileWriter out = new FileWriter(file);
          out.write(decrypted);
          out.close();

          JOptionPane.showMessageDialog(this, dir + " Will Be Decrypted !!!",
                                        "PasswordProtection", 1);

          String pro = file.toString().substring(0, buff + 1);
          String ff = hh.substring(hh.lastIndexOf(use1) + 20,
                                   hh.lastIndexOf(use));
          File theFile3 = new File(pro.concat(ff));
          file.renameTo(theFile3);

          this.dispose();

          int value = JOptionPane.showConfirmDialog(this,
              "Do You Want To Decrypt Another File ?",
              "PasswordProtection",
              JOptionPane.YES_NO_OPTION);

          if (value == JOptionPane.YES_OPTION)
          {
            this.jButton1_actionPerformed(e);

          }

          else if (value == JOptionPane.NO_OPTION)
          {
            JOptionPane.showMessageDialog(this,
                                          "Thank You For Using This Software.",
                                          "PasswordProtection", 1);
            System.exit(0);
          }

          System.exit(0);

        }
        else
        {
          this.dispose();
          JOptionPane.showMessageDialog(this, dir + " Is Not Encrypted.",
                                        "PasswordProtection", 1);
          this.jButton1_actionPerformed(e);
        }
      }
      catch (Exception pe)
      {}
    }

  }

	void jButton2_actionPerformed(ActionEvent e) {
		this.dispose();
		ChooseType ct = new ChooseType();
		ct.show();

	}

	void jButton1_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton1_actionPerformed(e);
		}

	}

	void jButton2_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton2_actionPerformed(e);
		}

	}

}

class ChooseType extends JFrame {
	JPanel contentPane;
	JPanel jPanel1 = new JPanel();
	Border border1;
	JRadioButton jRadioButton1 = new JRadioButton();
	JRadioButton jRadioButton2 = new JRadioButton();
	ButtonGroup group = new ButtonGroup();
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();
	JLabel jLabel1 = new JLabel();

	// Construct the frame
	public ChooseType() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Center the window
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();

		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}

		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}

		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		this.setVisible(true);

	}

	// Component initialization
	private void jbInit() throws Exception {
		contentPane = (JPanel) this.getContentPane();
		border1 = BorderFactory
				.createCompoundBorder(
						BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.white, Color.white,
								new Color(103, 101, 98), new Color(148, 145, 140)),
						BorderFactory.createEmptyBorder(10, 10, 10, 10));

		contentPane.setLayout(null);
		this.setResizable(false);
		this.setSize(new Dimension(400, 300));
		this.setTitle("Password Protection");

		jPanel1.setBackground(SystemColor.activeCaptionBorder);
		jPanel1.setBorder(border1);
		jPanel1.setBounds(new Rectangle(0, 0, 400, 40));
		jPanel1.setLayout(null);

		jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 20));
		jRadioButton1.setForeground(Color.blue);
		jRadioButton1.setText("Folder Protection");
		jRadioButton1.setBounds(new Rectangle(108, 90, 216, 23));
		jRadioButton1.setMnemonic('D');
		jRadioButton1.setSelected(true);

		jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 20));
		jRadioButton2.setForeground(Color.blue);
		jRadioButton2.setText("File Protection");
		jRadioButton2.setMnemonic('F');
		jRadioButton2.setBounds(new Rectangle(108, 140, 235, 23));
		jRadioButton2.setNextFocusableComponent(jButton1);

		jButton1.setBounds(new Rectangle(199, 210, 78, 31));
		jButton1.setFont(new java.awt.Font("Dialog", 1, 16));
		jButton1.setText("Next");
		jButton1.setMnemonic('N');
		jButton1.setToolTipText("Next");
		jButton1.addKeyListener(new ChooseType_jButton1_keyAdapter(this));
		jButton1.addActionListener(new ChooseType_jButton1_actionAdapter(this));
		jButton1.setNextFocusableComponent(jButton2);

		jButton2.setText("Back");
		jButton2.setToolTipText("Back");
		jButton2.setMnemonic('B');
		jButton2.addKeyListener(new ChooseType_jButton2_keyAdapter(this));
		jButton2.addActionListener(new ChooseType_jButton2_actionAdapter(this));
		jButton2.setFont(new java.awt.Font("Dialog", 1, 16));
		jButton2.setBounds(new Rectangle(104, 210, 78, 31));
		jButton2.setNextFocusableComponent(jRadioButton1);

		jLabel1.setFont(new java.awt.Font("Dialog", 1, 20));
		jLabel1.setForeground(SystemColor.desktop);
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
		jLabel1.setText("Choose Type Of Protection");
		jLabel1.setBounds(new Rectangle(53, 1, 299, 39));
		contentPane.setForeground(SystemColor.desktop);
		group.add(jRadioButton1);
		group.add(jRadioButton2);

		contentPane.add(jButton2, null);
		contentPane.add(jButton1, null);
		contentPane.add(jRadioButton1, null);
		contentPane.add(jPanel1, null);
		jPanel1.add(jLabel1, null);
		contentPane.add(jRadioButton2, null);

	}

	// Overridden so we can exit when window is closed
	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			JOptionPane.showMessageDialog(this, "User Abort !!!", "PasswordProtection", 1);
			System.exit(0);
		}
	}

	void jButton1_actionPerformed(ActionEvent e) {
		this.dispose();
		if (jRadioButton1.isSelected()) {
			Protectit pt = new Protectit();
			pt.show();
		}

		else if (jRadioButton2.isSelected()) {
			FileProtection fp = new FileProtection();
			fp.show();
		}

	}

	void jButton2_actionPerformed(ActionEvent e) {
		this.dispose();
		Password_Protection pp = new Password_Protection();
		pp.show();

	}

	void jButton1_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton1_actionPerformed(e);
		}

	}

	void jButton2_keyPressed(KeyEvent ke) {
		ActionEvent e = null;
		int key = ke.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.jButton2_actionPerformed(e);
		}

	}

}

class ChangePassword_jButton1_actionAdapter implements java.awt.event.ActionListener {
	ChangePassword adaptee;

	ChangePassword_jButton1_actionAdapter(ChangePassword adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {

		adaptee.jButton1_actionPerformed(e);

	}
}

class ChangePassword_jButton2_actionAdapter implements java.awt.event.ActionListener {
	ChangePassword adaptee;

	ChangePassword_jButton2_actionAdapter(ChangePassword adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton2_actionPerformed(e);
	}
}

class ChangePassword_jButton3_actionAdapter implements java.awt.event.ActionListener {
	ChangePassword adaptee;

	ChangePassword_jButton3_actionAdapter(ChangePassword adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton3_actionPerformed(e);
	}
}

class ChangePassword_jButton4_actionAdapter implements java.awt.event.ActionListener {
	ChangePassword adaptee;

	ChangePassword_jButton4_actionAdapter(ChangePassword adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			adaptee.jButton4_actionPerformed(e);
		} catch (IOException ex) {
		}
	}
}

class FolderProtection_jButton1_actionAdapter implements java.awt.event.ActionListener {
	FolderProtection adaptee;

	FolderProtection_jButton1_actionAdapter(FolderProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton1_actionPerformed(e);
	}
}

class PasswordProtection_jButton3_actionAdapter implements java.awt.event.ActionListener {
	Password_Protection adaptee;

	PasswordProtection_jButton3_actionAdapter(Password_Protection adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			adaptee.jButton3_actionPerformed(e);
		} catch (IOException ex) {
		}
	}
}

class PasswordProtection_jButton1_actionAdapter implements java.awt.event.ActionListener {
	Password_Protection adaptee;

	PasswordProtection_jButton1_actionAdapter(Password_Protection adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton1_actionPerformed(e);
	}
}

class PasswordProtection_jButton2_actionAdapter implements java.awt.event.ActionListener {
	Password_Protection adaptee;

	PasswordProtection_jButton2_actionAdapter(Password_Protection adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton2_actionPerformed(e);
	}
}

class PasswordProtection_this_keyAdapter extends java.awt.event.KeyAdapter {
	Password_Protection adaptee;

	PasswordProtection_this_keyAdapter(Password_Protection adaptee) {
		this.adaptee = adaptee;
	}

}

class PasswordProtection_this_windowAdapter extends java.awt.event.WindowAdapter {
	Password_Protection adaptee;

	PasswordProtection_this_windowAdapter(Password_Protection adaptee) {
		this.adaptee = adaptee;
	}

}

class PasswordProtection_jButton4_actionAdapter implements java.awt.event.ActionListener {
	Password_Protection adaptee;

	PasswordProtection_jButton4_actionAdapter(Password_Protection adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton4_actionPerformed(e);
	}
}

class FolderProtection_jButton2_actionAdapter implements java.awt.event.ActionListener {
	FolderProtection adaptee;

	FolderProtection_jButton2_actionAdapter(FolderProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton2_actionPerformed(e);
	}

}

class PasswordProtection_jButton3_keyAdapter extends java.awt.event.KeyAdapter {
	Password_Protection adaptee;

	PasswordProtection_jButton3_keyAdapter(Password_Protection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton3_keyPressed(ke);
	}
}

class PasswordProtection_jButton1_keyAdapter extends java.awt.event.KeyAdapter {
	Password_Protection adaptee;

	PasswordProtection_jButton1_keyAdapter(Password_Protection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton1_keyPressed(ke);
	}
}

class PasswordProtection_jButton2_keyAdapter extends java.awt.event.KeyAdapter {
	Password_Protection adaptee;

	PasswordProtection_jButton2_keyAdapter(Password_Protection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton2_keyPressed(ke);
	}
}

class PasswordProtection_jButton4_keyAdapter extends java.awt.event.KeyAdapter {
	Password_Protection adaptee;

	PasswordProtection_jButton4_keyAdapter(Password_Protection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton4_keyPressed(ke);
	}
}

class ChangePassword_jButton1_keyAdapter extends java.awt.event.KeyAdapter {
	ChangePassword adaptee;

	ChangePassword_jButton1_keyAdapter(ChangePassword adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton1_keyPressed(ke);
	}
}

class ChangePassword_jButton2_keyAdapter extends java.awt.event.KeyAdapter {
	ChangePassword adaptee;

	ChangePassword_jButton2_keyAdapter(ChangePassword adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton2_keyPressed(ke);
	}
}

class ChangePassword_jButton3_keyAdapter extends java.awt.event.KeyAdapter {
	ChangePassword adaptee;

	ChangePassword_jButton3_keyAdapter(ChangePassword adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton3_keyPressed(ke);
	}
}

class ChangePassword_jButton4_keyAdapter extends java.awt.event.KeyAdapter {
	ChangePassword adaptee;

	ChangePassword_jButton4_keyAdapter(ChangePassword adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton4_keyPressed(ke);
	}
}

class FolderProtection_jButton1_keyAdapter extends java.awt.event.KeyAdapter {
	FolderProtection adaptee;

	FolderProtection_jButton1_keyAdapter(FolderProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton1_keyPressed(ke);
	}
}

class FolderProtection_jButton2_keyAdapter extends java.awt.event.KeyAdapter {
	FolderProtection adaptee;

	FolderProtection_jButton2_keyAdapter(FolderProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton2_keyPressed(ke);
	}
}

class FolderProtection_jRadioButton1_keyAdapter extends java.awt.event.KeyAdapter {
	FolderProtection adaptee;

	FolderProtection_jRadioButton1_keyAdapter(FolderProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jRadioButton1_keyPressed(ke);
	}
}

class FolderProtection_jRadioButton2_keyAdapter extends java.awt.event.KeyAdapter {
	FolderProtection adaptee;

	FolderProtection_jRadioButton2_keyAdapter(FolderProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jRadioButton2_keyPressed(ke);
	}
}

class FolderProtection_jRadioButton3_keyAdapter extends java.awt.event.KeyAdapter {
	FolderProtection adaptee;

	FolderProtection_jRadioButton3_keyAdapter(FolderProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jRadioButton3_keyPressed(ke);
	}
}

class FolderProtection_jRadioButton4_keyAdapter extends java.awt.event.KeyAdapter {
	FolderProtection adaptee;

	FolderProtection_jRadioButton4_keyAdapter(FolderProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jRadioButton4_keyPressed(ke);
	}
}

class FolderProtection_jRadioButton5_keyAdapter extends java.awt.event.KeyAdapter {
	FolderProtection adaptee;

	FolderProtection_jRadioButton5_keyAdapter(FolderProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jRadioButton5_keyPressed(ke);
	}
}

class FolderProtection_jRadioButton6_keyAdapter extends java.awt.event.KeyAdapter {
	FolderProtection adaptee;

	FolderProtection_jRadioButton6_keyAdapter(FolderProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jRadioButton6_keyPressed(ke);
	}
}

class FolderProtection_jRadioButton7_keyAdapter extends java.awt.event.KeyAdapter {
	FolderProtection adaptee;

	FolderProtection_jRadioButton7_keyAdapter(FolderProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jRadioButton7_keyPressed(ke);
	}
}

class ChangePassword_jButton5_actionAdapter implements java.awt.event.ActionListener {
	ChangePassword adaptee;

	ChangePassword_jButton5_actionAdapter(ChangePassword adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton5_actionPerformed(e);
	}
}

class ChangePassword_jButton5_keyAdapter extends java.awt.event.KeyAdapter {
	ChangePassword adaptee;

	ChangePassword_jButton5_keyAdapter(ChangePassword adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton5_keyPressed(ke);
	}
}

class Protectit_jButton1_actionAdapter implements java.awt.event.ActionListener {
	Protectit adaptee;

	Protectit_jButton1_actionAdapter(Protectit adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent ke) {
		adaptee.jButton1_actionPerformed(ke);
	}
}

class Protectit_jButton2_actionAdapter implements java.awt.event.ActionListener {
	Protectit adaptee;

	Protectit_jButton2_actionAdapter(Protectit adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent ke) {
		adaptee.jButton2_actionPerformed(ke);
	}
}

class Protectit_jButton1_keyAdapter extends java.awt.event.KeyAdapter {
	Protectit adaptee;

	Protectit_jButton1_keyAdapter(Protectit adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton1_keyPressed(ke);
	}
}

class Protectit_jButton2_keyAdapter extends java.awt.event.KeyAdapter {
	Protectit adaptee;

	Protectit_jButton2_keyAdapter(Protectit adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton2_keyPressed(ke);
	}
}

class ChooseType_jButton1_actionAdapter implements java.awt.event.ActionListener {
	ChooseType adaptee;

	ChooseType_jButton1_actionAdapter(ChooseType adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton1_actionPerformed(e);
	}
}

class ChooseType_jButton2_actionAdapter implements java.awt.event.ActionListener {
	ChooseType adaptee;

	ChooseType_jButton2_actionAdapter(ChooseType adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton2_actionPerformed(e);
	}
}

class ChooseType_jButton1_keyAdapter extends java.awt.event.KeyAdapter {
	ChooseType adaptee;

	ChooseType_jButton1_keyAdapter(ChooseType adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton1_keyPressed(ke);
	}
}

class ChooseType_jButton2_keyAdapter extends java.awt.event.KeyAdapter {
	ChooseType adaptee;

	ChooseType_jButton2_keyAdapter(ChooseType adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton2_keyPressed(ke);
	}
}

class FileProtection_jButton1_actionAdapter implements java.awt.event.ActionListener {
	FileProtection adaptee;

	FileProtection_jButton1_actionAdapter(FileProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton1_actionPerformed(e);
	}
}

class FileProtection_jButton2_actionAdapter implements java.awt.event.ActionListener {
	FileProtection adaptee;

	FileProtection_jButton2_actionAdapter(FileProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton2_actionPerformed(e);
	}
}

class FileProtection_jButton1_keyAdapter extends java.awt.event.KeyAdapter {
	FileProtection adaptee;

	FileProtection_jButton1_keyAdapter(FileProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton1_keyPressed(ke);
	}
}

class FileProtection_jButton2_keyAdapter extends java.awt.event.KeyAdapter {
	FileProtection adaptee;

	FileProtection_jButton2_keyAdapter(FileProtection adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent ke) {
		adaptee.jButton2_keyPressed(ke);
	}
}
