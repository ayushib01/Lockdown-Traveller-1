package Client;

import java.io.Serializable;

/**
 *
 * @author Priyanshi dixit
 */
public class TrainsBetweenRequest implements Serializable{
    String source,destination,arrival,departure,Date;
    int train_no;
    public String getDate(){
        return Date;
    }
    public String getSource(){
        return source;
    }
    public String getDestination(){
        return destination;
    }   
    public void setTrain_no(int train_no){
        this.train_no=train_no;
    }
    public int getTrain_no(){
        return train_no;
    }
    public TrainsBetweenRequest (String source , String destination,String Date){
        this.source=source;
        this.destination=destination;
        this.Date=Date;
    }
     public String getArrival(){
        return arrival;
    }
    public String getDeparture(){
        return departure;
    }
    public void setArrival(String arrival){
        this.arrival=arrival;
    }
    public void setDeparture(String departure){
        this.departure=departure;
    }
    @Override
    public String toString(){
        return String.valueOf(source+" "+destination+" date is "+Date+" "+arrival+" "+departure+" "+train_no);
    }
}
