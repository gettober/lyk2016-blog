package blog;

public class VideoPost extends Post {
	private String url;

	public VideoPost(String title, String body, String category, String url) {
		super(title, body, category);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
