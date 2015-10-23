# AJLIG Clojure Hackathon

Building on (stealing) the ideas of others, this is a series of partially implemented tests 
designed to provide an introduction to Clojure 

Thanks go to @lazerwalker and @dthume for the content and idea 

## Usage

```
./lein midje
```

Should:

 * install [Leiningen](http://leiningen.org/#install) if it's not already installed
 * install the [midje](https://github.com/marick/Midje) dependency
 * build the project
 * run the tests
 * produce the following output

```
WORK TO DO "Simple Maths and Equality" at (01_core.clj:4)

WORK TO DO "Lists" at (01_core.clj:24)

WORK TO DO "Maps" at (01_core.clj:48)

WORK TO DO "Generating lazy sequences" at (02_sequences.clj:4)

WORK TO DO "Sequence comprehensions" at (02_sequences.clj:29)

WORK TO DO "Conditionals" at (02_sequences.clj:46)

WORK TO DO "Functions" at (03_functions.clj:7)

WORK TO DO "Higher Order Functions" at (03_functions.clj:28)

WORK TO DO "Function builders" at (03_functions.clj:60)

WORK TO DO "Destructuring" at (04_more_more_more.clj:4)

WORK TO DO "Luhn Check" at (04_more_more_more.clj:22)
No facts were checked. Is that what you wanted?
```

If so, you are now ready to go

* Edit the files in [test/cme/ajlig/hackathon/](test/cme/ajlig/hackathon/)
* Replace any `:??` with the Clojure code for the test to pass
* When you're ready to run the a section, replace future-fact with fact
* Rerun `./lein midje`
* Repeat until you see

```
All checks (70) succeeded.
```


If you get bored of running `./lein midje`, try:

```
./lein midje :autotest
```

it will automatically run the tests everytime you modify the file

