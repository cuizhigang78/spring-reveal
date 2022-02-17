package com.cui;

import com.cui.exception.FXNewsRetrieveFailureException;
import org.apache.commons.lang3.ArrayUtils;

public class FXNewsProvider {

    private IFXNewsListener newsListener;
    private IFXNewsPersister newPersistener;

    public FXNewsProvider() {
    }

    /**
     * 构造器 —— 构造方法注入
     * @param newsListener
     * @param newPersistener
     */
    public FXNewsProvider(IFXNewsListener newsListener, IFXNewsPersister newPersistener) {
        this.newsListener = newsListener;
        this.newPersistener = newPersistener;
    }

    /**
     * setXXX —— setter 方法注入
     * @param newsListener
     */
    public void setNewsListener(IFXNewsListener newsListener) { this.newsListener = newsListener; }

    public void setNewPersistener(IFXNewsPersister newPersistener) { this.newPersistener = newPersistener; }

    public void getAndPersistNews() throws FXNewsRetrieveFailureException {
        String[] newsIds = newsListener.getAvailableNewsIds();
        if (ArrayUtils.isEmpty(newsIds)) {
            return;
        }
        for (String newsId : newsIds) {
            // 抓取新闻内容
            FXNewsBean newsBean = newsListener.getNewsByPK(newsId);
            // 存储抓取的新闻
            newPersistener.persistNews(newsBean);
            newsListener.postProcessIfNecessary(newsId);
        }
    }
}
