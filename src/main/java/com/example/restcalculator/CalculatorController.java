package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// str k zum commiten
// str shift k zum pushen
// http://localhost:8080/sum?a=817234&b=19824


/*Workflow konfigurieren / Pipeline hinzugefügt
->commiten
in develop branch pushen
git hub actions -> Maven in Java -> start commit
dateiversion auf 17 ändern
maven.yml nennen
runterscrollen im Maven.yml -> Build success

yml datei bei code öffnen
 Füge hinzu:
 - run: mkdir download && cp target/*.jar download


    - name: Upload aBuild Artifact
      uses: actions/upload-artifact@v2
      with:
       name: Build
       path: download
dann commit -> brauch man nicht benennen



Pull Request

Develop branch auf Master branch pushen
sobald Pull request auf den Master branch geht wird maven ausgeführt
*/

@RestController
public class CalculatorController {
    private Calculator calculator = new Calculator();

    @RequestMapping("/sum")
    public int sum (
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.sum(a,b);
    }
    @RequestMapping("/min")
    public int min (
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.min(a,b);
    }

    @RequestMapping("/mul")
    public int mul (
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.mul(a,b);
    }
    @RequestMapping("/div")
    public int div (
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.div(a,b);
    }
    @RequestMapping("/expo")
    public int expo (
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.expo(a,b);
    }
}
