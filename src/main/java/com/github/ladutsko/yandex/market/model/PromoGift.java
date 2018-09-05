/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 George Ladutsko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.github.ladutsko.yandex.market.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;

/**
 * Created by George Ladutsko on 8/29/2018.
 */
public class PromoGift implements Serializable {

    private static final long serialVersionUID = -2729105662349973229L;

    @JacksonXmlProperty(localName = "offer-id", isAttribute = true)
    private String offerId;
    @JacksonXmlProperty(localName = "gift-id", isAttribute = true)
    private String giftId;

    public String getOfferId() {
        return offerId;
    }

    public PromoGift setOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    public String getGiftId() {
        return giftId;
    }

    public PromoGift setGiftId(String giftId) {
        this.giftId = giftId;
        return this;
    }
}
