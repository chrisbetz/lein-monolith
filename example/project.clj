(defproject example/all "LEIN-V-MONOLITH-SNAPSHOT"
  :description "Overarching example project."

  :plugins
  [[lein-monolith "1.0.1"]
   [lein-cprint "1.2.0"]
   [com.roomkey/lein-v "6.1.0"]]


  :dependencies
  [[org.clojure/clojure "1.8.0"]]

  :test-selectors
  {:unit        (complement :integration)
   :integration :integration}

  :profiles {:install-for-with-all-repl {:middleware ^:replace []}}

  :monolith
  {:inherit [:test-selectors
             :env
             :plugins
             :profiles]

   :inherit-leaky
            [:repositories
             :managed-dependencies]

   :project-selectors
            {:deployable :deployable
             :unstable   #(= (first (:version %)) \0)}

   :project-dirs
            ["apps/app-a"
             "apps/app-b"
             "libs/*"
             "not-found"]}

  :env
  {:foo "bar"})
