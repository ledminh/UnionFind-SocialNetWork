
public class UF {
	private int [] sizes;
	private int [] parents;
	
	public UF(int [] v) {
				
		parents = new int[v.length];
		sizes = new int[v.length];
		
		for(int i = 0; i < parents.length; i++) {
			parents[i] = i;
			sizes[i] = 1;
		}
	}
	
	public void union(int a, int b) {
		int rA = root(a),
			rB = root(b);
		
		if(sizes[rA] > sizes[rB]) {
			parents[rB] = rA;
			sizes[rA] += sizes[rB];
		}
		else if(sizes[rA] < sizes[rB]) {
			parents[rA] = rB;
			sizes[rB] += sizes[rA];
		}
		else {
			if(rA > rB) {
				parents[rA] = rB;
				sizes[rB] += sizes[rA];
			}
			else
				parents[rB] = rA;
				sizes[rA] += sizes[rB];
		}
		
		
		
	}
	
	public boolean connected(int a, int b) {
			
		return root(a) == root(b);
	}
	
	
	public int size(int i) {
		return sizes[root(i)];
	}
	
	
	private int root(int i) {
		
		while(parents[i] != i) {
			i = parents[i];
		}
		
		return i;
	}
	
	
}
