(ns jvm-playground.temp-files
  (:require [clojure.java.io :as io])
  (:import [java.io File]
           [java.nio.file Files]
           [java.nio.file.attribute FileAttribute]))

(def tmp-dir (io/file (System/getProperty "java.io.tmpdir")))

(defn create-temp-file []
  (File/createTempFile "temporary" ".txt" tmp-dir))

(defn create-temp-dir [parent]
  (.toFile (Files/createTempDirectory
             (.toPath parent)
             "temporarydir"
             (make-array FileAttribute 0))))
