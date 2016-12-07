(ns jvm-playground.import-form
  (:import [java.io File]
           ;; import java.io.File;
           [java.lang Thread$UncaughtExceptionHandler]
           ;; import java.lang.Thread.UncaughtExceptionHandler;
           [java.nio.charset StandardCharsets]
           ;; import java.nio.charset.StandardCharsets;
           ))

StandardCharsets ;; => java.nio.charset.StandardCharsets

StandardCharsets/UTF_8 ;; => #object[sun.nio.cs.UTF_8 0x87f3df2 "UTF-8"]
;; Java: StandardCharsets.UTF_8
