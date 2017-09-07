(defproject example/all "0.0.0"
  :description "Overarching example project."

  :vcs :git

  :plugins
  [[lein-monolith "1.0.1"]
   [lein-cprint "1.2.0"]
   [com.roomkey/lein-v "6.1.0-cb-9-0x521a"]]


  :middleware [leiningen.v/version-from-scm
               leiningen.v/add-workspace-data]

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
             :profiles
             :middleware
             ]

   :inherit-leaky
            [:dependencies
             :repositories
             :managed-dependencies]

   :project-selectors
            {:deployable :deployable
             :unstable   #(= (first (:version %)) \0)}

   :project-dirs
            ["apps/app-a"
             "apps/app-b"
             "libs/*"]}

  :release-tasks [["vcs" "assert-committed"]
                  ["v" "update"] ;; compute new version & tag it
                  ["vcs" "push"]
                  #_["deploy"]]

  :env
  {:foo "bar"})
