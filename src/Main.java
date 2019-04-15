import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    /*public static void main_1(String[] args) {
        byte b_max = Byte.MAX_VALUE;
        byte b_min = Byte.MIN_VALUE;
        short s_max = Short.MAX_VALUE;
        short s_min = Short.MIN_VALUE;
        int i_max = Integer.MAX_VALUE;
        int i_min = Integer.MIN_VALUE;
        long l_max = Long.MAX_VALUE;
        long l_min = Long.MIN_VALUE;
        float f_max = Float.MAX_VALUE;
        float f_min = Float.MIN_VALUE;
        double d_max = Double.MAX_VALUE;
        double d_min = Double.MIN_VALUE;
        char ch_max = Character.MAX_VALUE;
        char ch_min = Character.MIN_VALUE;
        System.out.println("byte max = " + b_max);
        System.out.println("byte min = " + b_min);
        System.out.println("short max = " + s_max);
        System.out.println("short min = " + s_min);
        System.out.println("integer max = " + i_max);
        System.out.println("integer min = " + i_min);
        System.out.println("long max = " + l_max);
        System.out.println("long min = " + l_min);
        System.out.println("float max = " + f_max);
        System.out.println("float min = " + f_min);
        System.out.println("double max = " + d_max);
        System.out.println("char max = " + ch_max);
        System.out.println("char min = " + ch_min);
        System.out.println("----------");
        System.out.println("|         |");
        System.out.println("|         |");
        System.out.println("|         |");
        System.out.println(" ----------");
        System.out.println("__________");
        System.out.println("\\        /");
        System.out.println(" \\      / ");
        System.out.println("  \\    /  ");
        System.out.println("   \\  /   ");
        System.out.println("    \\/    ");
        System.out.println("*************");
        System.out.println("*           *");
        System.out.println("*Прямокутник*");
        System.out.println("*           *");
        System.out.println("*************");
        System.out.println("  _____   ");
        System.out.println(" /     \\ ");
        System.out.println("/       \\");
        System.out.println("\\       /");
        System.out.println(" \\_____/ ");

    }*/

    public static void main(String[] args) {

        int e = 1;
        int i = 0;
        while (e < 100) {
            if (e % 2 != 0) {
                ++i;
            }
            ++e;
        }
        int[] nums = new int[i];
        e = 1;
        i = 0;
        while (e < 100) {
            if (e % 2 != 0) {
                nums[i] = e;
                ++i;
            }
            ++e;
        }

        for (int c = 0; c < nums.length; c++) {
            System.out.print(nums[c]);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println();

        for(int c = nums.length - 1; c >= 0; c--){
            System.out.print( nums[c] + " " );
        }

    }

    public static void main1(String[] args) {
        int day = 4;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }

}
