package com.epam.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

class HouseTest {

    @Test
    void shouldCheckGenericTypeParameters() {
        Type[] houseTypes = House.class.getTypeParameters();
        Assertions.assertEquals(1, houseTypes.length);
        String houseType = houseTypes[0].getTypeName();
        try {
            Field field = House.class.getDeclaredField("residents");
            Assertions.assertEquals(field.getGenericType().getTypeName(), "java.util.List<" + houseType + ">");
        } catch (NoSuchFieldException e) {
            Assertions.fail("'House' class should contain 'residents' field");
        }
    }
}
