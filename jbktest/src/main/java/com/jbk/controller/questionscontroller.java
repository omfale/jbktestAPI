package com.jbk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testapi")


public class questionscontroller 
{
	public Question getQuestions()
	{
		
		Question question = new Question();//this is practice code
		question.setQuesstionText("is java platform independent...??");
		question.setOption1("yes");
		question.setOption2("NO");
		question.setCorrectoption("1");
		question.setExplanation("Due to byte code which is platform independent");
		return question;
		
	}
}
