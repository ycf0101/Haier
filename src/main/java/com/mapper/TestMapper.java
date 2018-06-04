package com.mapper;

import com.entity.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * ${DESCRIPTION}
 *
 * @author 袁成飞
 * @create 2018-05-14 20:19
 **/
@Mapper
//@Repository
public interface TestMapper {

    @Select("select * from person where id = #{id}")
    public Person getPerson(String id);

    @Insert("insert into person values(#{id},#{name},#{address})")
    public void savePerson(Person person);

    public Person queryPerson(String id);
}
