import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    void stockTest() {
        int[] test1 = {1,2,3};
        assertArrayEquals(new int[]{1,2,3}, Inventory.stock(test1));

        int[] test2 = {1,2,3,0};
        assertArrayEquals(new int[]{1,2,3,0}, Inventory.stock(test2));

        int[] test3 = {0,2};
        assertArrayEquals(new int[]{0,0}, Inventory.stock(test3));

        int[] test4 = {1,0,3};
        assertArrayEquals(new int[]{1,0,0}, Inventory.stock(test4));

        int[] test5 = {1,1,1,0,1};
        assertArrayEquals(new int[]{1,1,1,0,0}, Inventory.stock(test5));

        int[] test6 = {0,0,0};
        assertArrayEquals(new int[]{0,0,0}, Inventory.stock(test6));
    }
}