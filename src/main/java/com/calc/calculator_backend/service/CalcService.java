package com.calc.calculator_backend.service;

import com.calc.calculator_backend.entity.CalcRecord;
import com.calc.calculator_backend.repository.CalcRecordRepository;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalcService {

    private final CalcRecordRepository calcRecordRepository;

    public CalcService(CalcRecordRepository calcRecordRepository) {
        this.calcRecordRepository = calcRecordRepository;
    }

    public CalcRecord calculate(String expr) {
        Expression expression = new ExpressionBuilder(expr).build();
        double res = expression.evaluate();

        CalcRecord record = new CalcRecord();
        record.setExpression(expr);
        record.setResult(String.valueOf(res));
        return calcRecordRepository.save(record);
    }

    public List<CalcRecord> getAllHistory() {
        return calcRecordRepository.findAll();
    }
}
