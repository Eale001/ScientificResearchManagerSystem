package com.eale.scientificresearchmanagersystem.publication.bean;

import javax.persistence.*;


/**
 * 书籍审核实体
 */
@Entity
@Table(name = "srms_publication_bookverify")
public class BookVerify {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bv_id")
    private Long bv_id;//书籍审核ID

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book bookId;//书籍ID

    @Column(name = "bv_verify")
    private Integer bvVerify;//审核状态

    @Column(name = "bv_remark")
    private String bvRemark;//审核备注


}

