package blog;

import java.util.Iterator;

public class Menu {
	public static void printMenu() {
		StringBuilder menu = new StringBuilder(50);

		menu.append("\n");
		menu.append("MENU\n");
		menu.append("=====\n");
		menu.append("(1) Add page\n");
		menu.append("(2) Add post\n");
		menu.append("(3) Add comment\n");
		menu.append("(4) Show pages\n");
		menu.append("(5) Show post\n");
		menu.append("\n");
		menu.append("Enter your command: ");

		System.out.println(menu.toString());
	}

	public static void printPages() {
		StringBuilder menuPages = new StringBuilder(50);
		
		Iterator<Page> itr = PageHelper.getPageIterator();
		
		int i =1;
		while(itr.hasNext()){
			Page page = itr.next();
			menuPages.append("(");
			menuPages.append(i++);
			menuPages.append(") ");
			menuPages.append(" ");
			menuPages.append(page.getTitle());
			menuPages.append(" ");
			menuPages.append(page.getBody());
			menuPages.append(" ");
			menuPages.append(page.getCategory());
			menuPages.append("\n");
		}
		System.out.println(menuPages.toString());
	}
	
	public static void printPosts() {
		StringBuilder menuPosts = new StringBuilder(50);
		
		Iterator<Post> itr = PageHelper.getPostIterator();
		
		int i =1;
		while(itr.hasNext()){
			Post post = itr.next();
			
			menuPosts.append("(");
			menuPosts.append(i++);
			menuPosts.append(") ");
			menuPosts.append(" ");
			menuPosts.append("Title: " + post.getTitle());
			menuPosts.append(", ");
			menuPosts.append("Body: " + post.getBody());
			menuPosts.append(" ");
			menuPosts.append(post.getCategory());
			
			if(post instanceof VideoPost){
				menuPosts.append(", Url:" + ((VideoPost)post).getUrl());
			}
			else if(post instanceof TextPost){
				menuPosts.append(", Summary" + ((TextPost)post).getSummary());
			}
			
			menuPosts.append("\n");
		}
		System.out.println(menuPosts.toString());
	}

}
