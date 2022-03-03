package bean.roster;

import bean.BusRoute;
import bean.Driver;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Roster")
public class Roster implements Serializable {
    @Id
    @ManyToOne(targetEntity = Driver.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;
    @Id
    @ManyToOne(targetEntity = BusRoute.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "bus_route_id", nullable = false)
    private BusRoute busRoute;
    @Column
    private int route_quantity;
}
