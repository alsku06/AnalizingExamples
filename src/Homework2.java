public class Homework2 {
    public static void main(String[] arg) {

        int x = 5, y = -7, result = 0;
        int m;
        if (y < 0) {
            y = -1 * y;
            m = -1;
        } else
            m = 1;

        while (y > 0) {
            if (y % 2 == 0) {
                x = x + x;
                y = y / 2;
            }
            else{
                result = result + x;
             y = y - 1;
            }
        }
        if (m < 0) {
            result = -1 * result;
        }
        System.out.println(result);
    }
}
