package dog.cyotee;

/**
 * Created by cyotee on 11/2/16.
 */
public class Test {

    String instanceName;

    public Test(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        return getInstanceName().equals(test.getInstanceName());

    }

    @Override
    public int hashCode() {
        return getInstanceName().hashCode();
    }
}