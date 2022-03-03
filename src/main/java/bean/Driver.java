package bean;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "driver")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Driver extends Person implements Serializable {

    @Id
    @Column(name = "driver_id")
    int driverId;
    @Transient
    public static final String A = "A";
    @Transient
    public static final String B = "B";
    @Transient
    public static final String C = "C";
    @Transient
    public static final String D = "D";
    @Transient
    public static final String E = "E";
    @Transient
    public static final String F = "F";
    @Column(name = "driver_level")
    String level;
}
