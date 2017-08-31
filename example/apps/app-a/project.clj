(defproject example/app-a "LEIN-V-a-SNAPSHOT"
  :description "Example project with internal and external dependencies."
  :monolith/inherit true
  :deployable true

  :plugins
  [[lein-monolith "1.0.1"]
   [lein-cprint "1.2.0"]
   [com.roomkey/lein-v "6.1.0"]]


  :middleware [leiningen.v/version-from-scm
               leiningen.v/add-workspace-data]


  :dependencies
  [[commons-io "2.5"]
   [example/lib-a "1.0.0"]
   [example/lib-b "0.2.0"]
   [org.clojure/clojure "1.8.0"]])
