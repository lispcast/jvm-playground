(ns jvm-playground.logging
  (:gen-class)
  (:require [clojure.tools.logging :as log]))


(defn calculate-average [numbers]
  (try
    (/ (apply + numbers)
      (count numbers))
    (catch Exception e
      (log/errorf e "Caught an exception calculating the average of %d numbers." (count numbers)))))

(defn -main [& args]
  (log/info "Staring up the app...")

  (dotimes [x 10]
    (println (calculate-average (range x)))
    (Thread/sleep 500))
  
  (log/info "Shutting down the app...")
  (System/exit 0))
