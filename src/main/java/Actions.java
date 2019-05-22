import java.util.Objects;

public class Actions {

    public String s;
    StringBuffer stringBuffer;

    //test

    //test

    //test

    // test

    //test

    //test

    //test

    //test

    //test

    //test
    int aa;

    public Actions(String s) {
        this.s = s;
    }

    private int a() {
        return 0;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "s='" + s + '\'' +
                ", stringBuffer=" + stringBuffer +
                ", aa=" + aa +
                '}';
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actions actions = (Actions) o;
        return aa == actions.aa &&
                Objects.equals(s, actions.s) &&
                Objects.equals(stringBuffer, actions.stringBuffer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, stringBuffer, aa);
    }

    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }

    public void setStringBuffer(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    //test

    void test() {
        return;
    }

    void foo() {
        return;
    }

    //pewpew


}
