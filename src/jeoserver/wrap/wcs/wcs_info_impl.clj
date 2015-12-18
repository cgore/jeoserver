(ns jeoserver.wrap.wcs.wcs-info-impl
  (:import org.geoserver.wcs.WCSInfoImpl))

(defn wcs-info-impl? [thing]
  (instance? WCSInfoImpl thing))

(defn gml-prefixing? [info]
  (.isGMLPrefixing info))

(defn set-gml-prefixing!
  ([info]
   (set-gml-prefixing! info true))
  ([info value]
   (.setGMLPrefixing info value)
   info))

(defn unset-gml-prefixing! [info]
  (set-gml-prefixing! info false))

(defn max-input-memory [info]
  (.getMaxInputMemory info))

(defn set-max-input-memory! [info value]
  (.setMaxInputMemory info value)
  info)

(defn max-output-memory [info]
  (.getMaxOutputMemory info))

(defn set-max-output-memory! [info value]
  (.setMaxOutputMemory info value)
  info)

(defn subsampling-enabled? [info]
  (.isSubsamplingEnabled info))

(defn set-subsampling-enabled!
  ([info]
   (set-subsampling-enabled! info true))
  ([info value]
   (.setSubsamplingEnabled info value)
   info))

(defn unset-subsampling-enabled! [info]
  (set-subsampling-enabled! info false))

(defn enable-subsampling! [info]
  (set-subsampling-enabled! info))

(defn disable-subsampling! [info]
  (unset-subsampling-enabled! info))
