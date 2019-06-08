import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JTest {

	@Test
	public void test1() {
		
	  UF uf = new UF(new int[6]);
	  
	  for(int i = 0; i < 6; i++) {
		  assertEquals(1, uf.size(i));
		  assertEquals(i, uf.root(i));
	  }
      
	  
	  uf.union(0, 1);
	  uf.union(2, 3);
	  uf.union(5, 4);
	  
	  assertEquals(2, uf.size(0));
	  assertEquals(2, uf.size(1));
	  assertEquals(2, uf.size(2));
	  assertEquals(2, uf.size(3));
	  assertEquals(2, uf.size(4));
	  assertEquals(2, uf.size(5));
	  
	  assertEquals(0, uf.root(0));
	  assertEquals(0, uf.root(1));
	  
	  assertEquals(2, uf.root(2));
	  assertEquals(2, uf.root(3));
	  
	  assertEquals(4, uf.root(4));
	  assertEquals(4, uf.root(5));
	  
	  uf.union(3, 5);

	  assertEquals(2, uf.size(0));
	  assertEquals(2, uf.size(1));
	  assertEquals(4, uf.size(2));
	  assertEquals(4, uf.size(3));
	  assertEquals(4, uf.size(4));
	  assertEquals(4, uf.size(5));
	  
	  assertEquals(0, uf.root(0));
	  assertEquals(0, uf.root(1));
	  
	  assertEquals(2, uf.root(2));
	  assertEquals(2, uf.root(3));
	  
	  assertEquals(2, uf.root(4));
	  assertEquals(2, uf.root(5));
	  
	  
	  uf.union(4, 1);
	  
	  assertEquals(6, uf.size(0));
	  assertEquals(6, uf.size(1));
	  assertEquals(6, uf.size(2));
	  assertEquals(6, uf.size(3));
	  assertEquals(6, uf.size(4));
	  assertEquals(6, uf.size(5));
	  
	  assertEquals(2, uf.root(0));
	  assertEquals(2, uf.root(1));
	  
	  assertEquals(2, uf.root(2));
	  assertEquals(2, uf.root(3));
	  
	  assertEquals(2, uf.root(4));
	  assertEquals(2, uf.root(5));
	}
	
}
