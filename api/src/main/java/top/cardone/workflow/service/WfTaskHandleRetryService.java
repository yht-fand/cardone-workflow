package top.cardone.workflow.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.cache.Caches;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.List;
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
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#page
     */
    @Cacheable(key = Caches.KEY_1)
    default Page<Map<String, Object>> pageCache(Object page) {
        return this.page(page);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#page
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> Page<P> pageCache(Class<P> mappedClass, Object page) {
        return this.page(mappedClass, page);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#findList
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> List<P> findListCache(Class<P> mappedClass, Object findList) {
        return this.findList(mappedClass, findList);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#findOne
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> P findOneCache(Class<P> mappedClass, Object findOne) {
        return this.findOne(mappedClass, findOne);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#readList
     */
    @Cacheable(key = Caches.KEY_2)
    default <R> List<R> readListCache(Class<R> requiredType, Object readList) {
        return this.readList(requiredType, readList);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#readOne
     */
    @Cacheable(key = Caches.KEY_2)
    default <R> R readOneCache(Class<R> requiredType, Object readOne) {
        return this.readOne(requiredType, readOne);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#delete
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int deleteCache(Object delete) {
        return this.delete(delete);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#deleteAll
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int deleteAllCache() {
        return this.deleteAll();
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#deleteByIds
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int deleteByIdsCache(Object ids) {
        return this.deleteByIds(ids);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#deleteList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] deleteListCache(List<Object> deleteList) {
        return this.deleteList(deleteList);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#findList
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListCache(Object findList) {
        return this.findList(findList);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#findOne
     */
    @Cacheable(key = Caches.KEY_1)
    default Map<String, Object> findOneCache(Object findOne) {
        return this.findOne(findOne);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#insert
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int insertCache(Object insert) {
        return this.insert(insert);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#insertByNotExists
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int insertByNotExistsCache(Object insert) {
        return this.insertByNotExists(insert);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#insertList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] insertListCache(List<Object> insertList) {
        return this.insertList(insertList);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#insertListByNotExists
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] insertListByNotExistsCache(List<Object> insertList) {
        return this.insertListByNotExists(insertList);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#readList
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Object> readListCache(Object readList) {
        return this.readList(readList);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#readOne
     */
    @Cacheable(key = Caches.KEY_1)
    default Object readOneCache(Object readOne) {
        return this.readOne(readOne);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#save
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int saveCache(Object save) {
        return this.save(save);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#update
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int updateCache(Object update) {
        return this.update(update);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#updateList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] updateListCache(List<Object> updateList) {
        return this.updateList(updateList);
    }

	/**
     * @see top.cardone.workflow.service.WfTaskHandleRetryService#saveList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] saveListCache(List<Object> saveList) {
        return this.saveList(saveList);
    }
	
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
    default Map<String, Object> findOneByWfTaskHandleRetryIdCache(Map<String, Object> findOne) {
        return this.findOneByWfTaskHandleRetryId(findOne);
    }
	
    /**
     * 查询工作流任务处理重试下拉列表
     *
     * @param findList 关键字
     * @return 工作流任务处理重试下拉列表
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListByKeywordCache(Map<String, Object> findList) {
        return this.findListByKeyword(findList);
    }
}