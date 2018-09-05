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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import java.io.Serializable;

/**
 * Created by George Ladutsko on 8/29/2018.
 */
public class Discount implements Serializable {

    private static final long serialVersionUID = -3134068952105674652L;

    @JacksonXmlProperty(isAttribute = true)
    @JsonProperty(required = true)
    private String unit;
    @JacksonXmlProperty(isAttribute = true)
    private String currency;
    @JacksonXmlText
    @JsonProperty(required = true)
    private Double value;

    public String getUnit() {
        return unit;
    }

    public Discount setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public Discount setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public Discount setValue(Double value) {
        this.value = value;
        return this;
    }
}
