
public class Pensionist {
	private StreamingBefehl streamingBefehl;
	
	public void setStreamingBefehl(StreamingBefehl streamingBefehl) {
		this.streamingBefehl = streamingBefehl;
	}
	
	public void streamAuswaehlen() {
		streamingBefehl.auswaehlen();
	}
}
