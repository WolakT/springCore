package pl.sda.spring.mobile;

import org.springframework.stereotype.Component;

/**
 * Created by RENT on 2017-08-10.
 */

@Component("iosOperatingSystem")
public class IOSOperatingSystem implements OperatingSystem {
    public void showDetails() {
        System.out.println("this device runs on IOS");
    }
}
