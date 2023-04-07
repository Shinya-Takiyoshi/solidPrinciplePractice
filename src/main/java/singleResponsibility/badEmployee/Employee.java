package singleResponsibility.badEmployee;


import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Employee {
    String name;
    String department;

    // 経理部門が利用する
    public List<String> calculatePay(){
        List<String> returnLst = new ArrayList<>();
        returnLst.add(this.getRegularHours());
        returnLst.add("["+department+"]"+name+"の給与を計算しました");
        return returnLst;
    }

    // 人事部門が利用する
    public List<String> reportHours(){
        List<String> returnLst = new ArrayList<>();
        returnLst.add(this.getRegularHours());
        returnLst.add("["+department+"]"+name+"の給与を計算しました");
        return returnLst;
    }
    private String getRegularHours(){
        return "経理部門・人事部門共通のロジック";
        //経理部門だけ仕様変更が発生したが、共通ロジックのため人事部門のロジックも変更されてしまう テストがNGになる
        //return "経理部門の仕様変更済み";
    }
}
