package C05AnonymousLamda;

public class C01InnerClass {
    public static void main(String[] args) {
        MemberInnerClass m1 = new MemberInnerClass();
        System.out.println(m1.getA());

        MemberInnerClass.StaticInnerClass m2 = new MemberInnerClass.StaticInnerClass();
        m2.display();
    }
}
//(일반)내부클래스
class MemberInnerClass {
    int a;

    public MemberInnerClass() {
        this.a = 10;
    }

    public int getA() {
        return this.a;
    }

//      static내부클래스 : MemberInnerClass의 static변수처럼 사용
    static class StaticInnerClass {
        int b = 20;

    void display() {
        System.out.println(this.b);
    }
    }
}