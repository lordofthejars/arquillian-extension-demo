package org.arquillian.f2f;

import org.jboss.arquillian.core.api.annotation.Observes;
import org.jboss.arquillian.test.spi.event.suite.Before;

class HelloBangaloreObserver {

    public void helloBangalore(@Observes Before event) {
        System.out.println("Hello World From Bangalore and from " + event.getTestMethod().toString());
    }

}
