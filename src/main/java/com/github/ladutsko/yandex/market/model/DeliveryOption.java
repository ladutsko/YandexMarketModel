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
 * Created by George Ladutsko on 8/28/2018.
 */
public class DeliveryOption implements Serializable {

    private static final long serialVersionUID = -4896372201696663389L;

    @JacksonXmlProperty(isAttribute = true)
    private Integer cost;
    @JacksonXmlProperty(isAttribute = true)
    private Integer days;
    @JacksonXmlProperty(localName = "order-before", isAttribute = true)
    private Integer orderBefore;

    public Integer getCost() {
        return cost;
    }

    public DeliveryOption setCost(Integer cost) {
        this.cost = cost;
        return this;
    }

    public Integer getDays() {
        return days;
    }

    public DeliveryOption setDays(Integer days) {
        this.days = days;
        return this;
    }

    public Integer getOrderBefore() {
        return orderBefore;
    }

    public DeliveryOption setOrderBefore(Integer orderBefore) {
        this.orderBefore = orderBefore;
        return this;
    }
}
