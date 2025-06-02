public class Main {
    public static void main(String[] args) {
        // happy, sad, angry, tired
        String mood = "happy";

        switch (mood){
            case "happy" :
                System.out.println("나는 행복하다.");
                break;
            case "sad" :
                System.out.println("나는 슬프다.");
                break;
            case "angry" :
                System.out.println("나는 화가난다");
                break;
            case "tired" :
                System.out.println("나는 피곤하다");
                break;
        }
    }
}