
public class Chromebook extends Item{
	private int os;

	public Chromebook(String assetTag, String description, int os2) {
		super(assetTag, description);
		this.os = os2;
	}

	public int getOs() {
		return os;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}
}


