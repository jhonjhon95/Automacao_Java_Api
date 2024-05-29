package utils;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

public class AllureTestWatcher implements TestWatcher {

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Allure.addAttachment("Screenshot", "image/png", "your-screenshot.png");
    }
}
