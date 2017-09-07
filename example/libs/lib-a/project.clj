(defproject example/lib-a
  "0.0.0" ;; the current version is maintained by lein-v. Using "0.0.0" is easier to check in Cursive.

  :description "Example library with no internal dependencies."
  :monolith/inherit true

  :pedantic? :abort

  :plugins
  [[lein-monolith "1.0.1"]
   [com.roomkey/lein-v "6.1.0-cb-9-0x521a"]]
)
