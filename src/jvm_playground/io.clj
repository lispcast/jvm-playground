(ns jvm-playground.io
  (:require [clojure.java.io :as io]))

;; java.io.BufferedInputStream bis = new java.io.BufferedInputStream(new java.io.FileInputStream("/path/to/file"));


(io/input-stream (io/file "/tmp/somefile.txt"))
;; => #object[java.io.BufferedInputStream 0x2b2da32 "java.io.BufferedInputStream@2b2da32"]

(def os (io/output-stream (io/file "/tmp/somefile.txt")))

(.write os 65)
(.close os)


(def r (io/reader (io/file "/tmp/somefile.txt")))

(.read r);; => 65
(.readLine r) ;; => "A"
(.close r)
