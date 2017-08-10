(defproject example/app-a "LEIN-V"
  :description "Example project with internal and external dependencies."
  :monolith/inherit true
  :deployable true

  :dependencies
  [[commons-io "2.5"]
   [example/lib-a "1.0.0"]
   [example/lib-b "0.2.0"]
   [org.clojure/clojure "1.8.0"]])
