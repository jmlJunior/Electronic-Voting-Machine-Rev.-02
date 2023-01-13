package entities;

import java.awt.Image;
import javax.swing.ImageIcon;
import application.PrimaryPanel;

public class Candidate {

	private String dn;
	private String un;
	private String dnun;
	protected static Integer vote;
	protected static int confirm;
	protected static int blank;
	protected static int voteNull;
	protected static int ciroGomes;
	protected static int lula;
	protected static int robertoJefferson;
	protected static int simoneTebet;
	protected static int vera;
	protected static int sofiaManzano;
	protected static int jairBolsonaro;
	protected static int eymael;
	protected static int davila;
	protected static int sorayaThronicke;
	protected static int leoPericles;
	protected static int pabloMarcal;

	public Candidate() {

	}

	public Candidate(String dn, String un, String dnun, int vote, int confirm, int blank, int voteNull, int ciroGomes,
			int lula, int robertoJefferson, int simoneTebet, int vera, int sofiaManzano, int jairBolsonaro, int eymael,
			int davila, int sorayaThronicke, int leoPericles, int pabloMarcal) {

		this.dn = dn;
		this.un = un;
		this.dnun = dnun;
		Candidate.vote = vote;
		Candidate.confirm = confirm;
		Candidate.blank = blank;
		Candidate.voteNull = voteNull;
		Candidate.ciroGomes = ciroGomes;
		Candidate.lula = lula;
		Candidate.robertoJefferson = robertoJefferson;
		Candidate.simoneTebet = simoneTebet;
		Candidate.vera = vera;
		Candidate.sofiaManzano = sofiaManzano;
		Candidate.jairBolsonaro = jairBolsonaro;
		Candidate.eymael = eymael;
		Candidate.davila = davila;
		Candidate.sorayaThronicke = sorayaThronicke;
		Candidate.leoPericles = leoPericles;
		Candidate.pabloMarcal = pabloMarcal;
	}

	public String getDn() {
		return dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getDnun() {
		return dnun;
	}

	public void setDnun(String dnun) {
		this.dnun = dnun;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		Candidate.vote = vote;
	}

	public int getConfirm() {
		return confirm;
	}

	public void setConfirm(int confirm) {
		Candidate.confirm = confirm;
	}

	public int getBlank() {
		return blank;
	}

	public void setBlank(int blank) {
		Candidate.blank = blank;
	}

	public int getVoteNull() {
		return voteNull;
	}

	public void setVoteNull(int voteNull) {
		Candidate.voteNull = voteNull;
	}

	public int getCiroGomes() {
		return ciroGomes;
	}

	public void setCiroGomes(int ciroGomes) {
		Candidate.ciroGomes = ciroGomes;
	}

	public int getLula() {
		return lula;
	}

	public void setLula(int lula) {
		Candidate.lula = lula;
	}

	public int getRobertoJefferson() {
		return robertoJefferson;
	}

	public void setRobertoJefferson(int robertoJefferson) {
		Candidate.robertoJefferson = robertoJefferson;
	}

	public int getSimoneTebet() {
		return simoneTebet;
	}

	public void setSimoneTebet(int simoneTebet) {
		Candidate.simoneTebet = simoneTebet;
	}

	public int getVera() {
		return vera;
	}

	public void setVera(int vera) {
		Candidate.vera = vera;
	}

	public int getSofiaManzano() {
		return sofiaManzano;
	}

	public void setSofiaManzano(int sofiaManzano) {
		Candidate.sofiaManzano = sofiaManzano;
	}

	public int getJairBolsonaro() {
		return jairBolsonaro;
	}

	public void setJairBolsonaro(int jairBolsonaro) {
		Candidate.jairBolsonaro = jairBolsonaro;
	}

	public int getEymael() {
		return eymael;
	}

	public void setEymael(int eymael) {
		Candidate.eymael = eymael;
	}

	public int getDavila() {
		return davila;
	}

	public void setDavila(int davila) {
		Candidate.davila = davila;
	}

	public int getSorayaThronicke() {
		return sorayaThronicke;
	}

	public void setSorayaThronicke(int sorayaThronicke) {
		Candidate.sorayaThronicke = sorayaThronicke;
	}

	public int getLeoPericles() {
		return leoPericles;
	}

	public void setLeoPericles(int leoPericles) {
		Candidate.leoPericles = leoPericles;
	}

	public int getPabloMarcal() {
		return pabloMarcal;
	}

	public void setPabloMarcal(int pabloMarcal) {
		Candidate.pabloMarcal = pabloMarcal;
	}
	
    public void SetImage() {
    	CountVotes();
    	
	    if (vote == 12) {
	        Image img12 = new ImageIcon(this.getClass().getResource("/12.jpg")).getImage()
	        		                                   .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
	        PrimaryPanel.candidateImg.setIcon(new ImageIcon(img12));
            PrimaryPanel.candidateName.setText("CIRO GOMES");
            PrimaryPanel.politicalParty.setText("PDT");
            PrimaryPanel.viceName.setText("Vice: Ana Paula Matos");

            Image imgv12 = new ImageIcon(this.getClass().getResource("/v12.jpg")).getImage()
            		                                    .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
            PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv12));
	    }
	    
