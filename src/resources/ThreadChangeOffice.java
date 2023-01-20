package resources;

import java.awt.Image;
import java.lang.Thread;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

import application.PrimaryPanel;

public class ThreadChangeOffice extends Thread {
	
	JLabel candidateImg = PrimaryPanel.candidateImg;
    JLabel viceImg = PrimaryPanel.viceImg;
    JLabel viceName = PrimaryPanel.viceName;
    JLabel candidateName = PrimaryPanel.candidateName;
    JLabel politicalParty = PrimaryPanel.politicalParty;
    JLabel end = PrimaryPanel.end;
    JTextField tenBox = PrimaryPanel.tenBox;
    JTextField oneBox = PrimaryPanel.oneBox;
    
	public String name;
	
	public ThreadChangeOffice(String name) {
		this.name = name;
	}
	
	public void run() {
	    Image img = new ImageIcon(this.getClass().getResource("")).getImage()
                                                 .getScaledInstance(120, 160, Image.SCALE_SMOOTH);
	    candidateImg.setIcon(new ImageIcon(img));
	    viceImg.setIcon(new ImageIcon(img));
	    viceName.setText("");
	    candidateName.setText("");
	    politicalParty.setText("");
	    tenBox.setText("");
        oneBox.setText("");
        tenBox.requestFocus(); 
	}
}