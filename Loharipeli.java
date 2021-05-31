package loharipeli;
import java.util.Scanner;

public class Loharipeli {
	private static void pelaaPeli() {
		Scanner lukija = new Scanner(System.in);
		System.out.println("T‰h‰n pelin sis‰ltˆ.");
		boolean aarreMukana = etsiAarteita();
		boolean kuollaanko = keskustelu();
		if (kuollaanko == true) {
			//kuollaan
			System.out.println("\nYrityksesi ei toimi niin kuin oletit. Lohik‰‰rme polttaa sinut poroksi.");
		}
		else {
			//selvit‰‰n
			System.out.println("Livautat sormuksen sormeesi, ja sinusta tulee n‰kym‰tˆn! H‰mmennyksen turvin hiivit kohti luolan suuta.");
			if (aarreMukana == true) {
				//jee
				System.out.println("\nP‰‰sit ulos ehjin nahoin, ja mukanasi on kimmelt‰v‰ aarre. Jee!");
			}
			else {
				//mˆˆˆ
				System.out.println("\nP‰‰sit kyll‰ ulos ehjin nahoin, mutta aarre j‰i luolaan. Harmin paikka!");
			}
		}
		System.out.println("\nPalataan valikkoon...");
	}
	private static boolean etsiAarteita() {
		Scanner lukija = new Scanner(System.in);
		boolean aarreMukana = false;
		int vastaus = 0;
		System.out.println("Aarteen etsint‰. Kysymys? ƒ‰nt‰ 1, hiljaa 2.");
		vastaus = lukija.nextInt();
		lukija.nextLine();
		do {
			if (vastaus == 1) {
				System.out.println("\tOh shit. (Jenni tekee t‰n loppuun)");
				return aarreMukana;
			}
			else if (vastaus == 2) {
				System.out.println("\tJees. Jatkuu.");
			}
			else {
				System.out.println("÷hˆm. uusi yritys.");
				vastaus = lukija.nextInt();
				lukija.nextLine();
			}
		} while (vastaus != 1 && vastaus != 2);
		System.out.println("\nAarre lˆytyy, Jenni tekee t‰n.");
		aarreMukana = true;
		
		return aarreMukana;
	}
	private static boolean keskustelu() {
		Scanner lukija = new Scanner(System.in);
		boolean hyokkaako = false;
		int potutus = 0;
		int vastaus = 0;
		int reaktio = 0;
		//jos lukija ei anna nime‰, lohik‰‰rme kutsuu h‰nt‰ muukalaiseksi
		String nimi = "muukalainen";
		
		//Lohik‰‰rme alkaa kysell‰ asioita ja ‰rsyyntyy tai on ‰rsyyntym‰tt‰ lukijan vastauksien mukaan.
		//kysymys 1
		System.out.println("\nLohik‰‰rme k‰‰nt‰‰ katseensa sinuun. Se n‰ytt‰‰ k‰rttyis‰lt‰, katkaistiinhan silt‰ makoisat unet.\n\"Kuka sin‰ olet?\" se jylisee, ja vatsasi tuntuu putoavan v‰hint‰‰n metrin alasp‰in sen voimasta.\n\t1) ole hiljaa\n\t2) kerro nimesi");
		vastaus = lukija.nextInt();
		lukija.nextLine();
		do {
			if (vastaus == 1) {
				//lohik‰‰rme ‰rsyyntyy mystisyydest‰
				System.out.println("Lohik‰‰rme tuhahtaa. \"Veikˆ kissa kielesi? Nimen kertominen olisi vain kohteliasta.\nVarsinkin jos on tunkeutunut toisen asuinmajoille ilman lupaa...\"");
				potutus++;
			}
			else if (vastaus == 2) {
				//kysyt‰‰n lukijalta nimi, jota lohik‰‰rme k‰ytt‰‰ jatkossa
				System.out.println("Anna nimi:");
				nimi = lukija.nextLine();
				System.out.println("\"Vai " + nimi + "... En olekaan kuullut tuollaista nime‰ aiemmin.\"");
			}
			else {
				System.out.println("÷hˆm. uusi yritys.");
			}
		} while (vastaus != 1 && vastaus != 2);
		
		//kysymys 2
		System.out.println("\nTunnet lohik‰‰rmeen henk‰isyn kasvoillasi ja hiuksissasi kun se laskee p‰‰ns‰ tasollesi.\n\"No, " + nimi + "\", se kysyy, \"mit‰ teet t‰‰ll‰?\"\n\t1) kehu lohik‰‰rmett‰\n\t2) kehu aarteita");
		vastaus = lukija.nextInt();
		lukija.nextLine();
		do {
			if (vastaus == 2) {
				//lohik‰‰rme ei pit‰nyt vastauksesta, joten h‰n ‰rsyyntyy
				System.out.println("Kerrot tulleesi ihastelemaan lohik‰‰rmeen kuuluisaa aarrekokoelmaa. Tajuat pian, ettei se ollut hyv‰ ajatus.\n\"T‰m‰ aarrekokoelma on minun\", se ‰r‰ht‰‰, \"ja kovalla tyˆll‰ hankittu! Se on vain minua varten!\"");
				potutus++;
			}
			else if (vastaus == 1) {
				System.out.println("Kerrot tulleesi katsomaan, ovatko huhut lohik‰‰rmeen uskomattoman kauniista suomupeitteest‰ todella totta.\nLohik‰‰rme n‰ytt‰‰ h‰mmentyneelt‰. \"En tiennytk‰‰n, ett‰ siit‰ liikkuu huhuja...\" se miettii.");
			}
			else {
				System.out.println("÷hˆm. uusi yritys.");
			}
		} while (vastaus != 1 && vastaus != 2);
		
		//kysymys 3
		System.out.println("\nN‰et lohik‰‰rmeen sirist‰v‰n silmi‰‰n. Se on hyvin ep‰luuloisen n‰kˆinen.\n\"Kerrohan viel‰, mist‰ tarkalleen olet kotoisin, " + nimi + "?\n\t1) kerro totuus\n\t2) valehtele");
		vastaus = lukija.nextInt();
		lukija.nextLine();
		do {
			if (vastaus == 2) {
				System.out.println("Kerrot tulleesi l‰heisest‰ kyl‰st‰. Lohik‰‰rmeen silmiss‰ v‰l‰ht‰‰ viha.\n\"K‰‰piˆt. Olisi pit‰nyt arvata!\"");
				potutus+=3;
			}
			else if (vastaus == 1) {
				System.out.println("Kerrot asuvasi pieness‰ kyl‰ss‰ kaukana t‰‰lt‰. Uskaltaudut kertomaan el‰m‰st‰si, ja lohik‰‰rme kuuntelee kiinnostuneena.");
			}
			else {
				System.out.println("÷hˆm. uusi yritys.");
			}
		} while (vastaus != 1 && vastaus != 2);
		if (potutus > 2) {
			System.out.println("Olet onnistunut suututtamaan lohik‰‰rmeen. Mieti seuraava siirtosi tarkkaan.");
			//viimeinen mahdollisuus selvit‰!
			System.out.println("\nN‰ytt‰‰ silt‰, ett‰ lohik‰‰rme on hyˆkk‰‰m‰ss‰ kimppuusi. Se vet‰‰ henke‰ sis‰‰n uhkaavasti. \n\t1) Yrit‰ vietell‰ lohik‰‰rme\n\t2) Laita sormus sormeen\n\t3) Leiki kuollutta");
			reaktio = lukija.nextInt();
			do {
				if (reaktio == 1 || reaktio == 3) {
					hyokkaako = true;
				}
				else if (reaktio != 2) {
					System.out.println("÷hˆm. uusi yritys.");
				}
			} while (reaktio != 1 && reaktio != 2 && reaktio != 3);
		}
		else {
			System.out.println("\"Vaikutat rehelliselt‰\", lohik‰‰rme toteaa.\n\"P‰‰st‰n sinut menem‰‰n t‰ll‰ kertaa, " + nimi + ". Mutta ‰l‰ tule toista kertaa h‰iritsem‰‰n rauhaani.\"");
		}
		return hyokkaako;
	}
	private static void n‰yt‰Ohjeet() {
		System.out.println("T‰m‰ on tekstiseikkailu, jossa p‰‰set itse vaikuttamaan tarinan kulkuun.\nTarinan aikana sinulle esitet‰‰n kysymyksi‰ ja vaihtoehtoja niihin.\nKirjoita haluamasi vastauksen numero ja paina enter-n‰pp‰int‰ jatkaaksesi eteenp‰in.\n\nPalataan valikkoon...");
	}
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int toiminto = 0;
		System.out.println("Tervetuloa lohik‰‰rmeen luolan suulle!");
		do {
			System.out.println("\tAloittaaksesi pelin kirjoita 1.\n\tLukeaksesi ohjeet kirjoita 2.\n\tSulkeaksesi pelin kirjoita 3.\n\tLopuksi paina enter-n‰pp‰int‰.");
			toiminto = lukija.nextInt();
			lukija.nextLine();
			if (toiminto == 1)
				pelaaPeli();
			else if (toiminto == 2)
				n‰yt‰Ohjeet();
			else if (toiminto == 3)
				System.out.println("Kiitos pelist‰! N‰hk‰‰mme pian uudestaan lohik‰‰rmeen luolassa.");
			else
				System.out.println("Kirjoita numero 1, 2 tai 3 ja paina enter-n‰pp‰int‰ jatkaaksesi.");
		} while (toiminto != 3);
	}
}
