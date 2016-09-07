package edu.csumb.questionsanswers.hugo;

import java.util.Map;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

	/**
	*	A half-secretive map of questions to answers (at most one answer per question).
	*	Gives out random questions (keys) from the map, and
	*	can	be queried to test if a given question maps to a given answer.
	*/
public class QuestionsAnswers {
		private Map<String, String> questionsAnswersMap;
		
		QuestionsAnswers() {
			this.questionsAnswersMap = new HashMap();
		}
	
		/**
		 *	Map question to	answer.
		 */
		void put(String	question,	String	answer)	{
			questionsAnswersMap.put(question, answer);
		}
		/**
		 *	Queries	if question	maps to	answer.
		 */
		boolean	testAnswer(String question, String	answer)	{
			String mapAnswer = null;
			
			if(this.questionsAnswersMap.containsKey(question)) {
				mapAnswer = questionsAnswersMap.get(question);
			}
			
			return mapAnswer.equals(answer);
		}
		/**
		 *	Gives out a	random question	from the key set.
		 */
		String	getRandomQuestion()	{
			List<String> questionsList = new ArrayList(); 
			questionsList.addAll(questionsAnswersMap.keySet());
			
			String question = questionsList.get(new Random().nextInt(questionsList.size()));
			
			return question;
		}
		
		public static void main(String[] args) {
			QuestionsAnswers obj = new QuestionsAnswers();
			
			obj.put("Which year are we currently on?", "2016");
			obj.put("How many months does a year comprise?", "twelve");
			obj.put("Which semester are we currently on?", "Fall 2016");
			
			obj.testAnswer("Which year are we currently on?", "2016");
			
			
		}
}
