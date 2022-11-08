public class Main {
    public static void main(String[] args) {

        int [] massive = new int[3];
        massive[0] = 2;
        massive[1] = 7;
        massive[2] = 9;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 != 0) {
                massive[i]++;
                System.out.println(massive[i]);
            }

        }

        double [] massive1 ={1.57, 7.654, 9.986};
        for (int i = massive1.length - 1 ; i >= 0; i--) {
            if (i != 0) {
                System.out.print(massive1[i] + ",");
            } else
                System.out.println(massive1[i]);
        }
        int [] number = new int[5];
        number[0] = 50;
        number[1] = 60;
        number[2] = 70;
        number[3] = 80;
        number[4] = 90;
        for (int i = number.length - 1; i >= 0 ; i--) {
            if (i != 0) {
                System.out.print(number[i] + ",");
            } else
                System.out.println(number[i]);
        }

    }
}