(defproject example/lib-b
  "0.0.0" ;; the current version is maintained by lein-v. Using "0.0.0" is easier to check in Cursive.

  :description "Example lib depending on lib-a."

  :middleware [leiningen.v/version-from-scm
               leiningen.v/dependency-version-from-scm
               leiningen.v/add-workspace-data]



  :dependencies
  [[example/lib-a nil]
   [org.clojure/clojure "1.8.0"]])
