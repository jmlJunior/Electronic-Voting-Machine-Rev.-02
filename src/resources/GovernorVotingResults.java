package resources;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import entities.Governor;

public class GovernorVotingResults extends Governor {
	
	public static int confirm, nullVote, blank;
	
	public static void Results() {
		
		Governor choice = new Governor();
		
		vote = choice.getVote();
		tarcisio = choice.gettarcisio();
        elvisCezar = choice.getelvisCezar();
        haddad = choice.gethaddad();
        altino = choice.getaltino();
        gabrielColombo = choice.getgabrielColombo();
        antonioJorge = choice.getantonioJorge();
        edsonDorta = choice.getedsonDorta();
        viniciusPoit = choice.getviniciusPoit();
        rodrigoGarcia = choice.getrodrigoGarcia();
        carolVigliar = choice.getcarolVigliar();
		
		switch (vote) {
		    case 10: tarcisio++; confirm ++; break;
	        case 12: elvisCezar++; confirm ++; break;
	        case 13: haddad++; confirm ++; break;
	        case 16: altino++; confirm ++; break;
	        case 21: gabrielColombo++; confirm ++; break;
	        case 27: antonioJorge++; confirm ++; break;
	        case 29: edsonDorta++; confirm ++; break;
	        case 30: viniciusPoit++; confirm ++; break;
	        case 45: rodrigoGarcia++; confirm ++; break;
	        case 80: carolVigliar++; confirm ++; break;
	        case 111: blank++; confirm++; break;
	        default: nullVote++; confirm ++; break;
        }

		System.out.println(
				"Total de Votos para Governador: ......" + confirm
				+"\n"
				+ "\n10 - TARCÍSIO (REPUBLICANOS) = ......." + tarcisio
				+ "\n12 - ELVIS CEZAR (PDT) = ............." + elvisCezar
				+ "\n13 - FERNANDO HADDAD (PT) = .........." + haddad
				+ "\n16 - ALTINO (PSTU) = ................." + altino
				+ "\n21 - GABRIEL COLOMBO (PCB) = ........." + gabrielColombo
				+ "\n27 - ANTONIO JORGE (DC) = ............" + antonioJorge
				+ "\n29 - EDSON DORTA (PCO) = ............." + edsonDorta
				+ "\n30 - VINICIUS POIT (NOVO) = .........." + viniciusPoit
				+ "\n45 - RODRIGO GARCIA (PSDB) = ........." + rodrigoGarcia
				+ "\n80 - CAROL VIGLIAR (UP) = ............" + carolVigliar
				+ "\nVotos BRANCOS = ......................" + blank
				+ "\nVotos NULOS = ........................" + nullVote
				+ "\n\n"
		);
	}
		
		
	public static void setResults() {
		
		FileWriter results;
		try {
			results = new FileWriter("D:\\JAVA\\Temp\\ws-eclipse\\Electronic Voting Machine Rev. 3\\archive\\RESULTS.txt", true);
			PrintWriter gravarResults = new PrintWriter(results);
			
			gravarResults.println(
					"Total de Votos para Governador:....." + confirm
					+"\n"
					+ "\n10 - TARCÍSIO (REPUBLICANOS):......." + tarcisio
					+ "\n12 - ELVIS CEZAR (PDT):............." + elvisCezar
					+ "\n13 - FERNANDO HADDAD (PT):.........." + haddad
					+ "\n16 - ALTINO (PSTU):................." + altino
					+ "\n21 - GABRIEL COLOMBO (PCB):........." + gabrielColombo
					+ "\n27 - ANTONIO JORGE (DC):............" + antonioJorge
					+ "\n29 - EDSON DORTA (PCO):............." + edsonDorta
					+ "\n30 - VINICIUS POIT (NOVO):.........." + viniciusPoit
					+ "\n45 - RODRIGO GARCIA (PSDB):........." + rodrigoGarcia
					+ "\n80 - CAROL VIGLIAR (UP):............" + carolVigliar
					+ "\nVotos BRANCOS:......................" + blank
					+ "\nVotos NULOS:........................" + nullVote
					);

			        results.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
}