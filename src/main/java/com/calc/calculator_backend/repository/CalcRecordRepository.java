package com.calc.calculator_backend.repository;

import com.calc.calculator_backend.entity.CalcRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalcRecordRepository extends JpaRepository<CalcRecord, Long> {
}
