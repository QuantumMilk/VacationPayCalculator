package com.company.VacationPayCalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {
    public double GetVacationPay(int averageSalary, int vacationDays){
        return averageSalary/29.3 * vacationDays;
    }
}
