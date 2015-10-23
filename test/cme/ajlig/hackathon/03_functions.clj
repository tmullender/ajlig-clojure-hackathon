(ns cme.ajlig.hackathon.03_functions
  (:require [midje.sweet :refer :all]))

;A function definition takes a name, a vector of arguments and an expression
(defn square [n] (* n n))

(future-fact "Functions"
    ;by now you've called a few functions
    (square 9) => :??

    ;now to define a few, here's an anonymous one
    ((fn [n] (* n n)) :??) => 25

    ;there's an even shorter form for anonymous functions
    (#(* % %) :??) => 36

    ;and you can use multiple arguments
    (#(* %1 %2) :?? 5) => 20

    ;a function can return a function
    (((fn [] :??)) 4 5) => 9

    ;a function can be passed as an argument
    ((fn [f] (f 3 6)) :??) => 18

             )

(future-fact "Higher Order Functions"
    ; map returns a lazy sequence of the result of applying the function to the the first item of each sequence,
    ; followed by applying the function to the second item in each sequence, and so on until one is exhausted
    (map square (range 5)) => :??

    ;you tell me the function
    (map :?? (range 5)) => '(0 3 6 9 12)

    ;don't forget we can provide multiple sequences
    (map * '(1 3 5 7) :??) => '(2 12 30 56)

    ;filter returns a lazy sequence of the items in the sequence for which (pred item) returns true
    (filter even? (range 10)) => :??

    ;you tell me the function
    (filter :?? (range 10)) => '(6 7 8 9)

    ;so what is true?
    (filter identity '(:true :false true? false? true false 1 0 "true" "false" nil)) => :??

    ; reduce returns the result of applying the function to the first 2 items in the sequence,
    ; then applying the function to that result and the 3rd item, etc
    (reduce + '(1 2 3 4 :??)) => 16

    ;if you provide an intial value it's as if it was the first element in the sequence
    (reduce + :?? (range 6)) => 25

    ;you tell me the function
    (reduce :?? 240 '(1 2 3 4)) => 10

             )

(future-fact "Function builders"
    ;some functions take functions and return new functions, I will compliment you on your complement
    (filter (complement :??) (range 6)) => '(1 3 5)

    ;comp takes multiple functions and returns one, lazy thing
    (map (comp :?? inc) (range 1 5)) => '(4 9 16 25)

    (map (comp str dec square) (range 1 5)) => :??

    ; partial takes a function and a partial argument list,
    ; the resulting function can then be called with the remaining arguments
    (map (partial + :??) (range 1 5)) => '(3 4 5 6)

    (map (partial str "Number: ") (range 1 5)) => :??
             )
