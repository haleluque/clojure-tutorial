(ns tutorial.Exercise2Solution)

(def buyerAccount (ref 1000))
(def merchantAccount (ref 0))
(def prices { 'pen 1, 'notebook 5, 'backpack 10 })
(def items (ref []))

(defn printInfo
  []
  (println "\nPrintInfo:")
  (println "BuyerAccount " @buyerAccount)
  (println "MerchantAccount " @merchantAccount)
  (println "Items " @items)
  )

(defn buy
  [item]
  (def itemPrice (get prices item))
  (if (<= itemPrice @buyerAccount)
    (dosync
      (ref-set merchantAccount (+ @merchantAccount itemPrice))
      (ref-set buyerAccount (- @buyerAccount itemPrice))
      ;sequence to add the item at the beginning to items
      (def newItems (cons item @items))
      ;replace items with newItems
      (ref-set items newItems)
      )
    (println "Insufficient funds")
    )
  (printInfo)
  )

(buy 'pen)
(buy 'notebook)

