package za.co.hitechcpt.AmountConversions.resource;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.hitechcpt.AmountConversions.services.AmountConversionService;

@RestController
@RequestMapping("conversions")
public class AmountConversionResource {
    private static Logger LOGGER = LoggerFactory.getLogger(AmountConversionResource.class);

    public static Logger getLog() {
        return LOGGER;
    }
    @Autowired
    private AmountConversionService conversionService;

    @ApiOperation(value="Convert Kelvin Amount to Celsius Endpoint",
            notes="${userResource.KelvinToCelsius.ApiOperation.Notes}")
    @GetMapping(path = "/ktoc/{kelvin}", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String convertKelvinToCelsius(@PathVariable double kelvin){
        getLog().info("Converting Kelvin to Celsius {} ", kelvin);
       return conversionService.convertKelvinToCelsius(kelvin);
    }

    @ApiOperation(value="Convert Celsius Amount to Kelvin Endpoint",
            notes="${userResource.CelsiusToKelvin.ApiOperation.Notes}")
    @GetMapping(path = "/ctok/{celsius}", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String convertCelsiusToKelvin(@PathVariable float celsius){
        getLog().info("Converting Celsius to Kelvin {} ", celsius);
        return conversionService.convertCelsiusToKelvin(celsius);
    }

    @ApiOperation(value="Convert Miles to Kilometers Endpoint",
            notes="${userResource.MilesToKilometers.ApiOperation.Notes}")
    @GetMapping(path = "/mtok/{miles}", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String convertMilesToKm(@PathVariable double miles){
        getLog().info("Converting Miles to Kilometers {} ", miles);
        float milesToKm = conversionService.convertMilesToKm(miles);
        return milesToKm + "KM";

    }

    @ApiOperation(value="Convert Kilometers to Miles Endpoint",
            notes="${userResource.KilometersToMiles.ApiOperation.Notes}")
    @GetMapping(path = "/ktom/{km}", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String convertKmToMiles(@PathVariable double km){
        getLog().info("Converting Kilometers to Miles {} ", km);
        float kmToMiles = conversionService.convertKmToMiles(km);
        return kmToMiles + "Miles";

    }
}
