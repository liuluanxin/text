package com.example.demo.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("m_user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("user_name")
    private String userName;
    @TableField("pass_word")
    private String passWord;
    @TableField("delete_flag")
    private String delete_flag;

}
