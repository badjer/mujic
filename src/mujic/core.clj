(ns mujic.core
	(:import [org.jfugue Player Pattern]))

(def p (org.jfugue.Player.))

(def pat (org.jfugue.Pattern. "C D E F G A B"))

(.play p pat)
