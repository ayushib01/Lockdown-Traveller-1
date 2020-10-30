/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.Serializable;

/**
 *
 * @author Priyanshi Dixit
 */
public class TicketRequest implements Serializable{
    String coach,arrival,departure,source,destination,passg,fare,date,train_no,NoOfSeats;
    int seats_before;
    public String getArrival(){
        return arrival;
    }
    public String getCoach(){          //ac or sleeper
        return coach;
    }
    public String getDeparture(){
        return departure;
    }
    public String getSource(){
        return source;
    }
    public String getDestination(){
        return destination;
    }
    public String getPassg(){
        return passg;
    }
    public String getFare(){
        return fare;
    }
    public String getDate(){
        return date;
    }
    public String getTrain_no(){
        return train_no;
    }
    public String getNoOfSeats(){
        return NoOfSeats;
    }
    public void SetSeatsBefore(int seats_before){
        this.seats_before=seats_before;
    }
    public int getSeatsBefore(){
        return seats_before;
    }
    public TicketRequest(String coach,String arrival,String departure,String source,
            String destination,String passg,String fare,String date,String train_no,String NoOfSeats)
    {
        this.coach=coach;
        this.arrival=arrival;
        this.departure=departure;
        this.source=source;
        this.destination=destination;
        this.passg=passg;
        this.fare=fare;
        this.date=date;
        this.train_no=train_no;
        this.NoOfSeats=NoOfSeats;
    }
}
