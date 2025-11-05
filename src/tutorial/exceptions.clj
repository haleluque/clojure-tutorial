(ns tutorial.exceptions)

;exception handling - try-catch-finally
(defn ExHandling
  [x]
  (try
    (inc x)
    (catch ClassCastException e (println (str "Caught Exception " (.getMessage e))))
    (catch Exception e (println (str "Generic Exception " (.getMessage e))))
    (finally (println "Ended connection"))
    )
  )

(ExHandling "string")
