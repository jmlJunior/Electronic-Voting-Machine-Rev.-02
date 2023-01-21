package entities;

import java.awt.Image;
import javax.swing.ImageIcon;
import application.PrimaryPanel;

public class Governor extends VoterChoice {

	protected static Integer vote;
	protected static int tarcisio;
	protected static int elvisCezar;
	protected static int haddad;
	protected static int altino;
	protected static int gabrielColombo;
	protected static int antonioJorge;
	protected static int edsonDorta;
	protected static int viniciusPoit;
	protected static int rodrigoGarcia;
	protected static int carolVigliar;


	public Governor() {
		super();
	}

	public Governor(int setedVote, int tarcisio, int elvisCezar,
			int haddad, int altino, int gabrielColombo, int antonioJorge, int edsonDorta, int viniciusPoit,
			int rodrigoGarcia, int carolVigliar) {

		super(null, null, null, setedVote);

		Governor.vote = this.setedVote;
		Governor.tarcisio = tarcisio;
		Governor.elvisCezar = elvisCezar;
		Governor.haddad = haddad;
		Governor.altino = altino;
		Governor.gabrielColombo = gabrielColombo;
		Governor.antonioJorge = antonioJorge;
		Governor.edsonDorta = edsonDorta;
		Governor.viniciusPoit = viniciusPoit;
		Governor.rodrigoGarcia = rodrigoGarcia;
		Governor.carolVigliar = carolVigliar;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		Governor.vote = vote;
	}

	public int gettarcisio() {
		return tarcisio;
	}

	public void settarcisio(int tarcisio) {
		Governor.tarcisio = tarcisio;
	}

	public int getelvisCezar() {
		return elvisCezar;
	}

	public void setelvisCezar(int elvisCezar) {
		Governor.elvisCezar = elvisCezar;
	}

	public int gethaddad() {
		return haddad;
	}

	public void sethaddad(int haddad) {
		Governor.haddad = haddad;
	}

	public int getaltino() {
		return altino;
	}

	public void setaltino(int altino) {
		Governor.altino = altino;
	}

	public int getgabrielColombo() {
		return gabrielColombo;
	}

	public void setgabrielColombo(int gabrielColombo) {
		Governor.gabrielColombo = gabrielColombo;
	}

	public int getantonioJorge() {
		return antonioJorge;
	}

	public void setantonioJorge(int antonioJorge) {
		Governor.antonioJorge = antonioJorge;
	}

	public int getedsonDorta() {
		return edsonDorta;
	}

	public void setedsonDorta(int edsonDorta) {
		Governor.edsonDorta = edsonDorta;
	}

	public int getviniciusPoit() {
		return viniciusPoit;
	}

	public void setviniciusPoit(int viniciusPoit) {
		Governor.viniciusPoit = viniciusPoit;
	}

	public int getrodrigoGarcia() {
		return rodrigoGarcia;
	}

	public void setrodrigoGarcia(int rodrigoGarcia) {
		Governor.rodrigoGarcia = rodrigoGarcia;
	}

	public int getcarolVigliar() {
		return carolVigliar;
	}

	public void SetImageGov() {
		if (PrimaryPanel.office.getText().equals("GOVERNADOR")) {
			SetVote();
			CountGovernorVotes();

			if (vote == 10) {
				Image img10 = new ImageIcon(this.getClass().getResource("/G10.jpg"))
						                                   .getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
				PrimaryPanel.candidateImg.setIcon(new ImageIcon(img10));
				PrimaryPanel.candidateName.setText("TARCÍSIO");
				PrimaryPanel.politicalParty.setText("REPUBLICANOS");
				PrimaryPanel.viceName.setText("Vice: Felicio Ramuth");

				Image imgv10 = new ImageIcon(this.getClass().getResource("/VG10.jpg"))
						                                    .getImage().getScaledInstance(60, 75, Image.SCALE_SMOOTH);
				PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv10));
			}

