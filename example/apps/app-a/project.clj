(defproject example/app-a
  "0.0.0" ;; the current version is maintained by lein-v. Using "0.0.0" is easier to check in Cursive.

  :description "Example project with internal and external dependencies."
  :monolith/inherit true
  :deployable true

  :middleware [leiningen.v/version-from-scm
               leiningen.v/dependency-version-from-scm
               leiningen.v/add-workspace-data]



  :plugins
  [[lein-monolith "1.0.1"]
   [lein-cprint "1.2.0"]]


  :dependencies
  [[commons-io "2.5"]
   [example/lib-a nil]
   [example/lib-b nil]
   [org.clojure/clojure "1.8.0"]])
