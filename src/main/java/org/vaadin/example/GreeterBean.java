package org.vaadin.example;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;

/**
 * Created by mstahv
 */
@ApplicationScoped
public class GreeterBean {
    public String sayHi() {
        return "Hi di how at " + LocalDateTime.now();
    }

}
