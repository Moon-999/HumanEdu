package com.study.springboot;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ContentDto {
	private int id;
	@NotNull(message="writer is null.")
	@NotEmpty(message="writer is empty.")
	@Size(min=3, max=10, message="writer min 3, max 10.")
	private String writer;
	@NotNull(message="content is null.")
	@NotEmpty(message="content is empty.")
	private String content;
	private String error_message;
	public int getId() {
		return id;
	}
	public String getError_message() {
		return error_message;
	}
	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
