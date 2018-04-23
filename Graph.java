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
public class Graph<T> 
{
    private final ArrayList<GraphNode<T>> _graphNodes;
    private ArrayList<GraphArch> _graph_arches;

    public Graph(int _cantStations, int _cantArchs) 
    {
        _graphNodes = new ArrayList<>(_cantStations);
        _graphNodes.stream().map((_item) -> new GraphNode(_cantArchs)).forEachOrdered((_node) -> 
        {
            _graphNodes.add(_node);
        });
    }
}

