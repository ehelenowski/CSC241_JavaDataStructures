package Trivia;

//----------------------------------------------------------------------------
// TriviaQuestion.java           by Dale/Joyce/Weems                 Chapter 2
//
// Provides trivia question objects.
//----------------------------------------------------------------------------

import StringLog.*;

public class TriviaQuestion 
{
  private String category;             // category of question
  private String question;             // the question
  private StringLogInterface answers;  // acceptable answers

  public TriviaQuestion(String category, String question, int maxNumAnswers)
  // Precondition:  maxNumAnswers > 0 
  {
//	 this.question = question;
     this.category = category;
	 this.question = question;
	 answers = new ArrayStringLog("trivia", maxNumAnswers);
//	 answers = new LinkedStringLog("trivia");
  }

  public String getCategory()
  {
    return category;
  }
  
  public String getQuestion()
  {
    return question;
  }

  public boolean tryAnswer(String answer)
  {
    return answers.contains(answer);
  }	 

  public void storeAnswer(String answer)
  // Precondition:  answers String Log is not full
  {
    answers.insert(answer);
  }
}