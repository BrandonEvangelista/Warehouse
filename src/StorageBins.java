import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Represents a storage bin in the warehouse.
 */
class Bin {
    private String id;
    private int capacity;
    private int currentItems;

    /**
     * Initializes a new bin with the specified ID and capacity.
     *
     * @param id       The unique ID of the bin.
     * @param capacity The maximum capacity of the bin.
     */
    public Bin(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.currentItems = 0;
    }

    // ... (rest of the Bin class)

    @Override
    public String toString() {
        return "Bin " + id + " (Capacity: " + capacity + ", Items: " + currentItems + ")";
    }
}

/**
 * Represents an incoming shipment with an ID and quantity.
 */
class Shipment {
    private String id;
    private int quantity;

    /**
     * Initializes a new shipment with the specified ID and quantity.
     *
     * @param id       The unique ID of the shipment.
     * @param quantity The quantity of items in the shipment.
     */
    public Shipment(String id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    // ... (rest of the Shipment class)

    @Override
    public String toString() {
        return "Shipment " + id + " (Quantity: " + quantity + ")";
    }
}

/**
 * Manages storage bins and incoming shipments in a warehouse.
 */
public class StorageBins {
    private Queue<Shipment> shipmentQueue;
    private Stack<Bin> binStack;

    /**
     * Initializes a new WarehouseManager with an empty shipment queue and an empty stack of bins.
     */
    public StorageBins() {
        shipmentQueue = new LinkedList<>();
        binStack = new Stack<>();
    }

    /**
     * Adds an incoming shipment to the shipment queue.
     *
     * @param shipment The shipment to be added to the queue.
     */
    public void addShipment(Shipment shipment) {
        shipmentQueue.add(shipment);
    }

    // ... (rest of the WarehouseManager class)

    /**
     * Displays the current shipments in the shipment queue.
     */
    public void displayShipmentQueue() {
        System.out.println("Shipment Queue: " + shipmentQueue);
    }

    /**
     * Displays the status of storage bins, including their IDs, capacities, and current item counts.
     */
    public void displayBins() {
        System.out.println("Bins:");
        for (Bin bin : binStack) {
            System.out.println(bin);
        }
    }
}
