/**
 * This class stores information about a vehicle which can either be either a taxi or shuttle.
 * It serves as the superclass for a more specific type of vehicle, which are taxis and shuttles in this case
 * @version 1.0
 */

public class Vehicle {
    // A unique ID for this taxi or shuttle created.
    private String identity;
    //The destination of this taxi or shuttle or the next
    // destination of this shuttle on its circular route.
    private String destination;
    // The location of this taxi or shuttle
    private String location;

    /**
     * Constructor for objects of class Vehicle
     * @param id This taxi or shuttle's unique Id
     * @param base The default location of this taxi or shuttle
     */
    public Vehicle(String id)
    {
        this.identity = id;
    }

    /**
     * Return the ID of this taxi or shuttle.
     * @return The ID of this taxi or shuttle.
     */
    protected String getIdentity()
    {
        return identity;
    }
}
