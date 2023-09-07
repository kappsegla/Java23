package org.example.objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void createNewCylinderObjectStoresRadiusAndHeight() {
        Cylinder cylinder = new Cylinder(1.0f, 10.0f);

        assertEquals(1.0f, cylinder.getRadius());
        assertEquals(10.0f, cylinder.getHeight());
    }

}
