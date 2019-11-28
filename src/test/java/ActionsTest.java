import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class ActionsTest {

    @Before
    public void setUp() throws Exception {

    }
    Integer a;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionsTest that = (ActionsTest) o;
        return Objects.equals(a, that.a) &&
                Objects.equals(s, that.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, s);
    }

    @Override
    public String toString() {
        return "ActionsTest{" +
                "a=" + a +
                ", s=" + s +
                '}';
    }



    ;
//

    StringBuffer s;

    public ActionsTest(Integer a) {
        this.a = a;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 0; i++) {
            System.out.println("pewpew");

        }
    }

    void test() {
        return;
    }

    void foo() {
        return;
    }

    @Test
    public void name() {

    }
}