
public class HuluBefehl implements StreamingBefehl {
	private Hulu stream;
	
	public HuluBefehl(Hulu stream) {
		this.stream = stream;
	}
	
	public void auswaehlen() {
		stream.einschalten("Vikings");
	}
}
