package pl.sda.spring.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by RENT on 2017-08-10.
 */

@Component("iphone")
public class IPhone extends Phone {

    @Autowired
    public IPhone(@Qualifier("iosOperatingSystem")OperatingSystem operatingSystem){
        super(operatingSystem);
    }


    public void display() {
        System.out.println("This is IPhone");
        operatingSystem.showDetails();
    }
}
