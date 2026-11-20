package it.unisa.diem.softeng.gruppo4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testTitoloNonVuoto() {
        // il titolo compare nella barra della finestra
        assertNotNull(App.TITOLO);
        assertFalse(App.TITOLO.trim().isEmpty());
    }

    @Test
    public void testDimensioniFinestraPositive() {
        assertTrue(App.LARGHEZZA > 0);
        assertTrue(App.ALTEZZA > 0);
    }
}
