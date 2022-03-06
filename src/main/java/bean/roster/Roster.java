package bean.roster;

import bean.BusRoute;
import bean.Driver;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Roster")
public class Roster implements Serializable {
    @Id
    @ManyToOne(targetEntity = Driver.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "driver_id", nullable = false)
    Driver driver;
    @Id
    @ManyToOne(targetEntity = BusRoute.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "bus_route_id", nullable = false)
    BusRoute busRoute;
    @Column(name = "route_quantity")
    int routeQuantity;
}
