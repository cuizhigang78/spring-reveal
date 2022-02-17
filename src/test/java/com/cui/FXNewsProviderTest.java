package com.cui;

import com.cui.exception.FXNewsRetrieveFailureException;
import com.cui.impl.MockNewsListener;
import com.cui.impl.MockNewsPersister;
import junit.framework.TestCase;

public class FXNewsProviderTest extends TestCase {
    private FXNewsProvider newsProvider;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        newsProvider = new FXNewsProvider(new MockNewsListener(), new MockNewsPersister());
    }

    @Override
    protected void tearDown() throws Exception {
        newsProvider = null;
        super.tearDown();
    }

    public void testGetAndPersistNewsWithoutResourceAvailable() {
        try {
            newsProvider.getAndPersistNews();
            fail("Since MockNewsListener has no news support, we should fail to get above.");
        } catch (FXNewsRetrieveFailureException e) {
            //……
        }
    }
}