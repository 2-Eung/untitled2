public class Main {
    public static void main(String[] args) {

        String day = "월";

        switch (day) {
            case "월" :
                System.out.println(day);
                break;
            case "화" :
                System.out.println(day);
                break;
            case "수" :
                System.out.println(day);
                break;
            default :
                System.out.println("목, 금, 토, 일 or 잘못입력");
        }

        if (day == "월") {
            System.out.println(day);
        } else if (day == "화") {
            System.out.println(day);
        } else if (day == "화") {
            System.out.println(day);
        } else {
            System.out.println("목, 금, 토, 일 or 잘못입력");
        }
    }
}