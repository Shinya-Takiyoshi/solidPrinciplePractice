/**
 * package-info SOLID原則のインターフェース分離の原則のbad例
 * badの理由
 * Vehicleという乗り物のインターフェースを定義したが
 * 車(Car)は空を飛べないので、意図してないインターフェースあり、不要な実装が発生する。
 * **/
package com.example.designPatternPractice.domain.model.interfaceSegregation.badInterface;