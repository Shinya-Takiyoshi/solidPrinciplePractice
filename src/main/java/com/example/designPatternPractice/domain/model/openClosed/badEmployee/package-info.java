/**
 * package-info SOLID原則のオープンクローズド原則のbad例
 * badの理由
 * getBonusを計算するのにif分岐で異なるグレードの社員のボーナスを計算している。
 * 将来的に新規グレードが追加された場合にif分岐に追加が必要。
 * 新規の観点のテストと、デグレートしていないことの観点のテストが両方必要になり、機能追加が容易ではなくなる。
 * **/
package com.example.designPatternPractice.domain.model.openClosed.badEmployee;