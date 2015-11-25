package ecbp.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Eric on 11/25/2015.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/offerView")
    public String page(){
        return "html/offer";
    }
}
