(ns tutorial.atoms)

;{:count 0} is immutable — you can't change it.
;swap! creates a new map {:count 1} and updates the atom to point to it.
(def my-atom (atom {:count 0}))
(swap! my-atom update :count inc)

(defn Atoms
  []
  (def amount (atom 100))
  (println @amount)
  ;change the value while being thread-safe
  (swap! amount inc)
  (println @amount)
  ;replaces the value with new value
  (reset! amount 110)
  (println @amount)
  ;check whether the atom has a value, if so, it will replace it with new value
  ;if amount == 110 -> set 120
  (compare-and-set! amount 110 120)
  (println @amount)
  ;this will fail, so wont change to 190
  (compare-and-set! amount 150 190)
  (println @amount)
  )
(Atoms)