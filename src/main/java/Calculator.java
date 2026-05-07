public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a / b;
    }

    public int times(int a, int b){
        return a * b;
    }

    public int solver(){


        return add(dif(100, 10), div(100, times(10,10)));

    }
}