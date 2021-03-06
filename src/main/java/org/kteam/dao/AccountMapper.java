package org.kteam.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.kteam.entity.Account;
import org.kteam.entity.AccountExample;

public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the dbserivce table account
     *
     * @mbggenerated Sun Aug 13 23:51:56 CST 2017
     */
    int countByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the dbserivce table account
     *
     * @mbggenerated Sun Aug 13 23:51:56 CST 2017
     */
    int deleteByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the dbserivce table account
     *
     * @mbggenerated Sun Aug 13 23:51:56 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the dbserivce table account
     *
     * @mbggenerated Sun Aug 13 23:51:56 CST 2017
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the dbserivce table account
     *
     * @mbggenerated Sun Aug 13 23:51:56 CST 2017
     */
    int insertSelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the dbserivce table account
     *
     * @mbggenerated Sun Aug 13 23:51:56 CST 2017
     */
    List<Account> selectByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the dbserivce table account
     *
     * @mbggenerated Sun Aug 13 23:51:56 CST 2017
     */
    Account selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the dbserivce table account
     *
     * @mbggenerated Sun Aug 13 23:51:56 CST 2017
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the dbserivce table account
     *
     * @mbggenerated Sun Aug 13 23:51:56 CST 2017
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the dbserivce table account
     *
     * @mbggenerated Sun Aug 13 23:51:56 CST 2017
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the dbserivce table account
     *
     * @mbggenerated Sun Aug 13 23:51:56 CST 2017
     */
    int updateByPrimaryKey(Account record);

    Account queryByID(Account record);
}