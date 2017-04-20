package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {

	@Test
	public void testJudgeIllegal() {
		triangle.getIntegers(3, 3, 7);
		triangle.judgeIllegal();
		assertEquals("illegal", triangle.getResult());
	}

	@Test
	public void testJudgeEquilateral() {
		triangle.getIntegers(3, 3, 3);
		triangle.judgeEquilateral();
		assertEquals("equilateral", triangle.getResult());
	}

	@Test
	public void testJudgeIossceles() {
		triangle.getIntegers(3, 3, 4);
		triangle.judgeIossceles();
		assertEquals("isosceles", triangle.getResult());
	}

	@Test
	public void testJudgeScalene() {
		triangle.getIntegers(3, 4, 5);
		triangle.judgeScalene();
		assertEquals("scalene", triangle.getResult());
	}

}
