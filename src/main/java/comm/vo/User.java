package comm.vo;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String realname;

    private String nickname;

    private String phone;

    private String email;

    private Timestamp interview_time;

    private String interviewer;

    private String position;

    private String room;

    private String status;

    private Date update_time;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getRealname() {return realname;}

    public void setRealname(String realname) {this.realname = realname;}

    public String getNickname() {return nickname;}

    public void setNickname(String nickname) {this.nickname = nickname;}

    public String getPhone() {return phone;}

    public void setPhone(String phone) {this.phone = phone;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public Timestamp getInterview_time() {return interview_time;}

    public void setInterview_time(Timestamp interview_time) {this.interview_time = interview_time;}

    public String getInterviewer() {return interviewer;}

    public void setInterviewer(String interviewer) {this.interviewer = interviewer;}

    public String getPosition() {return position;}

    public void setPosition(String position) {this.position = position;}

    public String getRoom() {return room;}

    public void setRoom(String room) {this.room = room;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public Date getUpdate_time() {return update_time;}

    public void setUpdate_time(Date update_time) {this.update_time = update_time;}
}

