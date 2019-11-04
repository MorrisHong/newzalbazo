package kr.zalbazo.newzalbazo.controller;

import kr.zalbazo.newzalbazo.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("/hi")
    @ResponseBody
    public String hi() {
        return "hi " +sampleService.getName() + " : " + sampleService.now();
    }
}
