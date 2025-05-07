public class Main {

    public static void main(String[] args){
        int[] table = {4, 12, 6, 10, 18};
        int result = Main.differenceMaxMin (table);
        int[] result2 = twoSmallest(table);
        double result3 = calculation(4, 12);
        System.out.println("Result: " + result);
        System.out.println("The two smallest numbers are " + result2[0] + " and " + result2[1]);
        System.out.println("The result of this calculation is : " + result3);
    }

    public static int differenceMaxMin (int[] numbers) {
        int minNb = numbers[0];
        int maxNb = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNb)
                minNb = numbers[i];
            if (numbers[i] > maxNb)
                maxNb = numbers[i];
        }
        return maxNb - minNb;
    }

    public static int[] twoSmallest (int[] numbers) {

        if (numbers.length < 2) {
            System.out.println("The list is too short");
            return new int[] {};
        }

        int min1;
        int min2;

        if (numbers[0] < numbers[1]) {
            min1 = numbers[0];
            min2 = numbers[1];
        } else {
            min1 = numbers[1];
            min2 = numbers[0];
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min1) {
                min2 = min1;
                min1 = numbers[i];
            }
            else if ((numbers[i] > min1) && (numbers[i] < min2)) {
                min2 = numbers[i];
            }
        }
        return new int[] {min1, min2};
    }

    public static double calculation(double x, double y){
        double x2 = x * x;
        double temp = (4 * y) / 5;
        double temp2 = temp - x;
        double temp3 = temp2 * temp2;

        return x2 + temp3;
    }
}
