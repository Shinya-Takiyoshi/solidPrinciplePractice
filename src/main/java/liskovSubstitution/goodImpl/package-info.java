/**
 * package-info SOLID原則のリスコフの置換原則のgood例
 * goodの理由
 * 振る舞いが異なるため抽象化を再定義し、それぞれのクラスとして独立させた。
 * 修正前：正方形は長方形である
 * 修正後：四角形→正方形、四角形→長方形に変更
 *
 * **/
package liskovSubstitution.goodImpl;