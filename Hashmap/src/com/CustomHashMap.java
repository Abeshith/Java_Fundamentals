package com;

public class CustomHashMap {
    private Entities[] entities;
    public CustomHashMap() {
        entities = new Entities[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode()) % entities.length;

        entities[hash] = new Entities(key, value);
    }
    public String get(String key) {
        int hash = Math.abs(key.hashCode()) % entities.length;
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }
    public void remove(String key) {
        int hash = Math.abs(key.hashCode()) % entities.length;
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    public class Entities {
        String key;
        String value;

        public Entities(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
