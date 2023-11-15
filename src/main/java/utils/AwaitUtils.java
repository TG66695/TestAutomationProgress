package utils;

import org.awaitility.Awaitility;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.awaitility.core.ConditionFactory;

import java.time.Duration;
import java.util.concurrent.Callable;

public class AwaitUtils {
    public static ConditionFactory await(String msg) {
        return Awaitility.await(msg);
    }
    public static ConditionFactory awaitWithInterval(String msg, int timeout, int interval) {
        return await(msg)
                .atMost(Duration.ofSeconds(timeout))
                .pollInSameThread()
                .pollInterval(Duration.ofMillis(interval))
                .pollDelay(Duration.ZERO)
                .ignoreExceptionsInstanceOf(WebDriverException.class);
    }

    public static ConditionFactory await(String msg, int timeout) {
        return awaitWithInterval(msg, timeout, 500);
    }

    public static void waitUntil(Callable<Boolean> condition, int timeout) {
        await(null, timeout).until(condition);
    }

}
