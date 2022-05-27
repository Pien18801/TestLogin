package entity;

import java.util.Date;

import javax.xml.crypto.Data;

public class Content {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String text) {
		this.title = text;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.sql.Timestamp createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public Content(int id, String title, String brief, String content, java.sql.Timestamp createDate, Date updateDate, int sort,
			int authorId) {
		super();
		this.id = id;
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.sort = sort;
		this.authorId = authorId;
	}
	public Content(int id, String text, String brief, java.sql.Timestamp createDate) {
		super();
		this.id = id;
		this.title = text;
		this.brief = brief;
		this.createDate = createDate;
	}

	private int id;
	private String title;
	private String brief;
	private String content;
	private java.sql.Timestamp createDate;
	private Date updateDate;
	private int sort;
	private int authorId;
	
	public Content() {
		
	}
}
