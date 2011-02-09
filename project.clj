(defproject mujic "1.0.0-SNAPSHOT"
  :description "FIXME: write"
  :repositories {"local" {:url "file://C:/Users/brian/Documents/clojure/mujic/extlib"}}; trying to get lein/maven to find dependencies locally - and failing
  :dependencies [[org.clojure/clojure "1.2.0"]
  				[org.clojars.badjer/jfugue "4.0.3"]	; I have no idea how to make this actually work - just copying into /lib for now
                 [org.clojure/clojure-contrib "1.2.0"]])
