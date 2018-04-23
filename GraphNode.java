/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectv1;
import java.util.ArrayList;
/**
 *
 * @author Valeria
 * @param <T>
 */
public class GraphNode<T> 
{
    private ArrayList<GraphArch> _graph_arches;
    private ArrayList<Integer> _cost;
    private String name;
    private boolean mark;

    public GraphNode(int _canArchs) {}
}
