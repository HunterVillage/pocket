package org.homo.dbconnect.criteria;

import org.homo.core.model.BaseEntity;

import java.util.List;

/**
 * @author wujianchuan 2019/1/10
 */
public interface Criteria {

    /**
     * 添加约束条件
     *
     * @param restrictions 约束条件SQL
     * @return Criteria
     */
    Criteria add(Restrictions restrictions);

    /**
     * 获取所有数据
     *
     * @return 对象集合
     * @throws Exception 异常
     */
    List list() throws Exception;

    /**
     * 获取一条数据
     *
     * @return 对象
     * @throws Exception 异常
     */
    Object unique() throws Exception;
}