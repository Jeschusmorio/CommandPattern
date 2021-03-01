
public class ZDFBefehl implements StreamingBefehl {
	private ZDF stream;
	
	public ZDFBefehl(ZDF stream) {
		this.stream = stream;
	}
	
	public void auswaehlen() {
		stream.einschalten("Doku");
	}
}
