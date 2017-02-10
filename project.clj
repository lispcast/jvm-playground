(defproject jvm-playground "0.1.0-SNAPSHOT"
  :description "Part of PurelyFunctional.tv"
  :url "https://purelyfunctional.tv/"
  :license {:name "CC0 1.0 Universal (CC0 1.0) Public Domain Dedication"
            :url "http://creativecommons.org/publicdomain/zero/1.0/"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [ch.qos.logback/logback-classic "1.2.1"]]

  :main jvm-playground.logging
  :source-paths ["src"]
  :java-source-paths ["src"]
  :javac-options ["-target" "1.6" "-source" "1.6"]
  :jvm-opts ["-Xmx2g" "-server" "-Xms1g"])
