(ns jvm-playground.fields-and-methods)

(.toString x)
;; Java: x.toString()

(.addVector2D v v2)
;; Java: v.addVector2D(v2)

(.x point)
;; Java: point.x()
;;   OR  point.x

(.-x point)
;; Java: point.x

(set! (.-x point) 100)
;; Java: point.x = 100

System
;; => java.lang.System

(System/currentTimeMillis)
;; => 1481138755976
;; System.currentTimeMillis()

(java.util.Date.)
;; => #inst "2016-12-07T19:26:44.666-00:00"
;; Java: new java.util.Date()

(java.util.Date. (System/currentTimeMillis))
;; => #inst "2016-12-07T19:27:16.020-00:00"
;; Java: new java.util.Date(System.currentTimeMillis())

(new java.util.Date)
;; => #inst "2016-12-07T19:27:44.944-00:00"
;; Java: new java.util.Date()

java.nio.charset.StandardCharsets;; => java.nio.charset.StandardCharsets

java.nio.charset.StandardCharsets/UTF_8
;; => #object[sun.nio.cs.UTF_8 0x87f3df2 "UTF-8"]


