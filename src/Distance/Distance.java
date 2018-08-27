package Distance;

public class Distance {

//metr

    public double DistanceM(double distance){
        return distance;
    }

    public double DistanceMtoCM(double distance){
        return distance * 10;
    }

    public double DistanceMtoMM(double distance){
        return distance * 100;
    }

// centymetr

    public double DistanceCM(double distance){
        return distance;
    }

    public double DistanceCMtoMM(double distance){
        return distance * 10;
    }
    public double DistanceCMtoM(double distance){
        return distance / 100;
    }

//milimetr

    public double DistanceMM(double distance){
        return distance;
    }

    public double DistanceMMtoCM(double distance){
        return distance / 10;
    }
    public double DistanceMMtoM(double distance){
        return distance / 1000;
    }
}
