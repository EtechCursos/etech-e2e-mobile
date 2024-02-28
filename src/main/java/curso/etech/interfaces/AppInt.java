package curso.etech.interfaces;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public interface AppInt {

    AndroidDriver getDriver() throws MalformedURLException;
}
