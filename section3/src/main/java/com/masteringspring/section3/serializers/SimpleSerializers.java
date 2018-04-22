package com.masteringspring.section3.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.masteringspring.section3.dto.Order;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.boot.jackson.JsonObjectSerializer;

import java.io.IOException;

@JsonComponent
public class SimpleSerializers {
    public static class OrderSerializer extends JsonObjectSerializer<Order> {

        /**
         * Serialize JSON content into the value type this serializer handles.
         *
         * @param value    the source value
         * @param jgen     the JSON generator
         * @param provider the serializer provider
         * @throws IOException on error
         */
        @Override
        protected void serializeObject(Order value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            jgen.writeStringField("LastName", value.getCustomer().getLastName());
            jgen.writeStringField("FirstName", value.getCustomer().getFirstName());
            jgen.writeNumberField("amount", value.getQuantity());
            jgen.writeStringField("Product", value.getProductName());
        }
    }
}
