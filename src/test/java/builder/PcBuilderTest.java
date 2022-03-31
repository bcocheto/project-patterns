package builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PcBuilderTest {

    @Test
    void shouldReturnComputerValidNoBoardVideo() {
        PcBuilder pcBuilder = new PcBuilder();
        Computer computer = pcBuilder
                .setSource("source")
                .setMotherBoard("motherboard")
                .setRamMemory("ram memory")
                .setHd("hd")
                .setProcessor("processor")
                .build();

        assertNotNull(computer);
    }

    @Test
    void shouldReturnComputerValidWithVideoBoard() {
        PcBuilder pcBuilder = new PcBuilder();
        Computer computer = pcBuilder
                .setSource("source")
                .setMotherBoard("motherboard")
                .setRamMemory("ram memory")
                .setHd("hd")
                .setProcessor("processor")
                .setVideoBoard("video board")
                .build();

        assertNotNull(computer);
    }

    @Test
    void shouldReturnExceptionComputerNoSource() {
        try {
            PcBuilder pcBuilder = new PcBuilder();
            Computer computer = pcBuilder
                    .setMotherBoard("motherboard")
                    .setRamMemory("ram memory")
                    .setHd("hd")
                    .setProcessor("processor")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("this pc needs a source.", e.getMessage());
        }
    }

    @Test
    void shouldReturnExceptionComputerNoMotherboard() {
        try {
            PcBuilder pcBuilder = new PcBuilder();
            Computer computer = pcBuilder
                    .setSource("source")
                    .setRamMemory("ram memory")
                    .setHd("hd")
                    .setProcessor("processor")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("this pc needs a motherboard.", e.getMessage());
        }
    }

    @Test
    void shouldReturnExceptionComputerNoProcessor() {
        try {
            PcBuilder pcBuilder = new PcBuilder();
            Computer computer = pcBuilder
                    .setSource("source")
                    .setMotherBoard("motherboard")
                    .setRamMemory("ram memory")
                    .setHd("hd")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("this pc needs a processor.", e.getMessage());
        }
    }

    @Test
    void shouldReturnExceptionComputerNoHd() {
        try {
            PcBuilder pcBuilder = new PcBuilder();
            Computer computer = pcBuilder
                    .setSource("source")
                    .setMotherBoard("motherboard")
                    .setProcessor("processor")
                    .setRamMemory("ram memory")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("this pc needs a hd.", e.getMessage());
        }
    }

    @Test
    void shouldReturnExceptionComputerNoMemoryRam() {
        try {
            PcBuilder pcBuilder = new PcBuilder();
            Computer computer = pcBuilder
                    .setSource("source")
                    .setMotherBoard("motherboard")
                    .setProcessor("processor")
                    .setHd("hd")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("this pc needs a ram memory.", e.getMessage());
        }
    }
}