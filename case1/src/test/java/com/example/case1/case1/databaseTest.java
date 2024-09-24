package com.example.case1.case1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class databaseTest {
    @Test
    public void testGetInstance() {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        // Assertions assetSame() method checks if two objects refer to the same object.
        Assertions.assertThat(db1).isSameAs(db2);

    }

}
