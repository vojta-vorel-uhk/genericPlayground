package pro1.Task6;

public class Resistor
{
    private double resistance;
    public Resistor(double resistance) {
        this.resistance = resistance;
    }
    public double getCurrent(double voltage) {
        if(voltage == Double.POSITIVE_INFINITY){
            throw new ResistorException("Infinite voltage");
        }
        if(resistance == 0){
            throw new ResistorException("Zero resistance");
        }
        return voltage / resistance;
    }
}