package org.arquillian.f2f;

import org.jboss.arquillian.core.spi.LoadableExtension;

public class BangaloreExtension implements LoadableExtension {
    public void register(ExtensionBuilder extensionBuilder) {
        extensionBuilder.observer(HelloBangaloreObserver.class);
    }
}
