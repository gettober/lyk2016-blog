package blog;

public class TextPost extends Post {
	private String Summary;

	public TextPost(String title, String body, String category, String summary) {
		super(title, body, category);
		Summary = summary;
	}

	public String getSummary() {
		return Summary;
	}

	public void setSummary(String summary) {
		Summary = summary;
	}
	
	
	
	
}
