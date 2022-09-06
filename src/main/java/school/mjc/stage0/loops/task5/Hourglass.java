package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = (int)Math.ceil(height / 2.); i >= 1; i--) {
            for (int j = i; j < (int)Math.ceil(height / 2.); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(8);
            }
            System.out.println("");
        }
        for (int i = 2; i <= (int)Math.ceil(height / 2.); i++) {
            for (int j = i; j < (int)Math.ceil(height / 2.); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(8);
            }
            System.out.println("");
        }
    }
}
