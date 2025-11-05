(ns tutorial.sequences)

(defn Seq
  []
  ;create a sequence from a vector (array)
  (def colors (seq ["red", "green", "yellow", "black", "white"]))
  (println colors)

  ;cons = append an element at the beginning of a sequence
  (println (cons "Brown" colors))
  ;even though we are appending to a string, most data types in closure can be accessed as a sequence
  ;result => '((red green yellow black white) B r o w n)'
  (println (cons colors "Brown"))

  ;conj = append an element to a sequence BUT in a way that makes sense to the sequence itself
  ;in this case, it will add the color 'Brown' at the beginning of the list
  ;BECAUSE, by default, lists grow at the beginning
  ;result => (Brown red green yellow black white)
  (println (conj colors "Brown"))

  ;Vectors grow at the end by default -> will add it at the end
  ;result => [red green yellow black white Brown]
  (println (conj ["red", "green", "yellow", "black", "white"] "Brown"))

  ;concat = Allows to concatenate to sequences, put them together into a new sequence
  (println (concat colors (seq ["Brown", "Purple"])))

  ;distinct = unique values
  (println (distinct (seq [1 2 4 3 2 5 7 1 2 3])))

  ;reverse = reverses the order of the elements of a sequence
  (println (reverse (seq [1 2 3 4 5 6 7 8 9])))
  (println (reverse colors))

  ;first = returns the first element of a sequence
  (println (first colors))

  ;rest = returns all the elements BUT the first of a sequence
  (println (rest colors))

  ;last = returns the last element of a sequence
  (println (last colors))

  ;sort = sorts over a sequence
  (println (sort (seq [ 1 2 5 4 8 2 1 3 6 9 54 4 1 66 15 99])))
  )
(Seq)
