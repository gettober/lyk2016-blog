package blog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PageHelper {
	
	private static List<Page> pages = new ArrayList<>(); 
	private static List<Post> posts = new ArrayList<>();
	static Scanner scr= new Scanner(System.in);
	
	public static void addPage(Page page){
		
		System.out.println("Title of page:");		
		String title = scr.nextLine();
		
		System.out.println("Body of page: ");
		String body = scr.nextLine();
		
		System.out.println("Category of page: ");
		String category = scr.nextLine();
		
		page.setTitle(title);
		page.setBody(body);
		page.setCategory(category);
		
		pages.add(page);
		System.out.println("Page created.");
	}
	
	public static void addPost(int type){
		
		System.out.println("Title of post:");		
		String title = scr.nextLine();
		
		System.out.println("Body of post: ");
		String body = scr.nextLine();
		
		System.out.println("Category of post: ");
		String category = scr.nextLine();
		
		switch(type){
		case 1:
			System.out.println("Url of video post: ");
			String url = scr.nextLine();
			VideoPost video = new VideoPost(title, body, category, url);
			System.out.println("Video post is created.");
			posts.add(video);
			break;
			
		case 2:
			System.out.println("Summary of text post: ");
			String summary = scr.nextLine();
			TextPost text = new TextPost(title, body, category, summary);
			System.out.println("Text post is created.");
			posts.add(text);
			break;
		}
	}
	
	
	public static Iterator<Page> getPageIterator() {
		return pages.iterator();
	}

	public static Iterator<Post> getPostIterator() {
		return posts.iterator();
	}		
		
}
