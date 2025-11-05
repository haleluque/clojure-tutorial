(ns tutorial.References)

(defn Refs []
  (def amount (ref 100))
  (println @amount)
  ;creates a transaction
  (dosync
    (ref-set amount 110)
    )
  (println @amount)

  (dosync
    ;passes a ref a function
    (alter amount inc)
    )
  (println @amount)
  )
(Refs)