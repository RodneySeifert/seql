(defproject seql "0.2.5"
  :description "schema migrations for the masses"
  :url "https://github.com/it0a/seql"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main seql.core
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]
                 [org.clojure/java.jdbc "0.3.7"]
                 [mysql/mysql-connector-java "8.0.30"]
                 [pandect "0.5.2"]
                 [org.clojure/data.codec "0.1.0"]
                 [crypto-password "0.2.0"]]
  :plugins      [[lein-bin "0.3.4"]]
  :aot [seql.core]
  :omit-source true

  ;; Use `lein deploy` to push to clojars.
  :deploy-repositories [["releases"  {:url "https://repo.clojars.org" :sign-releases false}]
                        ["snapshots" {:url "https://repo.clojars.org" :sign-releases false}]]

  :bin {:name "seql"})
