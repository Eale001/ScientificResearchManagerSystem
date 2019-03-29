package com.eale.scientificresearchmanagersystem.publication.bean;


import javax.persistence.*;

/**
 * 专利审核实体
 */
@Entity
@Table(name = "srms_publication_thesisverify")
public class PatentVerify {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="pt_id")
private Long ptId;//专利审核ID

    @OneToOne
    @JoinColumn(name = "patent_id")
    private Thesis patentId;//专利ID

    @Column(name = "tv_verify")
    private Integer tvVerify;//审核状态

    @Column(name = "tv_remark")
    private String remark;//审核备注

}
