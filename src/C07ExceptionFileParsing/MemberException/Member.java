package C07ExceptionFileParsing.MemberException;
//Entity(Member)
//Controller : 사용자의 입출력
//Service : 핵심로직, 예외발생, 검증
//Repository : DB에 CRUD
public class Member {
    private static Long staticId = 0L;

    private Long id;

    private String name;

    private String email;

    private String password;

    public Member(String name, String email, String password) {
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = password;
        staticId++;
    }

    public static Long getStaticId() {
        return staticId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' + '}';
    }
}
