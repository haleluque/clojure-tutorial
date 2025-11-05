(ns tutorial.conditionals)

; Simple If-else statement
(defn condIf
  []
  (println "\nCondIf:")
  (if (= 5 6)
    (println " Equal")
    (println " Not Equal")
    )
)
(condIf)

;If do statement, multiple actions
(defn condIfDo
  []
  (println "\nCondIfDo:")
    (if (= 5 6)
      (do (println "Equal first statement")
          (println "Equal second statement")
      )
      (do (println "Not Equal first statement")
          (println "Not Equal first statement")
      )
    )
)
(condIfDo)

; Nested if
(defn conNestedIf
  []
  (println "\nNesteIf: ")
  ;(if (and (= 5 5) (= 2 3)) ; SIMPLE AND condition
  (if (and (= 5 5) (or (= 2 2) (not true))) ; Nested validation and or
    (println "True")
    (println "False")
    )
)
(conNestedIf)

;Case statement -> switch case
(defn conCase
  [pet] ;variable pet
  (println "\nconCase: ")
  ;(def petCondition pet) -> redundant
  (case pet
    "cat" (println "i have a cat")
    "dog" (println "i have a dog")
    "fish" (println "i have a gold fish")
    )
  )
(conCase "fish")

; Cond statement -> ifelse condition, true once, skip others
(defn condCond
  [amount]
  (println "\ncondCond: ")
  (cond
        (<= amount 2) (println "Few")
        (<= amount 10) (println "Several")
        (<= amount 100) (println "Many")
        :else (println "Loads")
        ))
(condCond 1)