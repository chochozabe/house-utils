package com.whykk.houseutils.controller;

import com.whykk.houseutils.constants.ActionType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long CalcBrokerage(@RequestParam ActionType actionType, @RequestParam Long price) {
        return null;
    }
}
