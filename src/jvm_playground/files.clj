(ns jvm-playground.files
  (:require [clojure.java.io :as io]))

(def temp-dir (java.io.File. "/tmp"))

(def temp-file (java.io.File. temp-dir "xyz.txt"))

temp-file ;; => #object[java.io.File 0x65a6244f "/tmp/xyz.txt"]

(def uri (java.net.URI. "file:///tmp/xyz.txt"))
(java.io.File. uri) ;; => #object[java.io.File 0x40e7205d "/tmp/xyz.txt"]
(java.io.File. (java.net.URI. "https://purelyfunctional.tv/"))

(io/file "/tmp/xyz.txt");; => #object[java.io.File 0x7f966800 "/tmp/xyz.txt"]
;; Java: new java.io.File("/tmp/xyz.txt");
(io/file "/" "tmp" "xyz.txt") ;; => #object[java.io.File 0x2f9a036c "/tmp/xyz.txt"]
;; Java: new java.io.File(new java.io.File(new java.io.File("/"), "tmp"), "xyz.txt")
(io/file (java.net.URI. "file:///tmp/xyz.txt")) ;; => #object[java.io.File 0x7ae74758 "/tmp/xyz.txt"]
