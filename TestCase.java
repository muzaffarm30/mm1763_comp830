package hw6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	
	 @Test
		public void diceBagTest1() {
			DiceBag D= new DiceBag();
			D.addToken(new OrderDie("Tom", "Red"));
			assertEquals(1, D.noOfTokensInBag());
		}
		@Test
		public void diceBagTest2() {
			DiceBag D= new DiceBag();
			D.addToken(new OrderDie("Tom", "Red"));
			D.addToken(new OrderDie("Steve", "Red"));
			assertEquals(2, D.noOfTokensInBag());
		}
		
		public void diceBagTest3() {
			DiceBag D= new DiceBag();
			assertEquals(0, D.noOfTokensInBag());
		}
		
		@Test
		public void diceBagTest4() {
			Token T= new Token("Tom");
			DiceBag D= new DiceBag();
			D.addToken(new OrderDie("Tom", "Red"));
			assertEquals(T,D.drawToken() );
		}
		@Test
		public void diceBagTest5() {
			Token T= null;
			DiceBag D= new DiceBag();
			assertEquals(T,D.drawToken() );
		}
		
		@Test
		public void diceBagTest6() {
			String str = " Dice left: 1" +  "\n" +"Tom\n";
			DiceBag D= new DiceBag();
			D.addToken(new OrderDie("Tom", "Red"));
			assertEquals(str, D.toString());
			
		}
}
