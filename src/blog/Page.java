package blog;

import java.time.LocalDate;

public class Page {
	private String title;
	private String body;
	private LocalDate currentDate = LocalDate.now();
	private String category;
	//List comments
	
	
	public Page() {
		super();
	}
	
	public Page(String title, String body, String category) {
		this.title = title;
		this.body = body;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String page) {
		this.title = page;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getCurrentDate() {
		return currentDate;
	}

	@Override
	public String toString() {
		return "Page [title=" + title + ", body=" + body + ", currentDate="
				+ currentDate + ", category=" + category + "]";
	}
	
	
	
	
	

}
