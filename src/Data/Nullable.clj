(ns Data.Nullable._foreign)

(def null nil)

(defn nullable [a r f]
  (if (nil? a)
    r
    (f a)))

(def notNull identity)
