package com.example.designPatternPractice.domain.model.goodEnployee.Impl;

public class SeniorEmployee implements Employee{
    String name;
    /**
     * 社員のボーナス給与を計算する
     *
     * @param base ボーナス給与計算のベース値
     * @return Integer 計算結果
     */
    @Override
    public Integer getBonus(Integer base) {
        return (int) Math.floor(base * EmployeeGrade.SENIOR.getGradeBonus());
    }
}
