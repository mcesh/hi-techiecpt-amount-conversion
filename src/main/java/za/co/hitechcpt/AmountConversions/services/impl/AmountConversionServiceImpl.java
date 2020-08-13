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

    @Override
    public float convertMilesToKm(double distanceInMiles) {
        float kilometers = (float) (distanceInMiles * 1.60934);
        getLog().info("Distance in Kilometers: {} " , kilometers);
        return kilometers;
    }

    @Override
    public float convertKmToMiles(double distanceInKm) {
        float miles = (float) (distanceInKm * 0.6214);
        getLog().info("Distance in Miles: {} " , miles);
        return miles;
    }

    public static Logger getLog() {
        return LOGGER;
    }
}
