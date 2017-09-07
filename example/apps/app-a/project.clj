(defproject example/app-a
  "0.0.0" ;; the current version is maintained by lein-v. Using "0.0.0" is easier to check in Cursive.

  :description "Example project with internal and external dependencies."
  :monolith/inherit true
  :deployable true

  :middleware [leiningen.v/dependency-version-from-scm]

  :plugins
  [[lein-monolith "1.0.1"]
   [com.roomkey/lein-v "6.1.0-cb-9-0x521a"]]


  :dependencies
  [[commons-io "2.5"]
   [example/lib-a nil]
   [example/lib-b nil]])
