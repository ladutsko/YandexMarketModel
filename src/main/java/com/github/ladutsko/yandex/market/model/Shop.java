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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by George Ladutsko on 8/28/2018.
 */
public class Shop implements Serializable {

    private static final long serialVersionUID = 6028962526954561551L;

    @JsonProperty(required = true)
    private String name;
    @JsonProperty(required = true)
    private String company;
    @JsonProperty(required = true)
    private String url;

    private String platform;
    private String version;
    private String agency;
    private String email;
    private Boolean adult;

    @JacksonXmlElementWrapper(localName = "currencies")
    @JacksonXmlProperty(localName = "currency")
    @JsonProperty(required = true)
    private List<Currency> currencies;
    @JacksonXmlElementWrapper(localName = "categories")
    @JacksonXmlProperty(localName = "category")
    @JsonProperty(required = true)
    private List<Category> categories;
    @JacksonXmlElementWrapper(localName = "delivery-options")
    @JacksonXmlProperty(localName = "option")
    private List<DeliveryOption> deliveryOptions;
    @JacksonXmlProperty(localName = "enable_auto_discounts")
    @JsonDeserialize(using = EnableAutoDiscountsDeserializer.class)
    private Boolean enableAutoDiscounts;
    @JacksonXmlElementWrapper(localName = "offers")
    @JacksonXmlProperty(localName = "offer")
    @JsonProperty(required = true)
    private List<Offer> offers;
    @JacksonXmlElementWrapper(localName = "gifts")
    @JacksonXmlProperty(localName = "gift")
    private List<Gift> gifts;
    @JacksonXmlElementWrapper(localName = "promos")
    @JacksonXmlProperty(localName = "promo")
    private List<Promo> promos;

    public String getName() {
        return name;
    }

    public Shop setName(String name) {
        this.name = name;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Shop setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Shop setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public Shop setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public Shop setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getAgency() {
        return agency;
    }

    public Shop setAgency(String agency) {
        this.agency = agency;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Shop setEmail(String email) {
        this.email = email;
        return this;
    }

    public Boolean getAdult() {
        return adult;
    }

    public Shop setAdult(Boolean adult) {
        this.adult = adult;
        return this;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public Shop setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
        return this;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public Shop setCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public List<DeliveryOption> getDeliveryOptions() {
        return deliveryOptions;
    }

    public Shop setDeliveryOptions(List<DeliveryOption> deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
        return this;
    }

    public Boolean getEnableAutoDiscounts() {
        return enableAutoDiscounts;
    }

    public Shop setEnableAutoDiscounts(Boolean enableAutoDiscounts) {
        this.enableAutoDiscounts = enableAutoDiscounts;
        return this;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public Shop setOffers(List<Offer> offers) {
        this.offers = offers;
        return this;
    }

    public List<Gift> getGifts() {
        return gifts;
    }

    public Shop setGifts(List<Gift> gifts) {
        this.gifts = gifts;
        return this;
    }

    public List<Promo> getPromos() {
        return promos;
    }

    public Shop setPromos(List<Promo> promos) {
        this.promos = promos;
        return this;
    }
}
