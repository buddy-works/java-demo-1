package works.buddy.templates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import works.buddy.templates.CalcResult;
import works.buddy.templates.Calculator;

@RestController
public class CalcController {

    @Autowired
    private Calculator calculator;


    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/sum")
    public CalcResult sum(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return calculator.sum(a, b);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/subtract")
    public CalcResult subtract(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return calculator.subtract(a, b);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/multiply")
    public CalcResult multiply(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return calculator.multiply(a, b);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/divide")
    public CalcResult divide(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return calculator.divide(a, b);
    }

}
