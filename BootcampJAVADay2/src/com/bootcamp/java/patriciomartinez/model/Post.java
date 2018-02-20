package com.bootcamp.java.patriciomartinez.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private String title;
	private String text;
	private Date date;
	private List<String> tags;
	

	public Post(){
		tags = new ArrayList<>();
	}

	public Post(String title, String text, Date date, List tags) {
		super();
		this.title = title;
		this.text = text;
		this.date = date;
		this.tags = new ArrayList<>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	public void addTags(String s){
		tags.add(s);
	}

	@Override
	public String toString() {
		return "Post [title=" + title + ", text=" + text + ", date=" + date + ", tags=" + tags + "]";
	}

	

}
