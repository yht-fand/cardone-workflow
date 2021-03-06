package top.cardone.api.vx.workflow.wfTaskHandleRetry

import org.apache.commons.lang3.StringUtils
import top.cardone.workflow.service.WfTaskHandleRetryService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0003 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdById = input?.createdById
		newInput?.createdDate = input?.createdDate
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.endDate = input?.endDate
		newInput?.errorDate = input?.errorDate
		newInput?.errorMessage = input?.errorMessage
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.handleCode = input?.handleCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedById = input?.lastModifiedById
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.lastRetryDate = input?.lastRetryDate
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.retryCount = input?.retryCount
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.version = input?.version
		newInput?.wfTaskHandleId = input?.wfTaskHandleId
		newInput?.wfTaskHandleRetryId = input?.wfTaskHandleRetryId

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.wfTaskHandleRetryCode)) {
//          throw new CodeException("wfTaskHandleRetryCode required", "工作流任务处理重试编号必填")
//      }
//
//      if (StringUtils.length(input?.wfTaskHandleRetryCode) < 4) {
//          throw new CodeException("wfTaskHandleRetryCode minlength", "工作流任务处理重试编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.wfTaskHandleRetryCode) > 255) {
//          throw new CodeException("wfTaskHandleRetryCode maxlength", "工作流任务处理重试编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "工作流任务处理重试名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "工作流任务处理重试名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "工作流任务处理重试名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['wfTaskHandleRetryCode': input.wfTaskHandleRetryCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(WfTaskHandleRetryService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("wfTaskHandleRetryCode already exists", "工作流任务处理重试编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(WfTaskHandleRetryService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]        
    }
}