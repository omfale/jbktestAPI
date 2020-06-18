package com.jbk.controller;

public class Question
{
	

	String option2;
	String option3;
	String option4;
	String correctoption;
	String explanation;
	
	
	
	String option1;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correctoption == null) ? 0 : correctoption.hashCode());
		result = prime * result + ((explanation == null) ? 0 : explanation.hashCode());
		result = prime * result + ((option1 == null) ? 0 : option1.hashCode());
		result = prime * result + ((option2 == null) ? 0 : option2.hashCode());
		result = prime * result + ((option3 == null) ? 0 : option3.hashCode());
		result = prime * result + ((option4 == null) ? 0 : option4.hashCode());
		result = prime * result + ((quesstionText == null) ? 0 : quesstionText.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (correctoption == null) {
			if (other.correctoption != null)
				return false;
		} else if (!correctoption.equals(other.correctoption))
			return false;
		if (explanation == null) {
			if (other.explanation != null)
				return false;
		} else if (!explanation.equals(other.explanation))
			return false;
		if (option1 == null) {
			if (other.option1 != null)
				return false;
		} else if (!option1.equals(other.option1))
			return false;
		if (option2 == null) {
			if (other.option2 != null)
				return false;
		} else if (!option2.equals(other.option2))
			return false;
		if (option3 == null) {
			if (other.option3 != null)
				return false;
		} else if (!option3.equals(other.option3))
			return false;
		if (option4 == null) {
			if (other.option4 != null)
				return false;
		} else if (!option4.equals(other.option4))
			return false;
		if (quesstionText == null) {
			if (other.quesstionText != null)
				return false;
		} else if (!quesstionText.equals(other.quesstionText))
			return false;
		return true;
	}


	
	
	@Override
	public String toString() {
		return "question [option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4
				+ ", correctoption=" + correctoption + ", explanation=" + explanation + ", quesstionText="
				+ quesstionText + "]";
	}
	
	
	String quesstionText;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public Question(String quesstionText, String option1, String option2, String option3, String option4,
			String correctoption, String explanation) {
		super();
		this.quesstionText = quesstionText;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctoption = correctoption;
		this.explanation = explanation;
	}

	
	public String getQuesstionText() {
		return quesstionText;
	}
	public void setQuesstionText(String quesstionText) {
		this.quesstionText = quesstionText;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getCorrectoption() {
		return correctoption;
	}
	public void setCorrectoption(String correctoption) {
		this.correctoption = correctoption;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
}
