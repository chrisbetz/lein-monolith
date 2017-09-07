(defproject example/lib-b
  "0.0.0" ;; the current version is maintained by lein-v. Using "0.0.0" is easier to check in Cursive.

  :description "Example lib depending on lib-a."
  :monolith/inherit true

  :plugins
  [[lein-monolith "1.0.1"]
   [com.roomkey/lein-v "6.1.0-cb-9-0x521a"]]

  :middleware [leiningen.v/dependency-version-from-scm]

  :dependencies
  [[example/lib-a nil]])
