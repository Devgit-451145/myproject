package com.dev.practice;

class Entry {
    private final ValueType type;
    private final Object value;
    public Entry(ValueType type, Object value) {
        this.type = type;
        this.value = value;
    }
    public ValueType getType() {
        return type;
    }
    public Object getValue() {
        return value;
    }
}

