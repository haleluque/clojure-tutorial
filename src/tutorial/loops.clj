(ns tutorial.loops)

;Simple loop statement -> similar to fori
(defn Loop
  []
  (println "\nLoop: ")
  (loop [x 0] ;starts in 0 -> i=0
    (when (< x 10) ; condition -> i<10
      (println x)
      (recur (inc x)); increment -> i++
    )
  )
)
(Loop)

; DoTimes Statement -> simplified version of loop
(defn DoTimes
  []
  (println "\nDoTimes: ")
  (dotimes [x 10]
    (println x)
    )
  )
(DoTimes)

; WhileDo Statement -> similar to while
(defn WhileDo
  [count]
  (println "\nWhileDo: ")
  ;In closure, variables are immutable, so atoms are variables that we can change
  (def x (atom 0)); int x = 0;
  (while (< @x count) ; while (x < count)
    (do
      (println @x)
      (swap! x inc); x++
      )
    )
  )
(WhileDo 15)

;DoSeq statement -> do smth in a sequence -> similar to foreach
(defn DoSeq
  [seq]
  (println "\nDoSeq: ")
  (doseq [x seq]
    (println (inc x))
    )
  )
(DoSeq [6 2 9 0 4])