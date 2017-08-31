(defproject example/app-b "LEIN-V-b-SNAPSHOT"
  :description "Example project with internal and external dependencies."
  :monolith/inherit true
  :deployable true

  :dependencies
  [[org.clojure/clojure "1.8.0"]
   [org.clojure/clojurescript "1.9.293"]]

  :plugins
  [[lein-monolith "1.0.1"]
   [lein-cprint "1.2.0"]
   [com.roomkey/lein-v "6.1.0"]
   [lein-cljsbuild "1.1.7"]]

  :middleware [leiningen.v/version-from-scm
               leiningen.v/add-workspace-data]


  :source-paths ["src/cljc"]
  :cljsbuild {:builds [{
                        :id           "uberjar"
                        :source-paths ["src/cljs"]
                        :compiler     {:main          project-b.core
                                       :asset-path    "js/out"
                                       :output-to     "js/compiled/app.js"
                                       :optimizations :simple
                                       :pretty-print  false
                                       :warnings      true
                                       }
                        }]}

  )
