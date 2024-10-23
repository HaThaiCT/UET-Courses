public class Week4 {
    /**
     * Find the minimum value of an array.
     *
     * @param a
     * @param b
     * @return
     */
    public static int max2Int(int a, int b) {
        if(a > b) {
            return a;
        }
        return b;
    }

    /**
     * Find the minimum value of an array.
     *
     * @param arr
     * @return
     */
    public static int minArray(int[] array) {
        int minval = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minval) {
                minval = array[i];
            }
        }
        return minval;
    }

    /**
     * Calculate the BMI of a person.
     *
     * @param weight
     * @param height
     * @return
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = Math.round(weight / (height * height) * 10) / 10.0;
        if (bmi >= 25) {
            return "Béo phì";
        } else if (bmi >= 23) {
            return "Thừa cân";
        } else if (bmi >= 18.5) {
            return "Bình thường";
        } else {
            return "Thiếu cân";
        }
    }
}