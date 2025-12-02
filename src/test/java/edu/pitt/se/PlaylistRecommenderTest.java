package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


public class PlaylistRecommenderTest {

    @Test
    void testClassifyEnergy_high() {
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(List.of(150, 160, 170)));
    }

    @Test
    void testIsValidTrackTitle_valid() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Summer Breeze"));
    }

    @Test
    void testNormalizeVolume_clampsAboveMax() {
        assertEquals(100, PlaylistRecommender.normalizeVolume(120));
    }
}
