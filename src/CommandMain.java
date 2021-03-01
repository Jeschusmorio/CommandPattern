
public class CommandMain {

	public static void main(String[] args) {
		DisneyPlus dp = new DisneyPlus();
		ARD ard = new ARD();
		Netflix nf = new Netflix();
		Hulu h = new Hulu();
		ZDF zdf = new ZDF();
		
		Kind k = new Kind();
		Jugendlicher j = new Jugendlicher();
		Erwachsener e = new Erwachsener();
		Pensionist p = new Pensionist();
		
		k.setStreamingBefehl(new DisneyPlusBefehl(dp));
		j.setStreamingBefehl(new NetflixBefehl(nf));
		e.setStreamingBefehl(new HuluBefehl(h));
		p.setStreamingBefehl(new ZDFBefehl(zdf));
		
		k.streamAuswaehlen();
		j.streamAuswaehlen();
		e.streamAuswaehlen();
		p.streamAuswaehlen();
		
		System.out.println("\nUhrzeit: 20:00 Uhr");
		k.setStreamingBefehl(new ARDBefehl(ard));
		k.streamAuswaehlen();
	}

}
