package works.buddy.templates;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public CalcResult sum(int a, int b) {
        return new CalcResult(a + b);
    }

    public CalcResult subtract(int a, int b) {
        return new CalcResult(a - b);
    }

    public CalcResult multiply(int a, int b) {
        return new CalcResult(a * b);
    }

    public CalcResult divide(int a, int b) {
        return new CalcResult(a / b);
    }

}
