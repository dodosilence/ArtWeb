package com.silence.illustration.pojo;

public class MapPageQue {
	private Integer no;
	private Page page;
	private Question question;
	private Integer qscore;

	public MapPageQue() {
		// TODO Auto-generated constructor stub
	}

	public MapPageQue(Integer no, Page page, Question question, Integer qscore) {
		super();
		this.no = no;
		this.page = page;
		this.question = question;
		this.qscore = qscore;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Integer getQscore() {
		return qscore;
	}

	public void setQscore(Integer qscore) {
		this.qscore = qscore;
	}

	@Override
	public String toString() {
		return "MapPageQue [no=" + no + ", page=" + page + ", question=" + question + ", qscore=" + qscore + "]";
	}

}
