package pkovacs.aoc.y2016;

import org.junit.jupiter.api.Test;

class Day03Test extends DayTestBase {

    @Test
    public void test() {
        Day03.main(null);
        assertSolution1("869");
        assertSolution2("1544");
    }

}
