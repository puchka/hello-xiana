(ns hello.xiana.core
  (:require [xiana.core :as xiana]
            [framework.route.core :as route]
            [framework.webserver.core :as webserver]))

(def app-routes
  [["/" {:action
         #(xiana/ok
           (-> % (assoc :response
                        {:status 200
                         :body "Hello, world!"})))}]])

(def -main
  "Application entry point"
  []
  (route/reset app-routes)
  (webserver/start []))
