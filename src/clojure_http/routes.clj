(ns clojure-http.routes
  (:require [compojure.core :refer [context defroutes GET POST]]
            [compojure.route :as route]
            [ring.adapter.jetty :as jetty]))

(defroutes myapp
           (context "/admin" []
             (GET "/login" [] "Logging in")
             (GET "/logout" [] "Logging out"))
           (GET "/" [] "Hello from Compojure")
           (POST "/:name" [] (fn [req] (str "Hello " (-> req :route-params :name))))
           (GET ["hex-id/:id" :id #"[a-fA-F0-9]+"] [id] (str "ID: " id))
           (route/resources "/static"))

;simulating route
(myapp {:uri "/edevar" :request-method :get})

(defn -main []
  (jetty/run-jetty myapp {:port 3000}))
