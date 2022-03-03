package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

@MappedSuperclass
public class Person implements Serializable {

    @Column(name = "driver_name")
    protected String fullName;
    @Column(name = "driver_address")
    protected String address;
    @Column(name = "driver_phone")
    protected String phone;

    @Override
    public String toString() {
        return "họ tên: '" + fullName + '\'' +
                ", địa chỉ: '" + address + '\'' +
                ", số điện thoại: '" + phone + '\'';
    }
}
