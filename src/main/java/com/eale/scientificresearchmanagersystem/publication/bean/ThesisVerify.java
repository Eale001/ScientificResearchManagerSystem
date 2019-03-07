package com.eale.scientificresearchmanagersystem.publication.bean;

import javax.persistence.*;

/**
 * 论文审核实体
 */
@Entity
@Table(name = "srms_publication_thesisverify")
public class ThesisVerify {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="tv_id")
    private Long tvId;//论文审核ID

    @OneToOne
    @JoinColumn(name = "thesis_id")
    private Thesis thesisId;//论文ID

    @Column(name = "tv_verify")
    private Integer tvVerify;//审核状态

    @Column(name = "tv_remark")
    private String remark;//审核备注

}
