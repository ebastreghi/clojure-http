(ns clojure-http.core
  (:use compojure.core
        ring.middleware.json
        ring.util.response)
  (:require [compojure.route :as route]
            [clojure-http.view :as view]))

(defn foo [x] (str "Hello, " x))

(defroutes my_routes
  (GET "/" [] (view/index-page))
  (GET "/rest" [] (response {:email "edevarfilho@gmail.com"}))
  (route/resources "/"))

(def app (wrap-json-response my_routes))