		if (vote == 13) {
			Image img13 = new ImageIcon(this.getClass().getResource("/13.jpg")).getImage()
					                                   .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
			PrimaryPanel.candidateImg.setIcon(new ImageIcon(img13));
			PrimaryPanel.candidateName.setText("LULA");
			PrimaryPanel.politicalParty.setText("PT");
			PrimaryPanel.viceName.setText("Vice: Geraldo Alckmin");

			Image imgv13 = new ImageIcon(this.getClass().getResource("/v13.jpg")).getImage()
					                                    .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
			PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv13));
		}
		
		if (vote == 14) {
			Image img14 = new ImageIcon(this.getClass().getResource("/14.jpg")).getImage()
					                                   .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
			PrimaryPanel.candidateImg.setIcon(new ImageIcon(img14));
			PrimaryPanel.candidateName.setText("ROBERTO JEFFERSON");
			PrimaryPanel.politicalParty.setText("PTB");
			PrimaryPanel.viceName.setText("Vice: Padre Kelmon");

			Image imgv14 = new ImageIcon(this.getClass().getResource("/v14.jpg")).getImage()
					                                    .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
			PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv14));
		}
		
		if (vote == 15) {
			Image img15 = new ImageIcon(this.getClass().getResource("/15.jpg")).getImage()
					                                   .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
			PrimaryPanel.candidateImg.setIcon(new ImageIcon(img15));
			PrimaryPanel.candidateName.setText("SIMONE TEBET");
			PrimaryPanel.politicalParty.setText("MDB");
			PrimaryPanel.viceName.setText("Vice: Mara Babrilli");

			Image imgv15 = new ImageIcon(this.getClass().getResource("/v15.jpg")).getImage()
					                                    .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
			PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv15));
		}
		
		if (vote == 16) {
			Image img16 = new ImageIcon(this.getClass().getResource("/16.jpg")).getImage()
					                                   .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
			PrimaryPanel.candidateImg.setIcon(new ImageIcon(img16));
			PrimaryPanel.candidateName.setText("VERA");
			PrimaryPanel.politicalParty.setText("PSTU");
			PrimaryPanel.viceName.setText("Vice: Raquel Tremenbé");

			Image imgv16 = new ImageIcon(this.getClass().getResource("/v16.jpg")).getImage()
					                                    .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
			PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv16));
		}
		
		if (vote == 21) {
			Image img21 = new ImageIcon(this.getClass().getResource("/21.jpg")).getImage()
					                                   .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
			PrimaryPanel.candidateImg.setIcon(new ImageIcon(img21));
			PrimaryPanel.candidateName.setText("SOFIA MANZANO");
			PrimaryPanel.politicalParty.setText("PCB");
			PrimaryPanel.viceName.setText("Vice: Antonio Alves");

			Image imgv21 = new ImageIcon(this.getClass().getResource("/v21.jpg")).getImage()
					                                    .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
			PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv21));
		}
	    
	    if (vote == 22) {
			Image img22 = new ImageIcon(this.getClass().getResource("/22.jpg")).getImage()
                                                       .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
			PrimaryPanel.candidateImg.setIcon(new ImageIcon(img22));
			PrimaryPanel.candidateName.setText("JAIR BOLSONARO");
			PrimaryPanel.politicalParty.setText("PL");
			PrimaryPanel.viceName.setText("Vice: Braga Netto");

            Image imgv22 = new ImageIcon(this.getClass().getResource("/v22.jpg")).getImage()
                                                        .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
            PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv22));
	    }
	    
	    if (vote == 27) {
			Image img27 = new ImageIcon(this.getClass().getResource("/27.jpg")).getImage()
					                                   .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
			PrimaryPanel.candidateImg.setIcon(new ImageIcon(img27));
			PrimaryPanel.candidateName.setText("CONSTITUINTE EYMAEL");
			PrimaryPanel.politicalParty.setText("DC");
			PrimaryPanel.viceName.setText("Vice: Professor Bravo");

			Image imgv27 = new ImageIcon(this.getClass().getResource("/v27.jpg")).getImage()
					                                    .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
			PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv27));
		}
	    
		if (vote == 30) {
			Image img30 = new ImageIcon(this.getClass().getResource("/30.jpg")).getImage()
					                                   .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
			PrimaryPanel.candidateImg.setIcon(new ImageIcon(img30));
			PrimaryPanel.candidateName.setText("FELIPE D'AVILA");
			PrimaryPanel.politicalParty.setText("NOVO");
			PrimaryPanel.viceName.setText("Vice: Tiago Mitraud");

			Image imgv30 = new ImageIcon(this.getClass().getResource("/v30.jpg")).getImage()
					                                    .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
			PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv30));
		}
		
	    if (vote == 44) {
			Image img44 = new ImageIcon(this.getClass().getResource("/44.jpg")).getImage()
					                                   .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
			PrimaryPanel.candidateImg.setIcon(new ImageIcon(img44));
			PrimaryPanel.candidateName.setText("SORAYA THRONICKE");
			PrimaryPanel.politicalParty.setText("UNIÃO");
			PrimaryPanel.viceName.setText("Vice: Marcos Cintra");

			Image imgv44 = new ImageIcon(this.getClass().getResource("/v44.jpg")).getImage()
					                                    .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
			PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv44));
		}

		if (vote == 80) {
			Image img80 = new ImageIcon(this.getClass().getResource("/80.jpg")).getImage()
					                                   .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
			PrimaryPanel.candidateImg.setIcon(new ImageIcon(img80));
			PrimaryPanel.candidateName.setText("LÉO PÉRICLES");
			PrimaryPanel.politicalParty.setText("UP");
			PrimaryPanel.viceName.setText("Vice: Samara Martins");

			Image imgv80 = new ImageIcon(this.getClass().getResource("/v80.jpg")).getImage()
					                                    .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
			PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv80));
		}

		if (vote == 90) {
			Image img90 = new ImageIcon(this.getClass().getResource("/90.jpg")).getImage()
					                                   .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
			PrimaryPanel.candidateImg.setIcon(new ImageIcon(img90));
			PrimaryPanel.candidateName.setText("PABLO MARÇAL");
			PrimaryPanel.politicalParty.setText("PROS");
			PrimaryPanel.viceName.setText("Vice: Fátima Pérola Neggra");

			Image imgv90 = new ImageIcon(this.getClass().getResource("/v90.jpg")).getImage()
					                                    .getScaledInstance(60, 75, Image.SCALE_SMOOTH);
			PrimaryPanel.viceImg.setIcon(new ImageIcon(imgv90));
		}
    }

	public void CountVotes() {
		dn = PrimaryPanel.tenBox.getText();
		un = PrimaryPanel.oneBox.getText();
		dnun = (dn+un);  
	    vote = Integer.parseInt(dnun);
	}
}