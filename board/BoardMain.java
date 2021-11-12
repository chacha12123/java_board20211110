package board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 		
		List<Article> articles = new ArrayList<>();
		int lastId = 1;
		
		while(true) {
			System.out.print("명령어 : ");
			String command = sc.nextLine();
			
			command.trim();
			
			if(command.length() == 0) {
				continue;
			}
			
			if(command.equals("list")) {
				System.out.printf("=== 게시물 목록 ===\n");
				for(int i = 0; i < articles.size(); i++) {
					Article currentArticle = articles.get(i);
					System.out.printf("%d   | %s\n", currentArticle.id, currentArticle.title);					
				}
			}
			
			else if(command.equals("write")) {
				
				int id = lastId++;
				
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				
				Article article = new Article(id, title, body);
				
				articles.add(article);
				
				System.out.printf("게시물 등록이 완료되었습니다.\n");
				
			} else if(command.startsWith("detail ")) {
				
				String[] commandBits = command.split(" ");
			
				int id = Integer.parseInt(commandBits[1]);
				
				Article targetArticle = null;
				
				for(int i = 0; i < articles.size(); i++) {
					Article currentArticle = articles.get(i);
					
					if(currentArticle.id == id) {
						targetArticle = currentArticle;
					}
				}
				
				if(targetArticle == null) {
					System.out.printf("%d번 게시물이 존재하지 않습니다\n", id);
					continue;
				}
				
				System.out.printf("번호 : %d\n", targetArticle.id );
				System.out.printf("제목 : %s\n", targetArticle.title);
				System.out.printf("내용 : %s\n", targetArticle.body);
				
			}
			else {
				System.out.printf("%s는 존재하지 않는 명령어입니다.\n", command);
			}
			
			
		}
		
		
	}

}



