public class MultiplicationPairs {
    public static void main(String[] args) {
        int i = 0;
        while (i < 51) {
            int first = i++;
            int second = i++;
            System.out.println(first + " * " + second + " = " + (first * second));
            i++;
        }
    }
}