package blog;

import java.util.Scanner;

public class BlogApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int c=-1;
		Scanner input = new Scanner(System.in);
		
		while(true){
			Menu.printMenu();
			c=input.nextInt();
			processInput(c);
		}
	}
	
	public static void processInput(int c){
		Scanner input = new Scanner(System.in);
		switch (c) {
		case 1:
			Page page = new Page();
			PageHelper.addPage(page);
			break;
			
		case 2:
			System.out.println("Type of post as " +
					"\n(1) Video" +
					"\n(2) Text");
			int type = input.nextInt();
			PageHelper.addPost(type);
			break;
			
		case 3:
			System.out.println("Your comment: ");
			break;
			
		case 4:
			Menu.printPages();			
			break;
		case 5:
			Menu.printPosts();
			break;
			
		default:
			break;
		}
	}

}
