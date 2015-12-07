;; https://leetcode.com/problems/remove-element/
;;
;; Given an array and a value, remove all instances of that value in place and
;; return the new length.
;;
;; The order of elements can be changed. It doesn't matter what you leave beyond
;; the new length.
(ns leetcode.remove-element
  (:require [criterium.core :refer [bench]]))

;; NOTE:
;; since this problem need in-place replacement, we use atom to achive the
;; prolem requirement

;; the really remove-element implement
(defn remove-element-impl [nums val]
  (filter #(not= % val) nums))

;; use atom for in-place replacement
(defn remove-element [nums val]
  (reset! nums (remove-element-impl @nums val))
  (count @nums))

(defn test-element ;; [nums val expect]
  [{:keys [nums val expect]}]
  (let [arr (atom nums)]
    ;; calculate value and check result size
    (assert (= (remove-element arr val) (count expect)))
    ;; Make surce array is what we expect
    (assert (= @arr expect))
    ;; All is well
    true))
