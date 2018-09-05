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

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;

import java.io.IOException;

/**
 * Created by George Ladutsko on 8/29/2018.
 */
public class VatEnumDeserializer extends StdScalarDeserializer<VatEnum> {

    private static final VatEnum[] VAT_ENUM_VALUES = VatEnum.values();

    public VatEnumDeserializer() {
        this(VatEnum.class);
    }

    protected VatEnumDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public VatEnum deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonToken curr = p.getCurrentToken();
        switch (curr) {
            // Usually should just get string value:
            case VALUE_STRING:
            case FIELD_NAME:
                return VatEnum.valueOf(p.getText());

            // But let's consider int acceptable as well (if within ordinal range)
            case VALUE_NUMBER_INT:
                int index = p.getIntValue()-1;
                if (0 > index || VAT_ENUM_VALUES.length <= index) {
                    return null;
                }

                return VAT_ENUM_VALUES[index];
        }

        return null;
    }
}
