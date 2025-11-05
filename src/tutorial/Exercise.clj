(ns tutorial.Exercise
  (:gen-class))

;define the dealership cars
(def cars [ { :CarModel "BMW" :CarPrice 60000 }
           { :CarModel "FERRARI" :CarPrice 100000 }
           { :CarModel "FIAT" :CarPrice 20000 } ])

;function that applies the discount over the price
(defn applyDiscount [price] (- price (* price 0.20)))

;function that returns the cars that are within the budget
(defn affordableCars [maxPrice code]
  (if (= code "VALID")
    (do
      (println "THE COUPON IS VALID")
      (->> cars
           (map #(update % :CarPrice applyDiscount))
           (filter #(<= (:CarPrice %) maxPrice)))
      )
   (do
     (println "THE COUPON IS NOT VALID")
     (filter #(<= (:CarPrice %) maxPrice) cars)
     )
  ))

;define the function, print only the values
(doseq [car (affordableCars 50000 "VALID")]
  (println (vals car)))