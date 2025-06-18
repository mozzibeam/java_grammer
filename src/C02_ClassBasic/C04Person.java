package C02_ClassBasic;

public class C04Person {
//    private 접근제어자는 해당 클래스내에서만 접근 가능
//    클래스에서 객체변수는 일반적으로 변수의 안정성을 위해 private으로 설정
    private String name;
    private String email;
    private int age;

    //    메서드는 public 하게 별도로 만들어서 의도를 명확히 하여, 변수의 안정성 향상


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printPerson() { //person은 객체의 주소값이 매개변수로 전달
//        System.out.println("name = " + person.name + "email = " + person.email + "age = " + person.age);
        return "name = " + this.name + " email = " + this.getEmail() + " age = " + this.getAge();
    }
//    객체 메서드들끼리의 호출은 객체가 만들어져 있다는 것을 가정하고 있으므로, 문제없이 호출 가능

    public String printPerson2() {
        String temp = this.printPerson();
        return temp;
    }

//    클래스메서드는 기본적으로 객체생성을 가정하지 않으므로, 클래스메서드내에서 객체메서드를 호출하는것은 논리적 모순
    public static String printPerson3() {
//        String temp = this.printPerson(); //불가능
        return null;
    }
}
