/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectv1;

/**
 *
 * @author Valeria
 */
public class Controller 
{
    private final Graph _stationsGraph;
    public Controller(int _quantStations, int _quantArchs) 
    {
        _stationsGraph = new Graph(_quantStations, _quantArchs);
    }
}
