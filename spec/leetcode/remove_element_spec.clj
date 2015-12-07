(ns leetcode.remove-element-spec
  (:require [speclj.core :refer :all]
            [speclj.run.standard]
            [leetcode.remove-element :refer :all]))

(defn verify
  [{:keys [nums val expect]}]
  (let [arr (atom nums)]
    ;; calculate value and check result size
    (should (= (remove-element arr val) (count expect)))
    ;; Make surce array is what we expect
    (should (= @arr expect))
    ;; All is well
    true))

(describe
 "https://leetcode.com/problems/remove-element/

  Given an array and a value, remove all instances of that value in place and
  return the new length.

  The order of elements can be changed. It doesn't matter what you leave beyond
  the new length."

 (verify {:nums [1 2 3 4 5]
          :val 5
          :expect [1 2 3 4]})

 (verify {:nums [1 2 3 4]
          :val 3
          :expect [1 2 4]})

 (verify {:nums [1 2 3 4]
          :val 5
          :expect [1 2 3 4]})
 )