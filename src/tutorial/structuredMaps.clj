(ns tutorial.structuredMaps)

;We can define custom structures, similar to a class in OOP
(defn Pets
  []
  ;define the structure of the object
  (defstruct pet :PetType :PetName)
  ;create a 'pet' variable with the given structure
  (def myPet (struct pet "Dog" "Sophie"))
  ;result => {:PetType Dog, :PetName Sophie}
  (println myPet)

  ;we can define the pet structure in a more specific way, in different order
  (def myOtherPet (struct-map pet :PetName "Mandarine" :PetType "cat"))
  ;result => {:PetType cat, :PetName Mandarine}
  (println myOtherPet)
  ;extract specific info from the structures
  (println (str "The names of the pets are: " (:PetName myPet) " and " (:PetName myOtherPet)))

  ;We can create a new structure from an old one, changing their values (always immutable)
  (def myNewPet (assoc myPet :PetName "Max"))
  (println myNewPet)

  ;Add new key to a structured map, in this case, age
  (def myComplexPet (assoc myOtherPet :PetAge 10))
  (println myComplexPet)
  )
(Pets)