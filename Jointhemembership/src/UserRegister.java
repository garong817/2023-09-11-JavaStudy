import java.util.*;
public class UserRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.println("====================");
		  System.out.println("  회원등록  ");
		  System.out.println("====================");
		  
		  boolean register = false; // 
		  Scanner sc=new Scanner(System.in); // 입력받은 값을 처리
		  
		  while(!register) {
			  System.out.print(">> ");
			  System.out.println("회원가입을 하시겠습니까?\n   y:진행   N:취소"); 
			  // 사용자들이 입력된 값을 받아서 할당
			  String register_input =sc.nextLine(); // 사용자들의 입력값을 대기하는 곳
			  
			  // 사용자들이 입력한 y n 값에 의해 어떻게 판단할것인지
			 // Y를 입력한 경우
			  if(register_input.equalsIgnoreCase("Y")){
				  register = true;
				  System.out.println("==================");
				  System.out.println("회원가입이 진행됩니다.");
				  System.out.println("==================");
			  } // N을 입력한 경우
			  else if (register_input.equalsIgnoreCase(("N"))){
				  System.out.println("==================");
				  System.out.println("회원가입이 종료됩니다.");
				  System.out.println("==================");
				  System.exit(0);
			  } else {
				  System.out.println("입력 값을 확인해주세요.");
			  }  
		     }  
		        ArrayList users = new ArrayList();
		        
		        while(true) {
		        	
		        	HashMap user = new HashMap();
		        	
		        	// 입력 받는 값 : ID
		        	System.out.print("ID: ");
		        	String username = sc.nextLine();  // 사용자들이 입력한 ID 값 받기
		        	
		        	// 입력 받는 값 : PWD
		                 String password; // 변수선언 / String password = " ";
		                 while (true) {
		                	 System.out.print("PWD: ");
		                	 password = sc.nextLine();
		                	 System.out.println("PW 확인: ");
		                	 String password_confirm = sc.nextLine();
		                	 
		                	 if(password.equals(password_confirm)) {
		                		 break; // 비밀번호 맞으면 빠져나오기
		                	 } else {
		                		 System.out.println("======================="); 
		                		 System.out.println("패스워드가 일치하지 않습니다.");
		                		 System.out.println("패스워드를 다시 입력해주세요.");
		                		 System.out.println("======================="); 
		                	 }
		                 }
		              //  이름
		                 System.out.print("성명: ");
		                 String name = sc.nextLine();
		                 
		              // 생년월일(6자리)
		                String birth_date = " ";
		                while(true) {
		                	System.out.print("생년월일(6자리)"); 
		                   birth_date = sc.nextLine();
		                   if(birth_date.length() == 6) 
		                	   break; 
		                              else 
		                              {
		                    	System.out.println("======================="); 
		                		 System.out.println("생년월일 자릿수가 올바르지 않습니다.");
		                		 System.out.println("생년월일을 다시 입력해주세요.");
		                		 System.out.println("======================="); 	   
		                }
		                 // 이메일
		                              System.out.print("이메일: ");
		                              String email = sc.nextLine();
		                   
		                              
		                 user.put("username" , username);
		                 user.put("password" , password);
		                 user.put("name" , name);
		                 user.put("birth_date" , birth_date);
		                 user.put("email" , email);
		                 
		                 users.add(user);
		                 
		                 System.out.println("-----------------------------------------");
		                 System.out.println(user.get("name")+"님, 가입을 환영합니다!");
		                 System.out.println("ID는 "+user.get("username")+"님, 가입을 환영합니다!");
		             
		                 System.out.println("회원가입을 이어서 진행하시겠습니까?\n");
		                 System.out.print(">> ");
		                 String register_again = sc.nextLine();
		                 
		                 if(register_again.equalsIgnoreCase("y"));
		                 {
		                 else if (register_again.equalsIgnoreCase("n"));
		                 {
		                	 System.exit(0);	 
		                 }
		                 }
		        }
		  }
	}
}
