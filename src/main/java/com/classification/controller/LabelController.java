package com.classification.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LabelController {
    @RequestMapping("/labelList")
    public  String getLabelList(){
        return  "labelList";
    }
}
