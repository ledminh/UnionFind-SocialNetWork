
public class UF {
	private int [] vertices;
	private int [] roots;
	public UF(int [] v) {
		vertices = v;
		
		roots = new int[v.length];
		
		for(int i = 0; i < roots.length; i++) {
			roots[i] = i;
		}
	}
	
	public void union() {
		
	}
	
	
	public boolean connected() {
		boolean isConnected = false;
		
		return isConnected;
	}
	
}
