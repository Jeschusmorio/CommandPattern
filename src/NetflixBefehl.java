
public class NetflixBefehl implements StreamingBefehl {
	private Netflix stream;
	
	public NetflixBefehl(Netflix stream) {
		this.stream = stream;
	}
	
	public void auswaehlen() {
		stream.einschalten("Teen-Drama");
	}
}
