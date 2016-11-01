package no.hib.dat100.utsyn;

import java.util.ArrayList;

import no.hib.dat100.kontroll.Controller;
import no.hib.dat100.kontroll.Controller.StatusCode;
import no.hib.dat100.modell.Eier;
import no.hib.dat100.modell.KontaktAdresse;
import easyIO.In;
import easyIO.Out;

public class TekstUtsyn {

	private Controller controller;
	private Out out;
	private In in;

	final private static int NYNERINGSEIENDOM = 1;
	final private static int NYUTLEIEEIENDOM = 2;

	final private static int NYEIER = 3;
	final private static int NYEIEREIENDOM = 4;

	final private static int REGISTRERNABO = 5;
	final private static int FINNEIERE= 6;
	final private static int FINNLEIER = 7;
	
	final private static String SEPERATOR = "------------------------------------";
	
	final static int BREDDE = 25;
	
	public TekstUtsyn(Controller controller) {
		this.controller = controller;
		in = new In();
		out = new Out();
	}

	public void kjor() {

		boolean avslutt = false;

		do {
			out.outln(SEPERATOR);
			out.outln("Administrasjon av eiendommer");
			out.outln(SEPERATOR);
			out.outln("(1) - Ny næringseiendom");
			out.outln("(2) - Ny utleieeiendom");
			out.outln("(3) - Ny eier");
			out.outln("(4) - Ny eier for eiendom");
			out.outln("(5) - Registrer naboeiendom");
			out.outln("(6) - Finn eiere for eiendom");
			out.outln("(7) - Finn leier for utleieeiendom");
			out.outln("Andre for avslutt");
			out.out("Inntast valg:");
			
			int valg = in.inInt();

			switch (valg) {
			case NYNERINGSEIENDOM:
				nyNeringsEiendom();
				break;
			case NYUTLEIEEIENDOM:
				nyUtleieEiendom();
				break;
			case NYEIER:
				nyEier();
				break;
			case NYEIEREIENDOM:
				nyEierEiendom();
				break;
			case REGISTRERNABO:
				registrerNabo();
				break;
			case FINNEIERE:
				finnEiere();
				break;
			case FINNLEIER:
				finnLeier();
				break;
			default:
				avslutt = true;
			}

		} while (!avslutt);

	}

	public void nyNeringsEiendom() {

		out.outln("nyNæringsEiendom");
		
		EID eid = new EID();
		eid.readEID(in, out);
		
		out.out("Organisations nummer: ",BREDDE);
		int orgnr = in.inInt();
		
		StatusCode status = controller.nyNeringsEiendom(eid.gns, eid.bns, orgnr);
		
		out.outln(status.toString()); 
	}

	public void nyUtleieEiendom() {
		out.outln("nyUtleieEiendom");
		
		EID eid = new EID();
		eid.readEID(in, out);
		
		out.out("Leier fodselsnummer: ",BREDDE);
		int leier = in.inInt();
		
		out.out("Leiepris: ",BREDDE);
		int pris = in.inInt();
		
		StatusCode status = controller.nyUtleieEiendom(eid.gns, eid.bns, leier, pris);
		
		out.outln(status.toString()); 
	}

	public void nyEier() {

		out.outln("nyEier");
		
		out.out("navn: ",BREDDE);
		String navn = in.inLine();
		
		out.out("fodselsnummer: ",BREDDE);
		int fodselsnummer = in.inInt();
		
		out.out("vei: ",BREDDE);
		String vei = in.inLine();
		
		out.out("nummer: ",BREDDE);
		int nummer = in.inInt();
		
		out.out("postnummer: ",BREDDE);
		int postnummer = in.inInt();
		
		out.out("by: ",BREDDE);
		String by = in.inLine();
		
		out.out("land: ",BREDDE);
		String land = in.inLine();
		
		EID eid = new EID();
		eid.readEID(in, out);
		
		KontaktAdresse adresse = new KontaktAdresse(vei,nummer,postnummer,by,land);
		
		StatusCode status = controller.nyEier(navn, fodselsnummer, adresse, eid.gns, eid.bns);
		
		out.outln(status.toString()); 
	}
	
	public void nyEierEiendom() {

		out.outln("nyEierEiendom");
		
		out.out("eier fodselsnummer: ",BREDDE);
		int fodselsnummer = in.inInt();
		
		EID eid = new EID();
		eid.readEID(in, out);
		
		StatusCode status = controller.nyEierEiendom(fodselsnummer, eid.gns, eid.bns);
		
		out.outln(status.toString()); 
	}

	public void registrerNabo() {

		out.outln("registrerNabo");
		
		EID eid1 = new EID();
		eid1.readEID(in, out);
		
		EID eid2 = new EID();
		eid2.readEID(in, out);
		
		StatusCode status = controller.registrerNabo(eid1.gns, eid1.bns, eid2.gns, eid2.bns);
		
		out.outln(status.toString()); 
		
	}

	private void skrivEier(Eier eier) {
		out.outln(eier.getNavn()); // simpel representasjon av eier i dette utsyn
	}
	
	public void finnEiere() {

		out.outln("finnEiere");
		
		EID eid = new EID();
		eid.readEID(in, out);
		
		ArrayList<Eier> eiere = controller.finnEiere(eid.gns, eid.bns);
		
		if (eiere != null) {
			for (int i = 0; i<eiere.size(); i++)
				skrivEier(eiere.get(i));
		} else
			out.outln("finnEiere feilet");
	}

	public void finnLeier() {
		
		out.outln("finnEiere");
		
		EID eid = new EID();
		eid.readEID(in, out);
		
		int fodselsnummer = controller.finnLeier(eid.gns, eid.bns);
		
		if (fodselsnummer >= 0)
			out.outln("Leier fødselsnummer: " + fodselsnummer);
		else
			out.outln("finnLeier feilet");
	}
}