			if (vote == 12) {
				Image img12 = new ImageIcon(this.getClass().getResource("/G12.jpg"))
						                                   .getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
				PrimaryPanel.candidateImg.setIcon(new ImageIcon(img12));
				PrimaryPanel.candidateName.setText("ELVIS CEZAR");
				PrimaryPanel.politicalParty.setText("PDT");
				PrimaryPanel.viceName.setText("Vice: Gleides Sodré");

				Image imgv12 = new ImageIcon(this.getClass().getResource("/VG12.jpg"))
						                                    .getImage().getScaledInstance(60, 75, Image.SCALE_SMOOTH);
				PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv12));
			}

			if (vote == 13) {
				Image img13 = new ImageIcon(this.getClass().getResource("/G13.jpg"))
						                                   .getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
				PrimaryPanel.candidateImg.setIcon(new ImageIcon(img13));
				PrimaryPanel.candidateName.setText("FERNANDO HADDAD");
				PrimaryPanel.politicalParty.setText("PT");
				PrimaryPanel.viceName.setText("Vice: Lucia França");

				Image imgv13 = new ImageIcon(this.getClass().getResource("/VG13.jpg"))
						                                    .getImage().getScaledInstance(60, 75, Image.SCALE_SMOOTH);
				PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv13));
			}

			if (vote == 16) {
				Image img16 = new ImageIcon(this.getClass().getResource("/G16.jpg"))
						                                   .getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
				PrimaryPanel.candidateImg.setIcon(new ImageIcon(img16));
				PrimaryPanel.candidateName.setText("ALTINO");
				PrimaryPanel.politicalParty.setText("PSTU");
				PrimaryPanel.viceName.setText("Vice: Professora Flavia");

				Image imgv16 = new ImageIcon(this.getClass().getResource("/VG16.jpg"))
						                                    .getImage().getScaledInstance(60, 75, Image.SCALE_SMOOTH);
				PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv16));
			}

			if (vote == 21) {
				Image img21 = new ImageIcon(this.getClass().getResource("/G21.jpg"))
						                                   .getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
				PrimaryPanel.candidateImg.setIcon(new ImageIcon(img21));
				PrimaryPanel.candidateName.setText("GABRIEL COLOMBO");
				PrimaryPanel.politicalParty.setText("PCB");
				PrimaryPanel.viceName.setText("Vice: Professora Aline");

				Image imgv21 = new ImageIcon(this.getClass().getResource("/VG21.jpg"))
						                                    .getImage().getScaledInstance(60, 75, Image.SCALE_SMOOTH);
				PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv21));
			}

			if (vote == 27) {
				Image img27 = new ImageIcon(this.getClass().getResource("/G27.jpg"))
						                                   .getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
				PrimaryPanel.candidateImg.setIcon(new ImageIcon(img27));
				PrimaryPanel.candidateName.setText("ANTONIO JORGE");
				PrimaryPanel.politicalParty.setText("DC");
				PrimaryPanel.viceName.setText("Vice: Vitor Rocca");

				Image imgv27 = new ImageIcon(this.getClass().getResource("/VG27.jpg"))
						                                    .getImage().getScaledInstance(60, 75, Image.SCALE_SMOOTH);
				PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv27));
			}

			if (vote == 29) {
				Image img29 = new ImageIcon(this.getClass().getResource("/G29.jpg"))
						                                   .getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
				PrimaryPanel.candidateImg.setIcon(new ImageIcon(img29));
				PrimaryPanel.candidateName.setText("EDSON DORTA");
				PrimaryPanel.politicalParty.setText("PCO");
				PrimaryPanel.viceName.setText("Vice: Lílian Miranda");

				Image imgv29 = new ImageIcon(this.getClass().getResource("/VG29.jpg"))
						                                    .getImage().getScaledInstance(60, 75, Image.SCALE_SMOOTH);
				PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv29));
			}

			if (vote == 30) {
				Image img30 = new ImageIcon(this.getClass().getResource("/G30.jpg"))
						                                   .getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
				PrimaryPanel.candidateImg.setIcon(new ImageIcon(img30));
				PrimaryPanel.candidateName.setText("VINICIUS POIT");
				PrimaryPanel.politicalParty.setText("NOVO");
				PrimaryPanel.viceName.setText("Vice: Doris Alves");

				Image imgv30 = new ImageIcon(this.getClass().getResource("/VG30.jpg"))
						                                    .getImage().getScaledInstance(60, 75, Image.SCALE_SMOOTH);
				PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv30));
			}

			if (vote == 45) {
				Image img45 = new ImageIcon(this.getClass().getResource("/G45.jpg"))
						                                   .getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
				PrimaryPanel.candidateImg.setIcon(new ImageIcon(img45));
				PrimaryPanel.candidateName.setText("RODRIGO GARCIA");
				PrimaryPanel.politicalParty.setText("PSDB");
				PrimaryPanel.viceName.setText("Vice: Geninho Zuliani");

				Image imgv45 = new ImageIcon(this.getClass().getResource("/VG45.jpg"))
						                                    .getImage().getScaledInstance(60, 75, Image.SCALE_SMOOTH);
				PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv45));
			}

			if (vote == 80) {
				Image img80 = new ImageIcon(this.getClass().getResource("/G80.jpg"))
						                                   .getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
				PrimaryPanel.candidateImg.setIcon(new ImageIcon(img80));
				PrimaryPanel.candidateName.setText("CAROL VIGLIAR");
				PrimaryPanel.politicalParty.setText("UP");
				PrimaryPanel.viceName.setText("Vice: Elô Alves");

				Image imgv80 = new ImageIcon(this.getClass().getResource("/VG80.jpg"))
						                                    .getImage().getScaledInstance(60, 75, Image.SCALE_SMOOTH);
				PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv80));
			}
		}
	}

	public void CountGovernorVotes() {
		vote = setedVote;
	}
}