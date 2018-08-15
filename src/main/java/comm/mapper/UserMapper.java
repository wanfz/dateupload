package comm.mapper;

import comm.vo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "realname", column = "realname"),
            @Result(property = "nickname", column = "nickname"),
            @Result(property = "phone",column = "phone"),
            @Result(property = "email",column = "email"),
            @Result(property = "interview_time",column = "interview_time"),
            @Result(property = "interviewer",column = "interviewer"),
            @Result(property = "position",column = "position"),
            @Result(property = "room",column = "room"),
            @Result(property = "status",column = "status"),
            @Result(property = "update_time",column = "update_time")
    })

    @Select("select * from user where id = #{id}")
    User findById(Integer id);

    @Insert("insert into user(realname,nickname,phone,email,interview_time,interviewer,position,room,status) " +
            "values (#{realname},#{nickname},#{phone},#{email},#{interview_time},#{interviewer},#{position},#{room},#{status})")
    void addUser(User user);

    @Update("update user set realname=#{realname},nickname=#{nickname},phone=#{phone},email=#{email}," +
            "interview_time=#{interview_time},interviewer=#{interviewer},position=#{position},room=#{room},status=#{status}"+
            "where id = #{id}")
    void modUserById(User user);

    @Update("update user set status = '5' where id = #{id}")
    void clockUserById(Integer id);

    @Delete("delete from user where id = #{id}")
    void delUserById(Integer id);


}