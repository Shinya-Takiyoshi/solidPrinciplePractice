/**
 * package-info SOLID原則のリスコフの置換原則のbad例
 * badの理由
 * 継承関係は 「is-a」の関係である。
 * 犬は動物である。
 * 正方形は長方形である。
 * 一見間違っていなさそうだが、
 * 親クラスと子クラスで振る舞いが異なっていたことが問題。
 *
 * **/
package liskovSubstitution.badExtends;