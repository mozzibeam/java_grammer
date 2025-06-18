package C02_ClassBasic;

public class C07Constructor {
        public static void main(String[] args) {
            Calendar calendar = new Calendar("2025", "06", "18");
            System.out.println(calendar.printCalendar());
//            toString() 메서드는 특별한 메서드로 객체명을 출력할 때 자동으로 실행
            System.out.println(calendar);
        }
    }
class Calendar {
    private String year;
    private String month;
    private String day;

//       생성자를 통해 객체변숙밧들을 객체가 만들어지는 시점에 초기화(세팅)
    public Calendar(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
//      별도 생성자를 추가할 경우, 기본 생성자는 무시됨, 필요 시 별도로 생성해야됨.
    public Calendar() {
    }

    public String printCalendar() {
        return "오늘은 " + this.year + "년 " + this.month + "월 " + this.day + "일 입니다.";
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }


    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}

