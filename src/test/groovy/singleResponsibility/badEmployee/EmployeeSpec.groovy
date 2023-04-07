package singleResponsibility.badEmployee


import spock.lang.Specification
import spock.lang.Unroll

class EmployeeSpec extends Specification {
    @Unroll
    def "calculatePayで#name,departmentの時、メッセージは#expectedである"() {
        given:
        Employee emp = new Employee(name,department)
        expect:
        emp.calculatePay() == expected
        where:
        name | department ||expected
        "アタック西本" | "経理部門" || ["経理部門・人事部門共通のロジック","[経理部門]アタック西本の給与を計算しました"]
        "かみちい" | "人事部門" ||  ["経理部門・人事部門共通のロジック","[人事部門]かみちいの給与を計算しました"]
    }

    @Unroll
    def "reportHoursで#name,departmentの時、メッセージは#expectedである"() {
        given:
        Employee emp = new Employee(name,department)
        expect:
        emp.reportHours() == expected
        where:
        name | department ||expected
        "アタック西本" | "経理部門" || ["経理部門・人事部門共通のロジック","[経理部門]アタック西本の給与を計算しました"]
        "かみちい" | "人事部門" ||  ["経理部門・人事部門共通のロジック","[人事部門]かみちいの給与を計算しました"]
    }
}
