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
        Author currentUser = null;

        while (true) {
            System.out.println("\n0. 로그인 | 1. 회원가입 | 2. 회원 목록 | 3. 회원 상세 | 4. 글 작성 | 5. 글 목록 | 6. 글 상세 | 7. 종료");
            int option = Integer.parseInt(br.readLine());

            switch (option) {
                case 0: // 로그인
                    if (currentUser != null) {
                        System.out.println("이미 로그인된 상태입니다.");
                        break;
                    }

                    int attempt = 0;
                    boolean isLogin = false;

                    while (attempt < 3 && !isLogin) {
                        System.out.print("아이디(이메일): ");
                        String email = br.readLine();
                        System.out.print("비밀번호: ");
                        String password = br.readLine();

                        Author foundUser = null;
                        for (Author author : authorList) {
                            if (author.getEmail().equals(email)) {
                                foundUser = author;
                                break;
                            }
                        }

                        if (foundUser == null) {
                            System.out.println("아이디가 올바르지 않습니다.");
                        } else if (!foundUser.getPassword().equals(password)) {
                            System.out.println("비밀번호가 틀렸습니다.");
                        } else {
                            isLogin = true;
                            currentUser = foundUser;
                            System.out.println("로그인 성공. 안녕하세요 " + currentUser.getName() + "님");
                        }

                        if (!isLogin) {
                            attempt++;
                            if (attempt < 3) {
                                System.out.println("남은 로그인 가능 횟수: " + (3 - attempt));
                            } else {
                                System.out.println("로그인 시도 횟수를 초과했습니다.");
                            }
                        }
                    }
                    break;

                case 1: // 회원가입
                    System.out.print("이름: ");
                    String name = br.readLine();
                    System.out.print("이메일: ");
                    String email = br.readLine();
                    System.out.print("비밀번호: ");
                    String password = br.readLine();

                    boolean isDuplicate = false;
                    for (Author author : authorList) {
                        if (author.getEmail().equals(email)) {
                            isDuplicate = true;
                            break;
                        }
                    }

                    if (isDuplicate) {
                        System.out.println("이미 가입된 회원입니다.");
                    } else {
                        authorList.add(new Author(name, email, password));
                        System.out.println("정상적으로 회원가입 되었습니다.");
                    }
                    break;

                case 2: // 회원 전체 목록 조회
                    if (authorList.isEmpty()) {
                        System.out.println("회원 목록이 없습니다.");
                    } else {
                        System.out.println("전체 회원 목록을 조회합니다.");
                        for (Author a : authorList) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 3: // 회원 상세 조회
                    System.out.print("조회할 회원의 id를 입력하세요: ");
                    long id = Long.parseLong(br.readLine());
                    boolean found = false;
                    for (Author author : authorList) {
                        if (author.getAuthorId() == id) {
                            System.out.println(author + ", 작성글수: " + author.getaPost().size());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("존재하지 않는 회원입니다.");
                    }
                    break;

                case 4: // 게시글 작성
                    if (currentUser == null) {
                        System.out.println("로그인 후 게시글을 작성할 수 있습니다.");
                        break;
                    }

                    System.out.print("제목: ");
                    String title = br.readLine();
                    System.out.print("내용: ");
                    String content = br.readLine();

                    Post post = new Post(title, content, currentUser);
                    postList.add(post);
                    currentUser.getaPost().add(post);
                    System.out.println("게시글이 등록되었습니다.");
                    break;

                case 5: // 게시글 목록 조회
                    if (postList.isEmpty()) {
                        System.out.println("게시글이 없습니다.");
                    } else {
                        System.out.println("전체 게시글 목록을 조회합니다.");
                        for (Post pList : postList) {
                            System.out.println("postId: " + pList.getPostId() + ", title: " + pList.getTitle());
                        }
                    }
                    break;

                case 6: // 특정 작성자의 모든 게시글 보기
                    System.out.print("조회할 작성자의 ID를 입력하세요: ");
                    long authorId = Long.parseLong(br.readLine());

                    boolean authorExists = false;
                    for (Author author : authorList) {
                        if (author.getAuthorId() == authorId) {
                            authorExists = true;
                            System.out.println(author.getName() + "님의 게시글 목록:");
                            if (author.getaPost().isEmpty()) {
                                System.out.println("작성한 게시글이 없습니다.");
                            } else {
                                for (Post p : author.getaPost()) {
                                    System.out.println("postId: " + p.getPostId() + ", title: " + p.getTitle());
                                }
                            }
                            break;
                        }
                    }

                    if (!authorExists) {
                        System.out.println("해당 ID의 작성자가 존재하지 않습니다.");
                    }
                    break;

                case 7: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}

class Author {
    private static long commonId;
    private long authorId;
    private String name;
    private String email;
    private String password;
    private List<Post> postList;

    public Author(String name, String email, String password) {
        this.authorId = ++commonId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.postList = new ArrayList<>();
    }

    public long getAuthorId() { return authorId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public List<Post> getaPost() { return postList; }

    @Override
    public String toString() {
        return "authorId: " + authorId + ", name: " + name + ", email: " + email;
    }
}

class Post {
    private static long commonId;
    private long postId;
    private String title;
    private String content;
//    객체 안의 객체를 선언함으로서 post객체에서 쉽게 author객체에 접근 가능
    private Author author;

    public Post(String title, String content, Author author) {
        this.postId = ++commonId;
        this.title = title;
        this.content = content;
        this.author = author;

    }

    public long getPostId() { return postId; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public Author getAuthor() { return author; }

    @Override
    public String toString() { return "게시글 Id: " + postId + ", 제목: " + title + ", 내용: " + content + ", 작성자: " + author;}
}