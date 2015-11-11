(ns cme.ajlig.hackathon.01_core
  (:require [midje.sweet :refer :all]))

(fact "Simple Maths and Equality"
    ;Addition
    (+ 1 1) => 2

    ;Subtraction
    (- 6 4) => 2

    ;Multiplication
    (* 4 3) => 12

    ;Equals can take multiple arguments
    (= (+ 1 1 1) 3 (- 4 1) ) => true

    ;Strings are not numbers
    (= 2 "2" ) => false

    ;Nor are they keywords or symbols
    (= "foo" :foo 'foo ) => false
             )

(fact "Lists"
    ;Lists can be constructed with a quote or the list function
    '(1 2 3 4 5) => (list 1 2 3 4 5)

    ;First takes the second element, - just kidding
    (first '(1 2 3 4 5)) => 1

    ;Guess what last does
    (last '(1 2 3 4 5)) => 5

    ;You can get the rest as well
    (rest '(1 2 3 4 5)) => '(2 3 4 5)

    ;Pythonesque?
    (count '(1 2 3 4 5)) => 5

    ;You can do it
    (count '()) => 0

    ;Lists are immutable so to add you create a new list
    (conj '(:b :c :d :e) :a) => '(:a :b :c :d :e)

             )

(fact "Maps"
    ;Commas are optional in creating a map
    {:a 1, :b 2, :c 3} => (hash-map :a 1 :b 2 :c 3)

    ;Gotcha?
    (count {:a 1 :b 2 :c 3}) => 3

    ;So you can use get to retrieve something from a map
    (get {:a 1 :b 2 :c 3} :b) => 2

    ;And it's handy if you have a default value
    (get {:a 1 :b 2 :c 3} :d :default-value) => :default-value

    ;But it's much more fun to use the map as a function
    ({1 "One" 2 "Two" 3 "Three"} 2) => "Two"

    ;Or a keyword
    (:3 {:1 "One" :2 "Two" :3 "Three"}) => "Three"

    ;You can create a new map by adding values
    (assoc {:a 1 :b 2} :c 3) => {:a 1 :b 2 :c 3}

    ;Or removing them
    (dissoc {:a 1 :b 2} :b) => {:a 1}

    ;keys returns the keys - beware maps are not ordered
    (sort (keys {1 :1 2 :2 3 :3})) => '(1 2 3)

    ;vals returns the values
    (sort (vals {"A" 0, "G" 4, "I" 3, "J" 1, "L" 2})) => '(0 1 2 3 4)

             )


