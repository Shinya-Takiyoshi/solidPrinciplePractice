package openClosed.goodEnployee.Impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class JuniorEmployee implements Employee {
    private final String name;
    /**
     * 社員のボーナス給与を計算する
     *
     * @param base ボーナス給与計算のベース値
     * @return Integer 計算結果
     */
    @Override
    public Integer getBonus(final Integer base){
        return base * EmployeeGrade.JUNIOR.getGradeBonus();
    }
}
