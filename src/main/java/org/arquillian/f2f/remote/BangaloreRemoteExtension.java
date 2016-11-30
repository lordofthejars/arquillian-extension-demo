package org.arquillian.f2f.remote;

import org.arquillian.f2f.HelloBangaloreObserver;
import org.jboss.arquillian.container.test.spi.RemoteLoadableExtension;

public class BangaloreRemoteExtension implements RemoteLoadableExtension {

    public void register(ExtensionBuilder builder) {
        builder.observer(HelloBangaloreObserver.class);
    }

}
