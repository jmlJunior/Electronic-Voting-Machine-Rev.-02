package resources;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import entities.President;

public class PresidentVotingResults extends President {
	
	public static void Results() {
		
		President choice = new President();
		
		vote = choice.getVote();
		confirm = choice.getConfirm();
		ciroGomes = choice.getCiroGomes();
        lula = choice.getLula();
        robertoJefferson = choice.getRobertoJefferson();
        simoneTebet = choice.getSimoneTebet();
        vera = choice.getVera();
        sofiaManzano = choice.getSofiaManzano();
        jairBolsonaro = choice.getJairBolsonaro();
        eymael = choice.getEymael();
        davila = choice.getDavila();
        sorayaThronicke = choice.getSorayaThronicke();
        leoPericles = choice.getLeoPericles();
        pabloMarcal = choice.getPabloMarcal();
        voteNull = choice.getVoteNull();
        blank = choice.getBlank();
		
		switch (vote) {
		    case 12: ciroGomes++; confirm ++; break;
	        case 13: lula++; confirm ++; break;
	        case 14: robertoJefferson++; confirm ++; break;
	        case 15: simoneTebet++; confirm ++; break;
	        case 16: vera++; confirm ++; break;
	        case 21: sofiaManzano++; confirm ++; break;
	        case 22: jairBolsonaro++; confirm ++; break;
	        case 27: eymael++; confirm ++; break;
	        case 30: davila++; confirm ++; break;
	        case 44: sorayaThronicke++; confirm ++; break;
	        case 80: leoPericles++; confirm ++; break;
	        case 90: pabloMarcal++; confirm ++; break;
	        case 111: blank++; confirm++; break;
	        default: voteNull++; confirm ++; break;
        }

		System.out.println(
				"Total de Votos para Presidente: ......" + confirm
				+"\n"
				+ "\n12 - CIRO GOMES (PDT) = .............." + ciroGomes
				+ "\n13 - LULA (PT) = ....................." + lula
				+ "\n14 - ROBERTO JEFFERSON (PTB) = ......." + robertoJefferson
				+ "\n15 - SIMONE TEBET (MDB) = ............" + simoneTebet
				+ "\n16 - VERA (PSTU) = ..................." + vera
				+ "\n21 - SOFIA MANZANO (PCB) = ..........." + sofiaManzano
				+ "\n22 - JAIR BOLSONARO (PL) = ..........." + jairBolsonaro
				+ "\n27 - CONSTITUINTE EYMAEL (DC) = ......" + eymael
				+ "\n30 - FELIPE D'AVILA (NOVO) = ........." + davila
				+ "\n44 - SORAYA THRONICKE (UNIÃO) = ......" + sorayaThronicke
				+ "\n80 - LÉO PÉRICLES (UP) = ............." + leoPericles
				+ "\n90 - PABLO MARÇAL (PROS) = ..........." + pabloMarcal
				+ "\nVotos BRANCOS = ......................" + blank
				+ "\nVotos NULOS = ........................" + voteNull
				+ "\n\n"
				+ "_______________________________________"
				+ "\n\n"
		);
	}
		
		
	public static void PrintResults() {
		
		FileWriter results;
		try {
			results = new FileWriter("D:\\JAVA\\Temp\\ws-eclipse\\Electronic Voting Machine Rev. 3\\archive\\RESULTS.txt");
			PrintWriter gravarResults = new PrintWriter(results);
			
			gravarResults.println(
					"Total de Votos para Presidente:" + "....." + confirm
					+"\n"
					+ "\n12 - CIRO GOMES (PDT):" +  ".............." + ciroGomes
					+ "\n13 - LULA (PT):" +   "....................." + lula
					+ "\n14 - ROBERTO JEFFERSON (PTB):" +  "......." + robertoJefferson
					+ "\n15 - SIMONE TEBET (MDB):" +  "............" + simoneTebet
					+ "\n16 - VERA (PSTU):" + "..................." +  vera
					+ "\n21 - SOFIA MANZANO (PCB):" + "..........." +  sofiaManzano
					+ "\n22 - JAIR BOLSONARO (PL):" +  "..........." + jairBolsonaro
					+ "\n27 - CONSTITUINTE EYMAEL (DC):" +  "......" + eymael
					+ "\n30 - FELIPE D'AVILA (NOVO):" +  "........." + davila
					+ "\n44 - SORAYA THRONICKE (UNIÃO):" +  "......" + sorayaThronicke
					+ "\n80 - LÉO PÉRICLES (UP):" +  "............." + leoPericles
					+ "\n90 - PABLO MARÇAL (PROS):" +  "..........." + pabloMarcal
					+ "\nVotos BRANCOS:" +  "......................" + blank
					+ "\nVotos NULOS:" +  "........................" + voteNull
					+ "\n\n"
					+ "_____________________________________"
					+ "\n\n"
					);

			        results.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
}