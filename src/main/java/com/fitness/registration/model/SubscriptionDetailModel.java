package com.fitness.registration.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "regs_subs_detail")
public class SubscriptionDetailModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subs_detail_id")
    private int subsDetailId;

    @Column(name = "subscription_id")
    private int subscriptionId;

    @Column(name = "subs_detail_desc", columnDefinition = "text")
    private String subsDetailDesc;

    @Column(name = "subs_detail_duration")
    private int subsDetailDuration;

}
