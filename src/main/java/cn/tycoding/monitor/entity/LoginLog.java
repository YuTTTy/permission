package cn.tycoding.monitor.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * @author tycoding
 * @date 2019-03-13
 */
@Table(name = "tb_login_log")
@ToString
@Data
public class LoginLog implements Serializable {

    @Id
    private Long id;

    private String username;

    private String ip;

    private String location;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "create_time")
    private Date createTime;

    private String device;

    @Transient
    private String filedTime;


}
