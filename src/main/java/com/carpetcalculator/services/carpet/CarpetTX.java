package com.carpetcalculator.services.carpet;

import com.carpetcalculator.enums.City;
import com.carpetcalculator.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {

    private static final Map<City,BigDecimal> mapOfUnitPricesPerCity = new HashMap<>();

    static {
        mapOfUnitPricesPerCity.put(City.AUSTIN, new BigDecimal("1.32"));
        mapOfUnitPricesPerCity.put(City.DALLAS, new BigDecimal("1.75"));
        mapOfUnitPricesPerCity.put(City.SAN_ANTONIO, new BigDecimal("2.20"));
    }


    @Override
    public BigDecimal getSqFtPrice(City city) {

        BigDecimal defaultValue = BigDecimal.ZERO;

        // Get the map
        Optional<Map.Entry<City, BigDecimal>> filteredMap = mapOfUnitPricesPerCity.entrySet().stream().
                filter(x -> x.getKey() == city).findFirst();

        // If there is a value then return, otherwise return the default value
        return filteredMap.isPresent() ? filteredMap.get().getValue() : defaultValue;
    }
}
