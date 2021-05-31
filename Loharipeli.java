package loharipeli;
import java.util.Scanner;

public class Loharipeli {
	private static void pelaaPeli() {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Tähän pelin sisältö.");
		boolean aarreMukana = etsiAarteita();
		boolean kuollaanko = keskustelu();
		if (kuollaanko == true) {
			//kuollaan
			System.out.println("\nYrityksesi ei toimi niin kuin oletit. Lohikäärme polttaa sinut poroksi.");
		}
		else {
			//selvitään
			System.out.println("Livautat sormuksen sormeesi, ja sinusta tulee näkymätön! Hämmennyksen turvin hiivit kohti luolan suuta.");
			if (aarreMukana == true) {
				//jee
				System.out.println("\nPääsit ulos ehjin nahoin, ja mukanasi on kimmeltävä aarre. Jee!");
			}
			else {
				//mööö
				System.out.println("\nPääsit kyllä ulos ehjin nahoin, mutta aarre jäi luolaan. Harmin paikka!");
			}
		}
		System.out.println("\nPalataan valikkoon...");
	}
private static boolean etsiAarteita() {
		Scanner lukija = new Scanner(System.in);
		boolean aarreMukana = false;
		int vastaus = 0;
		System.out.println("Mene luolaan? 1. Marssi tai 2. Hiivi");
		vastaus = lukija.nextInt();
		do {
			if (vastaus == 1) {
				return aarreMukana;
			}
			else if (vastaus == 2) {
				System.out.println("Hiivit luolaan, ja näet aarteita.");
			}
			else {
				System.out.println("Öhöm. uusi yritys.");
			}
		} while (vastaus != 1 && vastaus != 2);
		System.out.println("Kerää aarteita? 1. Kerää aarteita tai 2. Älä kerää aarteita");
				do {
			if (vastaus == 1) {
				return aarreMukana;
			}
			else if (vastaus == 2) {
				System.out.println("Keräät aarteita mukaasi. Näet lohikäärmeen nukkumassa. Sen nahka näyttää jännältä");
				aarreMukana = true;
			}
			else {
				System.out.println("Öhöm. uusi yritys.");
			}
		} while (vastaus != 1 && vastaus != 2);
		System.out.println("Kutita lohikäärmettä? 1. Kutita tai 2. Älä kutita");
				do {
			if (vastaus == 1) {
				return aarreMukana;
			}
			else if (vastaus == 2) {
				System.out.println("Kutitat lohikäärmettä vasten tahtoasi.");
				return aarreMukana;
			}
			else {
				System.out.println("Öhöm. uusi yritys.");
			}
		} while (vastaus != 1 && vastaus != 2);
		
		return aarreMukana;
	}
	private static boolean keskustelu() {
		Scanner lukija = new Scanner(System.in);
		boolean hyokkaako = false;
		int potutus = 0;
		int vastaus = 0;
		int reaktio = 0;
		//jos lukija ei anna nimeä, lohikäärme kutsuu häntä muukalaiseksi
		String nimi = "muukalainen";
		
		//Lohikäärme alkaa kysellä asioita ja ärsyyntyy tai on ärsyyntymättä lukijan vastauksien mukaan.
		//kysymys 1
		System.out.println("\nLohikäärme kääntää katseensa sinuun. Se näyttää kärttyisältä, katkaistiinhan siltä makoisat unet.\n\"Kuka sinä olet?\" se jylisee, ja vatsasi tuntuu putoavan vähintään metrin alaspäin sen voimasta.\n\t1) ole hiljaa\n\t2) kerro nimesi");
		vastaus = lukija.nextInt();
		lukija.nextLine();
		do {
			if (vastaus == 1) {
				//lohikäärme ärsyyntyy mystisyydestä
				System.out.println("Lohikäärme tuhahtaa. \"Veikö kissa kielesi? Nimen kertominen olisi vain kohteliasta.\nVarsinkin jos on tunkeutunut toisen asuinmajoille ilman lupaa...\"");
				potutus++;
			}
			else if (vastaus == 2) {
				//kysytään lukijalta nimi, jota lohikäärme käyttää jatkossa
				System.out.println("Anna nimi:");
				nimi = lukija.nextLine();
				System.out.println("\"Vai " + nimi + "... En olekaan kuullut tuollaista nimeä aiemmin.\"");
			}
			else {
				System.out.println("Öhöm. uusi yritys.");
			}
		} while (vastaus != 1 && vastaus != 2);
		
		//kysymys 2
		System.out.println("\nTunnet lohikäärmeen henkäisyn kasvoillasi ja hiuksissasi kun se laskee päänsä tasollesi.\n\"No, " + nimi + "\", se kysyy, \"mitä teet täällä?\"\n\t1) kehu lohikäärmettä\n\t2) kehu aarteita");
		vastaus = lukija.nextInt();
		lukija.nextLine();
		do {
			if (vastaus == 2) {
				//lohikäärme ei pitänyt vastauksesta, joten hän ärsyyntyy
				System.out.println("Kerrot tulleesi ihastelemaan lohikäärmeen kuuluisaa aarrekokoelmaa. Tajuat pian, ettei se ollut hyvä ajatus.\n\"Tämä aarrekokoelma on minun\", se ärähtää, \"ja kovalla työllä hankittu! Se on vain minua varten!\"");
				potutus++;
			}
			else if (vastaus == 1) {
				System.out.println("Kerrot tulleesi katsomaan, ovatko huhut lohikäärmeen uskomattoman kauniista suomupeitteestä todella totta.\nLohikäärme näyttää hämmentyneeltä. \"En tiennytkään, että siitä liikkuu huhuja...\" se miettii.");
			}
			else {
				System.out.println("Öhöm. uusi yritys.");
			}
		} while (vastaus != 1 && vastaus != 2);
		
		//kysymys 3
		System.out.println("\nNäet lohikäärmeen siristävän silmiään. Se on hyvin epäluuloisen näköinen.\n\"Kerrohan vielä, mistä tarkalleen olet kotoisin, " + nimi + "?\n\t1) kerro totuus\n\t2) valehtele");
		vastaus = lukija.nextInt();
		lukija.nextLine();
		do {
			if (vastaus == 2) {
				System.out.println("Kerrot tulleesi läheisestä kylästä. Lohikäärmeen silmissä välähtää viha.\n\"Kääpiöt. Olisi pitänyt arvata!\"");
				potutus+=3;
			}
			else if (vastaus == 1) {
				System.out.println("Kerrot asuvasi pienessä kylässä kaukana täältä. Uskaltaudut kertomaan elämästäsi, ja lohikäärme kuuntelee kiinnostuneena.");
			}
			else {
				System.out.println("Öhöm. uusi yritys.");
			}
		} while (vastaus != 1 && vastaus != 2);
		if (potutus > 2) {
			System.out.println("Olet onnistunut suututtamaan lohikäärmeen. Mieti seuraava siirtosi tarkkaan.");
			//viimeinen mahdollisuus selvitä!
			System.out.println("\nNäyttää siltä, että lohikäärme on hyökkäämässä kimppuusi. Se vetää henkeä sisään uhkaavasti. \n\t1) Yritä vietellä lohikäärme\n\t2) Laita sormus sormeen\n\t3) Leiki kuollutta");
			reaktio = lukija.nextInt();
			do {
				if (reaktio == 1 || reaktio == 3) {
					hyokkaako = true;
				}
				else if (reaktio != 2) {
					System.out.println("Öhöm. uusi yritys.");
				}
			} while (reaktio != 1 && reaktio != 2 && reaktio != 3);
		}
		else {
			System.out.println("\"Vaikutat rehelliseltä\", lohikäärme toteaa.\n\"Päästän sinut menemään tällä kertaa, " + nimi + ". Mutta älä tule toista kertaa häiritsemään rauhaani.\"");
		}
		return hyokkaako;
	}
	private static void näytäOhjeet() {
		System.out.println("Tämä on tekstiseikkailu, jossa pääset itse vaikuttamaan tarinan kulkuun.\nTarinan aikana sinulle esitetään kysymyksiä ja vaihtoehtoja niihin.\nKirjoita haluamasi vastauksen numero ja paina enter-näppäintä jatkaaksesi eteenpäin.\n\nPalataan valikkoon...");
	}
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int toiminto = 0;
		System.out.println("Tervetuloa lohikäärmeen luolan suulle!");
		do {
			System.out.println("\tAloittaaksesi pelin kirjoita 1.\n\tLukeaksesi ohjeet kirjoita 2.\n\tSulkeaksesi pelin kirjoita 3.\n\tLopuksi paina enter-näppäintä.");
			toiminto = lukija.nextInt();
			lukija.nextLine();
			if (toiminto == 1)
				pelaaPeli();
			else if (toiminto == 2)
				näytäOhjeet();
			else if (toiminto == 3)
				System.out.println("Kiitos pelistä! Nähkäämme pian uudestaan lohikäärmeen luolassa.");
			else
				System.out.println("Kirjoita numero 1, 2 tai 3 ja paina enter-näppäintä jatkaaksesi.");
		} while (toiminto != 3);
	}
}
