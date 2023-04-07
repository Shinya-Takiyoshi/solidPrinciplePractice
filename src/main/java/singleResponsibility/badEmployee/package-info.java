/**
 * package-info SOLID原則の単一責任原則のbad例
 * badの理由
 * 共通メソッドgetRegularHoursは同じことをするので一見DRY原則に従っており良いコードに見えるが
 * 実際は共通化したによりアクター毎の切り離しができなくなった。つまり改修時の影響が大きくなった。
 * **/
package singleResponsibility.badEmployee;