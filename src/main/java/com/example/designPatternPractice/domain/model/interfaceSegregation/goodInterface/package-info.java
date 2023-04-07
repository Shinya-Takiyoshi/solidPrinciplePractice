/**
 * package-info SOLID原則のインターフェース分離の原則のgood例
 * goodの理由
 * VehicleをMovableとflyに分けることによって、それぞれ実装したいインターフェースを分けることができる。
 * 抽象化が朝買ったため発生した問題。
 * 抽象化を再定義することにより解決。
 * 車(Car)は空を飛べないので、flyを実装しないことで本来の機能のみ実装できる。
 * **/
package com.example.designPatternPractice.domain.model.interfaceSegregation.goodInterface;