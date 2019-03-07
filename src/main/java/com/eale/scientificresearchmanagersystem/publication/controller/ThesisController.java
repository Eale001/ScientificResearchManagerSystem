package com.eale.scientificresearchmanagersystem.publication.controller;

import com.eale.scientificresearchmanagersystem.publication.service.ThesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 论文管理
 */
@Controller
@RequestMapping("/thesiscontroller")
public class ThesisController {

    @Autowired
    private ThesisService thesisService;

    @RequestMapping(params = "thesisApply")
    public String thesisApply(){
        return "";
    }



}
