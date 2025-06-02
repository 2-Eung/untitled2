public class Main {
    public static void main(String[] args) {
        // "happy", "angry", "sad", etc.
        String mood = "ㅇㅇ";

        switch (mood) {
            case "happy":
                System.out.println("나는 행복하다.");
                break;
            case "angry":
                System.out.println("나는 화가난다.");
                break;
            case "sad":
                System.out.println("나는 슬프다.");
                break;
            default:
                System.out.println("나도 모르겠다.");
        }
    }
}