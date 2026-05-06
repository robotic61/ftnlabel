package com.forthems.ftnlabel.controller;


import com.forthems.ftnlabel.model.Ftn;
import com.forthems.ftnlabel.service.FtnService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FtnController {

    private final FtnService ftnService;

    public FtnController(FtnService ftnService) {
        this.ftnService = ftnService;
    }


    @GetMapping("/ftn/findbyftn")
    public Ftn findByFtnNo(@RequestParam String word) {
        return ftnService.findByFtnNo(word);
    }

    @GetMapping("/ftn/product")
    public void ftnLabelCreation(@RequestParam String num) {
        ftnService.ftnLabelCreation(num);
    }

}
