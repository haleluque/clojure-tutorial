(ns tutorial.functions
  (:gen-class))

;Basic function
(defn -main
  "You can add a description to the function"
  []                                                        ;parameters
  (println "My name is Henry")
  (println "Loving Clojure so far")
  (+ 2 5))

;anonymous function with 1 param, as it doesn't have a name we can call it like this
;(#(println "This is an anonymous function" %), " ,isn't that right?")
#(println "This is an anonymous function" %)

;(#(println "This is an anonymous function" %1 " and " %2), 1 2)
#(println "This is an anonymous function with 2 numbers" %1 " and " %2)

;Defines a function called 'increment' that receives a parameter 'x' and sums it 1
(def increment (fn [x] (+ x 1)))

;Creates an 'increment_set' function that receives a set of values and pass them to
;the 'increment' function, then returns a new set of values e.g (increment_set [1 2 3 4])
(defn increment_set
  [x]
  (map increment x))

; Defines a function, no params, defines variables, and then print them.
; where
; a is an Integer
; b is a Double
; c is a Float
; d is a hex/hexadecimal
; e is null/nil -> default return
; f is Boolean
; g is String
; h is Keyword -> word we can use as a reference in parts of the code
(defn DataTypes []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12)
  (def d 0xfdfc)
  (def e nil)
  (def f true)
  (def g "String text")
  (def h 'thanks)

  (def status true)
  (def STATUS false)

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println g)
  (println h)
  (println status)
  (println STATUS)
  )
(DataTypes)

;Exercise for pet age
;can be called like this (humanAgeToPet 10 (extractPetAge "Fish"))
(defn extractPetAge
  "Improved version of the method above"
  [petMapKey]
  (def petMap { "Dog" 7, "Cat" 5, "Fish" 10})
  (get petMap petMapKey))
(defn humanAgeToPet
  "This function returns the age of a pet in human age"
  [age petFactor]
  (println "age is:" (* age petFactor)))







