public class runner {
    public static void main(String[] args) {
        int num1 = 78;
        int num2 = 72;
        int num3 = 69;
        int[] heights = new int[3];

        heights[0] = num1;
        heights[1] = num2;
        heights[2] = num3;

        String[] alphabeticalNames = new String[4];
        alphabeticalNames[0] = "Abby";
        alphabeticalNames[1] = "David";
        alphabeticalNames[2] = "Charlie";
        alphabeticalNames[3] = "Lauren";

        String tempName = "Charlie";
        String tempName2 = "David";
        alphabeticalNames[1] = tempName;
        alphabeticalNames[2] = tempName2;

        System.out.println(alphabeticalNames[0]);
        System.out.println(alphabeticalNames[1]);
        System.out.println(alphabeticalNames[2]);
        System.out.println(alphabeticalNames[3]);

        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = new double[2];

        array3[0] = array1[0] + array2[0];
        array3[1] = array1[1] * array2[1];

        System.out.println(array3[0]);
        System.out.println(array3[1]);


    }
}
