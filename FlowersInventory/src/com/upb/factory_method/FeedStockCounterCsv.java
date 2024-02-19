package com.upb.factory_method;

public class FeedStockCounterCsv extends FeedStockCounter {
    @Override
    protected FeedParser buildParser() {
        return new FeedParserCsv();
    }
}
