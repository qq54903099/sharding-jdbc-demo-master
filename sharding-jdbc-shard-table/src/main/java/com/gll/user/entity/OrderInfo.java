package com.gll.user.entity;

    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author auto-generator
* @since 2019-12-06
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String orderNo;

    private Integer userId;


}
