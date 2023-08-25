public class Example2 {
    public static void main (String[]arg) {
        int RESULT=1;
        int x=2, y=5;
        while  (y>0){
            if (y%2==0){
                y=y/2;
                x=x*x;
            }
            else{
                y=y-1;
                RESULT=RESULT*x;
            }
        }
        System.out.println(RESULT);
    }

}
