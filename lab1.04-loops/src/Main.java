public class Main {

    public static void main(String[] args){
        int[] table = {4, 2, 6, 10, 18, 1};
        int result = Main.differenceMaxMin (table);
        System.out.println("Result: " + result);
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


}
