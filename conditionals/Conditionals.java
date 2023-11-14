package conditionals;

public class Conditionals {
    private static void runIfElseExample() {
        int i = 20;

        if (i == 10) System.out.println("i is 10");
        else if (i == 15) System.out.println("i is 15");
        else if (i == 20) System.out.println("i is 20");
        else System.out.println("i is not present");
    }

    private static void runSwitchExample() {
        int num = 20;
        switch (num) {
            case 5:
                System.out.println("It is 5");
                break;
            case 10:
                System.out.println("It is 10");
                break;
            case 15:
                System.out.println("It is 15");
                break;
            case 20:
                System.out.println("It is 20");
                break;
            default:
                System.out.println("Not present");

        }
    }

    private static void runContinueExample() {
        for (int i = 0; i < 10; i++) {
            // If the number is even skip and continue
            if (i % 2 == 0)
                continue;

            System.out.print(i + " ");
        }
    }

    private static void runReturnInConditionalExample(){
        boolean t = true;
        System.out.println("Before the return.");

        if (t)
            return;

        // Compiler will bypass every statement
        // after return
        System.out.println("This won't execute.");
    }

    public static void main(String[] args) {
        System.out.print("This is the if else example: ");
        Conditionals.runIfElseExample();
        System.out.print("This is the switch example: ");
        Conditionals.runSwitchExample();
        System.out.print("This is the Continue example: ");
        Conditionals.runContinueExample();
        System.out.print("\nThis is the return example: ");
        Conditionals.runReturnInConditionalExample();
    }
}
