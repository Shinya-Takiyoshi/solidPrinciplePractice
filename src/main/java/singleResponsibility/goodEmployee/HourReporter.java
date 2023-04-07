package singleResponsibility.goodEmployee;


import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class HourReporter {

    // 人事部門が利用する
    public List<String> reportHours(EmployeeData employeeData){
        List<String> returnLst = new ArrayList<>();
        returnLst.add(this.getRegularHours());
        returnLst.add("["+employeeData.department+"]"+employeeData.name+"の給与を計算しました");
        return returnLst;
    }
    private String getRegularHours(){
        return "労働時間レポート専用の労働時間計算ロジック";
    }
}
