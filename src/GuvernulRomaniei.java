
public class GuvernulRomaniei {

	public String legile = "1. Drepturile Omului";
	private String datoriile;
	
	private static GuvernulRomaniei guvernulRomaniei;
	
	private GuvernulRomaniei() {
		
	}
	
	public static GuvernulRomaniei getInstance() {
	    if (guvernulRomaniei == null) {
	    	guvernulRomaniei = new GuvernulRomaniei();
	    }

	    return guvernulRomaniei;
	}
}
