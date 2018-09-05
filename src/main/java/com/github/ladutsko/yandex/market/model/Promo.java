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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by George Ladutsko on 8/29/2018.
 */
public class Promo implements Serializable {

    private static final long serialVersionUID = -3595007785036167608L;

    @JacksonXmlProperty(isAttribute = true)
    @JsonProperty(required = true)
    private String id;
    @JacksonXmlProperty(isAttribute = true)
    @JsonProperty(required = true)
    private String type;
    @JacksonXmlProperty(localName = "start-date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startDate;
    @JacksonXmlProperty(localName = "end-date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endDate;
    @JacksonXmlCData
    private String description;

    private String url;

    @JacksonXmlProperty(localName = "promo-code")
    private String promoCode;

    private Discount discount;

    @JsonProperty(required = true)
    private Purchase purchase;
    @JacksonXmlElementWrapper(localName = "promo-gifts")
    @JacksonXmlProperty(localName = "promo-gift")
    private List<PromoGift> promoGifts;

    public String getId() {
        return id;
    }

    public Promo setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Promo setType(String type) {
        this.type = type;
        return this;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public Promo setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Promo setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Promo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Promo setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public Promo setPromoCode(String promoCode) {
        this.promoCode = promoCode;
        return this;
    }

    public Discount getDiscount() {
        return discount;
    }

    public Promo setDiscount(Discount discount) {
        this.discount = discount;
        return this;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public Promo setPurchase(Purchase purchase) {
        this.purchase = purchase;
        return this;
    }

    public List<PromoGift> getPromoGifts() {
        return promoGifts;
    }

    public Promo setPromoGifts(List<PromoGift> promoGifts) {
        this.promoGifts = promoGifts;
        return this;
    }
}
