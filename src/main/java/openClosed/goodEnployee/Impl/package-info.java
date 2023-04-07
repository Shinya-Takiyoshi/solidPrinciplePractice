/**
 * package-info SOLID原則のオープンクローズド原則のgood例
 * goodの理由
 * ポリモーフィズムを利用することでgetBonusの値がif分岐不要で別のグレードの社員に応じて切り替えができるようになった。
 * 結果getBonusにおける機能追加・機能削除が容易となった。
 * **/
package openClosed.goodEnployee.Impl;