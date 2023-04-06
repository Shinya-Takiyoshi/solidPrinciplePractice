/**
 * package-info SOLID原則の単一責任原則のgood例
 * goodの理由
 * 共通メソッドをEmployeeクラスから責任を分割し、社員情報と経理部門と人事部門でモデリングをしたことにより
 * 部門毎の改修が容易となり、改修した部門以外に改修影響が及ばなくなった。
 * **/
package com.example.designPatternPractice.domain.model.singleResponsibility.goodEmployee;