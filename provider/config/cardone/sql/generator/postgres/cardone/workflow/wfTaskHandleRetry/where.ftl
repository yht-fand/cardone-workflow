<#assign prefixName = true>
<#if (where_and_eq_batchNo??)>
<#if (where_and_eq_batchNo_value??)>
${prefixName?string('WHERE ', 'AND ')}"batch_no" = :where_and_eq_batchNo_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("batch_no" IS NULL OR "batch_no" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName?string('WHERE ', 'AND ')}"begin_date" = :where_and_eq_beginDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"begin_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"created_by_code" = :where_and_eq_createdByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("created_by_code" IS NULL OR "created_by_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdById??)>
<#if (where_and_eq_createdById_value??)>
${prefixName?string('WHERE ', 'AND ')}"created_by_id" = :where_and_eq_createdById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("created_by_id" IS NULL OR "created_by_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName?string('WHERE ', 'AND ')}"created_date" = :where_and_eq_createdDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"created_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"data_state_code" = :where_and_eq_dataStateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("data_state_code" IS NULL OR "data_state_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"department_code" = :where_and_eq_departmentCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("department_code" IS NULL OR "department_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName?string('WHERE ', 'AND ')}"end_date" = :where_and_eq_endDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"end_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_errorDate??)>
<#if (where_and_eq_errorDate_value??)>
${prefixName?string('WHERE ', 'AND ')}"error_date" = :where_and_eq_errorDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"error_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_errorMessage??)>
<#if (where_and_eq_errorMessage_value??)>
${prefixName?string('WHERE ', 'AND ')}"error_message" = :where_and_eq_errorMessage_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("error_message" IS NULL OR "error_message" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagCode??)>
<#if (where_and_eq_flagCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"flag_code" = :where_and_eq_flagCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("flag_code" IS NULL OR "flag_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagObjectCode??)>
<#if (where_and_eq_flagObjectCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"flag_object_code" = :where_and_eq_flagObjectCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("flag_object_code" IS NULL OR "flag_object_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_handleCode??)>
<#if (where_and_eq_handleCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"handle_code" = :where_and_eq_handleCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("handle_code" IS NULL OR "handle_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_jsonData??)>
<#if (where_and_eq_jsonData_value??)>
${prefixName?string('WHERE ', 'AND ')}"json_data" = :where_and_eq_jsonData_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"json_data" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"last_modified_by_code" = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("last_modified_by_code" IS NULL OR "last_modified_by_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedById??)>
<#if (where_and_eq_lastModifiedById_value??)>
${prefixName?string('WHERE ', 'AND ')}"last_modified_by_id" = :where_and_eq_lastModifiedById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("last_modified_by_id" IS NULL OR "last_modified_by_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName?string('WHERE ', 'AND ')}"last_modified_date" = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"last_modified_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastRetryDate??)>
<#if (where_and_eq_lastRetryDate_value??)>
${prefixName?string('WHERE ', 'AND ')}"last_retry_date" = :where_and_eq_lastRetryDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"last_retry_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orderBy??)>
<#if (where_and_eq_orderBy_value??)>
${prefixName?string('WHERE ', 'AND ')}"order_by_" = :where_and_eq_orderBy_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"order_by_" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"org_code" = :where_and_eq_orgCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("org_code" IS NULL OR "org_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalCode??)>
<#if (where_and_eq_personalCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"personal_code" = :where_and_eq_personalCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("personal_code" IS NULL OR "personal_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalId??)>
<#if (where_and_eq_personalId_value??)>
${prefixName?string('WHERE ', 'AND ')}"personal_id" = :where_and_eq_personalId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("personal_id" IS NULL OR "personal_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_retryCount??)>
<#if (where_and_eq_retryCount_value??)>
${prefixName?string('WHERE ', 'AND ')}"retry_count" = :where_and_eq_retryCount_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"retry_count" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"site_code" = :where_and_eq_siteCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("site_code" IS NULL OR "site_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"state_code" = :where_and_eq_stateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("state_code" IS NULL OR "state_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"system_info_code" = :where_and_eq_systemInfoCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("system_info_code" IS NULL OR "system_info_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName?string('WHERE ', 'AND ')}"version_" = :where_and_eq_version_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"version_" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_wfTaskHandleId??)>
<#if (where_and_eq_wfTaskHandleId_value??)>
${prefixName?string('WHERE ', 'AND ')}"wf_task_handle_id" = :where_and_eq_wfTaskHandleId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("wf_task_handle_id" IS NULL OR "wf_task_handle_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_wfTaskHandleRetryId??)>
<#if (where_and_eq_wfTaskHandleRetryId_value??)>
${prefixName?string('WHERE ', 'AND ')}"wf_task_handle_retry_id" = :where_and_eq_wfTaskHandleRetryId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("wf_task_handle_retry_id" IS NULL OR "wf_task_handle_retry_id" = '')
</#if>
<#assign prefixName = false>
</#if>