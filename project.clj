(defproject hackathon "0.1.0-SNAPSHOT"
  :description "A series of tests to demonstrate your Clojure knowledge"
  :url "http://lmgtfy.com/?q=clojure+docs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles
    {:dev
     {:plugins [[lein-midje "3.1.3"]]
      :dependencies [[midje "1.6.3"]]}
     }
  )
