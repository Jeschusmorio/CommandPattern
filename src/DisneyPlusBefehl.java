
public class DisneyPlusBefehl implements StreamingBefehl {
	private DisneyPlus stream;
	
	public DisneyPlusBefehl(DisneyPlus stream) {
		this.stream = stream;
	}
	
	public void auswaehlen() {
		stream.einschalten("Monster AG");
	}
}
