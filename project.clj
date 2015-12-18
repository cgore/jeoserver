(defproject jeoserver "0.1.0-SNAPSHOT"
  :description "JeoServer: a thin wrapper around GeoServer's libraries for use in Clojure."
  :url "https://github.com/cgore/jeoserver"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["boundlessgeo.com" "https://repo.boundlessgeo.com/main"]
                 ["osgeo.org" "http://download.osgeo.org/webdav/geotools/"]]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.geoserver/gs-wcs "2.8.1"]])
