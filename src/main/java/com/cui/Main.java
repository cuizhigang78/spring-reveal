package com.cui;

import com.cui.exception.FXNewsRetrieveFailureException;
import com.cui.impl.DowJonesNewsListener;

public class Main {
    public static void main(String[] args) throws FXNewsRetrieveFailureException {

        IoContainer container = new IoContainer<>();
        container.register(FXNewsProvider.class, new FXNewsProvider());
        container.register(IFXNewsListener.class, new DowJonesNewsListener());

        FXNewsProvider newsProvider = (FXNewsProvider) container.get(FXNewsProvider.class);
        newsProvider.getAndPersistNews();
    }
}
