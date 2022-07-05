import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void 더하기() {
        int rs = Calculator.add("10 + 20");
        assertEquals(30, rs);
    }

    @Test
    public void 더하기_2() {
        int rs = Calculator.add("20 + 20");
        assertEquals(40, rs);
    }

    @Test
    public void 더하기_3() {
        int rs = Calculator.add("10 + 10");
        assertEquals(20, rs);
    }

    @Test
    public void 빼기(){
        int rs = Calculator.subtract("10 - 10");
        assertEquals(0, rs);
    }

    @Test
    public void 빼기_2(){
        int rs = Calculator.subtract("30 - 20");
        assertEquals(10, rs);
    }

    @Test
    public void 곱하기(){
        int rs = Calculator.multiply("10 * 5");
        assertEquals(50, rs);
    }

    @Test
    public void 나누기(){
        int rs = Calculator.divide("10 / 5");
        assertEquals(2, rs);
    }

    @Test
    public void 사칙연산(){
        int rs = Calculator.operation("10 + 10 - 5");
        assertEquals(15, rs);
    }

    @Test
    public void 사칙연산_2(){
        int rs = Calculator.operation("10 + 10 * 5");
        assertEquals(60, rs);
    }

    @Test
    public void 사칙연산_3(){
        int rs = Calculator.operation("(1 + 2) * 3");
        assertEquals(9, rs);
    }

    @Test
    public void 사칙연산_4(){
        int rs = Calculator.operation("(10 + 20) * 30 + (50 * 60 + (20 / 10))");
        assertEquals(3902, rs);
    }

}
