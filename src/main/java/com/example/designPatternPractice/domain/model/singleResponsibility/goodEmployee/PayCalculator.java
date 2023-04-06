package com.example.designPatternPractice.domain.model.singleResponsibility.goodEmployee;


import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class PayCalculator {

    // 経理部門が利用する
    public List<String> calculatePay(EmployeeData employeeData){
        List<String> returnLst = new ArrayList<>();
        returnLst.add(this.getRegularHours());
        returnLst.add("["+employeeData.department+"]"+employeeData.name+"の給与を計算しました");
        return returnLst;
    }

    private String getRegularHours(){
        return "給与計算用の労働時間計算ロジック";
    }
}
