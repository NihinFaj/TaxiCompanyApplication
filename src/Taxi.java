public class Taxi extends Vehicle {
    // Whether it is free or not.
    private boolean free;

    /**
     * Constructor for objects of class Taxi.
     * @param base The name of the company's base.
     * @param id This taxi's unique id.
     */
    public Taxi(String base, String id)
    {
        super(id);
        free = true;
        setLocation(base);
        setDestination(null);
    }

    /**
     * Book this taxi to the given destination.
     * The status of the taxi will no longer be free.
     * @param destination The taxi's destination.
     */
    public void book(String destination)
    {
        setDestination(destination);
        free = false;
    }

    /**
     * Indicate that this taxi has arrived at its destination.
     * As a result, it will be free.
     */
    public void signalArrival()
    {
        setDestination(null);
        free = true;
    }
}
