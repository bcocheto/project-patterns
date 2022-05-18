package observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void shouldNotifyClient() {
        Tracker tracker = new Tracker("Product", "Street");
        Client client = new Client("Michael");

        client.trackBack(tracker);
        tracker.changeStatus();
        assertEquals("Michael Last update Product", client.getLastTrack());
    }

    @Test
    void shouldNotifyClients() {
        Tracker tracker = new Tracker("Product", "Street");
        Client client = new Client("Michael");
        Client vendor = new Client("vendor");

        client.trackBack(tracker);
        vendor.trackBack(tracker);
        tracker.changeStatus();
        assertEquals("Michael Last update Product", client.getLastTrack());
        assertEquals("vendor Last update Product", vendor.getLastTrack());
    }

    @Test
    void shouldNotNotifyClient() {
        Tracker tracker = new Tracker("Product", "Street");
        Client client = new Client("Michael");

        tracker.changeStatus();
        assertNull(client.getLastTrack());
    }

}