package by.sibel.equipment;

import by.sibel.equipment.BaseMessage;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Simple JavaBean domain object that represents Customer.
 *
 * @author Ruslan Baigolov
 * @version 1.0
 */

@Table(name = "alerts")
@Getter
@Setter
@ToString
public class Equipment extends BaseMessage {

    @Column(name = "SN")
    private String SN;

    @Column(name = "Date")
    private String Date;

    @Column(name = "Time")
    private String Time;

    @Column(name = "Failure Code")
    private String failCode;

    @Column(name = "Location")
    private String address;
}