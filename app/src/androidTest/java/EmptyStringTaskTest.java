import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Joseph Costlow on 16-May-17.
 */

@RunWith(AndroidJUnit4.class)
public class EmptyStringTaskTest {
    private static final String LOG_TAG = EmptyStringTaskTest.class.getSimpleName();

    @Test
    public void verifyNonEmptyString() {
        try {
            EndpointsAsyncTask taskTest = new EndpointsAsyncTask();
            taskTest.execute();
            String result = taskTest.get();
            assertTrue("joke is null", result != null);
            assertTrue("joke is empty", !result.isEmpty());
        } catch (Exception e) {
            Log.e(LOG_TAG, ": timed out!");
            e.getMessage();
            e.printStackTrace();
        }
    }
}