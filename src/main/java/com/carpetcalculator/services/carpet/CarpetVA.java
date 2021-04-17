package com.carpetcalculator.services.carpet;

import com.carpetcalculator.enums.City;
import com.carpetcalculator.interfaces.carpetPrices.Carpet;

import java.math.BigDecimal;

public class CarpetVA implements Carpet {
    @Override
    public BigDecimal getSqFtPrice(City city) {
        return null;
    }
}
