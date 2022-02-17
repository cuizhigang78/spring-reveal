package com.cui.impl;


import com.cui.FXNewsBean;
import com.cui.IFXNewsListener;
import com.cui.exception.FXNewsRetrieveFailureException;

public class MockNewsListener implements IFXNewsListener {
    @Override
    public String[] getAvailableNewsIds() throws FXNewsRetrieveFailureException {
        throw new FXNewsRetrieveFailureException();
    }

    @Override
    public FXNewsBean getNewsByPK(String newsId) {
        // TODO
        return null;
    }

    @Override
    public void postProcessIfNecessary(String newsId) {
        // TODO
    }
}
