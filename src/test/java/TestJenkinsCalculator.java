import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJenkinsCalculator {

    @Test
    public void addTest(){
        JenkinsCalculator jenkinsCalculator = new JenkinsCalculator();
        assertEquals(jenkinsCalculator.addNumbers(1,2),3);
    }
}
