(ns leetcode.remove-element-spec
  (:require [speclj.core :refer :all]
            [speclj.run.standard]
            [leetcode.remove-element :refer :all]))

(describe
 "https://leetcode.com/problems/remove-element/

  Given an array and a value, remove all instances of that value in place and
  return the new length.

  The order of elements can be changed. It doesn't matter what you leave beyond
  the new length."

 ;; testcase I wrote
 (verify {:nums [1 2 3 4 5] :val 5 :expect [1 2 3 4]})
 (verify {:nums [1 2 3 4]   :val 3 :expect [1 2 4]})
 (verify {:nums [1 2 3 4]   :val 5 :expect [1 2 3 4]})

 ;; https://github.com/samfang/leetcode/blob/master/26.%20Remove%20Element
 (verify {:nums [2]         :val 3 :expect [2]})
 (verify {:nums [4 5]       :val 4 :expect [5]})
 )