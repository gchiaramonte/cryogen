(defproject cryogen "0.1.0"
            :description "Simple static site generator"
            :url "https://github.com/lacarmen/cryogen"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [hiccup "1.0.5"]
                           [selmer "0.7.7"]
                           [markdown-clj "0.9.58"
                            :exclusions [com.keminglabs/cljx]]
                           [ring/ring-devel "1.3.2"]
                           [compojure "1.2.2"]
                           [clj-text-decoration "0.0.3"]
                           [io.aviso/pretty "0.1.13"]
                           [ring-server "0.3.1"]
                           [clj-rss "0.1.9"]
                           [me.raynes/fs "1.4.6"]
                           [crouton "0.1.2"]
                           [cheshire "5.3.1"]
                           [cryogen-core "0.1.0"]]
            :plugins [[lein-ring "0.8.13"]]
            :main cryogen.compiler
            :ring {:init cryogen.server/init
                   :handler cryogen.server/handler})