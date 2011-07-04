(ns cluje.core
  (:use [clojure.contrib.lib])
  (:import (javax.script ScriptEngineManager ScriptEngine)
           (java.io File)))

;; TODO: Evaluate whether the parameters here make sense.  What's the
;; ScriptEngine means of abstracting modules, functions, and objects across
;; languages?
;;
;; TODO: Want to be able to load scripts either from path names or from the
;; classpath.
(defmacro defscript 
  [engine-name & {:keys [post-properties argv sys-path modules]
                  :or {post-properties {} argv []}}]
  `(let [manager (ScriptEngineManager.) 
         engine (. manager getEngineByName ~engine-name)]
     ))


(defn load-script [script-name]
  (. clojure.lang.RT (loadResourceScript "test-script.rb")))


