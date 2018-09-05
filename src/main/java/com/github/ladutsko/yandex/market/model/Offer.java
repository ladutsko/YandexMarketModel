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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;

/**
 * Created by George Ladutsko on 8/28/2018.
 */
public class Offer implements Serializable {

    private static final long serialVersionUID = -5254662019696902748L;

    // Common

    @JacksonXmlProperty(isAttribute = true)
    @JsonProperty(required = true)
    private String id;
    @JacksonXmlProperty(isAttribute = true)
    private String type;
    @JacksonXmlProperty(isAttribute = true)
    private String cbid;
    @JacksonXmlProperty(isAttribute = true)
    private String bid;
    @JacksonXmlProperty(isAttribute = true)
    private Boolean available;

    private String name;
    private String model;
    private String vendor;
    private String vendorCode;
    private String typePrefix;

    @JsonProperty(required = true)
    private String url;
    @JsonProperty(required = true)
    private Price price;
    @JacksonXmlProperty(localName = "enable_auto_discounts")
    @JsonDeserialize(using = EnableAutoDiscountsDeserializer.class)
    private Boolean enableAutoDiscounts;

    private Double oldprice;

    @JsonSerialize(using = VatEnumSerializer.class)
    @JsonDeserialize(using = VatEnumDeserializer.class)
    private VatEnum vat;
    @JsonProperty(required = true)
    private String currencyId;
    @JsonProperty(required = true)
    private Long categoryId;
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "picture")
    private List<String> pictures;

    private Boolean delivery;

    @JacksonXmlElementWrapper(localName = "delivery-options")
    @JacksonXmlProperty(localName = "option")
    private List<DeliveryOption> deliveryOptions;

    private Boolean pickup;
    private Boolean store;

    @JacksonXmlCData
    private String description;
    @JacksonXmlProperty(localName = "sales_notes")
    private String salesNotes;
    @JacksonXmlProperty(localName = "manufacturer_warranty")
    private Boolean manufacturerWarranty;
    @JacksonXmlProperty(localName = "country_of_origin")
    private String countryOfOrigin;

    private Boolean adult;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "barcode")
    private List<String> barcodes;
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "param")
    private List<Param> params;

    private Period expiry;
    private Float weight;
    private String dimensions;
    private Boolean downloadable;
    private Age age;

    @JacksonXmlProperty(localName = "group_id")
    private Integer groupId;

    // Book

    private String publisher;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "ISBN")
    @JsonDeserialize(using = IsbnDeserializer.class)
    @JsonSerialize(using = IsbnSerializer.class)
    private List<String> isbns;

    private String author;
    private String series;
    private Integer year;
    private Integer volume;
    private Integer part;
    private String language;

    @JacksonXmlProperty(localName = "table_of_contents")
    private String tableOfContents;

    private String binding;

    @JacksonXmlProperty(localName = "page_extent")
    private Integer pageExtent;

    // Audiobook

    @JacksonXmlProperty(localName = "performed_by")
    private String performedBy;
    @JacksonXmlProperty(localName = "performance_type")
    private String performanceType;

    private String storage;
    private String format;

    @JacksonXmlProperty(localName = "recording_length")
    @JsonSerialize(using = RecordingLengthSerializer.class)
    @JsonDeserialize(using = RecordingLengthDeserializer.class)
    private Duration recordingLength;

    // Audio/Video

    private String artist;
    private String title;
    private String media;
    private String starring;
    private String director;
    private String originalName;
    private String country;

    // Ticket

    private String place;
    private String hall;

    @JacksonXmlProperty(localName = "hall_part")
    private String hallPart;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date;
    @JacksonXmlProperty(localName = "is_premiere")
    private Boolean premiere;
    @JacksonXmlProperty(localName = "is_kids")
    private Boolean kids;

    // Tour

    private String worldRegion;
    private String region;
    private Integer days;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataTour;
    @JacksonXmlProperty(localName = "hotel_stars")
    private String hotelStars;

    private String room;
    private String meal;
    private String included;
    private String transport;

    @JacksonXmlProperty(localName = "price_min")
    private Double priceMin;
    @JacksonXmlProperty(localName = "price_max")
    private Double priceMax;

    private String options;

    public String getId() {
        return id;
    }

    public Offer setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Offer setType(String type) {
        this.type = type;
        return this;
    }

    public String getCbid() {
        return cbid;
    }

    public Offer setCbid(String cbid) {
        this.cbid = cbid;
        return this;
    }

    public String getBid() {
        return bid;
    }

    public Offer setBid(String bid) {
        this.bid = bid;
        return this;
    }

    public Boolean getAvailable() {
        return available;
    }

    public Offer setAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    public String getName() {
        return name;
    }

    public Offer setName(String name) {
        this.name = name;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Offer setModel(String model) {
        this.model = model;
        return this;
    }

    public String getVendor() {
        return vendor;
    }

    public Offer setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public Offer setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }

    public String getTypePrefix() {
        return typePrefix;
    }

    public Offer setTypePrefix(String typePrefix) {
        this.typePrefix = typePrefix;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Offer setUrl(String url) {
        this.url = url;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public Offer setPrice(Price price) {
        this.price = price;
        return this;
    }

    public Boolean getEnableAutoDiscounts() {
        return enableAutoDiscounts;
    }

    public Offer setEnableAutoDiscounts(Boolean enableAutoDiscounts) {
        this.enableAutoDiscounts = enableAutoDiscounts;
        return this;
    }

    public Double getOldprice() {
        return oldprice;
    }

    public Offer setOldprice(Double oldprice) {
        this.oldprice = oldprice;
        return this;
    }

    public VatEnum getVat() {
        return vat;
    }

    public Offer setVat(VatEnum vat) {
        this.vat = vat;
        return this;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public Offer setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public Offer setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public Offer setPictures(List<String> pictures) {
        this.pictures = pictures;
        return this;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public Offer setDelivery(Boolean delivery) {
        this.delivery = delivery;
        return this;
    }

    public List<DeliveryOption> getDeliveryOptions() {
        return deliveryOptions;
    }

    public Offer setDeliveryOptions(List<DeliveryOption> deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
        return this;
    }

    public Boolean getPickup() {
        return pickup;
    }

    public Offer setPickup(Boolean pickup) {
        this.pickup = pickup;
        return this;
    }

    public Boolean getStore() {
        return store;
    }

    public Offer setStore(Boolean store) {
        this.store = store;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Offer setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getSalesNotes() {
        return salesNotes;
    }

    public Offer setSalesNotes(String salesNotes) {
        this.salesNotes = salesNotes;
        return this;
    }

    public Boolean getManufacturerWarranty() {
        return manufacturerWarranty;
    }

    public Offer setManufacturerWarranty(Boolean manufacturerWarranty) {
        this.manufacturerWarranty = manufacturerWarranty;
        return this;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public Offer setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
        return this;
    }

    public Boolean getAdult() {
        return adult;
    }

    public Offer setAdult(Boolean adult) {
        this.adult = adult;
        return this;
    }

    public List<String> getBarcodes() {
        return barcodes;
    }

    public Offer setBarcodes(List<String> barcodes) {
        this.barcodes = barcodes;
        return this;
    }

    public List<Param> getParams() {
        return params;
    }

    public Offer setParams(List<Param> params) {
        this.params = params;
        return this;
    }

    public Period getExpiry() {
        return expiry;
    }

    public Offer setExpiry(Period expiry) {
        this.expiry = expiry;
        return this;
    }

    public Float getWeight() {
        return weight;
    }

    public Offer setWeight(Float weight) {
        this.weight = weight;
        return this;
    }

    public String getDimensions() {
        return dimensions;
    }

    public Offer setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public Boolean getDownloadable() {
        return downloadable;
    }

    public Offer setDownloadable(Boolean downloadable) {
        this.downloadable = downloadable;
        return this;
    }

    public Age getAge() {
        return age;
    }

    public Offer setAge(Age age) {
        this.age = age;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Offer setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Offer setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public List<String> getIsbns() {
        return isbns;
    }

    public Offer setIsbns(List<String> isbns) {
        this.isbns = isbns;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Offer setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getSeries() {
        return series;
    }

    public Offer setSeries(String series) {
        this.series = series;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public Offer setYear(Integer year) {
        this.year = year;
        return this;
    }

    public Integer getVolume() {
        return volume;
    }

    public Offer setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    public Integer getPart() {
        return part;
    }

    public Offer setPart(Integer part) {
        this.part = part;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Offer setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getTableOfContents() {
        return tableOfContents;
    }

    public Offer setTableOfContents(String tableOfContents) {
        this.tableOfContents = tableOfContents;
        return this;
    }

    public String getBinding() {
        return binding;
    }

    public Offer setBinding(String binding) {
        this.binding = binding;
        return this;
    }

    public Integer getPageExtent() {
        return pageExtent;
    }

    public Offer setPageExtent(Integer pageExtent) {
        this.pageExtent = pageExtent;
        return this;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public Offer setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
        return this;
    }

    public String getPerformanceType() {
        return performanceType;
    }

    public Offer setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
        return this;
    }

    public String getStorage() {
        return storage;
    }

    public Offer setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public Offer setFormat(String format) {
        this.format = format;
        return this;
    }

    public Duration getRecordingLength() {
        return recordingLength;
    }

    public Offer setRecordingLength(Duration recordingLength) {
        this.recordingLength = recordingLength;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public Offer setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Offer setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getMedia() {
        return media;
    }

    public Offer setMedia(String media) {
        this.media = media;
        return this;
    }

    public String getStarring() {
        return starring;
    }

    public Offer setStarring(String starring) {
        this.starring = starring;
        return this;
    }

    public String getDirector() {
        return director;
    }

    public Offer setDirector(String director) {
        this.director = director;
        return this;
    }

    public String getOriginalName() {
        return originalName;
    }

    public Offer setOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Offer setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public Offer setPlace(String place) {
        this.place = place;
        return this;
    }

    public String getHall() {
        return hall;
    }

    public Offer setHall(String hall) {
        this.hall = hall;
        return this;
    }

    public String getHallPart() {
        return hallPart;
    }

    public Offer setHallPart(String hallPart) {
        this.hallPart = hallPart;
        return this;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Offer setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public Boolean getPremiere() {
        return premiere;
    }

    public Offer setPremiere(Boolean premiere) {
        this.premiere = premiere;
        return this;
    }

    public Boolean getKids() {
        return kids;
    }

    public Offer setKids(Boolean kids) {
        this.kids = kids;
        return this;
    }

    public String getWorldRegion() {
        return worldRegion;
    }

    public Offer setWorldRegion(String worldRegion) {
        this.worldRegion = worldRegion;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public Offer setRegion(String region) {
        this.region = region;
        return this;
    }

    public Integer getDays() {
        return days;
    }

    public Offer setDays(Integer days) {
        this.days = days;
        return this;
    }

    public LocalDateTime getDataTour() {
        return dataTour;
    }

    public Offer setDataTour(LocalDateTime dataTour) {
        this.dataTour = dataTour;
        return this;
    }

    public String getHotelStars() {
        return hotelStars;
    }

    public Offer setHotelStars(String hotelStars) {
        this.hotelStars = hotelStars;
        return this;
    }

    public String getRoom() {
        return room;
    }

    public Offer setRoom(String room) {
        this.room = room;
        return this;
    }

    public String getMeal() {
        return meal;
    }

    public Offer setMeal(String meal) {
        this.meal = meal;
        return this;
    }

    public String getIncluded() {
        return included;
    }

    public Offer setIncluded(String included) {
        this.included = included;
        return this;
    }

    public String getTransport() {
        return transport;
    }

    public Offer setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    public Double getPriceMin() {
        return priceMin;
    }

    public Offer setPriceMin(Double priceMin) {
        this.priceMin = priceMin;
        return this;
    }

    public Double getPriceMax() {
        return priceMax;
    }

    public Offer setPriceMax(Double priceMax) {
        this.priceMax = priceMax;
        return this;
    }

    public String getOptions() {
        return options;
    }

    public Offer setOptions(String options) {
        this.options = options;
        return this;
    }
}
