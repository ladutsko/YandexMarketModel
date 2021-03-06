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
public class Product implements Serializable {

    private static final long serialVersionUID = 734211048605031631L;

    @JacksonXmlProperty(localName = "offer-id", isAttribute = true)
    private String offerId;
    @JacksonXmlProperty(localName = "category-id", isAttribute = true)
    private Long categoryId;
    @JacksonXmlProperty(localName = "discount-price")
    private DiscountPrice discountPrice;

    public String getOfferId() {
        return offerId;
    }

    public Product setOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public Product setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public DiscountPrice getDiscountPrice() {
        return discountPrice;
    }

    public Product setDiscountPrice(DiscountPrice discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
}
