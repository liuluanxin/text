package com.example.demo.mapper;

import com.example.demo.entities.WorkTime;
import com.example.demo.service.workTime.WorkTimeCondition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WorkTimeMapper {
    /**
     * 残业情报取得
     *
     * @param userId     用户ID
     * @param targetDate 取得日
     * @param projectId  项目ID
     * @return
     */
    WorkTime getWorkTime(@Param("userId") String userId, @Param("targetDate") String targetDate, @Param("projectId") String projectId);

    /**
     * 残业情报一览取得
     *
     * @param condition 检索条件
     * @return 残业情报一览
     */
    long getWorkTimeListCount(WorkTimeCondition condition);

    /**
     * 残业情报一览取得
     *
     * @param condition 检索条件
     * @return 残业情报一览
     */
    List<WorkTime> getWorkTimeList(WorkTimeCondition condition);

    /**
     * 残业情报取得.
     *
     * @param userId     用户ID
     * @param targetDate 取得日
     * @param projectId  项目ID
     * @return 残业情报详细
     */
    WorkTime getWorkTimeCreateUse(@Param("userId") String userId, @Param("targetDate") String targetDate,
                                  @Param("projectId") String projectId);

    /**
     * 残业情报登录.
     *
     * @param workTime 残业情报详细
     * @return
     */
    void creatWorkTime(WorkTime workTime);

    /**
     * 残业情报更新.
     *
     * @param workTime 残业情报详细
     */
    void updateWorkTime(WorkTime workTime);

    /**
     * 残业情报删除.
     *
     * @param userId     ユーザID
     * @param targetDate 対象日
     * @param projectId  プロジェクトID
     */
    void deleteWorkTime(@Param("userId") String userId, @Param("targetDate") String targetDate, @Param("projectId") String projectId);
}
