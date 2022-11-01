package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int a = number%10;
        int b = number/10;
        int c = b%10;
        int d = b/10;

        System.out.println(a*100 + c*10 + d);
    }
}
