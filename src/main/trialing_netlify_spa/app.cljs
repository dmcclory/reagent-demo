(ns trialing-netlify-spa.app
  (:require [clojure.string :as str]
            [reagent.core :as r]
            [reagent.dom.client :as rdomc]))

(defonce root (delay (rdomc/create-root (.getElementById js/document "app"))))

(def click-count (r/atom 0))

(defn counter-component []
  [:div
    "The atom " [:code "click-count"] "has value:"
    @click-count ". "
    [:input {:type "button" :value "Click me!"
             :on-click #(swap! click-count inc)}]])

(defn simple-example []
  [:div
    [:h1 "A hello world"]
    (counter-component)])

(defn init []
  "Hello world")

(defn ^:export run []
  (rdomc/render @root [simple-example]))
