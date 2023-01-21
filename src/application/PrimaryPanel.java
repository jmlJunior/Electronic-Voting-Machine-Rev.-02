package application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import entities.Governor;
import entities.President;
import entities.VoterChoice;
import resources.FindVoters;
import resources.PresidentVotingResults;
import resources.GovernorVotingResults;
import resources.ThreadBack;
import resources.ThreadChangeOffice;
import resources.ThreadClear;

public class PrimaryPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, boardMemberPanel, votingPanel;

	public static JTabbedPane tabbedPane;
	public static JEditorPane titleNumber;
	public static JPasswordField passwordField;

	public static JTextField tenBox, oneBox;

	public static JLabel office, candidateName, viceName, candidateImg, viceImg, politicalParty, end;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimaryPanel frame = new PrimaryPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrimaryPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 689, 398);
		contentPane.add(tabbedPane);

		/**
		 * setting the board member panel
		 **/
		boardMemberPanel = new JPanel();
		tabbedPane.addTab("Painel do Mesário", null, boardMemberPanel, null);
		boardMemberPanel.setLayout(null);

		JLabel title = new JLabel("N\u00FAmero do T\u00EDtulo de Eleitor");
		title.setFont(new Font("Tahoma", Font.BOLD, 12));
		title.setBounds(43, 33, 187, 14);
		boardMemberPanel.add(title);

		titleNumber = new JEditorPane();
		titleNumber.setBounds(43, 58, 204, 20);
		boardMemberPanel.add(titleNumber);
		titleNumber.requestFocus();

		JLabel password = new JLabel("SENHA do MES\u00C1RIO - Liberar Vota\u00E7\u00E3o");
		password.setFont(new Font("Tahoma", Font.BOLD, 12));
		password.setBounds(43, 120, 240, 14);
		boardMemberPanel.add(password);

		passwordField = new JPasswordField();
		passwordField.setBounds(43, 145, 204, 20);
		boardMemberPanel.add(passwordField);

		JPanel edge = new JPanel();
		edge.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		edge.setBounds(24, 21, 371, 245);
		boardMemberPanel.add(edge);

		JLabel electoralJustice = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Justiça Eleitoral - Brasão.jpg")).getImage()
				.getScaledInstance(230, 245, Image.SCALE_SMOOTH);
		electoralJustice.setIcon(new ImageIcon(img));
		electoralJustice.setBounds(420, 21, 230, 245);
		boardMemberPanel.add(electoralJustice);

		JButton btnResult = new JButton("PRINT");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = new String(passwordField.getPassword());
				if (!senha.equals("123")) {
					JOptionPane.showMessageDialog(null, "SENHA INCORRETA!");
					passwordField.setText("");
					passwordField.requestFocus();
				} else {
					PresidentVotingResults.PrintResults();
					GovernorVotingResults.setResults();
					JOptionPane.showMessageDialog(null,
					"Resultado de Urna gerado com sucesso no Diretório D:\\JAVA\\Temp\\ws-eclipse\\Electronic Voting Machine\\archive\\!!!");
					passwordField.setText("");
				}
			}
		});
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnResult.setBackground(Color.WHITE);
		btnResult.setBounds(347, 288, 86, 36);
		boardMemberPanel.add(btnResult);

		JButton btnClear = new JButton("CORRIGE");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				titleNumber.setText("");
				passwordField.setText("");
				titleNumber.requestFocus();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnClear.setBackground(Color.ORANGE);
		btnClear.setBounds(443, 288, 94, 36);
		boardMemberPanel.add(btnClear);

		JButton btnEnter = new JButton("CONFIRMA");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = new String(passwordField.getPassword());
				if (!senha.equals("123")) {
					JOptionPane.showMessageDialog(null, "SENHA INCORRETA!");
					passwordField.setText("");
					passwordField.requestFocus();
				}
				if (titleNumber.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "O campo TÍTULO DE ELEITOR deve ser preenchido!");
				}
				if (!titleNumber.getText().equals("") && senha.equals("123")) {
					/**
					 * thread to check the names of voters registered
					 **/
					FindVoters treadFv = new FindVoters("Find");
					treadFv.start();

					tabbedPane.setEnabledAt(1, true);
					tabbedPane.setSelectedIndex(1);
					tenBox.requestFocus();
				}
			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnEnter.setBackground(Color.GREEN);
		btnEnter.setBounds(544, 279, 93, 45);
		boardMemberPanel.add(btnEnter);

		/**
		 * end of board member panel settings
		 *********************************************************************************************************************************************
		 * 
		 * 
		 * setting the voting panel
		 **/

		President votingp = new President();
		Governor votingg = new Governor();
		VoterChoice setNumber = new VoterChoice();

		votingPanel = new JPanel();
		tabbedPane.addTab("Painle de Votação", null, votingPanel, null);
		votingPanel.setLayout(null);
		tabbedPane.setEnabledAt(1, false);

		JLabel head = new JLabel("SEU VOTO PARA");
		head.setFont(new Font("Tahoma", Font.BOLD, 12));
		head.setBounds(43, 33, 100, 14);
		votingPanel.add(head);

		office = new JLabel("PRESIDENTE");
		office.setHorizontalAlignment(SwingConstants.CENTER);
		office.setFont(new Font("Calibri", Font.BOLD, 22));
		office.setBounds(80, 79, 150, 23);
		votingPanel.add(office);

		JLabel number = new JLabel("N\u00FAmero:");
		number.setFont(new Font("Tahoma", Font.BOLD, 10));
		number.setBounds(43, 123, 46, 14);
		votingPanel.add(number);

		tenBox = new JTextField();
		tenBox.setHorizontalAlignment(SwingConstants.CENTER);
		tenBox.setFont(new Font("Tahoma", Font.PLAIN, 38));
		tenBox.setColumns(10);
		tenBox.setBounds(120, 105, 33, 55);
		votingPanel.add(tenBox);
		tenBox.requestFocus();

		oneBox = new JTextField();
		oneBox.setHorizontalAlignment(SwingConstants.CENTER);
		oneBox.setFont(new Font("Tahoma", Font.PLAIN, 38));
		oneBox.setColumns(10);
		oneBox.setBounds(155, 105, 33, 55);
		votingPanel.add(oneBox);

		JLabel name = new JLabel("Nome:");
		name.setFont(new Font("Tahoma", Font.BOLD, 12));
		name.setBounds(43, 205, 46, 14);
		votingPanel.add(name);

		JLabel group = new JLabel("Partido:");
		group.setFont(new Font("Tahoma", Font.BOLD, 12));
		group.setBounds(43, 230, 60, 14);
		votingPanel.add(group);

		candidateName = new JLabel("");
		candidateName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		candidateName.setBounds(88, 204, 310, 14);
		votingPanel.add(candidateName);

		politicalParty = new JLabel("");
		politicalParty.setFont(new Font("Tahoma", Font.PLAIN, 14));
		politicalParty.setBounds(100, 230, 120, 14);
		votingPanel.add(politicalParty);

		candidateImg = new JLabel("");
		candidateImg.setFont(new Font("Arial", Font.BOLD, 65));
		candidateImg.setBounds(278, 21, 120, 160);
		votingPanel.add(candidateImg);

		end = new JLabel("");
		end.setFont(new Font("Tahoma", Font.PLAIN, 30));
		end.setBounds(108, 171, 112, 30);
		votingPanel.add(end);

		viceName = new JLabel("");
		viceName.setHorizontalAlignment(SwingConstants.RIGHT);
		viceName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		viceName.setBounds(159, 246, 169, 14);
		votingPanel.add(viceName);

		viceImg = new JLabel("");
		viceImg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		viceImg.setHorizontalAlignment(SwingConstants.RIGHT);
		viceImg.setBounds(338, 185, 60, 75);
		votingPanel.add(viceImg);

		edge = new JPanel();
		edge.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		edge.setBounds(10, 11, 401, 265);
		votingPanel.add(edge);

		JLabel instructions = new JLabel("Aperte a tecla");
		instructions.setFont(new Font("Tahoma", Font.BOLD, 11));
		instructions.setToolTipText("");
		instructions.setBounds(30, 290, 298, 14);
		votingPanel.add(instructions);

		JLabel green = new JLabel("VERDE para CONFIRMAR");
		green.setFont(new Font("Tahoma", Font.BOLD, 11));
		green.setBounds(30, 305, 298, 14);
		votingPanel.add(green);

		JLabel orange = new JLabel("LARANJA para CORRIGIR");
		orange.setFont(new Font("Tahoma", Font.BOLD, 11));
		orange.setBounds(30, 321, 298, 14);
		votingPanel.add(orange);

		JLabel electoralJusticeCoat = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/Justiça Eleitoral.jpg")).getImage()
				                                  .getScaledInstance(180, 68, Image.SCALE_SMOOTH);
		electoralJusticeCoat.setIcon(new ImageIcon(img1));
		electoralJusticeCoat.setBounds(445, 33, 180, 68);
		votingPanel.add(electoralJusticeCoat);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tenBox.getText().equals("")) {
					tenBox.setText("1");
					oneBox.requestFocus();
					oneBox.setText("");
				}
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oneBox.getText().equals("")) {
					oneBox.setText("1");
					votingp.SetImage();
					votingg.SetImageGov();
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn1.setBounds(464, 123, 39, 30);
		votingPanel.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tenBox.getText().equals("")) {
					tenBox.setText("2");
					oneBox.requestFocus();
					oneBox.setText("");
				}
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oneBox.getText().equals("")) {
					oneBox.setText("2");
					votingp.SetImage();
					votingg.SetImageGov();
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn2.setBounds(516, 123, 39, 30);
		votingPanel.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tenBox.getText().equals("")) {
					tenBox.setText("3");
					oneBox.requestFocus();
					oneBox.setText("");
				}
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oneBox.getText().equals("")) {
					oneBox.setText("3");
					votingp.SetImage();
					votingg.SetImageGov();
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn3.setBounds(565, 123, 39, 30);
		votingPanel.add(btn3);

		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tenBox.getText().equals("")) {
					tenBox.setText("4");
					oneBox.requestFocus();
					oneBox.setText("");
				}
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oneBox.getText().equals("")) {
					oneBox.setText("4");
					votingp.SetImage();
					votingg.SetImageGov();
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn4.setBounds(464, 164, 39, 30);
		votingPanel.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tenBox.getText().equals("")) {
					tenBox.setText("5");
					oneBox.requestFocus();
					oneBox.setText("");
				}
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oneBox.getText().equals("")) {
					oneBox.setText("5");
					votingp.SetImage();
					votingg.SetImageGov();
				}
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn5.setBounds(516, 164, 39, 30);
		votingPanel.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tenBox.getText().equals("")) {
					tenBox.setText("6");
					oneBox.requestFocus();
					oneBox.setText("");
				}
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oneBox.getText().equals("")) {
					oneBox.setText("6");
					votingp.SetImage();
					votingg.SetImageGov();
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn6.setBounds(565, 164, 39, 30);
		votingPanel.add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tenBox.getText().equals("")) {
					tenBox.setText("7");
					oneBox.requestFocus();
					oneBox.setText("");
				}
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oneBox.getText().equals("")) {
					oneBox.setText("7");
					votingp.SetImage();
					votingg.SetImageGov();
				}
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn7.setBounds(464, 205, 39, 30);
		votingPanel.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tenBox.getText().equals("")) {
					tenBox.setText("8");
					oneBox.requestFocus();
					oneBox.setText("");
				}
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oneBox.getText().equals("")) {
					oneBox.setText("8");
					votingp.SetImage();
					votingg.SetImageGov();
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn8.setBounds(516, 205, 39, 30);
		votingPanel.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tenBox.getText().equals("")) {
					tenBox.setText("9");
					oneBox.setText("");
				}
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oneBox.getText().equals("")) {
					oneBox.setText("9");
					votingp.SetImage();
					votingg.SetImageGov();
				}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn9.setBounds(565, 205, 39, 30);
		votingPanel.add(btn9);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tenBox.getText().equals("")) {
					tenBox.setText("0");
					oneBox.requestFocus();
					oneBox.setText("");
				}
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oneBox.getText().equals("")) {
					oneBox.setText("0");
					votingp.SetImage();
					votingg.SetImageGov();
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn0.setBounds(516, 246, 39, 30);
		votingPanel.add(btn0);

		JButton btnCorrige = new JButton("CORRIGE");
		btnCorrige.setBackground(Color.ORANGE);
		btnCorrige.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!candidateImg.getText().equals("FIM")) {
					Image img = new ImageIcon(this.getClass().getResource("")).getImage().getScaledInstance(120, 160,
							Image.SCALE_SMOOTH);
					tenBox.setText("");
					oneBox.setText("");
					candidateImg.setIcon(new ImageIcon(img));
					viceImg.setIcon(new ImageIcon(img));
					candidateImg.setText("");
					viceName.setText("");
					candidateName.setText("");
					politicalParty.setText("");
					end.setText("");
					tenBox.requestFocus();
				}
			}
		});
		btnCorrige.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCorrige.setBounds(463, 299, 94, 36);
		votingPanel.add(btnCorrige);

		JButton btnWhite = new JButton("BRANCO");
		btnWhite.setBackground(Color.WHITE);
		btnWhite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (office.getText().equals("PRESIDENTE")) {
					votingp.setVote(111);
					PresidentVotingResults.Results();
					ThreadChangeOffice change = new ThreadChangeOffice("Change");
					change.start();

					office.setText("GOVERNADOR");

				} else {
					if (!candidateImg.getText().equals("FIM")) {
						votingg.setVote(111);
						GovernorVotingResults.Results();
						ThreadClear clear = new ThreadClear("Clear");
						clear.start();
						ThreadBack back = new ThreadBack("Back", 7000);
						back.start();
					}
				}
			}
		});
		btnWhite.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnWhite.setBounds(367, 299, 86, 36);
		votingPanel.add(btnWhite);

		JButton btnConfirm = new JButton("CONFIRMA");
		btnConfirm.setBackground(Color.GREEN);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((!tenBox.getText().equals("")) && (!oneBox.getText().equals("")) && (office.getText().equals("PRESIDENTE"))) {
					setNumber.SetVote();
					votingp.CountPresidentVotes();
					PresidentVotingResults.Results();
					ThreadChangeOffice change = new ThreadChangeOffice("Change");
					change.start();
					office.setText("GOVERNADOR");
				} else if ((!tenBox.getText().equals("")) && (!oneBox.getText().equals("")) && (office.getText().equals("GOVERNADOR"))) {
					votingg.CountGovernorVotes();
					GovernorVotingResults.Results();
					ThreadClear clear = new ThreadClear("Clear");
					clear.start();
				
					ThreadBack back = new ThreadBack("Back", 7000);
					back.start();
				}
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnConfirm.setBounds(567, 290, 93, 45);
		votingPanel.add(btnConfirm);

		/**
		 * end of voting panel settings
		 **/
	}
}