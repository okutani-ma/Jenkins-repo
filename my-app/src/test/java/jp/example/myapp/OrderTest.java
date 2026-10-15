package jp.example.myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
    public void 黒明細のみの合計金額を求める() throws Exception {
        // given
        int[][] values = {{100, 8}, {200, 5}, {300, 3}};
        int expected = 2700;

        // when
        int actual = Order.order(values);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void 赤明細を含む合計金額を求める() throws Exception {
        // given
        int[][] values = {{100, 8}, {200, 5}, {300, 3}, {100, -2}};
        int expected = 2500;

        // when
        int actual = Order.order(values);

        // then
        assertEquals(expected, actual);
    }

}
