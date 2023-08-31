package org.example.records;

import java.math.BigDecimal;
import java.util.Objects;

public record Product(String id, BigDecimal price, int weight) {

}
