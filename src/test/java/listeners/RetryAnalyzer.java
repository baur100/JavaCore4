package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/* to solve the problem of flaky test - it runs the same test multiple times to check whether the tests passes atleast once (inorder to check the flackiness of the test */
public class RetryAnalyzer implements IRetryAnalyzer{

    private int retryCount = 0;
    private static final int maxRetryCount = 4;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
