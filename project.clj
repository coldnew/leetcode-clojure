(defproject leetcode "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [criterium "0.4.3"]]

  :profiles {:dev {:dependencies [[speclj "3.3.0"]]}}
  :plugins [[speclj "3.3.0"]
            [michaelblume/lein-marginalia "0.9.0"]]
  :test-paths ["spec"])
