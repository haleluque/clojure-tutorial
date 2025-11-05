(ns tutorial.watchers)

(defn Watch []
  (def x (atom 5))
  (add-watch x :xWatcher
             (fn [key ref old-state new-state]
               (println key)
               (println ref)
               (println old-state)
               (println new-state)
               )
             )
  (reset! x 10)
  (remove-watch x :xWatcher)
  (reset! x 15)
  )
;result
; :xWatcher
; #object[clojure.lang.Atom 0x28371c67 {:status :ready, :val 10}]
; 5
; 10
(Watch)

;example 2
(def my-atom (atom 0))

(add-watch my-atom :logger
           (fn [key ref old new]
             (println "Changed from" old "to" new)))
