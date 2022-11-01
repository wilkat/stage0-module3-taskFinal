package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int a = number%10;
        int b = number/10;
        int c = b%10;
        int d = b/10;
        int e = d%10;
        int f = d/10;

        System.out.println(a+c+e+f);
    }
}
