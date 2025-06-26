package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//저장소 역할을 하는 계층
//저장소 DB에 접근하는 계층으로 활용됨 (CRUD 수행)
public class MemberRepository {
    private static List<Member> memberList = new ArrayList<>();

//    회원가입
    public void resister(Member member) {
        memberList.add(member);
    }

    //    회원상세조회
    public Optional<Member> findById(Long id) {
        return memberList.stream().filter(m -> m.getId() == id).findFirst();
//        for (Member member : memberList) {
//            if (member.getId().equals(id)) {
//                return Optional.of(member);
//            }
//        }
//        return Optional.empty();
    }

//    회원목록조회
    public List<Member> findAll() { //메모리 주소가 넘어감 (원본 변경 가능성이 있음)
        return memberList;
    }

    public Optional<Member> findByEmail(String email) {
        return memberList.stream().filter(m-> m.getEmail().equals(email)).findFirst();
    }

}
