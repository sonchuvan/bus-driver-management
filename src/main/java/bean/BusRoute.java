package bean;

import javafx.beans.DefaultProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "bus_route")
public class BusRoute implements Serializable {

    public static int COUNT;
    @Id
    @Column(name = "bus_route_id")
    private int routeID;
    @Column(name = "bus_route_range")
    private float range;
    @Column(name = "bus_route_stop_number")
    private int numberOfStops;
}
