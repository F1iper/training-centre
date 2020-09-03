package lenght;

public class LengthConverter {
    public double INCH_TO_METER = 0.0254;
    public double FOOT_TO_METER = 0.3048;
    public double MILE_TO_METER = 1609.344;
    public double MM_TO_METER = 0.001;
    public double CM_TO_METER = 0.01;
    public double KM_TO_METER = 1000;
    public double YD_TO_METER = 0.9144;


    private double factor;

    public LengthConverter(String unit) {
        if (unit.toUpperCase().equals("IN")) {
            factor = INCH_TO_METER;
        } else if (unit.toUpperCase().equals("FT")) {
            factor = FOOT_TO_METER;
        } else if (unit.toUpperCase().equals("MI")) {
            factor = MILE_TO_METER;
        } else if (unit.toUpperCase().equals("MM")) {
            factor = MM_TO_METER;
        } else if(unit.toUpperCase().equals("CM")) {
            factor= CM_TO_METER;
        } else if(unit.toUpperCase().equals("KM")) {
            factor = KM_TO_METER;
        } else if(unit.toUpperCase().equals("YD")) {
            factor = YD_TO_METER;
        }
    }

    public double toMeters(double measurement) {
        return (measurement * factor);
    }
}
