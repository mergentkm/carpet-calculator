package com.carpetcalculator.interfaces.carpetPrices;

import com.carpetcalculator.enums.City;

import java.math.BigDecimal;

public interface Carpet {

    BigDecimal getSqFtPrice(City city);

}
