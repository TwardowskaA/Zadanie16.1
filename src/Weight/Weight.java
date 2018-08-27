package Weight;

public class Weight {

    //kg

    public double WeightKG(double weight){
        return weight;
    }
    public double WeightKGtoG(double weight){
        return weight * 1000;
    }
    public double WeightKGtoMg(double weight){
        return weight * 1000000 ;
    }

    //g

    public double WeightG(double weight){
        return weight;
    }

    public double WeightGtoMG(double weight){
        return weight * 1000;
    }

    public double WeightGtoKG(double weight){
        return weight / 1000;
    }

    //mg
    public double WeightMG(double weight){
        return weight;
    }

    public double WeightMGtoG(double weight){
        return weight / 1000;
    }

    public double WeightMGtoKG(double weight){
        return weight / 1000000;
    }
}
