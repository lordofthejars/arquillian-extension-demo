package org.arquillian.f2f;

import org.arquillian.f2f.remote.BangaloreArchiveAppender;
import org.jboss.arquillian.container.test.spi.client.deployment.AuxiliaryArchiveAppender;
import org.jboss.arquillian.core.spi.LoadableExtension;

public class BangaloreExtension implements LoadableExtension {
    public void register(ExtensionBuilder extensionBuilder) {
        extensionBuilder.observer(HelloBangaloreObserver.class)
                .observer(BangaloreConfigurator.class)
                .service(AuxiliaryArchiveAppender.class, BangaloreArchiveAppender.class);
    }
}
