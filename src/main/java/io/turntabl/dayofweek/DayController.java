package io.turntabl.dayofweek;


import io.turntabl.dayofweek.model.DayMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class DayController {
    private static final String template = "Hello %s, it's %s!";

    @RequestMapping("/whatdayisit")
    public DayMessage whatDayIsIt(@RequestParam(value="name", defaultValue="World")String name){
        Date today = new Date();
        String day = new SimpleDateFormat("EEEE").format(today);
        return new DayMessage(String.format(template, name, day));
    }

}
