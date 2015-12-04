package com.silence.illustration.pojo;

import java.sql.PreparedStatement;
import java.util.List;

public class Page {
	private Integer pno;
	private Integer totleScore;
	private List<MapPageQue> mapPageQues;

	public Page() {
		// TODO Auto-generated constructor stub
	}

	public Page(Integer pno, Integer totleScore, List<MapPageQue> mapPageQues) {
		super();
		this.pno = pno;
		this.totleScore = totleScore;
		this.mapPageQues = mapPageQues;
	}

	public Integer getPno() {
		return pno;
	}

	public void setPno(Integer pno) {
		this.pno = pno;
	PreparedStatement pStatement=null;
	}

	public Integer getTotleScore() {
		return totleScore;
	}

	public void setTotleScore(Integer totleScore) {
		this.totleScore = totleScore;
	}

	public void setMapPageQues(List<MapPageQue> mapPageQues) {
		this.mapPageQues = mapPageQues;
	}

	public List<MapPageQue> getMapPageQues() {
		return mapPageQues;
	}

	@Override
	public String toString() {
		return "Page [pno=" + pno + ", totleScore=" + totleScore + ", mapPageQues=" + mapPageQues + "]";
	}

}
