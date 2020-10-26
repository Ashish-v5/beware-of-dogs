package com.epam.lab;

import java.util.ArrayList;
import java.util.List;


public class House {

    private final List residents = new ArrayList();

    public void enter(Object resident) {
        residents.add(resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("В доме находятся:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }
}
