import java.util.Objects;

public class ActionsHelper {

    String s;
    int bb;

    public ActionsHelper(String s) {
        this.s = s;
    }

    public String foo() {
        return "";
    }

    //todo

    void test() {
        return;
    }

    void foo1() {
        return;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionsHelper that = (ActionsHelper) o;
        return bb == that.bb &&
                Objects.equals(s, that.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, bb);
    }

    @Override
    public String toString() {
        return "ActionsHelper{" +
                "s='" + s + '\'' +
                ", bb=" + bb +
                '}';
    }

    public void setBb(int bb) {
        this.bb = bb;
    }
}
