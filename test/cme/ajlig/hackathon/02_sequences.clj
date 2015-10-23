(ns cme.ajlig.hackathon.02_sequences
  (:require [midje.sweet :refer :all]))

(future-fact "Generating lazy sequences"
    ; range returns a lazy seq of nums from start (inclusive) to end (exclusive), by step,
    ; where start defaults to 0, step to 1, and end to infinity
    (range :??) => '(0 1 2 3 4)

    (range :?? 5) => '(2 3 4)

    (range 0 10 :??) => '(0 3 6 9)

    ;take teturns a lazy sequence of the first n items in the sequence
    (take :?? (range 100)) => '(0 1 2 3 4 5 6)

    ;drop returns a lazy sequence of all but the first n items in the sequence.
    (drop :?? (range 50)) => '(47 48 49)

    ;iterate returns a sequence by repeatedly applying a function to an initial value
    (take 5 (iterate inc :??)) => '(10 11 12 13 14)

    ;repeat returns a sequence by repeating an initial value n times
    (repeat 3 "Hello") => :??

    ;take your pick which way you do it
    (take 10 (iterate identity :??)) => (repeat 10 :again)
             )

(future-fact "Sequence comprehensions"
    ; for takes a vector of one or more binding-form pairs, each followed by 0+ modifiers, and
    ; yields a lazy sequence of evaluations of expr
    (for [index (range 5)] index) => :??

    ;remember the binding is immutable so inc only modifies what is returned
    (for [index (range 5)] (inc :??)) => '(1 2 3 4 5)

    ;when lets you filter what's yielded
    (for [index (range 10) :when (:?? index)] index) => '(1 3 5 7 9)

    (for [index (range 10) :when (even? index)] (:?? index)) => '(-1 1 3 5 7)

    ;lets really push the boat out, multiple pairs with a while modifier and a function applied
    (take 10 (for [x (range 1000000) y (range 1000000) :while (< y x)] (* x y))) => :??
             )

(future-fact "Conditionals"
    ;if takes a an expression and two results, if the expression is true the second argument is returned otherwise the third
    (if (= 4 5) :a :b) => :??

    ;if not is not if
    (if-not (= 4 5) :?? :b) => :a

    ;greater than can be a bit confusing, thinking of it as decreasing
    (if (> 4 3 2) :a) => :??

    ;if you don't provide an else you get
    (if (nil? 0) :a) => :??

    ;sometimes you just need more options, let binds an expression to a symbol
    (let [selection :??]
      (cond (= 1 selection) :option-1
            (= 2 selection) :option-2
            (= 3 selection) :option-3
            :else :??)) => :try-again

             )

