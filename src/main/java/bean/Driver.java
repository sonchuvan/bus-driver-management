package bean;

import lombok.*;
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

    public Driver(int id){
        this.driverId = id;
    }

    public Driver(String fullName, String address, String phone, String level) {
        super(fullName, address, phone);
        this.level = level;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", level='" + level + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
