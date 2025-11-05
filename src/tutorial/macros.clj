(ns tutorial.macros)

;expanded expression => (if true (do (println "Hello")))
;when is transformed into an if-do statement - shorthand
(macroexpand-1 '(when true (println "Hello")))