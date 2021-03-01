
public class ARDBefehl implements StreamingBefehl {
	private ARD stream;
	
	public ARDBefehl(ARD stream) {
		this.stream = stream;
	}
	
	public void auswaehlen() {
		stream.einschalten("Sandmaennchen");
	}
}
