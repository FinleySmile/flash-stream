package com.finley.flash.stream.dao;

import com.finley.flash.stream.domain.UserShare15Min;
import com.finley.flash.stream.domain.UserShare15MinExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserShare15MinMapper {
    long countByExample(UserShare15MinExample example);

    int deleteByExample(UserShare15MinExample example);

    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("createTime") Date createTime);

    int insert(UserShare15Min record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int insertSelective(@Param("record") UserShare15Min record, @Param("selective") UserShare15Min.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    UserShare15Min selectOneByExample(UserShare15MinExample example);

    List<UserShare15Min> selectByExample(UserShare15MinExample example);

    UserShare15Min selectByPrimaryKey(@Param("userId") Long userId, @Param("createTime") Date createTime);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByExampleSelective(@Param("record") UserShare15Min record, @Param("example") UserShare15MinExample example, @Param("selective") UserShare15Min.Column ... selective);

    int updateByExample(@Param("record") UserShare15Min record, @Param("example") UserShare15MinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByPrimaryKeySelective(@Param("record") UserShare15Min record, @Param("selective") UserShare15Min.Column ... selective);

    int updateByPrimaryKey(UserShare15Min record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<UserShare15Min> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<UserShare15Min> list, @Param("selective") UserShare15Min.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsert(UserShare15Min record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsertByExample(@Param("record") UserShare15Min record, @Param("example") UserShare15MinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsertByExampleSelective(@Param("record") UserShare15Min record, @Param("example") UserShare15MinExample example, @Param("selective") UserShare15Min.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsertSelective(@Param("record") UserShare15Min record, @Param("selective") UserShare15Min.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchUpsert(@Param("list") List<UserShare15Min> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_share_15min
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchUpsertSelective(@Param("list") List<UserShare15Min> list, @Param("selective") UserShare15Min.Column ... selective);
}