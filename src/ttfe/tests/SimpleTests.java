package ttfe.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import jdk.jfr.Timestamp;
import ttfe.SimulatorInterface;
import ttfe.TTFEFactory;

/**
 * This class provides a very simple example of how to write tests for this project.
 * You can implement your own tests within this class or any other class within this package.
 * Tests in other packages will not be run and considered for completion of the project.
 */
public class SimpleTests {

	private SimulatorInterface game;

	@Before
	public void setUp() {
		game = TTFEFactory.createSimulator(4, 4, new Random(0));
	}
	
	@Test
	public void testInitialGamePoints() {
		assertEquals("The initial game did not have zero points", 0,
				0 == game.getPoints());
		
	}
	
	@Test
	public void testInitialBoardHeight() {
		assertTrue("The initial game board did not have correct height",
				4 == game.getBoardHeight());
	}

	@Test
	public void testInitialBoardWidth() {
		assertTrue("The initial game board did not have correct width",
				4 == game.getBoardWidth());
	}


	@Test
	public void testIllegalPoints() {
		assertTrue("The initial score was not 0",
				 0 != game.getPoints());
	}
	@Test 
	public void testIllegalMoves(){
		if (16 == getNumPieces() && null == isMovePossible() ){
			fail("illegal move / G A M E  O V E R");
			
		}
		
	}
	@Test 
	public void testMovePossible(){
			assertTrue("No Move possible",
			null != isMovePossible());
			
}
}