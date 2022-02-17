package com.cui;

import com.cui.exception.FXNewsRetrieveFailureException;

public interface IFXNewsListener {
    public String[] getAvailableNewsIds() throws FXNewsRetrieveFailureException;

    public FXNewsBean getNewsByPK(String newsId);

    public void postProcessIfNecessary(String newsId);
}
