package com.silence.illustration.pojo;

public class Question {
	private Integer qno;
	private String queContent;
	private String contentAnswer;
	private String optAnswer;
	private String type;
	private String desc;

	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(Integer qno, String queContent, String contentAnswer, String optAnswer, String type, String desc) {
		this.qno = qno;
		this.queContent = queContent;
		this.contentAnswer = contentAnswer;
		this.optAnswer = optAnswer;
		this.type = type;
		this.desc = desc;
	}

	public Integer getQno() {
		return qno;
	}

	public void setQno(Integer qno) {
		this.qno = qno;
	}

	public String getQueContent() {
		return queContent;
	}

	public void setQueContent(String queContent) {
		this.queContent = queContent;
	}

	public String getContentAnswer() {
		return contentAnswer;
	}

	public void setContentAnswer(String contentAnswer) {
		this.contentAnswer = contentAnswer;
	}

	public String getOptAnswer() {
		return optAnswer;
	}

	public void setOptAnswer(String optAnswer) {
		this.optAnswer = optAnswer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Question [qno=" + qno + ", queContent=" + queContent + ", contentAnswer=" + contentAnswer
				+ ", optAnswer=" + optAnswer + ", type=" + type + ", desc=" + desc + "]";
	}

}
