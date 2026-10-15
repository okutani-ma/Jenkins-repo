package jp.example.myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
    void 単価100数量5でcalcメソッド呼び出しで500を返す() throws Exception {
        // given
        int price = 100;
        int count = 5;
        int expected = 500;

        // when
        int actual = Calculator.calc(price, count);

        // then
        assertEquals(expected, actual);
    }

    @Test
    void 単価100数量0未満でcalcメソッド呼び出しで0を返す() throws Exception {
        // given
        int price = 100;
        int count = -1;
        int expected = 0;

        // when
        int actual = Calculator.calc(price, count);

        // then
        assertEquals(expected, actual);
    }

}
