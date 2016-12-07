(ns jvm-playground.exceptions-errors)

Exception ;; => java.lang.Exception

Error ;; => java.lang.Error

Throwable;; => java.lang.Throwable

(defn fib [n]
  (assert (>= n 0)))


(try
  (assert (= 1 2))
  (catch Exception e
    ;; do something
    )
  (catch AssertionError ae
    ;; print it
    ))

(throw (ex-info "Hi, I am an Exception." {:name "Eric"
                                          :cause "I was just testing this out."}))
