public class Main {
    public static void main(String[] args) {

        int [] massive = new int[3];
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        for (int i = 0; i < massive.length; i++) {
            if (i != 2) {
                System.out.print(massive[i] + ", ");
            } else
                System.out.println(massive[i]);
        }

        double [] massive1 ={1.57, 7.654, 9.986};
        for (int i = 0; i < massive1.length; i++) {
            if (i != 2) {
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
        for (int i = 0; i < number.length; i++) {
            if (i != 4) {
                System.out.print(number[i] + ",");
            } else
                System.out.println(number[i]);
        }

    }
}