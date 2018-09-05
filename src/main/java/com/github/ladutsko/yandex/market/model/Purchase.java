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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by George Ladutsko on 8/29/2018.
 */
public class Purchase implements Serializable {

    private static final long serialVersionUID = 8683209051896658183L;

    @JacksonXmlProperty(localName = "required-quantity")
    private Integer requiredQuantity;
    @JacksonXmlProperty(localName = "free-quantity")
    private Integer freeQuantity;
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "product")
    @JsonProperty(required = true)
    private List<Product> products;

    public Integer getRequiredQuantity() {
        return requiredQuantity;
    }

    public Purchase setRequiredQuantity(Integer requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
        return this;
    }

    public Integer getFreeQuantity() {
        return freeQuantity;
    }

    public Purchase setFreeQuantity(Integer freeQuantity) {
        this.freeQuantity = freeQuantity;
        return this;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Purchase setProducts(List<Product> products) {
        this.products = products;
        return this;
    }
}
