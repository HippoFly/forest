package com.rymcu.vertical.dto.admin;

import lombok.Data;

/**
 * @author ronger
 */
@Data
public class Dashboard {

    private Integer countUserNum;

    private Integer newUserNum;

    private Integer countArticleNum;

    private Integer newArticleNum;

    private Integer countViewNum;

    private Integer toadyViewNum;
}