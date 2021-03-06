package top.cardone.workflow.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.Map;

/**
 * 工作流任务处理重试服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.workflow.service.WfTaskHandleRetryService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface WfTaskHandleRetryService extends PageService {
    /**
     * 查询工作流任务处理重试对象
     *
     * @param findOne 工作流任务处理重试标识
     * @return 工作流任务处理重试对象
     */
    Map<String, Object> findOneByWfTaskHandleRetryId(Map<String, Object> findOne);

    /**
     * 查询工作流任务处理重试对象
     *
     * @param findOne 工作流任务处理重试标识
     * @return 工作流任务处理重试对象
     */
    @Cacheable
    default Map<String, Object> findOneByWfTaskHandleRetryIdCache(Map<String, Object> findOne) {
        return this.findOneByWfTaskHandleRetryId(findOne);
    }
}