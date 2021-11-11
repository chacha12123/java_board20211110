package board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 		
		
		while(true) {
			System.out.print("명령어 : ");
			String command = sc.nextLine();
			
			command.trim();
			
			if(command.length() == 0) {
				continue;
			}
			
			if(command.equals("list")) {
				System.out.println("게시물 목록");
			}
			
			else if(command.equals("write")) {
				
				// 번호, 제목, 내용
				
				int id = 1;
				
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				
				System.out.printf("게시물 등록이 완료되었습니다.\n");
				
			} else {
				System.out.printf("%s는 존재하지 않는 명령어입니다.\n", command);
			}
			
			
		}
		
		
	}

}



