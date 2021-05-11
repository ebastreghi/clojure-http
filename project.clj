(defproject clojure-http "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :ring {:handler clojure-http.core/app
         :auto-reload? true
         :auto-refresh? false}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring "1.2.0"]
                 [http-kit "2.2.0"]
                 [compojure "1.2.0-SNAPSHOT"]
                 [ring/ring-json "0.2.0"]]
  :plugins [[lein-ring "0.12.5"]
            [lein-gorilla "0.4.0"]]
  :repl-options {:init-ns clojure-http.core})
