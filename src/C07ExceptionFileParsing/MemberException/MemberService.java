package C07ExceptionFileParsing.MemberException;

import C07ExceptionFileParsing.MemberException.exception.DuplicateEmailException;
import C07ExceptionFileParsing.MemberException.exception.NoMembersFoundException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//핵심 로직을 구현 (서비스 계층)
public class MemberService {
    private MemberRepository memberRepository;
    public MemberService() {
        this.memberRepository = new MemberRepository();
    }

//    회원가입
    public void register(String name, String email, String password) throws IllegalArgumentException{
//        DB에 이메일이 중복일 경우 예외 발생
            for (Member member : memberRepository.findAll()) {
                if (member.getEmail().equals(email)) {
                    throw new IllegalArgumentException("이미 사용하는 이메일을 입력했습니다.");
                }
            }
//        정상적이면 객체를 조립후 repository를 통해 register
        memberRepository.resister(new Member(name, email, password));
        }

//    회원상세조회
    public Member findById(Long id) throws NoSuchElementException{
//        Optional객체에 값이 없을 경우 예외발생. 있으면 Member를 꺼내서 return.
        return memberRepository.findById(id).orElseThrow(() -> new NoSuchElementException("해당 아이디의 회원이 존재하지 않습니다."));
    }

//    회원목록조회
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    //    로그인
    public void Login(String email, String password) throws NoSuchElementException, IllegalArgumentException{
        Optional<Member> optionalMember = memberRepository.findByEmail(email);
        if (!optionalMember.isPresent()) {
            throw new NoSuchElementException("잘못된 이메일입니다.");
        }
        if (!optionalMember.get().getPassword().equals(password)) {
            throw new IllegalArgumentException("비밀번호가 틀렸습니다");
        }
    }
}
