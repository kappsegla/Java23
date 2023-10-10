package org.example.files;

import java.io.Serializable;

public record Cake(int id, String name, int price) implements Serializable {}
