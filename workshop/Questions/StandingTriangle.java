package workshop.Questions;

public class StandingTriangle {
    public static void main(String[] args) {
        


        for (int i = 1; i <= 4; i++) {
            for (int sp = 1; sp <= 4 - i; sp++) System.out.print(" ");
            for (int st = 1; st <= i; st++) System.out.print("*");
            System.out.println();
        }


        for (int i = 4 - 1; i >= 1; i--) {
            for (int sp = 1; sp <= 4 - i; sp++) System.out.print(" ");
            for (int st = 1; st <= i; st++) System.out.print("*");
            System.out.println();
        }
    }
}
