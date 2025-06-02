public class Main {
    public static void main(String[] args) {
        // MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        String day = "MONDAY";

        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                System.out.println("평일");
                break;
            case "SATURDAY":
            case "SUNDAY":
                System.out.println("주말");
                break;
        }
        }
    }
}