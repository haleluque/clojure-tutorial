(ns tutorial.Namespaces
  ;avoid :refer :all => same as import *
  (:require [clojure.string :refer [capitalize]]))

;The same way we work with imports in java, calling the function capitalize inside the namespace clojure.string
(defn -main []
  (println (capitalize "hello"))
  )
(-main)

