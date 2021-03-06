package za.co.hitechcpt.AmountConversions.services;

import org.springframework.stereotype.Service;

public interface AmountConversionService {

    String convertKelvinToCelsius(double kelvin);
    String convertCelsiusToKelvin(float celsius);
    float convertMilesToKm(double distanceInMiles);
    float convertKmToMiles(double distanceInKm);
}
