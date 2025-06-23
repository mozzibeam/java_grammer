package C04Interface;

public class C01Cat implements C01AnimalInterface1, C01AnimalInterface2 {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public String play(String a, String b) {
        return a + "고양이와 " + b + "개가 놀고있어요.";
    }
}
