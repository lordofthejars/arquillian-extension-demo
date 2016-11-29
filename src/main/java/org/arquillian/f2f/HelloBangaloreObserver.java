package org.arquillian.f2f;

import org.jboss.arquillian.core.api.Instance;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.core.api.annotation.Observes;
import org.jboss.arquillian.test.spi.event.suite.Before;

class HelloBangaloreObserver {

    @Inject
    Instance<BangaloreConfiguration> bangaloreConfigurationInstance;

    public void helloBangalore(@Observes Before event) {

        final BangaloreConfiguration bangaloreConfiguration = bangaloreConfigurationInstance.get();

        if (bangaloreConfiguration == null) {
            throw new IllegalStateException("");
        }

        System.out.println(bangaloreConfiguration.getMessage() + " " + event.getTestMethod().toString());
    }

    public void configurationCreated(@Observes BangaloreConfiguration bangaloreConfiguration) {
        System.out.println("I have created the configuration " + bangaloreConfiguration.getMessage());
    }

}
