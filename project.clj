(defproject cluje "0.1.0"
  :description "A library to make the JRE ScriptEngine framework more convenient for Clojure developers."
  :url "http://github/timclemons/cluje"
  :dependencies
    [[org.clojure/clojure "1.2.1"]
     [org.clojure/clojure-contrib "1.2.0"]]
  :dev-dependencies
    [[org.jruby/jruby "1.6.2"]]
  :main cluje.core
  :dev-resources-path "test-resources")

