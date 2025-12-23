(ns trialing-netlify-spa.app
  (:require [clojure.string :as str]
            [reagent.core :as r]
            [reagent.dom.client :as rdomc]))

(defonce root (delay (rdomc/create-root (.getElementById js/document "app"))))

(defn simple-example []
  [:div
    [:h1 "A hello world"]
    [:ol
      [:li "foo"]
      [:li "bar"]
      [:li "cool!"]
      [:li "very-cool"]
      [:li "very-cool part 2"]
      [:li "very-cool part 3"]
      [:li "very-cool part 4"]
      [:li "very-cool part 5"]
      [:li "baz"]]])

(defn init []
  "Hello world")

(defn ^:export run []
  (rdomc/render @root [simple-example]))
