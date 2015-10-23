(ns cme.ajlig.hackathon.04-more-more-more
  (:require [midje.sweet :refer :all]))

(future-fact "Destructuring"
    ;destructuring allows you to break up arguments
    ((fn [[a b]] (str b a)) '("A" "B")) => :??

    ;destructuring maps is the other way round
    ((fn [{one :c two :b three :a}]
       (:?? one two three)) {:a 2 :b 4 :c 6 :d 8}) => 12

    ;but can be made slightly simpler
    ((fn [{:keys [b c]}] (* b c)) {:a 2 :b 4 :c 6 :d 8}) => :??

             )

(defn luhn? [input]
  (let [numbers (map #(Character/digit % 10) (seq input))
        sum (reduce + :??)]
    (zero? (mod sum 10))))

(future-fact "Luhn Check"
;The luhn test can be performed as follows,
; 1. Reverse the sequence
; 2. Double the even digits
; 3. Sum the digits of any results greater than 9
; 4. Sum the results and the odd digits
; 5. If the result ends in 0 the test passes
    (luhn? "1234567895") => false

    (luhn? "2424242424") => true

    (luhn? "1232123212") => false

    (luhn? "3456345655") => true

    (luhn? "9876543217") => true

    (luhn? "1111111111") => false

             )