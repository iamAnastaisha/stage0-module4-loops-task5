package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < (int)Math.ceil(height/2.); i++) {
            for (int j = 0; j < height; j++) {
                if (j >= i && j <= height - i - 1) {
                    System.out.println(8);
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }

        for (int i = (int)Math.ceil(height/2.) + 1; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j <= i && j >= height - i - 1) {
                    System.out.println(8);
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
