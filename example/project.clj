(defproject example/all "MONOLITH"
  :description "Overarching example project."

  :plugins
  [[lein-monolith "0.3.2"]
   [lein-cprint "1.2.0"]]

  :dependencies
  [[org.clojure/clojure "1.8.0"]]

  :test-selectors
  {:unit (complement :integration)
   :integration :integration}

  :monolith
  {:inherit
   [:repositories
    :test-selectors
    :managed-dependencies]

   :project-selectors
   {:deployable :deployable
    :unstable #(= (first (:version %)) \0)}

   :project-dirs
   ["apps/app-a"
   "apps/app-b"
    "libs/*"
    "not-found"]})
