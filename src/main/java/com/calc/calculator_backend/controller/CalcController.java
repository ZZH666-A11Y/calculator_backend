package com.calc.calculator_backend.controller;

import com.calc.calculator_backend.dto.CalcDTO;
import com.calc.calculator_backend.dto.CalcResp;
import com.calc.calculator_backend.entity.CalcRecord;
import com.calc.calculator_backend.service.CalcService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calc")
@CrossOrigin
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @PostMapping
    public CalcResp calc(@RequestBody CalcDTO calcDTO) {
        CalcRecord record = calcService.calculate(calcDTO.getExpression());
        CalcResp resp = new CalcResp();
        resp.setExpression(record.getExpression());
        resp.setResult(record.getResult());
        return resp;
    }

    @GetMapping("/history")
    public List<CalcRecord> getHistory() {
        return calcService.getAllHistory();
    }
}
