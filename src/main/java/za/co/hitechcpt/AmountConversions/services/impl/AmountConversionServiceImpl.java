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
        double celsius = (kelvin - 273.15);
        getLog().info("Celsius is: {} ", celsius);
        return celsius + "C";
    }

    public static Logger getLog() {
        return LOGGER;
    }
}
