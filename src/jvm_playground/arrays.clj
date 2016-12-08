(ns jvm-playground.arrays)

(String/format "number: %f, string: %s" (to-array [1.8 "Java"]))
;; => "number: 1.800000, string: Java"
;; Java: String.format("number: %f, string: %s", 1.8, "Java");
