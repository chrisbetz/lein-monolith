(defproject example/lib-a
  "0.0.0" ;; the current version is maintained by lein-v. Using "0.0.0" is easier to check in Cursive.

  :description "Example library with no internal dependencies."
  :monolith/inherit true

  :pedantic? :abort

  :dependencies
  [[org.clojure/clojure "1.8.0"]])
