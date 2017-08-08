(defproject example/app-b "0.5.0"
  :description "Example project with internal and external dependencies."
  :monolith/inherit true
  :deployable true

  :dependencies
  [[org.clojure/clojure "1.8.0"]
   #_[commons-io "2.5"]
   #_[example/lib-a "1.0.0"]
   #_[example/lib-b "0.2.0"]
   [org.clojure/clojurescript "1.9.293"]]

   :plugins [  #_ [lein-monolith "1.0.1"]
               [lein-cljsbuild "1.1.7"]]

   :source-paths ["src/cljc"]
   :cljsbuild {:builds [{
     :id           "uberjar"
     :source-paths ["src/cljs"]
                            :compiler     {:main            project-b.core
                                          :asset-path      "js/out"
                                          :output-to       "js/compiled/app.js"
                                          :optimizations   :simple
                                          :pretty-print    false
                                          :warnings        true
                                          }
                                        }]}

   )
