package org.arquillian.f2f.remote;

import org.arquillian.f2f.BangaloreConfiguration;
import org.arquillian.f2f.HelloBangaloreObserver;
import org.jboss.arquillian.container.test.spi.RemoteLoadableExtension;
import org.jboss.arquillian.container.test.spi.client.deployment.AuxiliaryArchiveAppender;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

public class BangaloreArchiveAppender implements AuxiliaryArchiveAppender {
    public Archive<?> createAuxiliaryArchive() {
        return ShrinkWrap.create(JavaArchive.class, "arquillian-banglore-extension.jar")
                .addClasses(HelloBangaloreObserver.class, BangaloreRemoteExtension.class, BangaloreConfiguration.class)
                .addAsServiceProvider(RemoteLoadableExtension.class, BangaloreRemoteExtension.class);
    }
}
