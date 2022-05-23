
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents a vertex in the graph with its adjacency list of edges.
 *
 * @version 2.0, April 2022
 * @author Saber Elsayed
 */
class Node implements NodeInteface {

    //id
    private Integer id;
    //person name
    private String name;

    //date of birth
    private LocalDate dateOB;
    //suburb a person lives at
    private String suburb;

    //contains a list of all firends of a person object
    protected HashMap<Integer, Edge> adj;

    /**
     * Construct a new vertex in the graph with the supplied id, name, DOB and
     * suburb.
     *
     */
    public Node(Integer id, String name, LocalDate dob, String suburb) {
        this.id=id;
        this.name = name;
        this.dateOB=dob;
        this.suburb=suburb;
    }

    @Override
    /**
     * to string for node
     */
    public String toString() {
        return "Node{" + "id =" + id + ", name=" + name + ", DOB ="+ dateOB+",suburb ="+suburb'}';
    }
    public HashMap<Integer, Edge> getAdj() {
        return adj;
    }

    @Override
    public Integer getId() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public String getSuburb() {
        // TODO Auto-generated method stub
        return suburb;
    }

    @Override
    public LocalDate getDateOB() {
        // TODO Auto-generated method stub
        return dateOB;
    }

}
