import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class ActionsHelperTest {

    @Test
    public void foo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionsHelperTest that = (ActionsHelperTest) o;
        return Objects.equals(sl, that.sl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sl);
    }

    @Override
    public String toString() {
        return "ActionsHelperTest{" +
                "sl='" + sl + '\'' +
                '}';
    }

    @Before
    public void setUp() throws Exception {

    }

    public ActionsHelperTest(String sl) {
        this.sl = sl;
    }


    String sl;

    ;


    @Test
    public void name() {

    }

    void foo1() {
        return;
    }
}