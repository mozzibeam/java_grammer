package C07ExceptionFileParsing.MemberException;

import C07ExceptionFileParsing.MemberException.exception.DuplicateEmailException;
import C07ExceptionFileParsing.MemberException.exception.NoMembersFoundException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

//사용자의 입출력 처리 계층 (컨트롤러 계층)
public class MemberController {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. 회원가입, 2. 회원상세조회, 3. 회원목록조회");
            String input = sc.nextLine();
//            회원가입
            if (input.equals("1")) {
//                이름, 이메일, 패스워드 입력받아서 service에 전달
                String name = sc.nextLine();
                String email = sc.nextLine();
                String password = sc.nextLine();
                if (password.length() >= 5) {
                    try {
                        memberService.register(name, email, password);
                    } catch (IllegalArgumentException e) {
//                예외발생시 적절한 문구 사용자에게 출력
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("예상치 못한 에러가 발생했습니다.");
                    }
                } else{
                    System.out.println("패스워드 길이가 5자리 이상이여야 합니다.");}

            } else if (input.equals("2")) {
//                회원정보 출력
                System.out.println("등록된 회원들의 정보를 출력합니다.");
                    List<Member> members = memberService.findAll();
                    for (Member member : members) {
                        System.out.println(member);
                    }
            } else if (input.equals("3")) {
//                회원상세조회
                System.out.print("조회하실 회원의 ID를 입력하세요: ");
                Long id = sc.nextLong();
                try {
                    Member member = memberService.findById(id);
                    System.out.println("조회된 회원: " + member);
                } catch (NoSuchElementException e) {
                    System.out.println(e. getMessage());
                }
            } else if (input.equals("4")) {
                String email = sc.nextLine();
                String password = sc.nextLine();
                try {
                    memberService.Login(email, password);
                    System.out.println("로그인 성공");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

            }
        }
    }
}
