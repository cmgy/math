package com.cmgy.struct;

public class ChenMap<K, V> {

    private Entry<K,V> values;

    private static final double RESIZE_FACTOR = 0.75;
    private static final int RESEIZT_PARM = 2;
    private long length = 16;

    public static class Entry<K,V>{
        private K k;
        private V v;

        public K getK() {
            return k;
        }

        public void setK(K k) {
            this.k = k;
        }

        public V getV() {
            return v;
        }

        public void setV(V v) {
            this.v = v;
        }
    }
}
