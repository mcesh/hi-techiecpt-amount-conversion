package za.co.hitechcpt.AmountConversions.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import za.co.hitechcpt.AmountConversions.services.AmountConversionService;

@Service
public class AmountConversionServiceImpl implements AmountConversionService {

    private static Logger LOGGER = LoggerFactory.getLogger(AmountConversionServiceImpl.class);

    @Override
    public String convertKelvinToCelsius(double kelvin) {
        float celsius = (float) (kelvin - 273.15);
        getLog().info("Celsius is: {} ", celsius);
        return celsius + "C";
    }

    @Override
    public String convertCelsiusToKelvin(float celsius) {
        float kelvin = (float) (celsius + 273.15);
        getLog().info("Converted Celsius to Kelvin: {} ", kelvin);
        return kelvin + "K";
    }

    public static Logger getLog() {
        return LOGGER;
    }
}
