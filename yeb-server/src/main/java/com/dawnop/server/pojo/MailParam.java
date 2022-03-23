package com.dawnop.server.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "邮件内容", description = "")
public class MailParam implements Serializable {

    @ApiModelProperty(value = "用户名", required = true)
    private String nickname;
    @ApiModelProperty(value = "邮件地址", required = true)
    private String mailAddress;
    @ApiModelProperty(value = "邮件内容", required = true)
    private String content;
}