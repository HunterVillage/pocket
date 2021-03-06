package org.hunter.pocket.session.actions;

import org.hunter.pocket.model.BaseEntity;

import java.io.Serializable;
import java.sql.SQLException;

/**
 * @author wujianchuan
 */
public interface OperateDictionary {

    /**
     * 是否已关闭
     *
     * @return boolean
     */
    boolean getClosed();

    /**
     * 开启Session，拿到数据库链接并开启
     */
    void open();

    /**
     * 关闭数据库链接
     */
    void close();


    /**
     * 查询对象
     *
     * @param clazz 类类型
     * @param uuid  数据标识
     * @return 实体对象
     */
    Object findOne(Class clazz, Serializable uuid) throws SQLException;

    /**
     * 强制通过数据库查询数据
     *
     * @param clazz 类类型
     * @param uuid  数据标识
     * @return 实体对象
     */
    Object findDirect(Class clazz, Serializable uuid) throws SQLException;

    /**
     * 保存(NULL同样进行保存)
     *
     * @param entity 实体对象
     * @return 影响行数
     * @throws SQLException 语句异常
     */
    int save(BaseEntity entity) throws SQLException;

    /**
     * 保存(NULL同样进行保存)
     *
     * @param entity  entity
     * @param cascade 是否进行级联保存操作
     * @return 影响行数（主+从）
     * @throws SQLException 语句异常
     */
    int save(BaseEntity entity, boolean cascade) throws SQLException, IllegalAccessException;

    /**
     * 保存(NULL不纳入保存范围保留数据库默认值)
     *
     * @param entity 实体对象
     * @return 影响行数
     * @throws SQLException 语句异常
     */
    int shallowSave(BaseEntity entity) throws SQLException;

    /**
     * 保存(NULL不纳入保存范围保留数据库默认值)
     *
     * @param entity  实体对象
     * @param cascade 是否进行级联保存操作
     * @return 影响行数
     * @throws SQLException 语句异常
     */
    int shallowSave(BaseEntity entity, boolean cascade) throws SQLException, IllegalAccessException;

    /**
     * 更新实体
     *
     * @param entity 实体对象
     * @return 影响行数
     * @throws SQLException 语句异常
     */
    int update(BaseEntity entity) throws SQLException;


    /**
     * 更新实体
     *
     * @param entity  实体对象
     * @param cascade 是否进行级联更新操作
     * @return 影响行数
     * @throws SQLException 语句异常
     */
    int update(BaseEntity entity, boolean cascade) throws SQLException, IllegalAccessException;

    /**
     * 删除实体
     *
     * @param entity 实体对象
     * @return 影响行数
     * @throws SQLException 语句异常
     */
    int delete(BaseEntity entity) throws SQLException, IllegalAccessException;

    /**
     * 获取最大数据标识
     *
     * @param serverId 服务名
     * @param clazz    实体类型
     * @return 最大值
     * @throws SQLException 语句异常
     */
    long getMaxUuid(Integer serverId, Class clazz) throws SQLException;
}
