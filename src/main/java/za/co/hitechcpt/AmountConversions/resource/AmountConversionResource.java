package za.co.hitechcpt.AmountConversions.resource;

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
@RequestMapping("conversions") // http://localhost:8080/users/web-apps-platform
public class AmountConversionResource {
    private static Logger LOGGER = LoggerFactory.getLogger(AmountConversionResource.class);

    public static Logger getLog() {
        return LOGGER;
    }
    @Autowired
    private AmountConversionService conversionService;

    @GetMapping(path = "/ktoc/{kelvin}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String convertKelvinToCelsius(@PathVariable double kelvin){
       return conversionService.convertKelvinToCelsius(kelvin);
    }
}
