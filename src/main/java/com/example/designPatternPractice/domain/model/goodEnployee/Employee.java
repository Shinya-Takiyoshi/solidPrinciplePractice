package com.example.designPatternPractice.domain.model.goodEnployee;

public interface Employee {

    /**
     * 社員のボーナス給与を計算する
     * @param base ボーナス給与計算のベース値
     * @return Integer 計算結果
     */
    Integer getBonus(Integer base);
}
