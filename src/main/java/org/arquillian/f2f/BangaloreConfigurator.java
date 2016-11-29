package org.arquillian.f2f;

import org.jboss.arquillian.config.descriptor.api.ArquillianDescriptor;
import org.jboss.arquillian.core.api.InstanceProducer;
import org.jboss.arquillian.core.api.annotation.ApplicationScoped;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.core.api.annotation.Observes;

import java.util.Map;

public class BangaloreConfigurator {

    @Inject
    @ApplicationScoped
    InstanceProducer<BangaloreConfiguration> bangaloreConfigurationInstanceProducer;

    public void configure(@Observes ArquillianDescriptor arquillianDescriptor) {

        final Map<String, String> f2f = arquillianDescriptor.extension("f2f").getExtensionProperties();
        final BangaloreConfiguration bangaloreConfiguration = BangaloreConfiguration.fromMap(f2f);

        bangaloreConfigurationInstanceProducer.set(bangaloreConfiguration);
    }

}
