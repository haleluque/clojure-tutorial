(ns tutorial.destructuring)

;It can extract the element of a vector into multiple variables
;those variables are received as a vector as well
(defn Destruct
  []
  (def myVector [1 2 3 4 5])
  (let [[a b c ] myVector] (println a b c))

  ;extract 2 variables and the rest, store them into a list
  ;result => 1 2 (3 4 5)
  (let [[a b & rest] myVector] (println a b rest))

  ;extract specific values from a map into variables using their keys
  ;if the key does not exist, it will return nil
  (def myMap { 'name "Jhon" 'lastName "Smith" })
  (let [{ a 'name b 'lastName } myMap] (println a b))
  )
(Destruct)