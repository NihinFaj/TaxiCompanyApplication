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
     *
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
    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination()
    {
        return destination;
    }

    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    protected void setDestination(String destination)
    {
        this.destination = destination;
    }

    /**
     * Return the location of the vehicle
     * @return The location of the vehicle
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * set the location of the user.
     * @param the location of the vehicle.
     */
    protected void setLocation(String location){
        if(location != null){
            this.location = location;
        }
    }

    /**
     * Return a string representative of the vehicle status.
     * @return returns the vehicle status when free or in use
     */
    public String toString()
    {
        if(destination != null && !destination.isEmpty()){
            return identity + " at " + location + " headed for " +
                    destination;
        }else{
            return identity + " at " + location + " and Vehicle is Free";
        }
    }

    /**
     * returns the current status of the vehicle
     * @return the vehicle status
     */
    public String getStatus(){
        return toString();
    }

    /**
     * method that indicates that a vehicle has arrived at is destination
     */
    protected void signalArrival(){
        location = destination;
    }
}
