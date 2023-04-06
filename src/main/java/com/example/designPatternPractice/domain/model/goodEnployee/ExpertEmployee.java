package com.example.designPatternPractice.domain.model.goodEnployee;

public class ExpertEmployee implements Employee {
    /**
     * 社員のボーナス給与を計算する
     *
     * @param base ボーナス給与計算のベース値
     * @return Integer 計算結果
     */
    @Override
    public Integer getBonus(Integer base) {
        // badEmployeeから比較して、ExpertEmployee用のgrade値がないため追加する
        return (int) Math.floor(base * EmployeeGrade.EXPERT.getGradeBonus());
    }
}
