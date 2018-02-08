package com.blog.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
	private int id;
	private String title;
	private String author;
	private String content;
	private String type;
	private String create_time;
	private String modify_time;
}
