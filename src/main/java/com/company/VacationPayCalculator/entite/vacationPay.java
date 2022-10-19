package com.company.VacationPayCalculator.entite;

public class vacationPay {
    public vacationPay(int averageSalary, int vacationDays) {
        this.averageSalary = averageSalary;
        this.vacationDays = vacationDays;
    }

    private double averageSalary;
    private int vacationDays;
    private double vacationPayment;

    public int GetVacationDays(){
        return this.vacationDays;
    }

    public double GetAverageSalary(){
        return averageSalary;
    }

    public double GetVacatiounPayment(){
        return PayForVacation(this.vacationDays, this.vacationDays);
    }


    private double PayForVacation(int averageSalary, int vacationDays) {
        return averageSalary / 29.3 * vacationDays;
    }
}
