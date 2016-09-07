package edu.csumb.questionsanswers.hugo;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class QuestionsAnswersTest extends TestCase {

	@Test
	public void testPut() {
		QuestionsAnswers obj = new QuestionsAnswers();
		
		obj.put("Which year are we currently on?", "2016");
		obj.put("How many months does a year comprise?", "twelve");
		obj.put("Which semester are we currently on?", "Fall 2016");
		
		assertEquals(true, obj.testAnswer("Which year are we currently on?", "2016"));
		assertEquals(true, obj.testAnswer("How many months does a year comprise?", "twelve"));
		assertEquals(true, obj.testAnswer("Which semester are we currently on?", "Fall 2016"));
		
		assertEquals(false, obj.testAnswer("Which year are we currently on?", "2015"));
		assertEquals(false, obj.testAnswer("How many months does a year comprise?", "ten"));
		assertEquals(false, obj.testAnswer("Which year are we currently on?", "Spring 2016"));
	}

}
