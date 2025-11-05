(ns tutorial.Agents)

(defn Agents []
  (def amount (agent 100))
  (println @amount)

  (send amount inc)
  ;result 100, we haven't had time to print the real value
  (println @amount)
  (println "Some time must pass before printing @amount")
  ;result 101
  (println @amount)

  (send amount inc)
  ;will wait 1 second for the update
  (await-for 1000 amount)
  (println @amount)

  ;serves to capture errors against our agents
  (println (agent-error amount))
  )
(Agents)