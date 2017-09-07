(defproject
  example/app-b
  "0.0.0" ;; the current version is maintained by lein-v. Using "0.0.0" is easier to check in Cursive.

  :description "Example project with internal and external dependencies."
  :monolith/inherit true
  :deployable true

  :dependencies
  [[org.clojure/clojurescript "1.9.293"]]

  :plugins
  [[lein-monolith "1.0.1"]
   [com.roomkey/lein-v "6.1.0-cb-9-0x521a"]
   [lein-cljsbuild "1.1.7"]]

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
