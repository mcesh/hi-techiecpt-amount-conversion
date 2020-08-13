package za.co.hitechcpt.AmountConversions.services.impl;

import org.springframework.stereotype.Service;
import za.co.hitechcpt.AmountConversions.services.AmountConversionService;
@Service
public class AmountConversionServiceImpl implements AmountConversionService {
    @Override
    public String convertKelvinToCelsius(double kelvin) {
        double celsius = (kelvin - 273.15);
        return celsius + "C";
    }
}
