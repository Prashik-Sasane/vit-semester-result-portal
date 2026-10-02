package com.vit.result.service;

import com.vit.result.model.ResultRecord;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

    public void calculate(ResultRecord result) {
        double ds = calculateSubject(result.getDataStructuresMSE(), result.getDataStructuresESE());
        double dbms = calculateSubject(result.getDbmsMSE(), result.getDbmsESE());
        double os = calculateSubject(result.getOsMSE(), result.getOsESE());
        double cn = calculateSubject(result.getCnMSE(), result.getCnESE());

        double total = ds + dbms + os + cn;
        double percentage = total / 4;

        result.setTotalMarks(total);
        result.setPercentage(percentage);
        result.setGrade(calculateGrade(percentage));
        result.setStatus(percentage >= 40 ? "PASS" : "FAIL");
    }

    public double calculateSubject(double mse, double ese) {
        return (mse * 0.3) + (ese * 0.7);
    }

    public String calculateGrade(double percentage) {
        if (percentage >= 90) return "S";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "F";
    }
}
