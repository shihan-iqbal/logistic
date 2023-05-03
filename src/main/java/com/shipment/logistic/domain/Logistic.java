package com.shipment.logistic.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "LOGISTIC")
@EntityListeners(AuditingEntityListener.class)
public class Logistic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;

    private String senderAddress;
    private String recipientAddress;
    private double packageWeight =  0.0;

    @Enumerated(EnumType.STRING)
    private Status status = Status.IN_TRANSIT;

    @Version
    private int version;

    @Column(name = "created_date", nullable = false, updatable = false)
    @CreatedDate
    private long createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate
    private long modifiedDate;

}
