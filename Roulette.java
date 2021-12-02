package compiti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class roulettewa {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// INIZIO
		int i= 2;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


		int count=0;
		int soldi=1000;
		System.out.println("\nBenvenuto!");
		do{ Scanner tastiera = new Scanner (System.in);
		int vincita=0;	
		int vincita1=0;
		System.out.println("\n"
				+ "\n \t   3  6  9  12  15  18  21  24  27  30  33  36  "
				+ "\n \t0    2  5  8  11  14  17  20  23  26  29  32  35 "
				+ "\n  \t  1  4  7  10  13  16  19  22  25  28  31  34  \n"
				+ "   \t  |  Pari   |   Rosso   |  Nero   |   Dispari | \n\n p\n\n");
		System.out.println("su cosa vuoi puntare? "
				+ "\nDevi Puntare su Pari/Dispari/Nero/Rosso e un numero a tua scelta (verrà puntato solo un euro per giocata) "
				+ "\n \t se vuoi uscire digita exit ");
		String Puntata1= tastiera.nextLine();
		//exit
		if(Puntata1 .equalsIgnoreCase("exit")) { System.out.println("Torna presto!");
		break;
		}
		//Puntata Su Nero/Rosso/Pari/Dispari debug
		while (!Puntata1 .equalsIgnoreCase("Rosso") && !Puntata1 .equalsIgnoreCase("nero") && !Puntata1 .equalsIgnoreCase("Pari")  && !Puntata1 .equalsIgnoreCase("dispari")) {
			System.out.println("Puoi mettere solo Pari/Dispari o Rosso/Nero "); 
			Puntata1 = tastiera.nextLine();
		}
		//Puntata su un numero a Scelta
		int puntata = tastiera.nextInt();

		while (   puntata >36 || puntata < 0) {
			System.out.println("un numero da 0 a 36 "); 
			puntata = tastiera.nextInt();
		}

		//Far Girare la Pallina
		System.out.println("\n\t Clicca invio per far girare la Pallina!");
		br.readLine();
		int randomNum = (int)(Math.random() * 37); // 0 to 36 
		System.out.println(randomNum);
		System.out.println();
		//Orfanelli

		if (randomNum == 14 ||randomNum == 34 ) System.out.println("è uscito Rosso Pari appartenente alla serie degli orfanelli ");
		else if  (randomNum == 9 || randomNum == 1) System.out.println("è uscito Rosso Dispari appartenente alla serie degli orfanelli ");
		else if  (randomNum == 31 || randomNum == 17) System.out.println("è uscito Nero Dispari appartenente alla serie degli orfanelli ");
		else if  (randomNum == 20 || randomNum == 6) System.out.println("è uscito Nero Pari appartenente alla serie degli orfanelli ");
		//Distacco

		//Zero
		if (randomNum == 0) System.out.println("è Uscito 0");
		//Distacco

		//Vicini Dello Zero
		else if  (randomNum == 3 || randomNum == 7|| randomNum == 19|| randomNum == 21|| randomNum == 25) System.out.println("è uscito Rosso Dispari appartenente alla serie dei Vicini Dello Zero ");
		else if  (randomNum == 18 || randomNum == 12 || randomNum == 32) System.out.println("è uscito Rosso Pari appartenente alla serie dei Vicini Dello Zero ");
		else if  (randomNum == 22 || randomNum == 28|| randomNum == 26|| randomNum == 4|| randomNum == 2) System.out.println("è uscito Nero Pari appartenente alla serie dei Vicini Dello Zero ");
		else if  (randomNum == 29 || randomNum == 35|| randomNum == 15) System.out.println("è uscito Nero Dispari appartenente alla serie dei Vicini Dello Zero ");
		//Distacco 

		//Serie5/8
		else if  (randomNum == 5 || randomNum == 23|| randomNum == 27) System.out.println("è uscito Rosso Dispari appartenente alla Serie 5/8 ");
		else if  (randomNum == 16 || randomNum == 30 || randomNum == 36) System.out.println("è uscito Rosso Pari appartenente alla Serie 5/8  ");
		else if  (randomNum == 24 || randomNum == 10|| randomNum == 8|| randomNum == 4|| randomNum == 2) System.out.println("è uscito Nero Pari appartenente alla Serie 5/8  ");
		else if  (randomNum == 13|| randomNum == 11|| randomNum == 33) System.out.println("è uscito Nero Dispari appartenente alla serie alla Serie 5/8  ");
		//Distacco 

		//Puntate Singole
		if (puntata==randomNum  ) {vincita = 36;

		}
		//Puntate Pari/Dispari/Rosso/Nero

		if (randomNum==2||randomNum==4||randomNum==6||randomNum==8||randomNum==10||randomNum==11||randomNum==13||randomNum==15||randomNum==17||randomNum==20||randomNum==22||randomNum==24||randomNum==26||randomNum==29||randomNum==31||randomNum==33||randomNum==35||randomNum==28) {
			if (Puntata1 .equalsIgnoreCase("nero")) vincita1 = 2;


		};
		if (randomNum==1||randomNum==3||randomNum==5||randomNum==7||randomNum==12||randomNum==9||randomNum==14||randomNum==16||randomNum==19||randomNum==18||randomNum==23||randomNum==25||randomNum==27||randomNum==21||randomNum==32||randomNum==34||randomNum==36||randomNum==30) {
			if (Puntata1 .equalsIgnoreCase("rosso")) vincita1 = 2;}


		if (Puntata1 .equalsIgnoreCase("dispari")&& randomNum%2!=0) vincita1 = 2;


		if (Puntata1 .equalsIgnoreCase("pari") && randomNum%2==0) vincita1 = 2;


		//Distacco 

		// vincita totale
		int vincitatot= (vincita+vincita1);
		System.out.println("Hai vinto "+vincitatot+" €");
		//Distacco 

		//Soldi Spesi
		soldi= soldi+vincitatot;
		soldi=soldi-2;
		count=count+2;
		System.out.println("hai speso in totale "+count+" €");
		System.out.println("\t                           ti rimangono "+soldi+" €\n\n\n\n\n\n\n\n\n\n\n\n");
		br.readLine();


		//break
		//Stop loop


		i++;
		}while(i!=1); 
	}
