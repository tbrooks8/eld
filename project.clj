(defproject eld "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :test-selectors {:default (fn [m] (not (:benchmark m)))
                   :benchmark :benchmark}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [criterium "0.4.3"]
                 [net.sf.trove4j/trove4j "3.0.3"]])
