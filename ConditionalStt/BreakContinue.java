package ConditionalStt;

public class BreakContinue {

    public static void main(String[] args) {
        // Break & Continue
        int i = 0;
        while (true) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if (i > 5) {
                break;
            }
        }
    }
}
