package singleResponsibility.goodEmployee


import spock.lang.Specification
import spock.lang.Unroll

/**
 * 比較のためにbadと同じファイル名で作成。
 * **/
class EmployeeSpec extends Specification {
    @Unroll
    def "calculatePayで#name,departmentの時、メッセージは#expectedである"() {
        given:
        EmployeeData empData = new EmployeeData(name,department)
        PayCalculator pay = new PayCalculator()

        expect:
        pay.calculatePay(empData) == expected

        where:
        name | department ||expected
        "アタック西本" | "経理部門" || ["給与計算用の労働時間計算ロジック","[経理部門]アタック西本の給与を計算しました"]
        "かみちい" | "人事部門" ||  ["給与計算用の労働時間計算ロジック","[人事部門]かみちいの給与を計算しました"]
    }

    @Unroll
    def "reportHoursで#name,departmentの時、メッセージは#expectedである"() {
        given:
        EmployeeData empData = new EmployeeData(name,department)
        HourReporter reporter = new HourReporter()

        expect:
        reporter.reportHours(empData) == expected
        where:
        name | department ||expected
        "アタック西本" | "経理部門" || ["労働時間レポート専用の労働時間計算ロジック","[経理部門]アタック西本の給与を計算しました"]
        "かみちい" | "人事部門" ||  ["労働時間レポート専用の労働時間計算ロジック","[人事部門]かみちいの給与を計算しました"]
    }
}
