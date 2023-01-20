package entities;

import application.PrimaryPanel;

public class VoterChoice {
	
	private String dn;
	private String un;
	private String dnun;
	protected Integer setedVote;
	
	public VoterChoice() {
		
	}

	public VoterChoice(String dn, String un, String dnun, Integer setedVote) {
		this.dn = dn;
		this.un = un;
		this.dnun = dnun;
		this.setedVote = setedVote;
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

	public Integer getSetedVote() {
		return setedVote;
	}

	public void setSetedVote(Integer setedVote) {
		this.setedVote = setedVote;
	}

	public void SetVote() {
		dn = PrimaryPanel.tenBox.getText();
		un = PrimaryPanel.oneBox.getText();
		dnun = (dn+un);
		setedVote = Integer.parseInt(dnun);
	}
}
