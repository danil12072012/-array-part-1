import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int [ ] bigBox = new int[3];
        bigBox [0] = 1;
        bigBox [1] = 2;
        bigBox [2] = 3;
        System.out.println(Arrays.toString(bigBox));
        for (int index = bigBox.length -1; index >= 0 ; index--) {
            if (index == 0) {
                System.out.print(bigBox[index]);
                break;
            }
            System.out.print(bigBox[index] + ", ");
        }
        System.out.println();
        double [] doubles = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(doubles));
        int doublesSize = doubles.length -1;
        for ( ; doublesSize >= 0; doublesSize--){
            if (doublesSize == 0){
                System.out.print(doubles[doublesSize]);
                break;
            }
            System.out.print(doubles[doublesSize] + ", ");
        }
        System.out.println();
        int [] week = new int [7];


        for (int i = 0; i < week.length; i++){
            week [i] = i + 1;
        }
        System.out.println(Arrays.toString(week));
        for (int b = week.length - 1; b >= 0; b--){
            if ( b== 0){
                System.out.print(week[b]);
                break;
            }
            System.out.print(week[b] + ", ");
        }
        for (int a = 0; a < week.length; a++){
            if (week[a] %2 == 0){
                System.out.println(week[a]);
            }else {
                week[a] = week[a] + 1;
                System.out.println(week[a]);
            }
        }
    }}

