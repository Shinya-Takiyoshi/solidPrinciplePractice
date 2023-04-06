package com.example.designPatternPractice.domain.model.openClosed.goodEnployee.Impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ExpertEmployee implements Employee {
    private final String name;
    /**
     * 社員のボーナス給与を計算する
     *
     * @param base ボーナス給与計算のベース値
     * @return Integer 計算結果
     */
    @Override
    public Integer getBonus(Integer base) {
        // badEmployeeから比較して、ExpertEmployee用のgrade値がないため追加する
        return base * EmployeeGrade.EXPERT.getGradeBonus();
    }
}
