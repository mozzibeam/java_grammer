package C02_ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C10BoardService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Author> authorList = new ArrayList<>();
        ArrayList<Post> postList = new ArrayList<>();
        while (true) {
            System.out.println("\n1. 회원가입 | 2. 회원 목록 | 3. 회원 상세 | 4. 글 작성 | 5. 글 목록 | 6. 글 상세 | 7. 종료");
            int option = Integer.parseInt(br.readLine());
            switch (option) {
                case 1: //회원가입
                    System.out.print("이름: "); String name = br.readLine();
                    System.out.print("이메일: "); String email = br.readLine();
                    System.out.print("비밀번호: "); String password = br.readLine();

                    boolean isDuplicate = false;
                    for (Author author : authorList) {
                        if (author.getEmail().equals(email)) {
                            isDuplicate = true;
                        }
                    }
                    if (isDuplicate) {
                        System.out.println("이미 가입된 회원입니다.");
                    } else {
                        authorList.add(new Author(name, email, password));
                        System.out.println("정상적으로 회원가입 되었습니다.");
                    }
                    break;
                case 2: //회원 전체 목록 조회 : id, email
                    if (authorList.size() == 0) {
                        System.out.println("회원 목록이 없습니다.");
                    } else {
                        System.out.println("전체 회원 목록을 조회합니다.");
                        for (Author author : authorList) {
                            System.out.println(author.toString());
                        }
                    }
                    break;
                case 3: //회원 상세 조회(id로 조회) : id, email, name, password, 작성글수()
                    System.out.print("조회할 회원의 id를 입력하세요: ");
                    long id = Long.parseLong(br.readLine());
                    for (Author author : authorList) {
                        if (author.getAuthorId() == id) {
                            System.out.println(author.toString());
                        }
                    }
                    break;
                case 4: //게시글 작성 : 제목, 내용, 작성자 Email(Author객체가능) -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
                    break;
                case 5: //게시물 목록 조회 : id(post), title
                    break;
                case 6: //게시물 상세 조회(id로 조회) : id(post), title, contents, 작성자email(작성자 이름)
                    break;
                case 7: //종료
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
        }
    }
}

class Author {
    public static long commonId;
    private long authorId;
    private String name;
    private String email;
    private String password;

    private List<Post> aPost = new ArrayList<>();

    public Author(String name, String email, String password) {
        this.authorId = ++commonId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getAuthorId() {
        return authorId;
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

    public List<Post> getaPost() {
        return aPost;
    }

    @Override
    public String toString() {
        return "authorId: " + authorId + ", name: '" + name + ", email: '" + email;
    }
}

class Post {
    public static long commonId;
    private long postId;
    private String title;
    private String content;
    private Author author;

    public Post(long postId, String title, String content, Author author) {
        this.postId = ++commonId;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public long getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Author getAuthor() {
        return author;
    }
}

