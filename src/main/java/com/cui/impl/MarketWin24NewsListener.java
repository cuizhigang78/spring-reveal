package com.cui.impl;

import com.cui.FXNewsBean;
import com.cui.IFXNewsListener;
import com.cui.exception.FXNewsRetrieveFailureException;

public class MarketWin24NewsListener implements IFXNewsListener {
    @Override
    public String[] getAvailableNewsIds() throws FXNewsRetrieveFailureException {
        return new String[0];
    }

    @Override
    public FXNewsBean getNewsByPK(String newsId) {
        return null;
    }

    @Override
    public void postProcessIfNecessary(String newsId) {

    }
}
