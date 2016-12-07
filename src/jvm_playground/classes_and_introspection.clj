(ns jvm-playground.classes-and-introspection)

String ;; => java.lang.String
java.io.InputStream;; => java.io.InputStream

Object ;; => java.lang.Object

(instance? String "hello") ;; => true
(string? "hello")
;; => true

(instance? Long 123)
;; => true

(class "hello")
;; => java.lang.String

(class 123);; => java.lang.Long

(supers String);; => #{java.lang.Object java.lang.CharSequence java.lang.Comparable java.io.Serializable}

