(ns tutorial.Exercise2)

;define the accounts
(def accounts { :Buyer 100, :Merchant 0 })

;define the sale items
(def items { "PEN" 1, "NOTEBOOK" 5, "BACKPACK" 10 })

;define a structure to save the story of purchases
(defstruct salesStory :Item :Amount)

;define an atom to store the sales logs
(def salesLog (atom []))

;function to add items to the end of the vector
(defn add-sale! [item amount]
  (swap! salesLog conj (struct salesStory item amount)))

;function to buy items
(defn buyItems [item amount]
  ;if buyer has credits
  (if (>= (get accounts :Buyer) (* (get items item) amount))
    (do
      (-> accounts
           (update :Buyer - (* (get items item) amount))
           (update :Merchant + (* (get items item) amount))
           )
      (add-sale! item amount)
      )
     (do
        (println (str "Buyer has no more credit to buy " amount " of " item))
        (println (str "Merchant received " (get accounts :Merchant) " money"))
         )
    )
  )

(buyItems "PEN" 10)
(buyItems "NOTEBOOK" 50)
(buyItems "BACKPACK" 2)

;sequence to print all sales story
(doseq [entry @salesLog]
  (println (:Item entry) "-" (:Amount entry)))

